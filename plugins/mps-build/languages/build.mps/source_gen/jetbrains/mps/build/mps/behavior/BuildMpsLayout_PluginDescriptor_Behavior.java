package jetbrains.mps.build.mps.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.build.util.DependenciesHelper;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.build.util.UnpackHelper;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class BuildMpsLayout_PluginDescriptor_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_exports_6547494638219603457(SNode thisNode, Object artifactId) {
    if (artifactId instanceof jetbrains.mps.smodel.SNode) {
      SNode node = (SNode) artifactId;
      // todo (in 3.0+) plugin should be exported by folder, not by xml 
      // weeeeell? 
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.build.mps.structure.BuildMps_IdeaPlugin")) {
        return SLinkOperations.getTarget(thisNode, "plugin", false) == node;
      }
    }
    return BehaviorReflection.invokeSuper(Boolean.TYPE, thisNode, "jetbrains.mps.build.structure.BuildLayout_Node", "virtual_exports_6547494638219603457", new Object[]{artifactId});
  }

  public static String virtual_location_7117056644539862594(SNode thisNode, DependenciesHelper helper, Object artifactId) {
    if (artifactId instanceof jetbrains.mps.smodel.SNode) {
      SNode node = (SNode) artifactId;
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.build.mps.structure.BuildMps_IdeaPlugin")) {
        return helper.locations().get(thisNode) + "/../..";
      }
    }
    return BehaviorReflection.invokeSuper(String.class, thisNode, "jetbrains.mps.build.structure.BuildLayout_Node", "virtual_location_7117056644539862594", new Object[]{helper, artifactId});
  }

  public static void virtual_appendName_1368030936106665465(SNode thisNode, SNode parent, StringBuilder sb) {
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.build.structure.BuildLayout_Container")) {
      sb.append("/");
    }
    sb.append(BuildMpsLayout_PluginDescriptor_Behavior.call_pluginXml_978600701690250198(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.build.mps.structure.BuildMpsLayout_PluginDescriptor")))));
  }

  public static void virtual_unpack_7128123785277710736(SNode thisNode, UnpackHelper helper, Iterable<Object> artifacts) {
    String parentLocation = helper.contentLocations().get(helper.parent(thisNode));
    helper.locations().put(thisNode, parentLocation + "/" + BuildMpsLayout_PluginDescriptor_Behavior.call_pluginXml_978600701690250198(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.build.mps.structure.BuildMpsLayout_PluginDescriptor")))));
  }

  public static String call_pluginXml_978600701690250198(SAbstractConcept thisConcept) {
    return "plugin.xml";
  }
}
