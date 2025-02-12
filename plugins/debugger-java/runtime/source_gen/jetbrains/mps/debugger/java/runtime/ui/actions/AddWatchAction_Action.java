package jetbrains.mps.debugger.java.runtime.ui.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.debugger.api.ui.DebugActionsUtil;
import org.apache.log4j.Priority;
import jetbrains.mps.debug.api.evaluation.IEvaluationProvider;
import jetbrains.mps.debugger.java.runtime.evaluation.EvaluationProvider;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class AddWatchAction_Action extends BaseAction {
  private static final Icon ICON = AllIcons.General.Add;

  public AddWatchAction_Action() {
    super("New Watch...", "New Watch...", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      event.getPresentation().setEnabled(DebugActionsUtil.getEvaluationProvider(event) != null);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "AddWatchAction", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      IEvaluationProvider evaluationProvider = DebugActionsUtil.getEvaluationProvider(event);
      if (evaluationProvider != null) {
        ((EvaluationProvider) evaluationProvider).createWatch();
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "AddWatchAction", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(AddWatchAction_Action.class);
}
