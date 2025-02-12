package jetbrains.mps.lang.plugin.standalone.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginDeclaration").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier").children(new String[]{"initBlock", "disposeBlock", "fieldDeclaration"}, new boolean[]{false, false, true}).alias("Application Plugin", "").create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginDisposeBlock").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").alias("dispose", "").staticScope(StaticScope.NONE).create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginInitBlock").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").alias("init", "").staticScope(StaticScope.NONE).create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginType").super_("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").parents("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").references("plugin").alias("application plugin<>", "").staticScope(StaticScope.NONE).create();
      case 4:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.GetPreferencesComponentInProjectOperation").super_("jetbrains.mps.lang.plugin.structure.BaseProjectOperation").parents("jetbrains.mps.lang.plugin.structure.BaseProjectOperation").references("componentDeclaration").alias("preferenceComponent<<{componentDeclaration}>>", "").staticScope(StaticScope.NONE).create();
      case 5:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.GetToolInProjectOperation").super_("jetbrains.mps.lang.plugin.structure.BaseProjectOperation").parents("jetbrains.mps.lang.plugin.structure.BaseProjectOperation").references("tool").alias("tool<<{tool}>>", "").staticScope(StaticScope.NONE).create();
      case 6:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginDeclaration").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier").children(new String[]{"initBlock", "disposeBlock", "fieldDeclaration"}, new boolean[]{false, false, true}).alias("Project Plugin", "").create();
      case 7:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginDisposeBlock").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").alias("dispose", "").staticScope(StaticScope.NONE).create();
      case 8:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginInitBlock").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").alias("init", "").staticScope(StaticScope.NONE).create();
      case 9:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginType").super_("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").parents("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").references("plugin").alias("project plugin<>", "").staticScope(StaticScope.NONE).create();
      case 10:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.plugin.standalone.structure.StandalonePluginDescriptor").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginDeclaration", "jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginDisposeBlock", "jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginInitBlock", "jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginType", "jetbrains.mps.lang.plugin.standalone.structure.GetPreferencesComponentInProjectOperation", "jetbrains.mps.lang.plugin.standalone.structure.GetToolInProjectOperation", "jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginDeclaration", "jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginDisposeBlock", "jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginInitBlock", "jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginType", "jetbrains.mps.lang.plugin.standalone.structure.StandalonePluginDescriptor"};
}
