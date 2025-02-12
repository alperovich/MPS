package jetbrains.mps.execution.configurations.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class StartProcessHandlerStatement_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_getComponent_1594211126127708543(SNode thisNode) {
    return StartProcessHandlerStatement_Behavior.call_getComponentByName_1594211126127708848(thisNode, "component");
  }

  public static SNode call_getDispose_1594211126127708769(SNode thisNode) {
    return StartProcessHandlerStatement_Behavior.call_getComponentByName_1594211126127708848(thisNode, "dispose");
  }

  public static SNode call_getListener_1594211126127708805(SNode thisNode) {
    return StartProcessHandlerStatement_Behavior.call_getComponentByName_1594211126127708848(thisNode, "listener");
  }

  public static SNode call_getComponentByName_1594211126127708848(SNode thisNode, final String name) {
    if ((SLinkOperations.getTarget(thisNode, "tool", true) == null)) {
      return null;
    }
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "tool", true), "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleLiteral")) {
      SNode first = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "tool", true), "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleLiteral"), "componentRef", true)).findFirst(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SPropertyOperations.getString(SLinkOperations.getTarget(it, "componentDeclaration", false), "name").equals(name);
        }
      });
      return SLinkOperations.getTarget(first, "value", true);
    }
    return null;
  }
}
