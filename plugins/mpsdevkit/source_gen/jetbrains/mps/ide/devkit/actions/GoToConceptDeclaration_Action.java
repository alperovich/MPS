package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import jetbrains.mps.icons.MPSIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import com.intellij.featureStatistics.FeatureUsageTracker;
import jetbrains.mps.openapi.navigation.NavigationSupport;
import jetbrains.mps.smodel.IOperationContext;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class GoToConceptDeclaration_Action extends BaseAction {
  private static final Icon ICON = MPSIcons.Nodes.Structure;

  public GoToConceptDeclaration_Action() {
    super("Concept Declaration", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return SNodeOperations.getConceptDeclaration(((SNode) MapSequence.fromMap(_params).get("node"))) != null;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "GoToConceptDeclaration", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
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
    MapSequence.fromMap(_params).put("context", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      FeatureUsageTracker.getInstance().triggerFeatureUsed("navigation.goto.concept");
      SNode concept = SNodeOperations.getConceptDeclaration(((SNode) MapSequence.fromMap(_params).get("node")));
      NavigationSupport.getInstance().openNode(((IOperationContext) MapSequence.fromMap(_params).get("context")), concept, true, true);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "GoToConceptDeclaration", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(GoToConceptDeclaration_Action.class);
}
