package jetbrains.mps.lang.textGen.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_CallInnerFunctionOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_CallInnerFunctionOperation_InferenceRule() {
  }

  public void applyRule(final SNode opcall, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode opdecl = SLinkOperations.getTarget(opcall, "function", false);
    if (opdecl == null) {
      return;
    }

    {
      Iterator<SNode> pdecl_it = ListSequence.fromList(SLinkOperations.getTargets(opdecl, "parameter", true)).iterator();
      Iterator<SNode> arg_it = ListSequence.fromList(SLinkOperations.getTargets(opcall, "parameter", true)).iterator();
      SNode pdecl_var;
      SNode arg_var;
      while (pdecl_it.hasNext() && arg_it.hasNext()) {
        pdecl_var = pdecl_it.next();
        arg_var = arg_it.next();
        {
          SNode _nodeToCheck_1029348928467 = arg_var;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:f568ac81-f20d-491c-8e81-330fbdff24e6(jetbrains.mps.lang.textGen.typesystem)", "9033423951287770196", 0, null);
          typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:f568ac81-f20d-491c-8e81-330fbdff24e6(jetbrains.mps.lang.textGen.typesystem)", "9033423951287769724", true), (SNode) SLinkOperations.getTarget(pdecl_var, "type", true), false, true, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.textGen.structure.OperationCall";
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
