package jetbrains.mps.execution.configurations.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.execution.common.behavior.IGeneratedToClass_Behavior;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class RunConfigurationProducer_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getDisplayedName_4366236229294143331(SNode thisNode) {
    return IGeneratedToClass_Behavior.call_getBaseName_4366236229294148974(thisNode) + " " + IGeneratedToClass_Behavior.call_getSuffix_946964771156905483(thisNode);
  }

  @NonNls
  public static String virtual_getSuffix_946964771156905483(SNode thisNode) {
    return "Producer";
  }

  public static String virtual_getBaseName_4366236229294148974(SNode thisNode) {
    if ((SLinkOperations.getTarget(thisNode, "configuration", true) == null)) {
      return "Unknown";
    }
    return check_5u07ui_a1a2(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "configuration", true), "persistentConfiguration", false));
  }

  private static String check_5u07ui_a1a2(SNode checkedDotOperand) {
    if (null != checkedDotOperand) {
      return BehaviorReflection.invokeVirtual(String.class, checkedDotOperand, "virtual_getBaseName_4366236229294148974", new Object[]{});
    }
    return null;
  }
}
