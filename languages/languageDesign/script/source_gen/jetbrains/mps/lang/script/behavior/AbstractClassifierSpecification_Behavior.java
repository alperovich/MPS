package jetbrains.mps.lang.script.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class AbstractClassifierSpecification_Behavior {
  public static void init(SNode thisNode) {
  }

  @Deprecated
  public static String call_getClassifierFqName_5434557751112930827(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getClassifierFqName_5434557751112930827", new Object[]{});
  }

  @Deprecated
  public static String call_getSModelReference_5434557751113441014(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getSModelReference_5434557751113441014", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getClassifierFqName_5434557751112930827(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.script.structure.AbstractClassifierSpecification"), callerConceptFqName, "virtual_getClassifierFqName_5434557751112930827", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static String callSuper_getSModelReference_5434557751113441014(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.script.structure.AbstractClassifierSpecification"), callerConceptFqName, "virtual_getSModelReference_5434557751113441014", new Class[]{SNode.class}, new Object[]{});
  }
}
