package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.project.SModuleOperations;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import java.util.Set;
import java.util.Collections;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class MakeModule_Action extends BaseAction {
  private static final Icon ICON = null;

  public MakeModule_Action() {
    super("Compile Java Files", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return SModuleOperations.isCompileInMps(((SModule) MapSequence.fromMap(_params).get("module")));
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "MakeModule", t);
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
    MapSequence.fromMap(_params).put("module", event.getData(MPSCommonDataKeys.MODULE));
    if (MapSequence.fromMap(_params).get("module") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      Set<SModule> modules = Collections.<SModule>singleton(((SModule) MapSequence.fromMap(_params).get("module")));
      ProgressManager.getInstance().run(new DefaultMakeTask(((Project) MapSequence.fromMap(_params).get("project")), "Compiling", modules, false));
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "MakeModule", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(MakeModule_Action.class);
}
