package jetbrains.mps.baseLanguage.javadoc.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class InlineTagCommentLinePart_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new InlineTagCommentLinePart_Actions.InlineTagCommentLinePart_Actions_DELETE(node));
  }

  public static class InlineTagCommentLinePart_Actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public InlineTagCommentLinePart_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode commentLine = SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.javadoc.structure.CommentLine");
      SNodeOperations.deleteNode(node);
      for (int i = 0; i < ListSequence.fromList(SLinkOperations.getTargets(commentLine, "part", true)).count() - 1; i++) {
        SNode part1 = ListSequence.fromList(SLinkOperations.getTargets(commentLine, "part", true)).getElement(i);
        SNode part2 = ListSequence.fromList(SLinkOperations.getTargets(commentLine, "part", true)).getElement(i + 1);
        if (SNodeOperations.isInstanceOf(part1, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart") && SNodeOperations.isInstanceOf(part2, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart")) {
          SPropertyOperations.set(SNodeOperations.cast(part1, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "text", SPropertyOperations.getString(SNodeOperations.cast(part1, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "text") + SPropertyOperations.getString(SNodeOperations.cast(part2, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "text"));
          SNodeOperations.deleteNode(part2);
          i--;
        }
      }
      editorContext.flushEvents();
    }
  }
}
