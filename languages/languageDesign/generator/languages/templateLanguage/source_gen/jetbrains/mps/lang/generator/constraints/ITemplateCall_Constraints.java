package jetbrains.mps.lang.generator.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SNodePointer;

public class ITemplateCall_Constraints extends BaseConstraintsDescriptor {
  public ITemplateCall_Constraints() {
    super("jetbrains.mps.lang.generator.structure.ITemplateCall");
  }

  @Override
  public boolean hasOwnCanBeParentMethod() {
    return true;
  }

  @Override
  public boolean canBeParent(SNode node, @Nullable SNode childNode, SNode childConcept, SNode link, IOperationContext operationContext, @Nullable CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAParent(node, childNode, childConcept, link, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeParentBreakingPoint);
    }

    return result;
  }

  public static boolean static_canBeAParent(SNode node, SNode childNode, SNode childConcept, SNode link, final IOperationContext operationContext) {
    if (link == SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.generator.structure.ITemplateCall", "actualArgument")) {
      return SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef") || SConceptOperations.isSubConceptOf(childConcept, "jetbrains.mps.lang.generator.structure.TemplateArgumentQueryExpression") || childConcept == SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateArgumentParameterExpression") || childConcept == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant") || childConcept == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant") || childConcept == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral") || childConcept == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral");
    }
    return true;
  }

  private static SNodePointer canBeParentBreakingPoint = new SNodePointer("r:00000000-0000-4000-0000-011c895902e2(jetbrains.mps.lang.generator.constraints)", "4035562641222637870");
}
