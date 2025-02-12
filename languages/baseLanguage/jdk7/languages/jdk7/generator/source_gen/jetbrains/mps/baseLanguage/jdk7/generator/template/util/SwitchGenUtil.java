package jetbrains.mps.baseLanguage.jdk7.generator.template.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;

public class SwitchGenUtil {
  public SwitchGenUtil() {
  }

  public static Iterable<SNode> getNodes(SNode node) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "case", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "expression", true) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "expression", true);
      }
    }).sort(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return SPropertyOperations.getString(SNodeOperations.cast(it, "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value");
      }
    }, true);
  }

  public static Map<String, Integer> getMap(SNode node, TemplateQueryContext genContext) {
    Map<String, Integer> m = (Map<String, Integer>) genContext.getTransientObject("switch" + node.getNodeId().toString());
    if (m != null) {
      return m;
    }

    final Iterable<SNode> nodes = getNodes(node);
    m = MapSequence.fromMap(new HashMap<String, Integer>());
    int index = 0;
    for (SNode e : nodes) {
      MapSequence.fromMap(m).put(SPropertyOperations.getString(SNodeOperations.cast(e, "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value"), index++);
    }
    genContext.putTransientObject("switch" + node.getNodeId().toString(), m);
    return m;
  }
}
