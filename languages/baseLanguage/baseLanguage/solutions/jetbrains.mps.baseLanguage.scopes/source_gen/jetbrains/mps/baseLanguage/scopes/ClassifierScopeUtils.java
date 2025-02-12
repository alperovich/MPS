package jetbrains.mps.baseLanguage.scopes;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.annotations.Nullable;
import java.util.Collections;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;

public class ClassifierScopeUtils {
  private ClassifierScopeUtils() {
  }

  @Deprecated
  public static String createMethodParameterTypesString(SNode method, Map<SNode, SNode> typeByTypeVar) {
    // use MethodSignature instead 
    StringBuilder result = new StringBuilder();
    for (SNode parm : SLinkOperations.getTargets(method, "parameter", true)) {
      SNode type = SLinkOperations.getTarget(parm, "type", true);
      type = GenericTypesUtil.getTypeWithResolvedTypeVars(type, typeByTypeVar);
      if (result.length() > 0) {
        result.append(',');
      }
      if (type != null) {
        result.append(BehaviorReflection.invokeVirtual(String.class, type, "virtual_getErasureSignature_1213877337313", new Object[]{}));
      } else {
        result.append("");
      }
    }
    return result.toString();
  }

  @Deprecated
  public static String getMethodSignatureForOverriding(SNode contextClassifier, SNode method) {
    // use MethodSignature instead 
    return SPropertyOperations.getString(method, "name") + "(" + createMethodParameterTypesString(method, resolveClassifierTypeVars(contextClassifier)) + ")";
  }

  public static Map<SNode, SNode> resolveClassifierTypeVars(@Nullable SNode classifier) {
    if (classifier == null) {
      return Collections.emptyMap();
    }
    return getClassifierAndSuperClassifiersData(classifier).typeByTypeVariable;
  }

  public static Set<SNode> getExtendedClassifiers(@Nullable SNode classifier) {
    if (classifier == null) {
      return Collections.emptySet();
    }
    return getClassifierAndSuperClassifiersData(classifier).classifiers;
  }

  public static boolean isHierarchyCyclic(@Nullable SNode classifier) {
    if (classifier == null) {
      return false;
    }
    return getClassifierAndSuperClassifiersData(classifier).isCyclic;
  }

  private static ClassifierScopeUtils.ClassifierAndSuperClassifiersData getClassifierAndSuperClassifiersData(@NotNull final SNode classifier) {
    if (check_uu0vlb_a0a0g(SNodeOperations.getModel(classifier)) instanceof TransientModelsModule) {
      return new ClassifierScopeUtils.ClassifierAndSuperClassifiersData(classifier);
    } else {
      return RepositoryStateCacheUtils.getFromCache(ClassifierScopeUtils.class, classifier, new _FunctionTypes._return_P0_E0<ClassifierScopeUtils.ClassifierAndSuperClassifiersData>() {
        public ClassifierScopeUtils.ClassifierAndSuperClassifiersData invoke() {
          return new ClassifierScopeUtils.ClassifierAndSuperClassifiersData(classifier);
        }
      });
    }
  }

  private static class ClassifierAndSuperClassifiersData {
    /*package*/ final Set<SNode> classifiers;
    /*package*/ final Map<SNode, SNode> typeByTypeVariable;
    /*package*/ final boolean isCyclic;

    /*package*/ ClassifierAndSuperClassifiersData(SNode topClassifier) {
      typeByTypeVariable = MapSequence.fromMap(new HashMap<SNode, SNode>());
      classifiers = SetSequence.fromSet(new LinkedHashSet<SNode>());
      isCyclic = collectImplementedAndExtended(topClassifier, SetSequence.fromSet(new HashSet<SNode>()), null);
    }

    /**
     * 
     * 
     * @param classifier classifier
     * @param subClassifiers subClassifiers
     * @param typeParms typeParams
     * @return is hierarchy cyclic?
     */
    private boolean collectImplementedAndExtended(SNode classifier, Set<SNode> subClassifiers, List<SNode> typeParms) {
      if (SetSequence.fromSet(subClassifiers).contains(classifier)) {
        return true;
      }
      if ((classifier == null) || SetSequence.fromSet(classifiers).contains(classifier)) {
        return false;
      }
      SetSequence.fromSet(classifiers).addElement(classifier);
      SetSequence.fromSet(subClassifiers).addElement(classifier);

      if (ListSequence.fromList(typeParms).isNotEmpty()) {
        Iterator<SNode> typeVars = ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).iterator();
        for (SNode typeParm : typeParms) {
          if (!(typeVars.hasNext())) {
            break;
          }
          SNode typeVar = typeVars.next();
          MapSequence.fromMap(typeByTypeVariable).put(typeVar, typeParm);
        }
      }

      for (SNode superType : BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), classifier, "virtual_getExtendedClassifierTypes_2201875424516179426", new Object[]{})) {
        if (collectImplementedAndExtended(SLinkOperations.getTarget(superType, "classifier", false), subClassifiers, SLinkOperations.getTargets(superType, "parameter", true))) {
          return true;
        }
      }

      SetSequence.fromSet(subClassifiers).removeElement(classifier);
      return false;
    }
  }

  private static SModule check_uu0vlb_a0a0g(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModule();
    }
    return null;
  }
}
