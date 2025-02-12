package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ElsifClause_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.append(" else if (");
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "condition", true), this.getSNode());
    this.append(") {");
    this.increaseDepth();
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "statementList", true), this.getSNode());
    this.decreaseDepth();
    this.appendNewLine();
    this.appendWithIndent("}");
  }
}
