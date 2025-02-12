package jetbrains.mps.lang.typesystem.devkit.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.typesystem.uiActions.AffectingRulesFinder;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ShowRulesWhichAffectNodeType_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowRulesWhichAffectNodeType_Action() {
    super("Show Rules Which Affect Node's Type", "", ICON);
    this.setIsAlwaysVisible(true);
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
        LOG.error("User's action doUpdate method failed. Action:" + "ShowRulesWhichAffectNodeType", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("operationContext", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("operationContext") == null) {
      return false;
    }
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
      final Wrappers._T<SearchQuery> query = new Wrappers._T<SearchQuery>();
      final Wrappers._T<IResultProvider> provider = new Wrappers._T<IResultProvider>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          query.value = new SearchQuery(((SNode) MapSequence.fromMap(_params).get("node")), ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")).getScope());
          provider.value = FindUtils.makeProvider(new AffectingRulesFinder());
        }
      });
      ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")).getComponent(UsagesViewTool.class).findUsages(provider.value, query.value, false, true, false, "no rules found");
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "ShowRulesWhichAffectNodeType", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(ShowRulesWhichAffectNodeType_Action.class);
}
