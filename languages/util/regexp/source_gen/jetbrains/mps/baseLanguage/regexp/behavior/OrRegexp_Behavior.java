package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class OrRegexp_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    String s = BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(thisNode, "left", true), "virtual_getString_1222432436326", new Object[]{vars}) + "|" + BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(thisNode, "right", true), "virtual_getString_1222432436326", new Object[]{vars});
    return (OrRegexp_Behavior.call_inParentheses_1353467374623956858(thisNode) ?
      Regexp_Behavior.call_par_1222433790846(thisNode, s) :
      s
    );
  }

  public static boolean virtual_needParentheses_1353467374623880338(SNode thisNode) {
    return true;
  }

  public static boolean call_inParentheses_1353467374623956858(SNode thisNode) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp");
  }

  @Deprecated
  public static String call_getString_1222434354398(SNode thisNode, List<SNode> vars) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getString_1222432436326", new Object[]{vars});
  }

  @Deprecated
  public static boolean call_needParentheses_1353467374623956023(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_needParentheses_1353467374623880338", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getString_1222434354398(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.OrRegexp"), callerConceptFqName, "virtual_getString_1222432436326", new Class[]{SNode.class, List.class}, new Object[]{vars});
  }

  @Deprecated
  public static boolean callSuper_needParentheses_1353467374623956023(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.OrRegexp"), callerConceptFqName, "virtual_needParentheses_1353467374623880338", new Class[]{SNode.class}, new Object[]{});
  }
}
