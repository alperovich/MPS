package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.openapi.editor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.CellConditions;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class BinaryOperation_RightArgument_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new BinaryOperation_RightArgument_Actions.BinaryOperation_RightArgument_Actions_DELETE(node));
  }

  public static class BinaryOperation_RightArgument_Actions_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public BinaryOperation_RightArgument_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "replace binary operation with left operand";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (!(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(node, "rightExpression", true)), NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression"))))) {
        SLinkOperations.setTarget(node, "rightExpression", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.Expression", null), true);
        return;
      }
      SNode leftExpression = SLinkOperations.getTarget(node, "leftExpression", true);
      SNodeOperations.replaceWithAnother(node, leftExpression);
      editorContext.flushEvents();
      EditorComponent editor = editorContext.getEditorComponent();
      EditorCell cell = editor.findNodeCell(leftExpression);
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
