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

public class DeleteFirstForLoopVar {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new DeleteFirstForLoopVar.DeleteFirstForLoopVar_DELETE(node));
  }

  public static class DeleteFirstForLoopVar_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public DeleteFirstForLoopVar_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "additionalVar", true)).isEmpty()) {
        SNodeOperations.deleteNode(SLinkOperations.getTarget(node, "variable", true));
      } else {
        SNode var = ListSequence.fromList(SLinkOperations.getTargets(node, "additionalVar", true)).removeElementAt(0);
        SNodeOperations.replaceWithAnother(SLinkOperations.getTarget(node, "variable", true), var);
      }
    }
  }
}
