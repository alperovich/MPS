package jetbrains.mps.samples.lambdaCalculus.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class Abstraction_Variable_actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new Abstraction_Variable_actions.Abstraction_Variable_actions_DELETE(node));
  }

  public static class Abstraction_Variable_actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public Abstraction_Variable_actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode body = SLinkOperations.getTarget(node, "body", true);
      SNodeOperations.replaceWithAnother(node, body);
    }
  }
}
