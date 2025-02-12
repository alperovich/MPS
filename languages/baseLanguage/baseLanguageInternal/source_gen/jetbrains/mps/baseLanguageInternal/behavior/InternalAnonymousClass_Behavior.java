package jetbrains.mps.baseLanguageInternal.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class InternalAnonymousClass_Behavior {
  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "nonStatic", "" + (true));
  }

  public static String virtual_getUnitName_5067982036267369911(SNode thisNode) {
    return InternalAnonymousClass_Behavior.call_getJavaName_3421461530438560397(thisNode);
  }

  public static String call_getJavaName_3421461530438560397(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, true);
    if ((ancestor == null)) {
      return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getFqName_1213877404258", new Object[]{});
    }
    return BehaviorReflection.invokeVirtual(String.class, ancestor, "virtual_getFqName_1213877404258", new Object[]{}) + "$" + InternalAnonymousClass_Behavior.call_getIndexInContainingClass_3421461530438560434(thisNode);
  }

  public static int call_getIndexInContainingClass_3421461530438560434(SNode thisNode) {
    final SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    int index = ListSequence.fromList(SNodeOperations.getDescendantsWhereConceptInList(ancestor, new String[]{"jetbrains.mps.baseLanguage.structure.AnonymousClass", "jetbrains.mps.baseLanguageInternal.structure.InternalAnonymousClass"}, false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.getAncestor(it, "jetbrains.mps.baseLanguage.structure.Classifier", false, false) == ancestor;
      }
    }).indexOf(thisNode) + 1;
    return index;
  }

  public static SNode virtual_getSuperclass_1240936569950(SNode thisNode) {
    return _quotation_createNode_bwi1fo_a0a3();
  }

  public static String virtual_getNestedName_8540045600162184125(SNode thisNode) {
    SNode containingClassifier = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    return (containingClassifier != null ?
      InternalAnonymousClass_Behavior.call_getAnonymousClassPresentation_3421461530438560331(thisNode, containingClassifier) + BehaviorReflection.invokeVirtual(String.class, containingClassifier, "virtual_getNestedName_8540045600162184125", new Object[]{}) :
      BehaviorReflection.invokeSuper(String.class, thisNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", "virtual_getNestedName_8540045600162184125", new Object[]{})
    );
  }

  public static String virtual_getFqName_1213877404258(SNode thisNode) {
    SNode containingClassifier = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    return (containingClassifier != null ?
      InternalAnonymousClass_Behavior.call_getAnonymousClassPresentation_3421461530438560331(thisNode, containingClassifier) + BehaviorReflection.invokeVirtual(String.class, containingClassifier, "virtual_getFqName_1213877404258", new Object[]{}) :
      BehaviorReflection.invokeSuper(String.class, thisNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", "virtual_getFqName_1213877404258", new Object[]{})
    );
  }

  public static String call_getAnonymousClassPresentation_3421461530438560331(SNode thisNode, SNode containingClassifier) {
    String result = "Anonymous in ";
    SNode containingMethod = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
    if (containingMethod != null && SNodeOperations.getParent(containingMethod) == containingClassifier) {
      result += SPropertyOperations.getString(containingMethod, "name") + "() in ";
    }
    return result;
  }

  @Deprecated
  public static String call_getUnitName_3421461530438560389(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getUnitName_5067982036267369911", new Object[]{});
  }

  @Deprecated
  public static String call_getNestedName_3421461530438560275(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getNestedName_8540045600162184125", new Object[]{});
  }

  @Deprecated
  public static String call_getFqName_3421461530438560303(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getFqName_1213877404258", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getUnitName_3421461530438560389(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguageInternal.structure.InternalAnonymousClass"), callerConceptFqName, "virtual_getUnitName_5067982036267369911", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static String callSuper_getNestedName_3421461530438560275(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguageInternal.structure.InternalAnonymousClass"), callerConceptFqName, "virtual_getNestedName_8540045600162184125", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static String callSuper_getFqName_3421461530438560303(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguageInternal.structure.InternalAnonymousClass"), callerConceptFqName, "virtual_getFqName_1213877404258", new Class[]{SNode.class}, new Object[]{});
  }

  private static SNode _quotation_createNode_bwi1fo_a0a3() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Object")));
    return quotedNode_1;
  }
}
