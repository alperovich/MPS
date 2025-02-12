package org.jetbrains.mps.samples.Money.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SNodePointer;

public class GetCurrency_Constraints extends BaseConstraintsDescriptor {
  public GetCurrency_Constraints() {
    super("org.jetbrains.mps.samples.Money.structure.GetCurrency");
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
    return SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.baseLanguage.structure.DotExpression") && TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(parentNode, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)), HUtil.createMatchingPatternByConceptFQName("org.jetbrains.mps.samples.Money.structure.MoneyType"), true) != null;
  }

  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:287f3730-82f2-4e81-b8c8-89838004f6d4(org.jetbrains.mps.samples.Money.constraints)", "1790427706118304184");
}
