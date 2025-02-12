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
package jetbrains.mps.smodel.language;

import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor;
import jetbrains.mps.smodel.runtime.LanguageAspectDescriptor;
import jetbrains.mps.smodel.runtime.StructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.TextGenAspectDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;
import jetbrains.mps.smodel.runtime.interpreted.ConstraintsAspectInterpreted;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;
import jetbrains.mps.smodel.runtime.interpreted.TextGenAspectInterpreted;
import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ExtensionDescriptor;
import jetbrains.mps.smodel.structure.FacetDescriptor;
import jetbrains.mps.smodel.structure.InterpretedFacetProvider;
import jetbrains.mps.util.SNodeOperations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import static jetbrains.mps.smodel.structure.DescriptorUtils.getObjectByClassNameForLanguage;
import static jetbrains.mps.smodel.structure.DescriptorUtils.getObjectByClassNameForLanguageNamespace;

/**
 * evgeny, 3/11/11
 */
public abstract class LanguageRuntime {
  public static final DescriptorProvider<FacetDescriptor> INTERPRETED_FACET_PROVIDER = new InterpretedFacetProvider();

  private DescriptorProvider<FacetDescriptor> facetDescriptor;

  private StructureAspectDescriptor structureDescriptor;
  private BehaviorAspectDescriptor behaviorDescriptor;
  private ConstraintsAspectDescriptor constraintsDescriptor;
  private ExtensionDescriptor myExtensionDescriptor;
  protected TextGenAspectDescriptor myTextGenDescriptor;
  private Map<Class<? extends LanguageAspectDescriptor>, LanguageAspectDescriptor> myAspectDescriptors =
      new HashMap<Class<? extends LanguageAspectDescriptor>, LanguageAspectDescriptor>();
  private List<LanguageRuntime> myExtendingLanguages = new LinkedList<LanguageRuntime>();

  public abstract String getNamespace();

  public IHelginsDescriptor getTypesystem() {
    Language language = ModuleRepositoryFacade.getInstance().getModule(getNamespace(), Language.class);

    SModel helginsModelDescriptor = LanguageAspect.TYPESYSTEM.get(language);
    if (helginsModelDescriptor == null) return null;
    String packageName = SNodeOperations.getModelLongName(helginsModelDescriptor);

    Object helginsDescriptor = getObjectByClassNameForLanguage(packageName + ".TypesystemDescriptor", IHelginsDescriptor.class, language, true);

    if (helginsDescriptor != null) {
      return (IHelginsDescriptor) helginsDescriptor;
    } else {
      return getObjectByClassNameForLanguage(packageName + ".HelginsDescriptor", IHelginsDescriptor.class, language, true);
    }
  }

  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  public abstract Collection<TemplateModule> getGenerators();

  @Deprecated
  private <T> DescriptorProvider<T> getDescriptorProvider(String aspectName, DescriptorProvider<T> defaultProvider) {
    String className = getNamespace() + "." + aspectName;
    DescriptorProvider<T> compiled =
        (DescriptorProvider<T>) getObjectByClassNameForLanguageNamespace(className, DescriptorProvider.class, getNamespace(), true);
    return compiled != null ? compiled : defaultProvider;
  }

  public DescriptorProvider<FacetDescriptor> getFacetProvider() {
    if (facetDescriptor == null) {
      facetDescriptor = getDescriptorProvider("plugin.FacetAspectDescriptor", INTERPRETED_FACET_PROVIDER);
    }
    return facetDescriptor;
  }

  @NotNull
  public StructureAspectDescriptor getStructureAspectDescriptor() {
//    return StructureAspectInterpreted.getInstance();
    if (structureDescriptor == null) {
      String className = getNamespace() + ".structure.StructureAspectDescriptor";
      Object compiled = getObjectByClassNameForLanguageNamespace(className, getNamespace(), true);

      if (compiled instanceof StructureAspectDescriptor) {
        structureDescriptor = (StructureAspectDescriptor) compiled;
      } else {
        structureDescriptor = StructureAspectInterpreted.getInstance();
      }
    }

    return structureDescriptor;
  }

  public BehaviorAspectDescriptor getBehaviorAspectDescriptor() {
//    return BehaviorAspectInterpreted.getInstance();
    if (behaviorDescriptor == null) {
      String className = getNamespace() + ".behavior.BehaviorAspectDescriptor";
      Object compiled = getObjectByClassNameForLanguageNamespace(className, getNamespace(), true);

      if (compiled instanceof BehaviorAspectDescriptor) {
        behaviorDescriptor = (BehaviorAspectDescriptor) compiled;
      } else {
        behaviorDescriptor = BehaviorAspectInterpreted.getInstance();
      }
    }

    return behaviorDescriptor;
  }

  public ConstraintsAspectDescriptor getConstraintsAspectDescriptor() {
//    return ConstraintsAspectInterpreted.getInstance();
    if (constraintsDescriptor == null) {
      String className = getNamespace() + ".constraints.ConstraintsAspectDescriptor";
      Object compiled = getObjectByClassNameForLanguageNamespace(className, getNamespace(), true);

      if (compiled instanceof ConstraintsAspectDescriptor) {
        constraintsDescriptor = (ConstraintsAspectDescriptor) compiled;
      } else {
        constraintsDescriptor = ConstraintsAspectInterpreted.getInstance();
      }
    }

    return constraintsDescriptor;
  }

  public TextGenAspectDescriptor getTextGenAspectDescriptor() {
    if (myTextGenDescriptor == null) {
      myTextGenDescriptor = TextGenAspectInterpreted.getInstance();
    }
    return myTextGenDescriptor;
  }

  public <T extends LanguageAspectDescriptor> T getAspectDescriptor(Class<T> descriptorInterface) {
    @SuppressWarnings("unchecked")
    T aspectDescriptor = (T) myAspectDescriptors.get(descriptorInterface);
    if (aspectDescriptor == null) {
      aspectDescriptor = InterpretedLanguageAspectsRegistry.getInstance().createAspectDescriptor(descriptorInterface, this);
      myAspectDescriptors.put(descriptorInterface, aspectDescriptor);
    }
    return aspectDescriptor;
  }

  public Iterable<LanguageRuntime> getExtendingLanguages() {
    return myExtendingLanguages;
  }

  // TODO: make abstract after MPS 3.0
  protected String[] getExtendedLanguageIDs() {
    return new String[]{};
  }

  private void registerExtendingLanguage(LanguageRuntime extendingLanguage) {
    myExtendingLanguages.add(extendingLanguage);
  }

  void initialize(LanguageRegistry registry) {
    Queue<String> extendedLanguageIDs = new java.util.LinkedList<String>(Arrays.asList(getExtendedLanguageIDs()));
    Set<String> visitedLanguages = new HashSet<String>();
    visitedLanguages.add(getNamespace());
    while (!extendedLanguageIDs.isEmpty()) {
      String nextLanguageID = extendedLanguageIDs.remove();
      if (visitedLanguages.contains(nextLanguageID)) {
        continue;
      }
      visitedLanguages.add(nextLanguageID);
      LanguageRuntime extendedLanguage = registry.getLanguage(nextLanguageID);
      if (extendedLanguage != null) {
        extendedLanguage.registerExtendingLanguage(this);
        extendedLanguageIDs.addAll(Arrays.asList(extendedLanguage.getExtendedLanguageIDs()));
      }
    }
  }

  void deinitialize() {
    myExtendingLanguages.clear();
  }

  @Override
  public String toString() {
    return getNamespace() + " runtime";
  }
}
