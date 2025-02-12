package jetbrains.mps.baseLanguage.regexp.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class MatchParensRegexp_removeName {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new MatchParensRegexp_removeName.MatchParensRegexp_removeName_DELETE(node));
  }

  public static class MatchParensRegexp_removeName_DELETE extends AbstractCellAction {
    /*package*/ SNode myNode;

    public MatchParensRegexp_removeName_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNodeFactoryOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp");
    }
  }
}
