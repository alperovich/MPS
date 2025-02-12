package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.List;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.util.SNodeOperations;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.IOperationContext;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class BuildAllBehaviors_Action extends BaseAction {
  private static final Icon ICON = null;

  public BuildAllBehaviors_Action() {
    super("Rebuild All Behaviors", "", ICON);
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
        LOG.error("User's action doUpdate method failed. Action:" + "BuildAllBehaviors", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("mpsProject", event.getData(MPSCommonDataKeys.MPS_PROJECT));
    if (MapSequence.fromMap(_params).get("mpsProject") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final Wrappers._T<List<SModel>> models = new Wrappers._T<List<SModel>>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          Iterable<SModel> allModels = SModelRepository.getInstance().getModelDescriptors();
          models.value = ListSequence.fromListWithValues(new ArrayList<SModel>(), Sequence.fromIterable(allModels).where(new IWhereFilter<SModel>() {
            public boolean accept(SModel it) {
              return SNodeOperations.isGeneratable(it) && LanguageAspect.BEHAVIOR.is(it);
            }
          }));
        }
      });

      new MakeActionImpl(((IOperationContext) MapSequence.fromMap(_params).get("context")), new MakeActionParameters(((IOperationContext) MapSequence.fromMap(_params).get("context")), models.value, null, null, null), true).executeAction();
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "BuildAllBehaviors", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(BuildAllBehaviors_Action.class);
}
