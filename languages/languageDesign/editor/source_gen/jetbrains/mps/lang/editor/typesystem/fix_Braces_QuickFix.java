package jetbrains.mps.lang.editor.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class fix_Braces_QuickFix extends QuickFix_Runtime {
  public fix_Braces_QuickFix() {
  }

  public String getDescription(SNode node) {
    return "Do Not Use Braces";
  }

  public void execute(SNode node) {
    SPropertyOperations.set(((SNode) fix_Braces_QuickFix.this.getField("collectionCell")[0]), "usesBraces", "" + (false));
  }
}
