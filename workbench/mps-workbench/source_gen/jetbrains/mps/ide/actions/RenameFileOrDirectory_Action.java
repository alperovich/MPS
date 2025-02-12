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
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.workbench.dialogs.RenameFileDialog;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.MPSProject;
import com.intellij.ide.projectView.ProjectView;
import javax.swing.SwingUtilities;
import java.io.IOException;
import com.intellij.openapi.ui.Messages;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class RenameFileOrDirectory_Action extends BaseAction {
  private static final Icon ICON = null;

  public RenameFileOrDirectory_Action() {
    super("Rename...", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
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
        LOG.error("User's action doUpdate method failed. Action:" + "RenameFileOrDirectory", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("selectedFile", event.getData(PlatformDataKeys.VIRTUAL_FILE));
    if (MapSequence.fromMap(_params).get("selectedFile") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("ideaProject", event.getData(PlatformDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("ideaProject") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSCommonDataKeys.MPS_PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      String oldName = ((VirtualFile) MapSequence.fromMap(_params).get("selectedFile")).getName();
      RenameFileDialog dialog = new RenameFileDialog(((Project) MapSequence.fromMap(_params).get("ideaProject")), oldName, ((VirtualFile) MapSequence.fromMap(_params).get("selectedFile")).isDirectory());
      dialog.show();
      if (!(dialog.isOK())) {
        return;
      }
      final String result = dialog.getResult();

      ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository().getModelAccess().executeCommand(new Runnable() {
        public void run() {
          try {
            if (RenameFileOrDirectory_Action.this.isNotValid(result, _params)) {
              return;
            }
            ((VirtualFile) MapSequence.fromMap(_params).get("selectedFile")).rename(null, result);
            ProjectView.getInstance(((Project) MapSequence.fromMap(_params).get("ideaProject"))).refresh();
            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                ProjectView.getInstance(((Project) MapSequence.fromMap(_params).get("ideaProject"))).getCurrentProjectViewPane().select(null, ((VirtualFile) MapSequence.fromMap(_params).get("selectedFile")), true);
              }
            });
          } catch (IOException e) {
          }
        }
      });
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "RenameFileOrDirectory", t);
      }
    }
  }

  /*package*/ boolean isNotValid(String result, final Map<String, Object> _params) {
    if (result == null || result.length() == 0) {
      Messages.showMessageDialog(((Project) MapSequence.fromMap(_params).get("ideaProject")), "Enter valid name", "Error", Messages.getErrorIcon());
      return true;
    }
    if (check_g7rid4_a0b0a(((VirtualFile) MapSequence.fromMap(_params).get("selectedFile")).getParent(), result) != null) {
      Messages.showMessageDialog(((Project) MapSequence.fromMap(_params).get("ideaProject")), result + " already exists", "Error", Messages.getErrorIcon());
      return true;
    }
    return false;
  }

  protected static Logger LOG = LogManager.getLogger(RenameFileOrDirectory_Action.class);

  private static VirtualFile check_g7rid4_a0b0a(VirtualFile checkedDotOperand, String result) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.findChild(result);
    }
    return null;
  }
}
