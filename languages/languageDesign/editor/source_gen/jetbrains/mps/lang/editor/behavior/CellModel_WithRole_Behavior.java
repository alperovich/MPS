package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CellModel_WithRole_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getRoleForCell_1216377898846(SNode thisNode) {
    return null;
  }

  @Deprecated
  public static String call_getRoleForCell_1216377898846(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getRoleForCell_1216377898846", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getRoleForCell_1216377898846(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.CellModel_WithRole"), callerConceptFqName, "virtual_getRoleForCell_1216377898846", new Class[]{SNode.class}, new Object[]{});
  }
}
