package jetbrains.mps.lang.structure.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ShowHelpForNode_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowHelpForNode_Action() {
    super("Show Help for Node", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return HelpHelper.helpForNodeIsAvailable(((SNode) MapSequence.fromMap(_params).get("node"))) && HelpHelper.getDefaultHelpFor(((SModule) MapSequence.fromMap(_params).get("module")), ((SModel) MapSequence.fromMap(_params).get("model")), ((SNode) MapSequence.fromMap(_params).get("node"))) != HelpHelper.HelpType.NODE;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "ShowHelpForNode", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("model", event.getData(MPSCommonDataKeys.CONTEXT_MODEL));
    MapSequence.fromMap(_params).put("module", event.getData(MPSCommonDataKeys.CONTEXT_MODULE));
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      HelpHelper.showHelpForNode(((SNode) MapSequence.fromMap(_params).get("node")));
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "ShowHelpForNode", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(ShowHelpForNode_Action.class);
}
