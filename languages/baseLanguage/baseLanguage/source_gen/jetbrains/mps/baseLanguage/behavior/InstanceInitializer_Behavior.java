package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import javax.swing.Icon;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class InstanceInitializer_Behavior {
  public static void init(SNode thisNode) {
  }

  public static Icon virtual_getAdditionalIcon_5017341185733863694(SNode thisNode) {
    return IVisible_Behavior.call_getVisibilityIcon_5017341185733869581(thisNode);
  }

  public static boolean virtual_needsEmptyLineBefore_641490355014296733(SNode thisNode) {
    return true;
  }

  public static boolean virtual_needsEmptyLineAfter_641490355014298838(SNode thisNode) {
    return true;
  }

  @Deprecated
  public static Icon call_getAdditionalIcon_8884554759541377996(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Icon.class, thisNode, "virtual_getAdditionalIcon_5017341185733863694", new Object[]{});
  }

  @Deprecated
  public static Icon callSuper_getAdditionalIcon_8884554759541377996(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Icon.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceInitializer"), callerConceptFqName, "virtual_getAdditionalIcon_5017341185733863694", new Class[]{SNode.class}, new Object[]{});
  }
}
