package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class supertypesOf_List_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_List_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    List<SNode> result = new ArrayList<SNode>();
    SNode elemType = SLinkOperations.getTarget(type, "elementType", true);
    ListSequence.fromList(result).addElement(_quotation_createNode_w26thq_a0a2a1(SLinkOperations.getTarget(type, "elementType", true)));
    ListSequence.fromList(result).addElement(_quotation_createNode_w26thq_a0a3a1(SLinkOperations.getTarget(type, "elementType", true)));
    ListSequence.fromList(result).addElement(_quotation_createNode_w26thq_a0a4a1());
    return result;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ListType";
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

  private static SNode _quotation_createNode_w26thq_a0a2a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = (SNode) parameter_1;
    if (quotedNode_3 != null) {
      quotedNode_2.addChild("elementType", HUtil.copyIfNecessary(quotedNode_3));
    }
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_w26thq_a0a3a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.CollectionType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = (SNode) parameter_1;
    if (quotedNode_3 != null) {
      quotedNode_2.addChild("elementType", HUtil.copyIfNecessary(quotedNode_3));
    }
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_w26thq_a0a4a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", null, null, GlobalScope.getInstance(), false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.WildCardType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.addChild("elementType", quotedNode_2);
    return quotedNode_1;
  }
}
