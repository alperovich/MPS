package jetbrains.mps.lang.structure.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.NameUtil;
import org.apache.log4j.Priority;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ShowDefaultHelp_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowDefaultHelp_Action() {
    super("Show Default Help", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        HelpHelper.HelpType defaultHelp = HelpHelper.getDefaultHelpFor(((SModule) MapSequence.fromMap(_params).get("module")), ((SModel) MapSequence.fromMap(_params).get("model")), ((SNode) MapSequence.fromMap(_params).get("node")));
        if (defaultHelp == null) {
          ShowDefaultHelp_Action.this.setEnabledState(event.getPresentation(), false);
          return;
        }
        ShowDefaultHelp_Action.this.setEnabledState(event.getPresentation(), true);
        event.getPresentation().setText("Show Help for " + NameUtil.capitalize(defaultHelp.getName()));
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "ShowDefaultHelp", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("module", event.getData(MPSCommonDataKeys.CONTEXT_MODULE));
    MapSequence.fromMap(_params).put("model", event.getData(MPSCommonDataKeys.CONTEXT_MODEL));
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      HelpHelper.showHelpFor(((SModule) MapSequence.fromMap(_params).get("module")), ((SModel) MapSequence.fromMap(_params).get("model")), ((SNode) MapSequence.fromMap(_params).get("node")));
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "ShowDefaultHelp", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(ShowDefaultHelp_Action.class);
}
