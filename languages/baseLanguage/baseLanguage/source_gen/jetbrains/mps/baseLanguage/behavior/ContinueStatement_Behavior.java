package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ContinueStatement_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_getLoop_1213877346346(SNode thisNode) {
    for (SNode loop : SNodeOperations.getAncestors(thisNode, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false)) {
      if ((SLinkOperations.getTarget(thisNode, "loopLabelReference", true) != null)) {
        SNode loopLabel = SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "loopLabelReference", true), "loopLabel", false);
        if ((loopLabel != null)) {
          if (loopLabel == SLinkOperations.getTarget(loop, "loopLabel", true)) {
            return loop;
          }
        }
      } else {
        if (SPropertyOperations.getString(thisNode, "label") == null) {
          return loop;
        }
        if (SPropertyOperations.getString(thisNode, "label").equals(SPropertyOperations.getString(loop, "label"))) {
          return loop;
        }
      }
    }
    return null;
  }

  public static boolean virtual_isGuardClauseStatement_1237547327995(SNode thisNode) {
    return true;
  }
}
