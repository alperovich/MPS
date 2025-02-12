package jetbrains.mps.ide.hierarchy;

/*Generated by MPS */

import jetbrains.mps.ide.tools.BaseProjectTool;
import javax.swing.JPanel;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.JScrollPane;
import com.intellij.ide.OccurenceNavigatorSupport;
import com.intellij.openapi.project.Project;
import javax.swing.Icon;
import com.intellij.openapi.wm.ToolWindowAnchor;
import org.jetbrains.annotations.Nullable;
import com.intellij.pom.Navigatable;
import javax.swing.tree.DefaultMutableTreeNode;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.ide.navigation.NodeNavigatable;
import jetbrains.mps.ide.project.ProjectHelper;
import com.intellij.usageView.UsageViewBundle;
import java.awt.BorderLayout;
import com.intellij.ui.ScrollPaneFactory;
import javax.swing.SwingUtilities;
import javax.swing.JComponent;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.openapi.navigation.NavigationSupport;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.ide.hierarchy.toggle.GroupedToggleAction;
import jetbrains.mps.ide.hierarchy.icons.Icons;
import jetbrains.mps.ide.hierarchy.toggle.ToggleActionGroup;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.icons.AllIcons;
import java.util.Map;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.ide.OccurenceNavigator;

public abstract class AbstractHierarchyView extends BaseProjectTool {
  protected AbstractHierarchyTree myHierarchyTree;
  protected HierarchyTreeNode myTreeNode;
  protected JPanel myComponent;
  protected IOperationContext myContext;
  public JScrollPane myScrollPane;
  private OccurenceNavigatorSupport myOccurenceNavigator;

  public AbstractHierarchyView(Project project, String id, int number, Icon icon) {
    super(project, id, number, icon, ToolWindowAnchor.RIGHT, true);
  }

  @Override
  public void disposeComponent() {
    if (myHierarchyTree == null) {
      return;
    }
    myHierarchyTree.dispose();
  }

  @Override
  protected void createTool() {
    myHierarchyTree = createHierarchyTree(false);
    myOccurenceNavigator = new OccurenceNavigatorSupport(myHierarchyTree) {
      @Nullable
      @Override
      protected Navigatable createDescriptorForNode(DefaultMutableTreeNode node) {
        if (!(node instanceof HierarchyTreeNode)) {
          return null;
        }
        final HierarchyTreeNode treeNode = (HierarchyTreeNode) node;

        SNodeReference ptr = ModelAccess.instance().runReadAction(new Computable<SNodeReference>() {
          @Override
          public SNodeReference compute() {
            SNode node = treeNode.getNode();
            if (node == null || SNodeOperations.isDisposed(node)) {
              return null;
            }

            return new SNodePointer(node);
          }
        });

        if (ptr == null) {
          return null;
        }

        Navigatable n = new NodeNavigatable(ProjectHelper.toMPSProject(getProject()), ptr);
        return (n.canNavigate() ?
          n :
          null
        );
      }

      @Override
      public String getPreviousOccurenceActionName() {
        return UsageViewBundle.message("action.previous.occurrence");
      }

      @Override
      public String getNextOccurenceActionName() {
        return UsageViewBundle.message("action.next.occurrence");
      }
    };
    myHierarchyTree.setRootVisible(true);
    final JPanel panel = new JPanel(new BorderLayout());
    this.myComponent = new AbstractHierarchyView.RootPanel();
    myComponent.add(panel, BorderLayout.NORTH);
    myScrollPane = ScrollPaneFactory.createScrollPane(myHierarchyTree);
    myComponent.add(myScrollPane, BorderLayout.CENTER);
    showItemInHierarchy(null, null);
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        JComponent buttonsPanel = ActionManager.getInstance().createActionToolbar(ActionPlaces.TYPE_HIERARCHY_VIEW_TOOLBAR, createButtonsGroup(), true).getComponent();
        panel.add(buttonsPanel, BorderLayout.WEST);
      }
    });
  }

  protected abstract AbstractHierarchyTree createHierarchyTree(boolean isParentHierarchy);

  public void openNode(SNode node, IOperationContext context) {
    NavigationSupport.getInstance().openNode(context, node, true, true);
  }

  protected DefaultActionGroup createButtonsGroup() {
    GroupedToggleAction childrenAction = new GroupedToggleAction("Children Hierarchy", "Show children hierarchy", Icons.CHILDREN_ICON, true) {
      @Override
      public void select() {
        myHierarchyTree.setParentHierarchy(false);
        myHierarchyTree.rebuildNow();
      }
    };
    GroupedToggleAction parentAction = new GroupedToggleAction("Parent Hierarchy", "Show parent hierarchy", Icons.PARENT_ICON, false) {
      @Override
      public void select() {
        myHierarchyTree.setParentHierarchy(true);
        myHierarchyTree.rebuildNow();
      }
    };
    ToggleActionGroup toggleGroup = new ToggleActionGroup();
    toggleGroup.add(childrenAction);
    toggleGroup.add(parentAction);
    ToggleAction thisModelAction = new ToggleAction("Only This Model", "Show hierarchy only for model", Icons.THIS_MODEL_ICON) {
      private boolean mySelected = false;

      @Override
      public boolean isSelected(AnActionEvent e) {
        return mySelected;
      }

      @Override
      public void setSelected(AnActionEvent e, boolean state) {
        mySelected = state;
        myHierarchyTree.setIsOnlyInOneModel(mySelected);
      }
    };
    ToggleAction generatorModelsAction = new ToggleAction("Show Generator Classes", "Show classes from generator models in hierarchy", Icons.GENERATOR_ICON) {
      private boolean mySelected = false;

      @Override
      public boolean isSelected(AnActionEvent e) {
        return mySelected;
      }

      @Override
      public void setSelected(AnActionEvent e, boolean state) {
        mySelected = state;
        myHierarchyTree.setShowGeneratorModels(mySelected);
      }
    };
    BaseAction expandAllAction = new BaseAction("Expand all", "Expand all nodes", AllIcons.Actions.Expandall) {
      @Override
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        myHierarchyTree.expandAll();
      }
    };
    BaseAction collapseAllAction = new BaseAction("Collapse all", "Collapse all nodes", AllIcons.Actions.Collapseall) {
      @Override
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        myHierarchyTree.collapseAll();
      }
    };
    BaseAction refreshAction = new BaseAction("Refresh", "Refresh", AllIcons.Actions.Refresh) {
      @Override
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        myHierarchyTree.rebuildNow();
      }
    };
    return ActionUtils.groupFromActions(childrenAction, parentAction, thisModelAction, generatorModelsAction, expandAllAction, collapseAllAction, refreshAction, createCloseAction());
  }

  public void showItemInHierarchy(SNode node, IOperationContext _context) {
    myHierarchyTree.setOperationContext(_context);
    myContext = _context;
    myHierarchyTree.myHierarchyNode = node;
    ModelAccess.instance().runReadInEDT(new Runnable() {
      @Override
      public void run() {
        Project project = getProject();
        if (project == null || project.isDisposed()) {
          return;
        }
        myHierarchyTree.rebuildNow();
        if (myTreeNode != null) {
          myHierarchyTree.selectNode(myTreeNode);
        }
        if (!(isTreeInfinite())) {
          myHierarchyTree.expandAll();
        }
      }
    });
  }

  protected boolean isTreeInfinite() {
    return false;
  }

  @Override
  public JComponent getComponent() {
    return myComponent;
  }

  public class RootPanel extends JPanel implements OccurenceNavigator {
    public RootPanel() {
      super(new BorderLayout());
    }

    @Override
    public String getPreviousOccurenceActionName() {
      return (myOccurenceNavigator != null ?
        myOccurenceNavigator.getPreviousOccurenceActionName() :
        ""
      );
    }

    @Override
    public String getNextOccurenceActionName() {
      return (myOccurenceNavigator != null ?
        myOccurenceNavigator.getNextOccurenceActionName() :
        ""
      );
    }

    @Override
    public OccurenceNavigator.OccurenceInfo goPreviousOccurence() {
      return (myOccurenceNavigator != null ?
        myOccurenceNavigator.goPreviousOccurence() :
        null
      );
    }

    @Override
    public OccurenceNavigator.OccurenceInfo goNextOccurence() {
      return (myOccurenceNavigator != null ?
        myOccurenceNavigator.goNextOccurence() :
        null
      );
    }

    @Override
    public boolean hasPreviousOccurence() {
      return myOccurenceNavigator != null && myOccurenceNavigator.hasPreviousOccurence();
    }

    @Override
    public boolean hasNextOccurence() {
      return myOccurenceNavigator != null && myOccurenceNavigator.hasNextOccurence();
    }
  }
}
