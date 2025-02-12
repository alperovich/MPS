package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.workbench.dialogs.DeleteDialog;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.model.SModel;

public class DeleteNode_Action extends BaseAction {
  private static final Icon ICON = null;

  public DeleteNode_Action() {
    super("Delete", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    for (SNode node : ListSequence.fromList(((List<SNode>) MapSequence.fromMap(_params).get("nodes")))) {
      if (check_v2o7qu_a0a0a0(node.getModel())) {
        return false;
      }
    }
    return ((List<SNode>) MapSequence.fromMap(_params).get("nodes")).size() != 0;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "DeleteNode", t);
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
    MapSequence.fromMap(_params).put("nodes", event.getData(MPSCommonDataKeys.NODES));
    if (MapSequence.fromMap(_params).get("nodes") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final DeleteNodesHelper helper = new DeleteNodesHelper(((List<SNode>) MapSequence.fromMap(_params).get("nodes")), ((MPSProject) MapSequence.fromMap(_params).get("project")));

      final Wrappers._boolean dialogNeeded = new Wrappers._boolean(false);
      ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository().getModelAccess().runReadAction(new Runnable() {
        public void run() {
          dialogNeeded.value = helper.hasOptions();
        }
      });

      DeleteDialog.DeleteOption safeOption = new DeleteDialog.DeleteOption("Safe Delete", false, true);
      DeleteDialog.DeleteOption aspectsOption = new DeleteDialog.DeleteOption("Delete Aspects", true, true);
      if (dialogNeeded.value) {
        DeleteDialog dialog = new DeleteDialog(((MPSProject) MapSequence.fromMap(_params).get("project")), "Delete Node", "Are you sure you want to delete selected node?", safeOption, aspectsOption);
        dialog.show();
        if (!(dialog.isOK())) {
          return;
        }
      }
      helper.deleteNodes(safeOption.selected, aspectsOption.selected, true);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "DeleteNode", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(DeleteNode_Action.class);

  private static boolean check_v2o7qu_a0a0a0(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.isReadOnly();
    }
    return false;
  }
}
