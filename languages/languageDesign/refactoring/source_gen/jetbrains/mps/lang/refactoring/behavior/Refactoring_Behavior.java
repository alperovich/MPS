package jetbrains.mps.lang.refactoring.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class Refactoring_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "target", true), "jetbrains.mps.lang.refactoring.structure.NodeTarget"))) {
      return null;
    }
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "target", true), "jetbrains.mps.lang.refactoring.structure.NodeTarget"), "concept", false);
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SNode nodeTarget = SConceptOperations.createNewNode("jetbrains.mps.lang.refactoring.structure.NodeTarget", null);
    SLinkOperations.setTarget(nodeTarget, "concept", baseConcept, false);
    SLinkOperations.setTarget(thisNode, "target", nodeTarget, true);
  }

  public static boolean call_isLoggable_1347577327951509202(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "updateModelBlock", true) != null);
  }

  @Deprecated
  public static SNode call_getBaseConcept_4205271146524200392(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getBaseConcept_2621449412040133768", new Object[]{});
  }

  @Deprecated
  public static void call_setBaseConcept_6261424444345979536(SNode thisNode, SNode baseConcept) {
    BehaviorReflection.invokeVirtual(Void.class, thisNode, "virtual_setBaseConcept_6261424444345963020", new Object[]{baseConcept});
  }

  @Deprecated
  public static SNode callSuper_getBaseConcept_4205271146524200392(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.Refactoring"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static void callSuper_setBaseConcept_6261424444345979536(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Void.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.Refactoring"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", new Class[]{SNode.class, SNode.class}, new Object[]{baseConcept});
  }
}
