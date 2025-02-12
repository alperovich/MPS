package jetbrains.mps.core.xml.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class XmlProlog_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean call_isInValidPosition_2133624044437891376(SNode thisNode, SNode element) {
    SNode declaration = ListSequence.fromList(SLinkOperations.getTargets(thisNode, "elements", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return BehaviorReflection.invokeVirtualStatic(Boolean.TYPE, SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(it))), "virtual_isFirst_1262430001741498376", new Object[]{});
      }
    });
    if (declaration == null) {
      return true;
    }
    return !(ListSequence.fromList(SNodeOperations.getPrevSiblings(declaration, false)).contains(element));
  }
}
