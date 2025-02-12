package jetbrains.mps.baseLanguage.collections.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class CustomMapCreator_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_createType_1576845966386891475(SNode thisNode) {
    SNode res = SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "containerDeclaration", false), "containerType", true));
    //  workaround an SModel's dumbness 
    final List<SNode> params = ListSequence.fromList(new ArrayList<SNode>());
    if ((SLinkOperations.getTarget(thisNode, "keyType", true) != null)) {
      ListSequence.fromList(params).addElement(SLinkOperations.getTarget(thisNode, "keyType", true));
    }
    if ((SLinkOperations.getTarget(thisNode, "valueType", true) != null)) {
      ListSequence.fromList(params).addElement(SLinkOperations.getTarget(thisNode, "valueType", true));
    }
    final List<SNode> tvars = SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "containerDeclaration", false), "typeVariableDeclaration", true);
    ListSequence.fromList(SNodeOperations.getChildren(res)).toListSequence().visitAll(new IVisitor<SNode>() {
      public void visit(SNode chld) {
        if (SNodeOperations.isInstanceOf(chld, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
          int index = ListSequence.fromList(tvars).indexOf(SLinkOperations.getTarget(SNodeOperations.cast(chld, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false));
          SNode realType = ((index >= 0 && index < ListSequence.fromList(params).count()) ?
            SNodeOperations.copyNode(ListSequence.fromList(params).getElement(index)) :
            null
          );
          SNodeOperations.replaceWithAnother(chld, realType);
        }
      }
    });
    return res;
  }

  public static boolean virtual_hasInitSize_1262430001741497996(SAbstractConcept thisConcept) {
    return false;
  }
}
