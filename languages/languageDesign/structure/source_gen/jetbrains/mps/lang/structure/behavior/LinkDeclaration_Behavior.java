package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class LinkDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_getGenuineLink_1213877254523(SNode thisNode) {
    if (thisNode == null) {
      return null;
    }
    return SModelUtil.getGenuineLinkDeclaration(thisNode);
  }

  public static String call_getGenuineRole_1213877254542(SNode thisNode) {
    if (thisNode == null) {
      return null;
    }
    return SModelUtil.getGenuineLinkRole(thisNode);
  }

  public static boolean call_isSingular_1213877254557(SNode thisNode) {
    SNode genuineLinkDeclaration = SModelUtil.getGenuineLinkDeclaration(thisNode);
    return SPropertyOperations.hasValue(genuineLinkDeclaration, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(genuineLinkDeclaration, "sourceCardinality", "1", "0..1");
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "role");
  }

  public static boolean call_isAtLeastOneCardinality_3386205146660812199(SNode thisNode) {
    SNode genuineLink = LinkDeclaration_Behavior.call_getGenuineLink_1213877254523(thisNode);
    return SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1", "0..1") || SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1..n", "0..1");
  }
}
