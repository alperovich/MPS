package jetbrains.mps.baseLanguage.javadoc.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import org.jetbrains.mps.openapi.model.SNode;

public class FieldDocComment_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    DocCommentTextGen.docCommentStart(node, this);

    DocCommentTextGen.docCommentEnd(node, this);
  }
}
