package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import javax.swing.tree.TreeNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.depanalyzer.DependencyTreeNode;
import jetbrains.mps.ide.depanalyzer.DependencyUtil;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.ide.platform.actions.DependenciesUtil;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.MPSProject;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ShowInDependenciesViewer_Action extends BaseAction {
  private static final Icon ICON = null;

  public ShowInDependenciesViewer_Action() {
    super("Show Usages", "show usages in dependencies viewer", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    if (!(((TreeNode) MapSequence.fromMap(_params).get("node")) instanceof DependencyTreeNode)) {
      return false;
    }
    DependencyUtil.LinkType linktype = ((DependencyTreeNode) ((TreeNode) MapSequence.fromMap(_params).get("node"))).getLink().linktype;
    return linktype == DependencyUtil.LinkType.Depends || linktype == DependencyUtil.LinkType.ReexportsDep || linktype == DependencyUtil.LinkType.ExtendsLanguage || linktype == DependencyUtil.LinkType.ExportsRuntime || linktype == DependencyUtil.LinkType.UsesLanguage;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "ShowInDependenciesViewer", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("node", event.getData(MPSCommonDataKeys.TREE_NODE));
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("mpsProject", event.getData(MPSCommonDataKeys.MPS_PROJECT));
    if (MapSequence.fromMap(_params).get("mpsProject") == null) {
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
      DependencyTreeNode treeNode = (DependencyTreeNode) ((TreeNode) MapSequence.fromMap(_params).get("node"));
      SModule from = check_hezs1a_a0b0a(as_nkoo1o_a0a0b0a0g(treeNode.getParent(), DependencyTreeNode.class));
      SModule to = treeNode.getModule();
      DependenciesUtil.analyzeDependencies(from, to, ((Project) MapSequence.fromMap(_params).get("project")), ((MPSProject) MapSequence.fromMap(_params).get("mpsProject")), treeNode.getLink().linktype == DependencyUtil.LinkType.UsesLanguage, true);
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "ShowInDependenciesViewer", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(ShowInDependenciesViewer_Action.class);

  private static SModule check_hezs1a_a0b0a(DependencyTreeNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModule();
    }
    return null;
  }

  private static <T> T as_nkoo1o_a0a0b0a0g(Object o, Class<T> type) {
    return (type.isInstance(o) ?
      (T) o :
      null
    );
  }
}
