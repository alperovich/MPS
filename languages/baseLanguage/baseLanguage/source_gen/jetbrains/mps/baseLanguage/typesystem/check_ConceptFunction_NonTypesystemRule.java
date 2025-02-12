package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptFunction_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ConceptFunction_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(nodeToCheck, "body", true) != null) {
      boolean checkReturns = false;
      if (BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), nodeToCheck, "virtual_getExpectedReturnType_1213877374441", new Object[]{}) != null && !(SNodeOperations.isInstanceOf(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), nodeToCheck, "virtual_getExpectedReturnType_1213877374441", new Object[]{}), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
        checkReturns = true;
      }
      DataFlowUtil.checkDataFlow(typeCheckingContext, SLinkOperations.getTarget(nodeToCheck, "body", true), checkReturns);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ConceptFunction";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
