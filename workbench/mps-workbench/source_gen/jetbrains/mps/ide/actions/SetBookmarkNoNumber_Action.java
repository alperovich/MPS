package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.bookmark.BookmarkManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.mps.openapi.model.SNode;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class SetBookmarkNoNumber_Action extends BaseAction {
  private static final Icon ICON = null;

  public SetBookmarkNoNumber_Action() {
    super("Set Bookmark", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "SetBookmarkNoNumber", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("node", event.getData(MPSCommonDataKeys.NODE));
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(PlatformDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      BookmarkManager bookmarkManager = ((Project) MapSequence.fromMap(_params).get("project")).getComponent(BookmarkManager.class);
      bookmarkManager.setUnnumberedBookmark(((SNode) MapSequence.fromMap(_params).get("node")));
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "SetBookmarkNoNumber", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(SetBookmarkNoNumber_Action.class);
}
