package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class HexIntegerLiteral_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.append("0x" + SPropertyOperations.getString(node, "value"));
  }
}
