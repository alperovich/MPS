package jetbrains.mps.ide.editor.actions.core;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.openapi.editor.message.SimpleEditorMessage;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.project.Project;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ShowNodeMessages_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowNodeMessages_Action() {
    super("Show Node Messages", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return !(ListSequence.fromList(((List<SimpleEditorMessage>) ((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).getHighlightManager().getMessagesFor(((SNode) MapSequence.fromMap(_params).get("node"))))).isEmpty());
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "ShowNodeMessages", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(PlatformDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("node", event.getData(MPSCommonDataKeys.NODE));
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorComponent", event.getData(MPSEditorDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editorComponent") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSCommonDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      List<SimpleEditorMessage> messages = ((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).getHighlightManager().getMessagesFor(((SNode) MapSequence.fromMap(_params).get("node")));
      StringBuilder sb = new StringBuilder();
      for (SimpleEditorMessage message : messages) {
        sb.append(message.getMessage());
        sb.append("; owner is ");
        sb.append(message.getOwner());
        sb.append("\n");
      }
      Messages.showMessageDialog(((Project) MapSequence.fromMap(_params).get("project")), sb.toString(), "Node Messages", Messages.getInformationIcon());
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "ShowNodeMessages", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(ShowNodeMessages_Action.class);
}
