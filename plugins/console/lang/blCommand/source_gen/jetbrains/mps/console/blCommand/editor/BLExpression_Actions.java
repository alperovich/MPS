package jetbrains.mps.console.blCommand.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class BLExpression_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.INSERT, new BLExpression_Actions.BLExpression_Actions_INSERT(node));
  }

  public static class BLExpression_Actions_INSERT extends AbstractCellAction {
    /*package*/ SNode myNode;

    public BLExpression_Actions_INSERT(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode blCommand = SConceptOperations.createNewNode("jetbrains.mps.console.blCommand.structure.BLCommand", null);
      SLinkOperations.setTarget(blCommand, "body", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StatementList", null), true);
      SLinkOperations.addNewChild(SLinkOperations.getTarget(blCommand, "body", true), "statement", "jetbrains.mps.baseLanguage.structure.ExpressionStatement");
      SLinkOperations.setTarget(SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(blCommand, "body", true), "statement", true)).first(), "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", SLinkOperations.getTarget(node, "expression", true), true);
      SNodeOperations.replaceWithAnother(node, blCommand);
    }
  }
}
