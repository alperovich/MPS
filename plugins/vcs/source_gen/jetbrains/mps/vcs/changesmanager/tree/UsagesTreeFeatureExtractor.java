package jetbrains.mps.vcs.changesmanager.tree;

/*Generated by MPS */

import org.jetbrains.annotations.Nullable;
import jetbrains.mps.vcs.changesmanager.tree.features.Feature;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.ui.tree.MPSTreeNode;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.UsagesTree;
import jetbrains.mps.ide.findusages.view.treeholder.tree.nodedatatypes.BaseNodeData;
import jetbrains.mps.ide.findusages.view.treeholder.tree.nodedatatypes.ModelNodeData;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.vcs.changesmanager.tree.features.ModelFeature;
import jetbrains.mps.ide.findusages.view.treeholder.tree.nodedatatypes.NodeNodeData;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.vcs.changesmanager.tree.features.NodeFeature;
import jetbrains.mps.ide.findusages.view.treeholder.tree.DataNode;

public class UsagesTreeFeatureExtractor implements TreeNodeFeatureExtractor {
  public UsagesTreeFeatureExtractor() {
  }

  @Nullable
  @Override
  public Feature getFeature(@NotNull MPSTreeNode treeNode) {
    if (treeNode instanceof UsagesTree.UsagesTreeNode) {
      BaseNodeData nodeData = check_f7pfq7_a0a0a0b(((UsagesTree.UsagesTreeNode) treeNode).getUserObject());
      if (nodeData instanceof ModelNodeData) {
        SModelReference mr = ((ModelNodeData) nodeData).getModelReference();
        if (mr != null) {
          return new ModelFeature(mr);
        }
      } else if (nodeData instanceof NodeNodeData) {
        SNodeReference np = ((NodeNodeData) nodeData).getNodePointer();
        if (np != null) {
          return new NodeFeature(np);
        }
      }
    }
    return null;
  }

  private static BaseNodeData check_f7pfq7_a0a0a0b(DataNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getData();
    }
    return null;
  }
}
