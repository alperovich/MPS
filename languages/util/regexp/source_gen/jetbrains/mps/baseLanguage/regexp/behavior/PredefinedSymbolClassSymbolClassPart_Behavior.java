package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class PredefinedSymbolClassSymbolClassPart_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getRepresentation_8173814113624650482(SNode thisNode) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "declaration", false), "name");
  }

  @Deprecated
  public static String call_getRepresentation_8173814113624650544(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getRepresentation_8173814113624650482", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getRepresentation_8173814113624650544(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart"), callerConceptFqName, "virtual_getRepresentation_8173814113624650482", new Class[]{SNode.class}, new Object[]{});
  }
}
