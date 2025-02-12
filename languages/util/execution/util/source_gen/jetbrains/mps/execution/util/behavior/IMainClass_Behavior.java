package jetbrains.mps.execution.util.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.generator.traceInfo.TraceDown;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class IMainClass_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getUnitName_4666195181811081431(final SNode thisNode) {
    final Wrappers._T<String> unitName = new Wrappers._T<String>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        unitName.value = TraceDown.anyUnitName(thisNode);
      }
    });
    return unitName.value;
  }

  public static boolean virtual_isNodeRunnable_4666195181811081448(SNode thisNode) {
    return isNotEmpty_4ittql_a0a0c(IMainClass_Behavior.call_getUnitName_4666195181811081431(thisNode));
  }

  @Deprecated
  public static String call_getUnitName_4666195181811081431(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getUnitName_4666195181811081431", new Object[]{});
  }

  @Deprecated
  public static boolean call_isNodeRunnable_4666195181811081448(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_isNodeRunnable_4666195181811081448", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getUnitName_4666195181811081431(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.util.structure.IMainClass"), callerConceptFqName, "virtual_getUnitName_4666195181811081431", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static boolean callSuper_isNodeRunnable_4666195181811081448(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.util.structure.IMainClass"), callerConceptFqName, "virtual_isNodeRunnable_4666195181811081448", new Class[]{SNode.class}, new Object[]{});
  }

  public static boolean isNotEmpty_4ittql_a0a0c(String str) {
    return str != null && str.length() > 0;
  }
}
