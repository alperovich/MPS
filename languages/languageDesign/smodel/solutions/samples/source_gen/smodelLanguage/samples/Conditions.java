package smodelLanguage.samples;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Conditions {
  public void checkTypeOfNode(SNode node) {
    boolean b = SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.IfStatement");
    boolean b2 = SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IfStatement"), "condition", true), "jetbrains.mps.baseLanguage.structure.BooleanConstant");
  }

  public void checkRoleAndTypeOfDirectParent(SNode node) {
    boolean b = SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.IfStatement", "condition");
  }

  public boolean checkIsNull(SNode node) {
    if ((node == null)) {
    } else
    if ((node != null)) {
    }
    return (node == null) || (node != null);
  }
}
