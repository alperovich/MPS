package jetbrains.mps.console.base.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class CommandHolder_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedName_5211727872447036782(SNode thisNode) {
    return SNodeOperations.getModel(thisNode).getModelName() + ".Main";
  }

  public static SNode virtual_getCommandToEdit_691634242167796942(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "command", true);
  }

  @Deprecated
  public static SNode call_getCommandToEdit_691634242167796942(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getCommandToEdit_691634242167796942", new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_getCommandToEdit_691634242167796942(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.console.base.structure.CommandHolder"), callerConceptFqName, "virtual_getCommandToEdit_691634242167796942", new Class[]{SNode.class}, new Object[]{});
  }
}
