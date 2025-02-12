package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class ReplaceRegexpOperation_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getReplacementString_3796137614137207007(SNode thisNode) {
    StringBuilder sb = new StringBuilder();
    for (SNode rep : SLinkOperations.getTargets(thisNode, "replacement", true)) {
      if ((rep != null)) {
        sb.append(BehaviorReflection.invokeVirtual(String.class, rep, "virtual_toString_3796137614137538905", new Object[]{SLinkOperations.getTarget(thisNode, "search", true)}));
      }
    }
    return sb.toString();
  }
}
