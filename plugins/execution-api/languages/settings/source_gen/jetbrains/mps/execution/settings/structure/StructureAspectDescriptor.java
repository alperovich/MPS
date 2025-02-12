package jetbrains.mps.execution.settings.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.ApplyTo_Function").super_("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").parents("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").alias("apply to", "").create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.CheckProperitesOperation").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation").references("checkProperties").staticScope(StaticScope.NONE).create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.CheckProperties_Function").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.baseLanguage.classifiers.structure.IMember").alias("check", "").create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.Configuration_Parameter").super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").parents("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").alias("configuration", "").staticScope(StaticScope.NONE).create();
      case 4:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.CreateEditor_Function").super_("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").parents("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").alias("create", "").create();
      case 5:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.DeprecatedAnnotation").super_("jetbrains.mps.lang.core.structure.NodeAttribute").parents("jetbrains.mps.lang.core.structure.NodeAttribute").properties("since", "comment").create();
      case 6:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.Dispose_Function").super_("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").parents("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").alias("dispose", "").create();
      case 7:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.EditorExpression").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").references("persistentPropertyDeclaration").alias("editor", "").staticScope(StaticScope.NONE).create();
      case 8:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.EditorOperationCall").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation").references("editorOperationDeclaration").children(new String[]{"arguments"}, new boolean[]{true}).staticScope(StaticScope.NONE).create();
      case 9:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").abstract_().create();
      case 10:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.EditorPropertyDeclaration").super_("jetbrains.mps.baseLanguage.structure.VariableDeclaration").parents("jetbrains.mps.baseLanguage.structure.VariableDeclaration").create();
      case 11:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.EditorPropertyReference").super_("jetbrains.mps.baseLanguage.structure.VariableReference").parents("jetbrains.mps.baseLanguage.structure.VariableReference").references("editorPropertyDeclaration").staticScope(StaticScope.NONE).create();
      case 12:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.GetEditorOperation").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation").alias("editor", "").staticScope(StaticScope.NONE).create();
      case 13:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.GridBagConstraints").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").properties("constraintsKind").children(new String[]{"order"}, new boolean[]{false}).alias("grid bag constraints", "").staticScope(StaticScope.NONE).create();
      case 14:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.IPersistentPropertyHolder").interface_().parents("jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"persistentProperty"}, new boolean[]{true}).create();
      case 15:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.PersistentConfiguration").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.execution.settings.structure.IPersistentPropertyHolder", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.execution.common.structure.IGeneratedToClass").children(new String[]{"editor", "checkProperties", "methods"}, new boolean[]{false, false, true}).create();
      case 16:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.PersistentConfigurationAssistent").interface_().references("configuration").create();
      case 17:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.PersistentConfigurationMethod").super_("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration").parents("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration").create();
      case 18:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplate").super_("jetbrains.mps.execution.settings.structure.PersistentConfiguration").parents("jetbrains.mps.execution.settings.structure.PersistentConfiguration").children(new String[]{"templateParameter"}, new boolean[]{true}).alias("persistent configuration template", "").create();
      case 19:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplateInitializer").super_("jetbrains.mps.baseLanguage.structure.AbstractCreator").parents("jetbrains.mps.baseLanguage.structure.AbstractCreator").references("template").children(new String[]{"parameter"}, new boolean[]{true}).staticScope(StaticScope.NONE).create();
      case 20:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.PersistentConfigurationType").super_("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").parents("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").references("persistentConfiguration").alias("configuration", "persistent configuration type").staticScope(StaticScope.NONE).create();
      case 21:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.PersistentPropertyDeclaration").super_("jetbrains.mps.baseLanguage.structure.VariableDeclaration").parents("jetbrains.mps.baseLanguage.structure.VariableDeclaration").create();
      case 22:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.PersistentPropertyReferenceOperation").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation").references("variableDeclaration").alias("", "persistent property reference").staticScope(StaticScope.NONE).create();
      case 23:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.ReportConfigurationErrorStatement").super_("jetbrains.mps.baseLanguage.structure.Statement").parents("jetbrains.mps.baseLanguage.structure.Statement").children(new String[]{"expression"}, new boolean[]{false}).alias("report error", "").staticScope(StaticScope.NONE).create();
      case 24:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.ResetFrom_Function").super_("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").parents("jetbrains.mps.execution.settings.structure.EditorOperationDeclaration").alias("reset from", "").create();
      case 25:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.SettingsEditor").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").children(new String[]{"createEditor", "applyTo", "resetFrom", "dispose", "propertyDeclaration"}, new boolean[]{false, false, false, false, true}).create();
      case 26:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.SettingsEditorType").super_("jetbrains.mps.baseLanguage.structure.Type").parents("jetbrains.mps.baseLanguage.structure.Type").references("configuration").alias("editor", "").staticScope(StaticScope.NONE).create();
      case 27:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.TemplateParameter").super_("jetbrains.mps.baseLanguage.structure.VariableDeclaration").parents("jetbrains.mps.baseLanguage.structure.VariableDeclaration").alias("template parameter", "").create();
      case 28:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.TemplateParameterReference").super_("jetbrains.mps.baseLanguage.structure.VariableReference").parents("jetbrains.mps.baseLanguage.structure.VariableReference").references("constructorParameterDeclaration").staticScope(StaticScope.NONE).create();
      case 29:
        return new ConceptDescriptorBuilder("jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType").super_("jetbrains.mps.execution.settings.structure.PersistentConfigurationType").parents("jetbrains.mps.execution.settings.structure.PersistentConfigurationType").references("template").alias("template configuration", "template configuration reference").staticScope(StaticScope.NONE).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.execution.settings.structure.ApplyTo_Function", "jetbrains.mps.execution.settings.structure.CheckProperitesOperation", "jetbrains.mps.execution.settings.structure.CheckProperties_Function", "jetbrains.mps.execution.settings.structure.Configuration_Parameter", "jetbrains.mps.execution.settings.structure.CreateEditor_Function", "jetbrains.mps.execution.settings.structure.DeprecatedAnnotation", "jetbrains.mps.execution.settings.structure.Dispose_Function", "jetbrains.mps.execution.settings.structure.EditorExpression", "jetbrains.mps.execution.settings.structure.EditorOperationCall", "jetbrains.mps.execution.settings.structure.EditorOperationDeclaration", "jetbrains.mps.execution.settings.structure.EditorPropertyDeclaration", "jetbrains.mps.execution.settings.structure.EditorPropertyReference", "jetbrains.mps.execution.settings.structure.GetEditorOperation", "jetbrains.mps.execution.settings.structure.GridBagConstraints", "jetbrains.mps.execution.settings.structure.IPersistentPropertyHolder", "jetbrains.mps.execution.settings.structure.PersistentConfiguration", "jetbrains.mps.execution.settings.structure.PersistentConfigurationAssistent", "jetbrains.mps.execution.settings.structure.PersistentConfigurationMethod", "jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplate", "jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplateInitializer", "jetbrains.mps.execution.settings.structure.PersistentConfigurationType", "jetbrains.mps.execution.settings.structure.PersistentPropertyDeclaration", "jetbrains.mps.execution.settings.structure.PersistentPropertyReferenceOperation", "jetbrains.mps.execution.settings.structure.ReportConfigurationErrorStatement", "jetbrains.mps.execution.settings.structure.ResetFrom_Function", "jetbrains.mps.execution.settings.structure.SettingsEditor", "jetbrains.mps.execution.settings.structure.SettingsEditorType", "jetbrains.mps.execution.settings.structure.TemplateParameter", "jetbrains.mps.execution.settings.structure.TemplateParameterReference", "jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType"};
}
