package jetbrains.mps.baseLanguage.javadoc.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.javadoc.editor.NodeCaretPair;
import org.jetbrains.mps.openapi.model.SNode;

public class InlineTagCommentLinePart_BehaviorDescriptor extends CommentLinePart_BehaviorDescriptor {
  public InlineTagCommentLinePart_BehaviorDescriptor() {
  }

  public NodeCaretPair virtual_smartDelete_9042833497008205283(SNode thisNode, boolean isBegining) {
    return InlineTagCommentLinePart_Behavior.virtual_smartDelete_9042833497008205283(thisNode, isBegining);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.javadoc.structure.InlineTagCommentLinePart";
  }
}
