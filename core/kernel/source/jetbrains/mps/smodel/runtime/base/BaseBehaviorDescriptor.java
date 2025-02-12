/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.smodel.runtime.base;

import jetbrains.mps.classloading.ClassLoaderManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.smodel.NodeReadAccessCasterInEditor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.SNodeUtil;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import jetbrains.mps.util.Computable;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BaseBehaviorDescriptor implements BehaviorDescriptor {
  private static final Logger LOG = LogManager.getLogger(BaseBehaviorDescriptor.class);

  private static final Pattern CONCEPT_FQNAME = Pattern.compile("(.*)\\.structure\\.([^\\.]+)$");

  private final String conceptFqName;
  private final List<Method> constructors;

  public BaseBehaviorDescriptor(String conceptFqName) {
    this.conceptFqName = conceptFqName;
    this.constructors = calculateConstructors(getConceptFqName());
  }

  @Override
  public String getConceptFqName() {
    return conceptFqName;
  }

  @Override
  public void initNode(SNode node) {
    if (node == null) {
      throw new IllegalArgumentException("initNode on null node");
    }

    for (int i = constructors.size() - 1; i >= 0; i--) {
      try {
        constructors.get(i).invoke(null, node);
      } catch (IllegalAccessException e) {
        LOG.error(null, e);
      } catch (InvocationTargetException e) {
        e.printStackTrace();
      }
    }
  }

  public static String behaviorClassByConceptFqName(@NotNull String fqName) {
    Matcher m = CONCEPT_FQNAME.matcher(fqName);
    if (m.matches()) {
      return m.group(1) + ".behavior." + m.group(2) + "_Behavior";
    } else {
      throw new RuntimeException();
    }
  }


  private static List<Method> calculateConstructors(final String conceptFqName) {
    // todo: use SConcept here
    return NodeReadAccessCasterInEditor.runReadTransparentAction(new Computable<List<Method>>() {
      @Override
      public List<Method> compute() {
        String languageNamespace = NameUtil.namespaceFromConceptFQName(conceptFqName);
        final Language language = ModuleRepositoryFacade.getInstance().getModule(languageNamespace, Language.class);

        List<Method> methodsToCall = new ArrayList<Method>();
        Set<SNode> processed = new HashSet<SNode>();

        List<SNode> concepts = Collections.singletonList(SConceptOperations.findConceptDeclaration(conceptFqName));
        while (!concepts.isEmpty()) {
          List<SNode> newFrontier = new ArrayList<SNode>();
          for (SNode currentConcept : concepts) {
            assert currentConcept != null : conceptFqName;
            if (processed.contains(currentConcept)) {
              continue;
            }
            String fqName = NameUtil.nodeFQName(currentConcept);
            String behaviorClass = behaviorClassByConceptFqName(fqName);

            try {
              Class cls = ClassLoaderManager.getInstance().getClass(language, behaviorClass);
              if (cls != null) {
                Method method = cls.getMethod("init", SNode.class);
                method.setAccessible(true);
                methodsToCall.add(method);
              }
            } catch (NoSuchMethodException e) {
              //ignore
            }

            if (SNodeUtil.isInstanceOfConceptDeclaration(currentConcept)) {
              for (SNode interfaceConcept : SNodeUtil.getConceptDeclaration_Implements(currentConcept)) {
                if (interfaceConcept == null || processed.contains(interfaceConcept)) continue;
                newFrontier.add(interfaceConcept);
              }
              SNode parentConcept = SNodeUtil.getConceptDeclaration_Extends(currentConcept);
              if (parentConcept != null && !processed.contains(parentConcept)) {
                newFrontier.add(parentConcept);
              }
            } else if (SNodeUtil.isInstanceOfInterfaceConceptDeclaration(currentConcept)) {
              for (SNode interfaceConcept : SNodeUtil.getInterfaceConceptDeclaration_Extends(currentConcept)) {
                if (interfaceConcept == null || processed.contains(interfaceConcept)) continue;
                newFrontier.add(interfaceConcept);
              }
            }
            processed.add(currentConcept);
          }
          concepts = newFrontier;
        }

        return methodsToCall;
      }
    });
  }

  @Deprecated
  @Override
  public <T> T invoke(Class<T> returnType, SNode node, String methodName, Class[] parametersTypes, Object... parameters) {
    if (node == null) {
      return BehaviorReflection.defaultValue(returnType);
    } else {
      return (T) invoke(node, methodName, parameters);
    }
  }

  @Deprecated
  @Override
  public <T> T invokeSuper(Class<T> returnType, SNode node, String callerConceptFqName, String methodName, Class[] parametersTypes, Object... parameters) {
    return BehaviorManager.getInstance().invokeSuper(returnType, node, callerConceptFqName, methodName, parametersTypes, parameters);
  }
}
