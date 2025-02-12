package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class NotExpression_Parens_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new NotExpression_Parens_Actions.NotExpression_Parens_Actions_DELETE(node));
  }

  public static class NotExpression_Parens_Actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public NotExpression_Parens_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "remove not-expression";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, "expression", true));
    }
  }
}
