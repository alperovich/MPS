package jetbrains.mps.samples.complex.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;

public class subtype_ComplexType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public subtype_ComplexType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode doubleType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return _quotation_createNode_roewzw_a0a1();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.DoubleType";
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

  private static SNode _quotation_createNode_roewzw_a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.complex.structure.ComplexType", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }
}
