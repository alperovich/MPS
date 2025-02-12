package jetbrains.mps.baseLanguage.javadoc.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;

public class CodeSnippet_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.appendNewLine();
    DocCommentTextGen.javadocIndent(this);
    this.append("{{");
    this.increaseDepth();
    this.increaseDepth();
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "statement", true)).isNotEmpty()) {
      for (SNode item : SLinkOperations.getTargets(node, "statement", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
      }
    }
    this.decreaseDepth();
    this.decreaseDepth();
    this.appendNewLine();
    DocCommentTextGen.javadocIndent(this);
    this.append("}}");
  }
}
