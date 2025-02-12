package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.project.Project;
import jetbrains.mps.baseLanguage.util.CodeStyleSettings;
import jetbrains.mps.baseLanguage.util.CodeStyleSettingsRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ParameterDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_createReference_1213877517482(SNode thisNode) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.VariableReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", thisNode, false);
    return ref;
  }

  public static boolean virtual_isCanBeUnused_1223985713603(SNode thisNode) {
    SNode method = SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");

    if (SPropertyOperations.getBoolean(method, "isFinal") && !(BaseMethodDeclaration_Behavior.call_hasAnnotation_5499146221535822693(method, SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Override"))) || SNodeOperations.isInstanceOf(method, "jetbrains.mps.baseLanguage.structure.IVisible") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(method, "jetbrains.mps.baseLanguage.structure.IVisible"), "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
      return true;
    }
    return false;
  }

  public static String virtual_getSuffix_3012473318495499856(SNode thisNode, Project project) {
    CodeStyleSettings settings = CodeStyleSettingsRegistry.getSettings(project);
    if (settings == null) {
      return "";
    }
    return (settings.getParameterSuffix() == null ?
      "" :
      settings.getParameterSuffix()
    );
  }

  public static String virtual_getPrefix_3012473318495495520(SNode thisNode, Project project) {
    CodeStyleSettings settings = CodeStyleSettingsRegistry.getSettings(project);
    if (settings == null) {
      return "";
    }
    return (settings.getParameterPrefix() == null ?
      "" :
      settings.getParameterPrefix()
    );
  }

  public static boolean call_hasAnnotation_5499146221535981742(SNode thisNode, SNode annotation) {
    for (SNode annotationInstance : SLinkOperations.getTargets(thisNode, "annotation", true)) {
      if (SLinkOperations.getTarget(annotationInstance, "annotation", false) == annotation) {
        return true;
      }
    }
    return false;
  }

  public static SNode virtual_getValue_1224857430232(SNode thisNode) {
    throw new UnsupportedOperationException();
  }

  @Deprecated
  public static String call_getSuffix_3012473318495506887(SNode thisNode, Project project) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getSuffix_3012473318495499856", new Object[]{project});
  }

  @Deprecated
  public static String call_getPrefix_3012473318495506881(SNode thisNode, Project project) {
    return BehaviorReflection.invokeVirtual(String.class, thisNode, "virtual_getPrefix_3012473318495495520", new Object[]{project});
  }

  @Deprecated
  public static SNode call_getValue_4163393263915013839(SNode thisNode) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), thisNode, "virtual_getValue_1224857430232", new Object[]{});
  }

  @Deprecated
  public static String callSuper_getSuffix_3012473318495506887(SNode thisNode, String callerConceptFqName, Project project) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), callerConceptFqName, "virtual_getSuffix_3012473318495499856", new Class[]{SNode.class, Project.class}, new Object[]{project});
  }

  @Deprecated
  public static String callSuper_getPrefix_3012473318495506881(SNode thisNode, String callerConceptFqName, Project project) {
    return BehaviorManager.getInstance().invokeSuper(String.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), callerConceptFqName, "virtual_getPrefix_3012473318495495520", new Class[]{SNode.class, Project.class}, new Object[]{project});
  }

  @Deprecated
  public static SNode callSuper_getValue_4163393263915013839(SNode thisNode, String callerConceptFqName) {
    return BehaviorManager.getInstance().invokeSuper((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), callerConceptFqName, "virtual_getValue_1224857430232", new Class[]{SNode.class}, new Object[]{});
  }
}
