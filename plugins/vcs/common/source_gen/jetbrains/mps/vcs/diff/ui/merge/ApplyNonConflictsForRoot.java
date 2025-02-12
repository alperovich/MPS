package jetbrains.mps.vcs.diff.ui.merge;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.vcs.diff.changes.ModelChange;

public class ApplyNonConflictsForRoot extends BaseAction implements DumbAware {
  private MergeRootsPane myPane;

  public ApplyNonConflictsForRoot(MergeRootsPane pane) {
    super("Apply Non-Conflicting Changes", null, MergeModelsDialog.APPLY_NON_CONFLICTS);
    myPane = pane;
    setDisableOnNoProject(false);
  }



  @Override
  protected void doExecute(AnActionEvent event, Map<String, Object> map) {
    myPane.getMergeSession().applyChanges(getChanges());
    myPane.rehighlight();
  }

  @Override
  protected void doUpdate(AnActionEvent event, Map<String, Object> map) {
    event.getPresentation().setEnabled(Sequence.fromIterable(getChanges()).isNotEmpty());
  }

  private Iterable<ModelChange> getChanges() {
    return myPane.getMergeSession().getApplicableChangesForRoot(myPane.getRootId());
  }
}
