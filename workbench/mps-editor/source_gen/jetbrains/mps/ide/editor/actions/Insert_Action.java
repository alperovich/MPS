package jetbrains.mps.ide.editor.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.editor.runtime.style.StyleAttributesUtil;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Insert_Action extends BaseAction {
  private static final Icon ICON = null;

  public Insert_Action() {
    super("Insert New Element", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return EditorActionUtils.isWriteActionEnabled(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent"))) && EditorActionUtils.getEditorCellToInsert(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent"))) != null;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "Insert", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorComponent", event.getData(MPSEditorDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editorComponent") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      EditorCell editorCell = EditorActionUtils.getEditorCellToInsert(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")));
      if (((jetbrains.mps.nodeEditor.cells.EditorCell) editorCell).isFirstCaretPosition()) {
        if (!(((jetbrains.mps.nodeEditor.cells.EditorCell) editorCell).isLastCaretPosition()) || !(StyleAttributesUtil.isLastPositionAllowed(editorCell.getStyle()))) {
          EditorActionUtils.callInsertBeforeAction(editorCell);
          return;
        }
      }
      EditorActionUtils.callInsertAction(editorCell);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "Insert", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(Insert_Action.class);
}
