package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class DefaultClassifierFieldDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getVisiblity_1213877352965(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "visibility", true);
  }

  public static List<SNode> virtual_getOperationConcept_3044950653914717125(SAbstractConcept thisConcept) {
    List<SNode> result = BehaviorReflection.invokeSuperStatic((Class<List<SNode>>) ((Class) Object.class), thisConcept, "jetbrains.mps.baseLanguage.classifiers.structure.IMember", "virtual_getOperationConcept_3044950653914717125", new Object[]{});
    ListSequence.fromList(result).addElement(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)", "1213999117680"));
    return result;
  }
}
