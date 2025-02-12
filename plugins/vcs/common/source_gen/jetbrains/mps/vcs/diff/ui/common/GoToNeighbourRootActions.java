package jetbrains.mps.vcs.diff.ui.common;

/*Generated by MPS */

import javax.swing.Icon;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.actionSystem.ShortcutSet;
import com.intellij.openapi.actionSystem.CustomShortcutSet;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeId;

public abstract class GoToNeighbourRootActions {
  private static final Icon PREVIOUS_ROOT_ICON = IconLoader.getIcon("/actions/prevfile.png");
  private static final Icon NEXT_ROOT_ICON = IconLoader.getIcon("/actions/nextfile.png");
  public static final ShortcutSet PREV_ROOT_SHORTCUT = CustomShortcutSet.fromString("control LEFT");
  public static final ShortcutSet NEXT_ROOT_SHORTCUT = CustomShortcutSet.fromString("control RIGHT");
  private BaseAction[] myActions;

  public GoToNeighbourRootActions() {
    myActions = new BaseAction[]{new GoToNeighbourRootActions.TheAction(false), new GoToNeighbourRootActions.TheAction(true)};
  }

  protected abstract boolean hasNeighbour(boolean next);

  protected abstract void goToNeighbour(boolean next);

  public final BaseAction previous() {
    return myActions[0];
  }

  public final BaseAction next() {
    return myActions[1];
  }

  public BaseAction[] getActions() {
    return myActions;
  }

  private class TheAction extends BaseAction implements DumbAware {
    private boolean myNext;

    public TheAction(boolean next) {
      super("Go to " + ((next ?
        "Next" :
        "Previous"
      )) + " Root", null, (next ?
        GoToNeighbourRootActions.NEXT_ROOT_ICON :
        GoToNeighbourRootActions.PREVIOUS_ROOT_ICON
      ));
      setDisableOnNoProject(false);
      setExecuteOutsideCommand(true);
      myNext = next;
    }

    @Override
    protected void doExecute(AnActionEvent event, Map<String, Object> map) {
      goToNeighbour(myNext);
    }

    @Override
    protected void doUpdate(AnActionEvent event, Map<String, Object> map) {
      setEnabledState(event.getPresentation(), hasNeighbour(myNext));
    }
  }

  public static abstract class GoToByTree extends GoToNeighbourRootActions {
    private DiffModelTree myTree;

    public GoToByTree(@NotNull DiffModelTree tree) {
      myTree = tree;
    }

    @Nullable
    protected abstract SNodeId getCurrentNodeId();

    public abstract void setCurrentNodeId(@Nullable SNodeId nodeId);

    @Override
    protected boolean hasNeighbour(boolean next) {
      return myTree.hasNeighbour(getCurrentNodeId(), next);
    }

    @Override
    protected void goToNeighbour(boolean next) {
      SNodeId nodeId = myTree.getNeighbourRoot(getCurrentNodeId(), next);
      setCurrentNodeId(nodeId);
      myTree.setSelected(nodeId);
    }
  }
}
