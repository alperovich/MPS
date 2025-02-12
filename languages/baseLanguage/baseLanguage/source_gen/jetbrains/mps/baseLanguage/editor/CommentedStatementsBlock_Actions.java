package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CommentedStatementsBlock_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new CommentedStatementsBlock_Actions.CommentedStatementsBlock_Actions_DELETE(node));
  }

  public static class CommentedStatementsBlock_Actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public CommentedStatementsBlock_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "remove commenting";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      for (SNode statement : ListSequence.fromList(SLinkOperations.getTargets(node, "statement", true))) {
        SNodeOperations.insertPrevSiblingChild(node, statement);
      }
      SNodeOperations.deleteNode(node);
    }
  }
}
