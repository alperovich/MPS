package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;

public class ReferenceMacro_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_suppress_3393165121846091591(SNode thisNode, SNode child) {
    if (SLinkOperations.getTarget(thisNode, "referentFunction", true) == child) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.core.structure.Attribute") && ListSequence.fromList(AttributeOperations.getAttributeList(SNodeOperations.getParent(thisNode), new IAttributeDescriptor.AllAttributes())).contains(SNodeOperations.cast(child, "jetbrains.mps.lang.core.structure.Attribute"))) {
      return false;
    }
    return true;
  }
}
