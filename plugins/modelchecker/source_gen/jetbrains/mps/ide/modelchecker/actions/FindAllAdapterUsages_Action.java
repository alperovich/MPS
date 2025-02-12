package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import java.util.List;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.ide.modelchecker.platform.actions.ModelCheckerTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class FindAllAdapterUsages_Action extends BaseAction {
  private static final Icon ICON = null;

  public FindAllAdapterUsages_Action() {
    super("Find All Adapter Usages", "Finds Usages in all available models", ICON);
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
        LOG.error("User's action doUpdate method failed. Action:" + "FindAllAdapterUsages", t);
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
    MapSequence.fromMap(_params).put("operationContext", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("operationContext") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      List<SModel> models = ListSequence.fromListWithValues(new ArrayList<SModel>(), Sequence.fromIterable(((Iterable<SModel>) SModelRepository.getInstance().getModelDescriptors())).where(new IWhereFilter<SModel>() {
        public boolean accept(SModel md) {
          return SModelStereotype.isUserModel(md);
        }
      }));
      ModelCheckerTool.getInstance(((Project) MapSequence.fromMap(_params).get("project"))).checkModels(models, ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")), true, new AdapterUsagesFinder());
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "FindAllAdapterUsages", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(FindAllAdapterUsages_Action.class);
}
