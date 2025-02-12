package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_NamedTupleComponentAccessOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_NamedTupleComponentAccessOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> PTYPES = new ArrayList<SNode>();
    SNode tupleDecl = SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(operation, "component", false)), "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration");
    for (SNode tvr : ListSequence.fromList(SLinkOperations.getTargets(tupleDecl, "typeVariableDeclaration", true))) {
      final SNode PTYPE_typevar_1239974367138 = typeCheckingContext.createNewRuntimeTypesVariable();
      ListSequence.fromList(PTYPES).addElement(typeCheckingContext.getRepresentative(PTYPE_typevar_1239974367138));
    }
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(operation);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "3862929002918414716", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "3862929002918414718", true), (SNode) _quotation_createNode_kga4po_a0d0b(tupleDecl, PTYPES), false, false, _info_12389875345);
    }
    SNode opType = SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(operation, "component", false), "type", true));
    if (SNodeOperations.isInstanceOf(opType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
      int idx = SNodeOperations.getIndexInParent(SLinkOperations.getTarget(SNodeOperations.cast(opType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false));
      opType = ListSequence.fromList(PTYPES).getElement(idx);
    } else {
      List<SNode> variableReferences = SNodeOperations.getDescendants(opType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false, new String[]{});
      List<SNode> tvrs = new ArrayList<SNode>();
      ListSequence.fromList(tvrs).addSequence(ListSequence.fromList(variableReferences));
      for (SNode tvr : tvrs) {
        int idx = SNodeOperations.getIndexInParent(SLinkOperations.getTarget(tvr, "typeVariableDeclaration", false));
        if (idx < ListSequence.fromList(PTYPES).count()) {
          SNodeOperations.replaceWithAnother(tvr, ListSequence.fromList(PTYPES).getElement(idx));
        }
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239579829277", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239579816726", true), (SNode) opType, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation";
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

  private static SNode _quotation_createNode_kga4po_a0d0b(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "classifier", (SNode) parameter_1);
    {
      List<SNode> nodes = (List<SNode>) parameter_2;
      for (SNode child : nodes) {
        quotedNode_3.addChild("parameter", HUtil.copyIfNecessary(child));
      }
    }
    return quotedNode_3;
  }
}
