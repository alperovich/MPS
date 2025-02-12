package jetbrains.mps.baseLanguage.collections.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.collections.behavior.IApplicableToNothing_Behavior;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SNodePointer;

public class SequenceOperation_Constraints extends BaseConstraintsDescriptor {
  public SequenceOperation_Constraints() {
    super("jetbrains.mps.baseLanguage.collections.structure.SequenceOperation");
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
    if (SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.baseLanguage.collections.structure.IApplicableToNothing")) {
      SNode opnd = SLinkOperations.getTarget(SNodeOperations.as(parentNode, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
      if ((opnd != null)) {
        SNode opndtype = TypeChecker.getInstance().getTypeOf(opnd);
        for (SNode exptype : (IApplicableToNothing_Behavior.call_getAllApplicableTypes_5994574781955687463(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SNodeOperations.castConcept(((SNode) childConcept), "jetbrains.mps.baseLanguage.collections.structure.IApplicableToNothing")))))) {
          if (TypeChecker.getInstance().getSubtypingManager().isSubtype(opndtype, exptype, false)) {
            return true;
          }
        }
      }
      return false;
    } else {
      return SNodeOperations.isInstanceOf(parentNode, "jetbrains.mps.baseLanguage.structure.DotExpression") && (TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(parentNode, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType"), false) != null);
    }
  }

  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)", "1224668260161");
}
