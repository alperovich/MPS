package jetbrains.mps.execution.commands.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;

public class typeof_ListCommandPart_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ListCommandPart_InferenceRule() {
  }

  public void applyRule(final SNode listCommandPart, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(listCommandPart, "list", true);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:3eecec87-82a4-4ea1-952b-7d3a8d81c769(jetbrains.mps.execution.commands.typesystem)", "8234001627573984149", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:3eecec87-82a4-4ea1-952b-7d3a8d81c769(jetbrains.mps.execution.commands.typesystem)", "8234001627573984141", true), (SNode) _quotation_createNode_pnnk5w_a0a0b(), false, false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(listCommandPart, "separator", true);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:3eecec87-82a4-4ea1-952b-7d3a8d81c769(jetbrains.mps.execution.commands.typesystem)", "8234001627573984181", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:3eecec87-82a4-4ea1-952b-7d3a8d81c769(jetbrains.mps.execution.commands.typesystem)", "8234001627573984173", true), (SNode) _quotation_createNode_pnnk5w_a0b0b(), false, false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.execution.commands.structure.ListCommandPart";
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

  private static SNode _quotation_createNode_pnnk5w_a0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", null, null, GlobalScope.getInstance(), false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.WildCardType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.addChild("elementType", quotedNode_2);
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_pnnk5w_a0b0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }
}
