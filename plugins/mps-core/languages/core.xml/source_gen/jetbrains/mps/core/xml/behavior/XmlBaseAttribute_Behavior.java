package jetbrains.mps.core.xml.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class XmlBaseAttribute_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isMultiline_3080189811177259788(SNode thisNode) {
    return false;
  }

  @Deprecated
  public static boolean call_isMultiline_3080189811177259788(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_isMultiline_3080189811177259788", new Object[]{});
  }

  @Deprecated
  public static boolean callSuper_isMultiline_3080189811177259788(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.core.xml.structure.XmlBaseAttribute"), callerConceptFqName, "virtual_isMultiline_3080189811177259788", new Class[]{SNode.class}, new Object[]{});
  }
}
