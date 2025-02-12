package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnAction;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.apache.log4j.Priority;
import com.intellij.featureStatistics.FeatureUsageTracker;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class GoToAction_Action extends BaseAction {
  private static final Icon ICON = null;
  private AnAction action;

  public GoToAction_Action(AnAction action_par) {
    super("Go to Action", "", ICON);
    this.action = action_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      GoToAction_Action.this.action.update(event);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "GoToAction", t);
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
      FeatureUsageTracker.getInstance().triggerFeatureUsed("navigation.popup.action");
      GoToAction_Action.this.action.actionPerformed(event);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "GoToAction", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder();
    res.append(super.getActionId());
    res.append("#");
    res.append(action_State((AnAction) this.action));
    res.append("!");
    return res.toString();
  }

  public static String action_State(AnAction object) {
    return "";
  }

  protected static Logger LOG = LogManager.getLogger(GoToAction_Action.class);
}
