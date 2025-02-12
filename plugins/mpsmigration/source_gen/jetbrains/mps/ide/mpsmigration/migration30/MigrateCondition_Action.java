package jetbrains.mps.ide.mpsmigration.migration30;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import java.util.List;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModelStereotype;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.model.SNodeUtil;
import org.jetbrains.mps.openapi.model.SReference;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNodeId;
import jetbrains.mps.smodel.SModelRepository;
import org.jetbrains.mps.openapi.model.EditableSModel;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class MigrateCondition_Action extends BaseAction {
  private static final Icon ICON = null;

  public MigrateCondition_Action() {
    super("Migrate Condition Inteface", "", ICON);
    this.setIsAlwaysVisible(false);
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
        LOG.error("User's action doUpdate method failed. Action:" + "MigrateCondition", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSCommonDataKeys.MPS_PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      List<SModule> modulelist = ((MPSProject) MapSequence.fromMap(_params).get("project")).getModulesWithGenerators();

      for (SModel md : ListSequence.fromList(modulelist).translate(new ITranslator2<SModule, SModel>() {
        public Iterable<SModel> translate(SModule it) {
          return it.getModels();
        }
      }).where(new IWhereFilter<SModel>() {
        public boolean accept(SModel m) {
          return SModelStereotype.isUserModel(m) && !(m.isReadOnly());
        }
      })) {
        for (SNode node : Sequence.fromIterable(SNodeUtil.getDescendants(md))) {
          for (SReference ref : Sequence.fromIterable(node.getReferences())) {
            if (!(ref instanceof jetbrains.mps.smodel.SReference)) {
              continue;
            }
            SModelReference targetModel = ref.getTargetSModelReference();
            if (targetModel == null) {
              continue;
            }
            if (!(targetModel.getModelName().equals("jetbrains.mps.util@java_stub"))) {
              continue;
            }
            SNodeId id = ref.getTargetNodeId();
            if (id == null) {
              continue;
            }
            if (!(id instanceof jetbrains.mps.smodel.SNodeId.Foreign)) {
              continue;
            }
            jetbrains.mps.smodel.SNodeId.Foreign fid = ((jetbrains.mps.smodel.SNodeId.Foreign) id);
            if (!(fid.getId().equals("~Condition"))) {
              continue;
            }
            ((jetbrains.mps.smodel.SReference) ref).setTargetSModelReference(SModelRepository.getInstance().getModelDescriptor(new jetbrains.mps.smodel.SModelReference("org.jetbrains.mps.util", "java_stub")).getReference());
            if (md instanceof EditableSModel) {
              ((EditableSModel) md).setChanged(true);
            }
          }
        }
      }
      SModelRepository.getInstance().saveAll();
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "MigrateCondition", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(MigrateCondition_Action.class);
}
