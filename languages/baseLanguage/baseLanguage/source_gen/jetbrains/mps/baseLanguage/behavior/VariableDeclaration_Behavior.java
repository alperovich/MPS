package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import javax.swing.Icon;
import java.util.ArrayList;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.plugin.IconResourceBundle_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class VariableDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<Icon> virtual_getMarkIcons_3923831204883340393(SNode thisNode) {
    List<Icon> markIcons = new ArrayList<Icon>(BehaviorReflection.invokeSuper((Class<List<Icon>>) ((Class) Object.class), thisNode, "jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration", "virtual_getMarkIcons_3923831204883340393", new Object[]{}));
    if (SPropertyOperations.getBoolean(thisNode, "isFinal")) {
      markIcons.add(IconResourceBundle_Behavior.getInstance().getResource("FINALMARK"));
    }
    return markIcons;
  }

  public static SNode virtual_createReference_1213877517482(SNode thisNode) {
    throw new RuntimeException();
  }

  public static boolean virtual_isInitializable_1213877517488(SNode thisNode) {
    return false;
  }

  public static List<SNode> virtual_getChildrenToDisplayIntention_4025276038182319200(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "type", true));
    return result;
  }

  public static SNode virtual_deriveType_1213877435747(SNode thisNode, SNode expression) {
    SNode type = null;
    if (SNodeOperations.getParent(expression) == thisNode && SNodeOperations.hasRole(expression, "jetbrains.mps.baseLanguage.structure.VariableDeclaration", "initializer")) {
      type = SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "type", true));
    }
    return type;
  }

  public static String virtual_getPrefix_3012473318495495520(SNode thisNode, Project project) {
    return "";
  }

  public static String virtual_getSuffix_3012473318495499856(SNode thisNode, Project project) {
    return "";
  }

  public static SNode virtual_getTypeAnnotation_1233920952262(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "type", true);
  }

  public static SNode virtual_getQualifiedReference_4598334504606213641(SNode thisNode) {
    return null;
  }

  @Deprecated
  public static List<Icon> call_getMarkIcons_5039675756633082307(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<Icon>>) ((Class) Object.class), thisNode, "virtual_getMarkIcons_3923831204883340393", new Object[]{});
  }

  @Deprecated
  public static SNode call_createReference_1213877517482(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_createReference_1213877517482", new Object[]{});
  }

  @Deprecated
  public static boolean call_isInitializable_1213877517488(SNode thisNode) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, thisNode, "virtual_isInitializable_1213877517488", new Object[]{});
  }

  @Deprecated
  public static List<SNode> call_getChildrenToDisplayIntention_4025276038182325660(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), thisNode, "virtual_getChildrenToDisplayIntention_4025276038182319200", new Object[]{});
  }

  @Deprecated
  public static String call_getPrefix_3012473318495495520(SNode thisNode, Project project) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getPrefix_3012473318495495520", new Object[]{project});
  }

  @Deprecated
  public static String call_getSuffix_3012473318495499856(SNode thisNode, Project project) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getSuffix_3012473318495499856", new Object[]{project});
  }

  @Deprecated
  public static SNode call_getQualifiedReference_4598334504606213641(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getQualifiedReference_4598334504606213641", new Object[]{});
  }

  @Deprecated
  public static List<Icon> callSuper_getMarkIcons_5039675756633082307(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<List<Icon>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), callerConceptFqName, "virtual_getMarkIcons_3923831204883340393", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static SNode callSuper_createReference_1213877517482(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), callerConceptFqName, "virtual_createReference_1213877517482", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static boolean callSuper_isInitializable_1213877517488(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper(Boolean.TYPE, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), callerConceptFqName, "virtual_isInitializable_1213877517488", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static List<SNode> callSuper_getChildrenToDisplayIntention_4025276038182325660(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<List<SNode>>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), callerConceptFqName, "virtual_getChildrenToDisplayIntention_4025276038182319200", new Class[]{SNode.class}, new Object[]{});
  }

  @Deprecated
  public static String callSuper_getPrefix_3012473318495495520(SNode thisNode, String callerConceptFqName, Project project) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), callerConceptFqName, "virtual_getPrefix_3012473318495495520", new Class[]{SNode.class, Project.class}, new Object[]{project});
  }

  @Deprecated
  public static String callSuper_getSuffix_3012473318495499856(SNode thisNode, String callerConceptFqName, Project project) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), callerConceptFqName, "virtual_getSuffix_3012473318495499856", new Class[]{SNode.class, Project.class}, new Object[]{project});
  }

  @Deprecated
  public static SNode callSuper_getQualifiedReference_4598334504606213641(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), callerConceptFqName, "virtual_getQualifiedReference_4598334504606213641", new Class[]{SNode.class}, new Object[]{});
  }
}
