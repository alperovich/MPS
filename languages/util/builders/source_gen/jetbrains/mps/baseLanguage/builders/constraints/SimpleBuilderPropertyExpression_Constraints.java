package jetbrains.mps.baseLanguage.builders.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class SimpleBuilderPropertyExpression_Constraints extends BaseConstraintsDescriptor {
  public SimpleBuilderPropertyExpression_Constraints() {
    super("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyExpression");
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
    return (SNodeOperations.getAncestor(parentNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderProperty", true, false) != null);
  }

  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:971d5c35-6139-4f76-9019-ac96d9713d41(jetbrains.mps.baseLanguage.builders.constraints)", "5389689214217242853");
}
