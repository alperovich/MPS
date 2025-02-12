package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class subtyping_arrayType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public subtyping_arrayType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode arrayType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> result = new ArrayList<SNode>();
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(arrayType, "componentType", true), "jetbrains.mps.baseLanguage.structure.PrimitiveType"))) {
      for (SNode componentTypeSupertype : TypeChecker.getInstance().getSubtypingManager().collectImmediateSupertypes(SLinkOperations.getTarget(arrayType, "componentType", true))) {
        if (SNodeOperations.isInstanceOf(componentTypeSupertype, "jetbrains.mps.baseLanguage.structure.Type")) {
          ListSequence.fromList(result).addElement(_quotation_createNode_ny91lb_a0a0a0a0a1a1(componentTypeSupertype));
        }
      }
    }
    return result;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayType";
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

  private static SNode _quotation_createNode_ny91lb_a0a0a0a0a1a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = (SNode) parameter_1;
    if (quotedNode_3 != null) {
      quotedNode_2.addChild("componentType", HUtil.copyIfNecessary(quotedNode_3));
    }
    return quotedNode_2;
  }
}
