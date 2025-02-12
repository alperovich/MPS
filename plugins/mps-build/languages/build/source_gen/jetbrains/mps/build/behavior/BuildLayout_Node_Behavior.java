package jetbrains.mps.build.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.UnpackHelper;
import jetbrains.mps.build.util.DependenciesHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class BuildLayout_Node_Behavior {
  public static void init(SNode thisNode) {
  }

  public static void virtual_unpack_7128123785277710736(SNode thisNode, UnpackHelper helper, Iterable<Object> artifacts) {
    // nop 
  }

  public static boolean virtual_exports_6547494638219603457(SNode thisNode, Object artifactId) {
    return false;
  }

  public static String virtual_location_7117056644539862594(SNode thisNode, DependenciesHelper helper, Object artifactId) {
    return helper.locations().get(thisNode);
  }

  public static void virtual_appendName_1368030936106665465(SNode thisNode, SNode parent, StringBuilder sb) {
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.build.structure.BuildLayout_Node")) {
      sb.append("/");
    }
    sb.append((SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(thisNode), "conceptAlias") != null ?
      SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(thisNode), "conceptAlias") :
      SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(thisNode), "name")
    ));
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuilder sb = new StringBuilder();
    BuildLayout_Node_Behavior.call_appendName_internal_1368030936106708110(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.build.structure.BuildLayout_Node"))), thisNode, sb);
    return sb.toString();
  }

  public static boolean virtual_isFolder_1368030936106753980(SNode thisNode) {
    return false;
  }

  public static boolean virtual_isFile_1368030936106753986(SNode thisNode) {
    return false;
  }

  public static void call_appendName_internal_1368030936106708110(SAbstractConcept thisConcept, SNode node, StringBuilder sb) {
    SNode parent = SNodeOperations.as(SNodeOperations.getParent(node), "jetbrains.mps.build.structure.BuildLayout_PathElement");
    if (parent != null) {
      BuildLayout_Node_Behavior.call_appendName_internal_1368030936106708110(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.build.structure.BuildLayout_Node"))), parent, sb);
    }
    BehaviorReflection.invokeVirtual(Void.class, node, "virtual_appendName_1368030936106665465", new Object[]{parent, sb});
  }

  @Deprecated
  public static void call_unpack_7128123785277723766(SNode thisNode, UnpackHelper helper, Iterable<Object> artifacts) {
    BehaviorReflection.invokeVirtual(Void.class, thisNode, "virtual_unpack_7128123785277710736", new Object[]{helper, artifacts});
  }

  @Deprecated
  public static boolean call_exports_6547494638219603457(SNode thisNode, Object artifactId) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_exports_6547494638219603457", new Object[]{artifactId});
  }

  @Deprecated
  public static boolean call_isFolder_1368030936106753980(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_isFolder_1368030936106753980", new Object[]{});
  }

  @Deprecated
  public static boolean call_isFile_1368030936106753986(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_isFile_1368030936106753986", new Object[]{});
  }

  @Deprecated
  public static void callSuper_unpack_7128123785277723766(SNode thisNode, String callerConceptFqName, UnpackHelper helper, Iterable<Object> artifacts) {
    BehaviorManager.getInstance().invokeSuper(Void.class, SNodeOperations.cast(thisNode, "jetbrains.mps.build.structure.BuildLayout_Node"), callerConceptFqName, "virtual_unpack_7128123785277710736", new Class[]{SNode.class, UnpackHelper.class, Iterable.class}, new Object[]{helper, artifacts});
  }

  @Deprecated
  public static boolean callSuper_exports_6547494638219603457(SNode thisNode, String callerConceptFqName, Object artifactId) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.build.structure.BuildLayout_Node"), callerConceptFqName, "virtual_exports_6547494638219603457", new Class[]{SNode.class, Object.class}, new Object[]{artifactId});
  }

  @Deprecated
  public static boolean callSuper_isFolder_1368030936106753980(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.build.structure.BuildLayout_Node"), callerConceptFqName, "virtual_isFolder_1368030936106753980", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static boolean callSuper_isFile_1368030936106753986(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.build.structure.BuildLayout_Node"), callerConceptFqName, "virtual_isFile_1368030936106753986", new Class[]{SNode.class}, new Object[]{});
  }
}
