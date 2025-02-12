package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class vector_subtype_of_matrix_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public vector_subtype_of_matrix_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode vectorType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return _quotation_createNode_exb2lq_a0a1(SLinkOperations.getTarget(vectorType, "elementType", true), "" + SPropertyOperations.getInteger(vectorType, "height"));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.VectorType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean isWeak() {
    return false;
  }

  private static SNode _quotation_createNode_exb2lq_a0a1(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.MatrixType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_3, "columns", "1");
    SNodeAccessUtil.setProperty(quotedNode_3, "rows", (String) parameter_2);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild("elementType", HUtil.copyIfNecessary(quotedNode_4));
    }
    return quotedNode_3;
  }
}
