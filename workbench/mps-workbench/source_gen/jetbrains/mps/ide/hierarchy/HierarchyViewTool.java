package jetbrains.mps.ide.hierarchy;

/*Generated by MPS */

import jetbrains.mps.ide.MPSCoreComponents;
import com.intellij.openapi.project.Project;
import com.intellij.icons.AllIcons;
import jetbrains.mps.ide.ui.tree.TreeHighlighterExtension;

public class HierarchyViewTool extends AbstractHierarchyView {
  private MPSCoreComponents myCoreComponents;

  public HierarchyViewTool(Project project, MPSCoreComponents coreComponents) {
    super(project, "Hierarchy", 8, AllIcons.Toolwindows.ToolWindowHierarchy);
    this.myCoreComponents = coreComponents;
  }

  @Override
  protected AbstractHierarchyTree createHierarchyTree(boolean isParentHierarchy) {
    ConceptHierarchyTree tree = new ConceptHierarchyTree(myCoreComponents.getLanguageHierarchyCache(), this, isParentHierarchy);
    TreeHighlighterExtension.attachHighlighters(tree, getProject());
    return tree;
  }

  public int getPriority() {
    return 2;
  }
}
