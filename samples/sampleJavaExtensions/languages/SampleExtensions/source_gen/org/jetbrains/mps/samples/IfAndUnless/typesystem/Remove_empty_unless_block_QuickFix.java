package org.jetbrains.mps.samples.IfAndUnless.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class Remove_empty_unless_block_QuickFix extends QuickFix_Runtime {
  public Remove_empty_unless_block_QuickFix() {
  }

  public String getDescription(SNode node) {
    return "Remove empty unless block";
  }

  public void execute(SNode node) {
    SNodeOperations.deleteNode(((SNode) Remove_empty_unless_block_QuickFix.this.getField("node")[0]));
  }
}
