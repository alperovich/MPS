package jetbrains.mps.execution.commands.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.openapi.editor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.CellConditions;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class RedirectOutputExpression {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new RedirectOutputExpression.RedirectOutputExpression_DELETE(node));
  }

  public static class RedirectOutputExpression_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public RedirectOutputExpression_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "replace redirect expression with process";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode expression = SLinkOperations.getTarget(node, "processHandler", true);
      SNodeOperations.replaceWithAnother(node, expression);

      // some stuff I copied from binary operation 
      // it does some magic with selection 
      editorContext.flushEvents();
      EditorComponent editor = editorContext.getEditorComponent();
      EditorCell cell = editor.findNodeCell(expression);
      if (cell != null) {
        EditorCell lastLeaf = ((jetbrains.mps.nodeEditor.cells.EditorCell) cell).getLastLeaf(CellConditions.SELECTABLE);
        editor.changeSelection(lastLeaf);
        if (lastLeaf instanceof EditorCell_Label) {
          ((EditorCell_Label) lastLeaf).end();
        }
      }

    }
  }
}
