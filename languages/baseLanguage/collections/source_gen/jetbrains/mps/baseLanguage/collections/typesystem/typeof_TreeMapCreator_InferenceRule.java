package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_TreeMapCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_TreeMapCreator_InferenceRule() {
  }

  public void applyRule(final SNode creator, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = creator;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240239601988", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240239597471", true), (SNode) _quotation_createNode_tnqpu1_a0a0b(SLinkOperations.getTarget(creator, "keyType", true), SLinkOperations.getTarget(creator, "valueType", true)), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.TreeMapCreator";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }

  private static SNode _quotation_createNode_tnqpu1_a0a0b(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedMapType", null, null, GlobalScope.getInstance(), false);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild("keyType", HUtil.copyIfNecessary(quotedNode_4));
    }
    quotedNode_5 = (SNode) parameter_2;
    if (quotedNode_5 != null) {
      quotedNode_3.addChild("valueType", HUtil.copyIfNecessary(quotedNode_5));
    }
    return quotedNode_3;
  }
}
