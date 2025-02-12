package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.projectPane.ProjectPane;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.StandaloneMPSProject;
import javax.swing.JOptionPane;
import java.awt.Frame;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class SetModuleFolder_Action extends BaseAction {
  private static final Icon ICON = null;

  public SetModuleFolder_Action() {
    super("Set Folder", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return ((MPSProject) MapSequence.fromMap(_params).get("project")).isProjectModule(((SModule) MapSequence.fromMap(_params).get("module")));
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "SetModuleFolder", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSCommonDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
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
    MapSequence.fromMap(_params).put("module", event.getData(MPSCommonDataKeys.MODULE));
    if (MapSequence.fromMap(_params).get("module") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      ProjectPane pane = ProjectPane.getInstance(((Project) MapSequence.fromMap(_params).get("ideaProject")));
      String oldFolder = ((StandaloneMPSProject) ((MPSProject) MapSequence.fromMap(_params).get("project"))).getFolderFor(((SModule) MapSequence.fromMap(_params).get("module")));
      String newFolder = JOptionPane.showInputDialog(((Frame) MapSequence.fromMap(_params).get("frame")), "Enter new folder", oldFolder);
      if (newFolder != null) {
        if (newFolder.equals("")) {
          newFolder = null;
        }
        for (SModule m : pane.getSelectedModules()) {
          ((StandaloneMPSProject) ((MPSProject) MapSequence.fromMap(_params).get("project"))).setFolderFor(m, newFolder);
        }
        pane.rebuild();
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "SetModuleFolder", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(SetModuleFolder_Action.class);
}
