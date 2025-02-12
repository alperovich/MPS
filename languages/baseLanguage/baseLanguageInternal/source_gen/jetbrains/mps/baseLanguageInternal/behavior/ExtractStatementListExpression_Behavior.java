package jetbrains.mps.baseLanguageInternal.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ExtractStatementListExpression_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getLocalVariableElements_1238805763253(SNode thisNode) {
    List<SNode> elems = new ArrayList<SNode>();
    ListSequence.fromList(elems).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "stmts", true), "statement", true)));
    ListSequence.fromList(elems).addElement(SLinkOperations.getTarget(thisNode, "innerExpr", true));
    return elems;
  }

  @Deprecated
  public static List<SNode> call_getLocalVariableElements_3196918548952834932(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), thisNode, "virtual_getLocalVariableElements_1238805763253", new Object[]{});
  }

  @Deprecated
  public static List<SNode> callSuper_getLocalVariableElements_3196918548952834932(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<List<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguageInternal.structure.ExtractStatementListExpression"), callerConceptFqName, "virtual_getLocalVariableElements_1238805763253", new Class[]{SNode.class}, new Object[]{});
  }
}
