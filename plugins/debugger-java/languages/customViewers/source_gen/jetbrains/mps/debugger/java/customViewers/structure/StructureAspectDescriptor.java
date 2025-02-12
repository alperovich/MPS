package jetbrains.mps.debugger.java.customViewers.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.StaticScope;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.CanWrapHighLevelValue_ConceptFunction").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").staticScope(StaticScope.NONE).create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.CustomWatchable").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").properties("iconPath").create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.CustomWatchablesContainer").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"watchable"}, new boolean[]{true}).alias("custom watchables container", "").create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.GetHighLevelValuePresentation_ConceptFunction").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").staticScope(StaticScope.NONE).create();
      case 4:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.GetHighLevelWatchablesBlock_ConceptFunction").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").staticScope(StaticScope.NONE).create();
      case 5:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.HighLevelCustomViewer").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"valueType", "canWrap", "getPresentation", "getWatchables"}, new boolean[]{false, false, false, false}).alias("custom viewer", "").create();
      case 6:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.HighLevelValue_ConceptFunctionParameter").super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").parents("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").children(new String[]{"valueProxyType"}, new boolean[]{false}).alias("value", "").staticScope(StaticScope.NONE).create();
      case 7:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.HighLevelWatchableCreator").super_("jetbrains.mps.baseLanguage.structure.AbstractCreator").parents("jetbrains.mps.baseLanguage.structure.AbstractCreator").references("watchable").children(new String[]{"value"}, new boolean[]{false}).alias("watchable", "").staticScope(StaticScope.NONE).create();
      case 8:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.ToProcessMethod").super_("jetbrains.mps.lang.core.structure.NodeAttribute").parents("jetbrains.mps.lang.core.structure.NodeAttribute").alias("to process method", "").create();
      case 9:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.WatchableListType").super_("jetbrains.mps.baseLanguage.structure.Type").parents("jetbrains.mps.baseLanguage.structure.Type", "jetbrains.mps.baseLanguage.structure.IGenericType").alias("watchable list", "").staticScope(StaticScope.NONE).create();
      case 10:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.WatchableType").super_("jetbrains.mps.baseLanguage.structure.Type").parents("jetbrains.mps.baseLanguage.structure.Type").alias("watchable", "").staticScope(StaticScope.NONE).create();
      case 11:
        return new ConceptDescriptorBuilder("jetbrains.mps.debugger.java.customViewers.structure.WatchablesListCreator").super_("jetbrains.mps.baseLanguage.structure.AbstractCreator").parents("jetbrains.mps.baseLanguage.structure.AbstractCreator").alias("watchables array list", "").staticScope(StaticScope.NONE).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.debugger.java.customViewers.structure.CanWrapHighLevelValue_ConceptFunction", "jetbrains.mps.debugger.java.customViewers.structure.CustomWatchable", "jetbrains.mps.debugger.java.customViewers.structure.CustomWatchablesContainer", "jetbrains.mps.debugger.java.customViewers.structure.GetHighLevelValuePresentation_ConceptFunction", "jetbrains.mps.debugger.java.customViewers.structure.GetHighLevelWatchablesBlock_ConceptFunction", "jetbrains.mps.debugger.java.customViewers.structure.HighLevelCustomViewer", "jetbrains.mps.debugger.java.customViewers.structure.HighLevelValue_ConceptFunctionParameter", "jetbrains.mps.debugger.java.customViewers.structure.HighLevelWatchableCreator", "jetbrains.mps.debugger.java.customViewers.structure.ToProcessMethod", "jetbrains.mps.debugger.java.customViewers.structure.WatchableListType", "jetbrains.mps.debugger.java.customViewers.structure.WatchableType", "jetbrains.mps.debugger.java.customViewers.structure.WatchablesListCreator"};
}
