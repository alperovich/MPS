package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class QueryFunction_SideTransform_ConceptHandler_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_pattern")) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_result")) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_targetNode")) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_editorContext")) {
      return false;
    }
    return true;
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.actions.structure.ConceptRightTransformPart", false, false);
    return _quotation_createNode_qx4gwz_a1a1(SLinkOperations.getTarget(ancestor, "concept", false));
  }

  public static List<SNode> virtual_getApplicableConceptFunctionParameter_3044950653914717136(SAbstractConcept thisConcept) {
    List<SNode> result = BehaviorReflection.invokeSuperStatic((Class<List<SNode>>) ((Class) Object.class), thisConcept, "jetbrains.mps.baseLanguage.structure.ConceptFunction", "virtual_getApplicableConceptFunctionParameter_3044950653914717136", new Object[]{});
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)", "1161622753914"));
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.lang.actions.structure)", "1177327274449"));
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.lang.actions.structure)", "1177497140107"));
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.lang.actions.structure)", "5425882385312046132"));
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.lang.actions.structure)", "1177526535706"));
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)", "1161622665029"));
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)", "1194033889146"));
    return result;
  }

  private static SNode _quotation_createNode_qx4gwz_a1a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "concept", (SNode) parameter_1);
    return quotedNode_2;
  }
}
