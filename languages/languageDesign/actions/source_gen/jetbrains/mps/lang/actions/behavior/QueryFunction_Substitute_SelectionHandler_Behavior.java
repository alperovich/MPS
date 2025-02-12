package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_Substitute_SelectionHandler_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return _quotation_createNode_le3w2u_a0a0();
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    return !(SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model")) && !(SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_editorContext"));
  }

  public static List<SNode> virtual_getParameters_1213877374450(SNode thisNode) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.lang.actions.structure.SimpleItemSubstitutePart") || SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.lang.actions.structure.ParameterizedSubstituteMenuPart")) {
      ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_pattern"));
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.lang.actions.structure.ParameterizedSubstituteMenuPart")) {
      ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_parameterObject"));
    }
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_parentNode"));
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_createdNode"));
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_childConcept"));
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model"));
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_operationContext"));
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_scope"));
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_editorContext"));
    return result;
  }

  private static SNode _quotation_createNode_le3w2u_a0a0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }
}
