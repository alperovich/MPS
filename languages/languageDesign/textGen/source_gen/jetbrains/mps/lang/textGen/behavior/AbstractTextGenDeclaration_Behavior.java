package jetbrains.mps.lang.textGen.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class AbstractTextGenDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getTextGenNode_1234784577703(SNode thisNode) {
    return null;
  }

  public static List<SNode> virtual_getAvailableOperations_1234781444746(SNode thisNode) {
    return null;
  }

  @Deprecated
  public static String call_getTextGenNode_1234784577703(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getTextGenNode_1234784577703", new Object[]{});
  }

  @Deprecated
  public static List<SNode> call_getAvailableOperations_1234781444746(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), thisNode, "virtual_getAvailableOperations_1234781444746", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getTextGenNode_1234784577703(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.textGen.structure.AbstractTextGenDeclaration"), callerConceptFqName, "virtual_getTextGenNode_1234784577703", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static List<SNode> callSuper_getAvailableOperations_1234781444746(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<List<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.lang.textGen.structure.AbstractTextGenDeclaration"), callerConceptFqName, "virtual_getAvailableOperations_1234781444746", new Class[]{SNode.class}, new Object[]{});
  }
}
