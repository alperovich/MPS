package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class SymbolClassRegexp_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getRepresentation_8173814113624650482", new Object[]{});
  }

  public static String virtual_getRepresentation_8173814113624650482(SNode thisNode) {
    return SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(thisNode), "conceptAlias") + SymbolClassRegexp_Behavior.call_partsToString_1222857748873(thisNode, SLinkOperations.getTargets(thisNode, "part", true)) + "]";
  }

  public static String call_partsToString_1222857748873(SNode thisNode, List<SNode> parts) {
    StringBuilder result = new StringBuilder();
    for (SNode part : parts) {
      result.append(BehaviorReflection.invokeVirtual(String.class, part, "virtual_getRepresentation_8173814113624650482", new Object[]{}));
    }
    return result.toString();
  }

  @Deprecated
  public static String call_getString_1222857578599(SNode thisNode, List<SNode> vars) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getString_1222432436326", new Object[]{vars});
  }

  @Deprecated
  public static String call_getRepresentation_8173814113624650627(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getRepresentation_8173814113624650482", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getString_1222857578599(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"), callerConceptFqName, "virtual_getString_1222432436326", new Class[]{SNode.class, List.class}, new Object[]{vars});
  }

  @Deprecated
  public static String callSuper_getRepresentation_8173814113624650627(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"), callerConceptFqName, "virtual_getRepresentation_8173814113624650482", new Class[]{SNode.class}, new Object[]{});
  }
}
