package jetbrains.mps.execution.commands.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class NewProcessBuilderExpression_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isLegalAsStatement_1239211900844(SNode thisNode) {
    return true;
  }

  @Deprecated
  public static boolean call_isLegalAsStatement_889694274152026870(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_isLegalAsStatement_1239211900844", new Object[]{});
  }

  @Deprecated
  public static boolean callSuper_isLegalAsStatement_889694274152026870(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.NewProcessBuilderExpression"), callerConceptFqName, "virtual_isLegalAsStatement_1239211900844", new Class[]{SNode.class}, new Object[]{});
  }
}
