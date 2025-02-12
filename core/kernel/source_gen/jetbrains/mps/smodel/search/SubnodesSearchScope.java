package jetbrains.mps.smodel.search;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import org.jetbrains.mps.util.Condition;
import java.util.ArrayList;
import jetbrains.mps.util.SNodeOperations;

public class SubnodesSearchScope extends AbstractSearchScope {
  private SNode myEnclosingNode;

  public SubnodesSearchScope(SNode enclosingNode) {
    myEnclosingNode = enclosingNode;
  }

  @NotNull
  @Override
  public List<SNode> getNodes(Condition<SNode> condition) {
    if (myEnclosingNode == null) {
      return new ArrayList<SNode>();
    }
    return SNodeOperations.getDescendants(myEnclosingNode, condition);
  }
}
