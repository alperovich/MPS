package jetbrains.mps.baseLanguage.extensionMethods.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class ExtensionMethodDeclaration_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.RIGHT_TRANSFORM, new ExtensionMethodDeclaration_Actions.ExtensionMethodDeclaration_Actions_RIGHT_TRANSFORM(node));
  }

  public static class ExtensionMethodDeclaration_Actions_RIGHT_TRANSFORM extends AbstractCellAction {
    /*package*/ SNode myNode;

    public ExtensionMethodDeclaration_Actions_RIGHT_TRANSFORM(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).isEmpty()) {
        SNodeFactoryOperations.addNewChild(node, "throwsItem", "jetbrains.mps.baseLanguage.structure.Type");
      }
    }
  }
}
