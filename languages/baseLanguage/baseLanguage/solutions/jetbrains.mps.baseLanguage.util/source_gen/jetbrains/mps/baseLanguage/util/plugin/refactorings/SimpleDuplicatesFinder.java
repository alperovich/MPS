package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.pattern.util.MatchingUtil;

public class SimpleDuplicatesFinder {
  private SNode myNodeToMatch;

  public SimpleDuplicatesFinder(SNode node) {
    this.myNodeToMatch = node;
  }

  public List<SNode> findDuplicates(SNode root) {
    List<SNode> found = new ArrayList<SNode>();
    for (SNode node : ListSequence.fromList(SNodeOperations.getDescendants(root, "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{}))) {
      if (node != this.myNodeToMatch && MatchingUtil.matchNodes(node, this.myNodeToMatch)) {
        ListSequence.fromList(found).addElement(node);
      }
    }
    return found;
  }
}
