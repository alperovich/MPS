package jetbrains.mps.lang.core.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class RemoveUnknownChildren_QuickFix extends QuickFix_Runtime {
  public RemoveUnknownChildren_QuickFix() {
  }

  public String getDescription(SNode node) {
    return "Child in undeclared role \"" + ((String) RemoveUnknownChildren_QuickFix.this.getField("role")[0]) + "\"";
  }

  public void execute(SNode node) {
    for (SNode child : ListSequence.fromList(SNodeOperations.getChildren(node))) {
      if (((String) RemoveUnknownChildren_QuickFix.this.getField("role")[0]).equals(SNodeOperations.getContainingLinkRole(child))) {
        SNodeOperations.deleteNode(child);
      }
    }
  }
}
