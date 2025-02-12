package jetbrains.mps.console.ideCommands.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class NodeReference_Constraints extends BaseConstraintsDescriptor {
  public NodeReference_Constraints() {
    super("jetbrains.mps.console.ideCommands.structure.NodeReference");
  }

  @Override
  public boolean hasOwnCanBeChildMethod() {
    return true;
  }

  @Override
  public boolean canBeChild(@Nullable SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext, @Nullable final CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAChild(node, parentNode, link, childConcept, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
    }

    return result;
  }

  public static boolean static_canBeAChild(SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext) {
    return SNodeOperations.getAncestorWhereConceptInList(parentNode, new String[]{"jetbrains.mps.console.ideCommands.structure.ShowBrokenReferences", "jetbrains.mps.console.ideCommands.structure.StatCommand"}, true, false) != null;
  }

  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:64807243-49b2-422a-a08f-a5df76bf508d(jetbrains.mps.console.ideCommands.constraints)", "7820875636627071491");
}
