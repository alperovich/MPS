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
package jetbrains.mps.generator.runtime;

import jetbrains.mps.generator.impl.interpreted.TemplateModuleInterpreted;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingConfig_AbstractRef;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingConfig_ExternalRef;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingConfig_RefAllGlobal;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingConfig_RefAllLocal;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingConfig_RefSet;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingConfig_SimpleRef;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingPriorityRule;
import jetbrains.mps.project.structure.modules.mappingpriorities.RuleType;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.smodel.language.LanguageRuntime;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Evgeny Gryaznov, 10/28/10
 */
public class TemplateUtil {

  private static final Logger LOG = LogManager.getLogger(TemplateUtil.class);

  public static Collection<SNode> singletonList(SNode node) {
    return node != null ? Collections.singletonList(node) : Collections.<SNode>emptyList();
  }

  public static Collection<SNode> asList(SNode... nodes) {
    if (nodes == null || nodes.length == 0) {
      return Collections.emptyList();
    }

    List<SNode> result = new ArrayList<SNode>(nodes.length);
    for (SNode node : nodes) {
      if (node != null) {
        result.add(node);
      }
    }
    return result;
  }

  public static String asString(Object obj) {
    return obj != null ? String.valueOf(obj) : null;
  }

  public static Collection<SNode> asList(Object... nodesOrCollectionOfNodes) {
    if (nodesOrCollectionOfNodes == null || nodesOrCollectionOfNodes.length == 0) {
      return Collections.emptyList();
    }

    int size = 0;
    for (Object o : nodesOrCollectionOfNodes) {
      if (o instanceof SNode) {
        size++;
      } else if (o instanceof Collection) {
        size += ((Collection) o).size();
      } else if (o == null) {
        // ignore
      } else {
        throw new IllegalArgumentException("Invalid template: unknown object in list - " + o.getClass().getCanonicalName());
      }
    }

    List<SNode> result = new ArrayList<SNode>(size);
    for (Object o : nodesOrCollectionOfNodes) {
      if (o instanceof SNode) {
        result.add((SNode) o);
      } else if (o instanceof Collection) {
        result.addAll((Collection<SNode>) o);
      }
    }
    return result;
  }

  public static <T> Iterable<T> asIterable(final T... objects) {
    return asCollection(objects);
  }

  public static <T> Iterable<T> asNotNull(final Iterable<T> objects) {
    return objects == null ? Collections.<T>emptyList() : objects;
  }

  public static <T> Collection<T> asCollection(final T... objects) {
    return new AbstractCollection<T>() {
      @Override
      public Iterator<T> iterator() {
        return new ArrayIterator<T>(objects);
      }

      @Override
      public int size() {
        return objects.length;
      }
    };
  }

  public static TemplateModule createInterpretedGenerator(LanguageRuntime sourceLanguage, String moduleReference) {
    Generator g = ModuleRepositoryFacade.getInstance().getModule(PersistenceFacade.getInstance().createModuleReference(moduleReference), Generator.class);
    if (g == null) {
      LOG.error("language " + sourceLanguage.getNamespace() + " doesn't contain generator `" + moduleReference + "': try to regenerate language");
      return null;
    }
    return new TemplateModuleInterpreted(sourceLanguage, g);
  }

  public static TemplateMappingPriorityRule createStrictlyBeforeRule(TemplateMappingConfigRef left, TemplateMappingConfigRef right) {
    MappingPriorityRule rule = new MappingPriorityRule();
    rule.setLeft((MappingConfig_AbstractRef) left);
    rule.setRight((MappingConfig_AbstractRef) right);
    rule.setType(RuleType.STRICTLY_BEFORE);
    return rule;
  }

  public static TemplateMappingPriorityRule createStrictlyTogetherRule(TemplateMappingConfigRef left, TemplateMappingConfigRef right) {
    MappingPriorityRule rule = new MappingPriorityRule();
    rule.setLeft((MappingConfig_AbstractRef) left);
    rule.setRight((MappingConfig_AbstractRef) right);
    rule.setType(RuleType.STRICTLY_TOGETHER);
    return rule;
  }

  public static TemplateMappingPriorityRule createBeforeOrTogetherRule(TemplateMappingConfigRef left, TemplateMappingConfigRef right) {
    MappingPriorityRule rule = new MappingPriorityRule();
    rule.setLeft((MappingConfig_AbstractRef) left);
    rule.setRight((MappingConfig_AbstractRef) right);
    rule.setType(RuleType.BEFORE_OR_TOGETHER);
    return rule;
  }

  public static TemplateMappingPriorityRule createAfterOrTogetherRule(TemplateMappingConfigRef left, TemplateMappingConfigRef right) {
    MappingPriorityRule rule = new MappingPriorityRule();
    rule.setLeft((MappingConfig_AbstractRef) left);
    rule.setRight((MappingConfig_AbstractRef) right);
    rule.setType(RuleType.AFTER_OR_TOGETHER);
    return rule;
  }

  public static TemplateMappingPriorityRule createStrictlyAfterRule(TemplateMappingConfigRef left, TemplateMappingConfigRef right) {
    MappingPriorityRule rule = new MappingPriorityRule();
    rule.setLeft((MappingConfig_AbstractRef) left);
    rule.setRight((MappingConfig_AbstractRef) right);
    rule.setType(RuleType.STRICTLY_AFTER);
    return rule;
  }

  public static TemplateMappingConfigRef createRefGlobal() {
    return new MappingConfig_RefAllGlobal();
  }

  public static TemplateMappingConfigRef createRefLocal() {
    return new MappingConfig_RefAllLocal();
  }

  public static TemplateMappingConfigRef createRefSet(TemplateMappingConfigRef... elements) {
    MappingConfig_RefSet result = new MappingConfig_RefSet();
    for (TemplateMappingConfigRef element : elements) {
      result.getMappingConfigs().add((MappingConfig_AbstractRef) element);
    }
    return result;
  }

  public static TemplateMappingConfigRef createRefNormal(String modelUID, String nodeUID) {
    MappingConfig_SimpleRef result = new MappingConfig_SimpleRef();
    result.setModelUID(modelUID);
    result.setNodeID(nodeUID);
    return result;
  }

  public static TemplateMappingConfigRef createRefExternal(String moduleReference, TemplateMappingConfigRef inner) {
    MappingConfig_ExternalRef result = new MappingConfig_ExternalRef();
    result.setGenerator(PersistenceFacade.getInstance().createModuleReference(moduleReference));
    result.setMappingConfig((MappingConfig_AbstractRef) inner);
    return result;
  }

  private static class ArrayIterator<T> implements Iterator<T> {
    private int idx = 0;
    private Object array;
    private int length;

    private ArrayIterator(Object array) {
      this.array = array;
      this.length = Array.getLength(array);
    }

    @Override
    public boolean hasNext() {
      return idx < length;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public T next() {
      return (T) Array.get(array, idx++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
}
