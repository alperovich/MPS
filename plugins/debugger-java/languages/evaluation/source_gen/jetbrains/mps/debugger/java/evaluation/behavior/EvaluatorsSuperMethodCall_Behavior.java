package jetbrains.mps.debugger.java.evaluation.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class EvaluatorsSuperMethodCall_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInstanceType_8008512149545154471(SNode thisNode) {
    return DebuggedType_Behavior.call_getHighClassifierType_4544608336420723238(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.debugger.java.evaluation.structure.EvaluatorConcept", false, false), "thisNode", true), "debuggedType", true));
  }
}
