package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TemplateDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "applicableConcept", false);
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SLinkOperations.setTarget(thisNode, "applicableConcept", baseConcept, false);
    SPropertyOperations.set(thisNode, "name", "reduce_" + SPropertyOperations.getString(baseConcept, "name"));
  }

  @Deprecated
  public static SNode call_getBaseConcept_8952337903384729127(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getBaseConcept_2621449412040133768", new Object[]{});
  }

  @Deprecated
  public static void call_setBaseConcept_390427525177435267(SNode thisNode, SNode baseConcept) {
    BehaviorReflection.invokeVirtual(Void.class, thisNode, "virtual_setBaseConcept_6261424444345963020", new Object[]{baseConcept});
  }

  @Deprecated
  public static SNode callSuper_getBaseConcept_8952337903384729127(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static void callSuper_setBaseConcept_390427525177435267(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Void.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", new Class[]{SNode.class, SNode.class}, new Object[]{baseConcept});
  }
}
