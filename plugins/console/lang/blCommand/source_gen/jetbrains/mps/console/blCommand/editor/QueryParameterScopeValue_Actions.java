package jetbrains.mps.console.blCommand.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.openapi.editor.cells.CellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class QueryParameterScopeValue_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new QueryParameterScopeValue_Actions.QueryParameterScopeValue_Actions_DELETE(node));
  }

  public static class QueryParameterScopeValue_Actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public QueryParameterScopeValue_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SLinkOperations.getTarget(node, "value", true) != null) {
        SLinkOperations.setTarget(node, "value", null, true);
        return;
      }
      CellAction action = editorContext.getEditorComponent().findNodeCell(node).getAction(CellActionType.DELETE);
      if (action != null && action.canExecute(editorContext)) {
        action.execute(editorContext);
        return;
      }
      SNodeOperations.deleteNode(node);
    }
  }
}
