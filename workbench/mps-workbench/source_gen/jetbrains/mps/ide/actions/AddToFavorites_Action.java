package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.apache.log4j.Priority;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.projectPane.favorites.MPSFavoritesManager;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.ide.projectPane.favorites.FavoritesUtil;
import javax.swing.tree.TreeNode;
import jetbrains.mps.ide.projectPane.favorites.FavoritesProjectPane;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class AddToFavorites_Action extends BaseAction {
  private static final Icon ICON = null;
  private String name;

  public AddToFavorites_Action(String name_par) {
    super("Add to Favorites", "", ICON);
    this.name = name_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      event.getPresentation().setText(AddToFavorites_Action.this.name);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "AddToFavorites", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("treeNodes", event.getData(MPSCommonDataKeys.TREE_NODES));
    if (MapSequence.fromMap(_params).get("treeNodes") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(PlatformDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      MPSFavoritesManager favoritesManager = ((Project) MapSequence.fromMap(_params).get("project")).getComponent(MPSFavoritesManager.class);
      if (favoritesManager == null) {
        return;
      }
      List<Object> toMove = FavoritesUtil.getObjects(((List<TreeNode>) MapSequence.fromMap(_params).get("treeNodes")));
      FavoritesProjectPane pane = FavoritesUtil.getCurrentPane(((Project) MapSequence.fromMap(_params).get("project")));
      if (pane != null) {
        favoritesManager.removeRoots(pane.getSubId(), toMove);
      }
      favoritesManager.addRoots(AddToFavorites_Action.this.name, toMove);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "AddToFavorites", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder();
    res.append(super.getActionId());
    res.append("#");
    res.append(name_State((String) this.name));
    res.append("!");
    return res.toString();
  }

  public static String name_State(String object) {
    return object;
  }

  protected static Logger LOG = LogManager.getLogger(AddToFavorites_Action.class);
}
