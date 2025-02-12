package jetbrains.mps.build.workflow.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class rt_SubTask_AfterOrBefore {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.RIGHT_TRANSFORM, new rt_SubTask_AfterOrBefore.rt_SubTask_AfterOrBefore_RIGHT_TRANSFORM(node));
  }

  public static class rt_SubTask_AfterOrBefore_RIGHT_TRANSFORM extends AbstractCellAction {
    /*package*/ SNode myNode;

    public rt_SubTask_AfterOrBefore_RIGHT_TRANSFORM(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "before", true)).isEmpty()) {
        SLinkOperations.addNewChild(node, "before", "jetbrains.mps.build.workflow.structure.BwfSubTaskDependency");
      } else if (ListSequence.fromList(SLinkOperations.getTargets(node, "after", true)).isEmpty()) {
        SLinkOperations.addNewChild(node, "after", "jetbrains.mps.build.workflow.structure.BwfSubTaskDependency");
      }
    }
  }
}
