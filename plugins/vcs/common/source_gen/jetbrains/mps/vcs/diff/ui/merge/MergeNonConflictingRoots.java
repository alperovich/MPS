package jetbrains.mps.vcs.diff.ui.merge;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;

public class MergeNonConflictingRoots extends BaseAction implements DumbAware {
  private MergeModelsDialog myDialog;

  public MergeNonConflictingRoots(MergeModelsDialog dialog) {
    super("Automatically Merge Non-Conflicting Roots", null, MergeModelsDialog.APPLY_NON_CONFLICTS);
    myDialog = dialog;
    setDisableOnNoProject(false);
  }

  @Override
  protected void doExecute(AnActionEvent event, Map<String, Object> map) {
    myDialog.mergeNonConflictingRoots();
    myDialog.rebuildLater();
  }

  @Override
  protected void doUpdate(AnActionEvent event, Map<String, Object> map) {
    event.getPresentation().setEnabled(myDialog.hasNonConflictingRoots());
  }
}
