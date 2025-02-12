package jetbrains.mps.lang.generator.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.AbandonInput_RuleConsequence").super_("jetbrains.mps.lang.generator.structure.RuleConsequence").parents("jetbrains.mps.lang.generator.structure.RuleConsequence").alias("<abandon input>", "").create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.AbstractMacro").interface_().properties("comment").create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.BaseMappingRule").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("applyToConceptInheritors").references("applicableConcept", "labelDeclaration").children(new String[]{"conditionFunction"}, new boolean[]{false}).abstract_().create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.BaseMappingRule_Condition").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("condition", "").staticScope(StaticScope.NONE).create();
      case 4:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.CopySrcListMacro").super_("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").parents("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro", "jetbrains.mps.lang.core.structure.ISuppressErrors").children(new String[]{"sourceNodesQuery"}, new boolean[]{false}).alias("$COPY_SRCL$", "copy list of nodes from source").staticScope(StaticScope.NONE).create();
      case 5:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.CopySrcNodeMacro").super_("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").parents("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro", "jetbrains.mps.lang.core.structure.ISuppressErrors").children(new String[]{"sourceNodeQuery"}, new boolean[]{false}).alias("$COPY_SRC$", "copy source node macro").staticScope(StaticScope.NONE).create();
      case 6:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.CreateRootRule").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").references("templateNode", "label").children(new String[]{"conditionFunction"}, new boolean[]{false}).alias("create root", "").create();
      case 7:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.CreateRootRule_Condition").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("condition", "").staticScope(StaticScope.NONE).create();
      case 8:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.DismissTopMappingRule").super_("jetbrains.mps.lang.generator.structure.RuleConsequence").parents("jetbrains.mps.lang.generator.structure.RuleConsequence").children(new String[]{"generatorMessage"}, new boolean[]{false}).alias("<dismiss top rule>", "").create();
      case 9:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.DropRootRule").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").references("applicableConcept").children(new String[]{"conditionFunction"}, new boolean[]{false}).create();
      case 10:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.DropRootRule_Condition").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("condition", "").staticScope(StaticScope.NONE).create();
      case 11:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.GeneratorDescriptor").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").properties("generate").alias("generator descriptor", "").create();
      case 12:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.GeneratorMessage").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("messageType", "messageText").alias("generator message", "").create();
      case 13:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.GeneratorParameterReference").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("isOptional").references("declaration").create();
      case 14:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.IGeneratorParameter").interface_().parents("jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"type"}, new boolean[]{false}).create();
      case 15:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.ITemplateCall").interface_().parents("jetbrains.mps.baseLanguage.structure.TypeDerivable").references("template").children(new String[]{"actualArgument"}, new boolean[]{true}).create();
      case 16:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.IfMacro").super_("jetbrains.mps.lang.generator.structure.NodeMacro").parents("jetbrains.mps.lang.generator.structure.NodeMacro").children(new String[]{"conditionFunction", "alternativeConsequence"}, new boolean[]{false, false}).alias("$IF$", "conditional macro").staticScope(StaticScope.NONE).create();
      case 17:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.IfMacro_Condition").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("condition", "").staticScope(StaticScope.NONE).create();
      case 18:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.IncludeMacro").super_("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").parents("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").references("includeTemplate").children(new String[]{"sourceNodeQuery"}, new boolean[]{false}).alias("$INCLUDE$", "include template macro").staticScope(StaticScope.NONE).create();
      case 19:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.InlineSwitch_Case").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").children(new String[]{"conditionFunction", "caseConsequence"}, new boolean[]{false, false}).create();
      case 20:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.InlineSwitch_RuleConsequence").super_("jetbrains.mps.lang.generator.structure.RuleConsequence").parents("jetbrains.mps.lang.generator.structure.RuleConsequence", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").children(new String[]{"case", "defaultConsequence"}, new boolean[]{true, false}).alias("<in-line switch>", "").create();
      case 21:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.InlineTemplateWithContext_RuleConsequence").super_("jetbrains.mps.lang.generator.structure.RuleConsequence").parents("jetbrains.mps.lang.generator.structure.RuleConsequence").children(new String[]{"contentNode"}, new boolean[]{false}).alias("<in-line template with context>", "").create();
      case 22:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence").super_("jetbrains.mps.lang.generator.structure.RuleConsequence").parents("jetbrains.mps.lang.generator.structure.RuleConsequence").children(new String[]{"templateNode"}, new boolean[]{false}).alias("<in-line template>", "").create();
      case 23:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.InsertMacro").super_("jetbrains.mps.lang.generator.structure.NodeMacro").parents("jetbrains.mps.lang.generator.structure.NodeMacro").children(new String[]{"createNodeQuery"}, new boolean[]{false}).alias("$INSERT$", "create an arbitrary node in output model").staticScope(StaticScope.NONE).create();
      case 24:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.InsertMacro_CreateNodeQuery").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("query", "").staticScope(StaticScope.NONE).create();
      case 25:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.LabelMacro").super_("jetbrains.mps.lang.generator.structure.NodeMacro").parents("jetbrains.mps.lang.generator.structure.NodeMacro").alias("$LABEL$", "attach label to output node").staticScope(StaticScope.NONE).create();
      case 26:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.LoopMacro").super_("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").parents("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").children(new String[]{"sourceNodesQuery"}, new boolean[]{false}).alias("$LOOP$", "loop macro").staticScope(StaticScope.NONE).create();
      case 27:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MapSrcListMacro").super_("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").parents("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").children(new String[]{"sourceNodesQuery", "mapperFunction", "postMapperFunction"}, new boolean[]{false, false, false}).alias("$MAP_SRCL$", "map nodes form source list macro").staticScope(StaticScope.NONE).create();
      case 28:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("create output node", "").staticScope(StaticScope.NONE).create();
      case 29:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MapSrcMacro_PostMapperFunction").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("post-process output node", "").staticScope(StaticScope.NONE).create();
      case 30:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MapSrcNodeMacro").super_("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").parents("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").children(new String[]{"sourceNodeQuery", "mapperFunction", "postMapperFunction"}, new boolean[]{false, false, false}).alias("$MAP_SRC$", "map source node macro").staticScope(StaticScope.NONE).create();
      case 31:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MappingConfiguration").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.structure.IMemberContainer", "jetbrains.mps.lang.structure.structure.IConceptAspect").properties("topPriorityGroup").children(new String[]{"condition", "rootMappingRule", "weavingMappingRule", "reductionMappingRule", "patternReductionRule", "createRootRule", "dropRootRule", "preMappingScript", "postMappingScript", "mappingLabel", "generationParameters"}, new boolean[]{false, true, true, true, true, true, true, true, true, true, true}).alias("mapping configuration", "").create();
      case 32:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MappingConfiguration_Condition").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("condition", "").staticScope(StaticScope.NONE).create();
      case 33:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MappingLabelDeclaration").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").references("sourceConcept", "targetConcept").alias("label: input -> output", "mapping label declaration").create();
      case 34:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MappingScript").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").properties("scriptKind", "modifiesModel").children(new String[]{"codeBlock"}, new boolean[]{false}).alias("mapping script", "").create();
      case 35:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MappingScriptReference").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").references("mappingScript").create();
      case 36:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.MappingScript_CodeBlock").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").staticScope(StaticScope.NONE).create();
      case 37:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.NodeMacro").super_("jetbrains.mps.lang.core.structure.NodeAttribute").parents("jetbrains.mps.lang.core.structure.NodeAttribute", "jetbrains.mps.lang.generator.structure.AbstractMacro").references("mappingLabel").abstract_().alias("$$", "abstract node macro").create();
      case 38:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.PatternReduction_MappingRule").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.generator.structure.ReductionRule").references("labelDeclaration").children(new String[]{"pattern", "ruleConsequence", "conditionFunction"}, new boolean[]{false, false, false}).alias("pattern reduce", "").create();
      case 39:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.PropertyMacro").super_("jetbrains.mps.lang.core.structure.PropertyAttribute").parents("jetbrains.mps.lang.core.structure.PropertyAttribute", "jetbrains.mps.lang.generator.structure.AbstractMacro", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").children(new String[]{"propertyValueFunction"}, new boolean[]{false}).staticScope(StaticScope.NONE).create();
      case 40:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("property value", "").staticScope(StaticScope.NONE).create();
      case 41:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.ReductionRule").interface_().create();
      case 42:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.Reduction_MappingRule").super_("jetbrains.mps.lang.generator.structure.BaseMappingRule").parents("jetbrains.mps.lang.generator.structure.BaseMappingRule", "jetbrains.mps.lang.generator.structure.ReductionRule").children(new String[]{"ruleConsequence"}, new boolean[]{false}).alias("reduce", "").create();
      case 43:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.ReferenceMacro").super_("jetbrains.mps.lang.core.structure.LinkAttribute").parents("jetbrains.mps.lang.core.structure.LinkAttribute", "jetbrains.mps.lang.generator.structure.AbstractMacro", "jetbrains.mps.lang.core.structure.ISuppressErrors").children(new String[]{"referentFunction"}, new boolean[]{false}).staticScope(StaticScope.NONE).create();
      case 44:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.ReferenceMacro_GetReferent").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("get referent", "").staticScope(StaticScope.NONE).create();
      case 45:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation").super_("jetbrains.mps.lang.core.structure.NodeAttribute").parents("jetbrains.mps.lang.core.structure.NodeAttribute").references("applicableConcept").create();
      case 46:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.Root_MappingRule").super_("jetbrains.mps.lang.generator.structure.BaseMappingRule").parents("jetbrains.mps.lang.generator.structure.BaseMappingRule").properties("keepSourceRoot").references("template").alias("map", "").create();
      case 47:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.RuleConsequence").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").abstract_().create();
      case 48:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").super_("jetbrains.mps.lang.generator.structure.NodeMacro").parents("jetbrains.mps.lang.generator.structure.NodeMacro").abstract_().staticScope(StaticScope.NONE).create();
      case 49:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("query", "").staticScope(StaticScope.NONE).create();
      case 50:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("query", "").staticScope(StaticScope.NONE).create();
      case 51:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.SwitchMacro").super_("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").parents("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").references("templateSwitch").children(new String[]{"sourceNodeQuery"}, new boolean[]{false}).alias("$SWITCH$", "template switch macro").staticScope(StaticScope.NONE).create();
      case 52:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateArgumentLinkPatternRefExpression").super_("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef").parents("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef").references("patternVar").staticScope(StaticScope.NONE).create();
      case 53:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateArgumentParameterExpression").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").references("parameter").staticScope(StaticScope.NONE).create();
      case 54:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").abstract_().staticScope(StaticScope.NONE).create();
      case 55:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternVarRefExpression").super_("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef").parents("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef").references("patternVarDecl").staticScope(StaticScope.NONE).create();
      case 56:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateArgumentPropertyPatternRefExpression").super_("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef").parents("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef").references("propertyPattern").staticScope(StaticScope.NONE).create();
      case 57:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateArgumentQuery").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("query", "").staticScope(StaticScope.NONE).create();
      case 58:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateArgumentQueryExpression").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").children(new String[]{"query"}, new boolean[]{false}).alias("query", "").staticScope(StaticScope.NONE).create();
      case 59:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateCallMacro").super_("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro").parents("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro", "jetbrains.mps.lang.generator.structure.ITemplateCall").children(new String[]{"sourceNodeQuery"}, new boolean[]{false}).alias("$CALL$", "call template macro").staticScope(StaticScope.NONE).create();
      case 60:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateDeclaration").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.structure.structure.IConceptAspect").references("applicableConcept").children(new String[]{"contentNode", "parameter"}, new boolean[]{false, true}).alias("template declaration", "").create();
      case 61:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateDeclarationReference").super_("jetbrains.mps.lang.generator.structure.RuleConsequence").parents("jetbrains.mps.lang.generator.structure.RuleConsequence", "jetbrains.mps.lang.generator.structure.ITemplateCall").staticScope(StaticScope.NONE).create();
      case 62:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateFragment").super_("jetbrains.mps.lang.core.structure.NodeAttribute").parents("jetbrains.mps.lang.core.structure.NodeAttribute").references("labelDeclaration").children(new String[]{"contextNodeQuery"}, new boolean[]{false}).create();
      case 63:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateFragment_ContextNodeQuery").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("template fragment context node", "").staticScope(StaticScope.NONE).create();
      case 64:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_mainContextNode").super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").parents("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").alias("mainContextNode", "").staticScope(StaticScope.NONE).create();
      case 65:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_outputNode").super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").parents("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").alias("outputNode", "").staticScope(StaticScope.NONE).create();
      case 66:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_parentOutputNode").super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").parents("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").alias("parentOutputNode", "").staticScope(StaticScope.NONE).create();
      case 67:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode").super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").parents("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").alias("node", "").staticScope(StaticScope.NONE).create();
      case 68:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_templatePropertyValue").super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").parents("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").alias("templateValue", "").staticScope(StaticScope.NONE).create();
      case 69:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_templateReferent").super_("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter").parents("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").alias("templateValue", "").staticScope(StaticScope.NONE).create();
      case 70:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateParameterDeclaration").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IValidIdentifier").children(new String[]{"type"}, new boolean[]{false}).alias("", "parameter").create();
      case 71:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateQueryBase").super_("jetbrains.mps.baseLanguage.structure.ConceptFunction").parents("jetbrains.mps.baseLanguage.structure.ConceptFunction").abstract_().staticScope(StaticScope.NONE).create();
      case 72:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateSwitch").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.structure.structure.IConceptAspect").references("modifiedSwitch").children(new String[]{"reductionMappingRule", "defaultConsequence", "nullInputMessage"}, new boolean[]{true, false, false}).alias("template switch", "").create();
      case 73:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TemplateSwitchReference").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").references("templateSwitch").create();
      case 74:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.TraceMacro").super_("jetbrains.mps.lang.generator.structure.NodeMacro").parents("jetbrains.mps.lang.generator.structure.NodeMacro").children(new String[]{"sourceNodeQuery"}, new boolean[]{false}).alias("$TRACE$", "specify input for the attributed node for tracing purposes").staticScope(StaticScope.NONE).create();
      case 75:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.VarMacro").super_("jetbrains.mps.lang.generator.structure.NodeMacro").parents("jetbrains.mps.lang.generator.structure.NodeMacro", "jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"type", "value"}, new boolean[]{false, false}).alias("$VAR$", "compute and store value in variable").create();
      case 76:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.VarMacro_ValueQuery").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("query", "").staticScope(StaticScope.NONE).create();
      case 77:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.WeaveEach_RuleConsequence").super_("jetbrains.mps.lang.generator.structure.RuleConsequence").parents("jetbrains.mps.lang.generator.structure.RuleConsequence", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").references("template").children(new String[]{"sourceNodesQuery"}, new boolean[]{false}).alias("<weave each>", "").create();
      case 78:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.WeaveMacro").super_("jetbrains.mps.lang.generator.structure.NodeMacro").parents("jetbrains.mps.lang.generator.structure.NodeMacro").children(new String[]{"ruleConsequence", "nodesToWeaveQuery"}, new boolean[]{false, false}).alias("$WEAVE$", "weave additional children").staticScope(StaticScope.NONE).create();
      case 79:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.Weaving_MappingRule").super_("jetbrains.mps.lang.generator.structure.BaseMappingRule").parents("jetbrains.mps.lang.generator.structure.BaseMappingRule").children(new String[]{"ruleConsequence", "contextNodeQuery"}, new boolean[]{false, false}).alias("weave", "").create();
      case 80:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.generator.structure.Weaving_MappingRule_ContextNodeQuery").super_("jetbrains.mps.lang.generator.structure.TemplateQueryBase").parents("jetbrains.mps.lang.generator.structure.TemplateQueryBase").alias("weaving context node", "").staticScope(StaticScope.NONE).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.lang.generator.structure.AbandonInput_RuleConsequence", "jetbrains.mps.lang.generator.structure.AbstractMacro", "jetbrains.mps.lang.generator.structure.BaseMappingRule", "jetbrains.mps.lang.generator.structure.BaseMappingRule_Condition", "jetbrains.mps.lang.generator.structure.CopySrcListMacro", "jetbrains.mps.lang.generator.structure.CopySrcNodeMacro", "jetbrains.mps.lang.generator.structure.CreateRootRule", "jetbrains.mps.lang.generator.structure.CreateRootRule_Condition", "jetbrains.mps.lang.generator.structure.DismissTopMappingRule", "jetbrains.mps.lang.generator.structure.DropRootRule", "jetbrains.mps.lang.generator.structure.DropRootRule_Condition", "jetbrains.mps.lang.generator.structure.GeneratorDescriptor", "jetbrains.mps.lang.generator.structure.GeneratorMessage", "jetbrains.mps.lang.generator.structure.GeneratorParameterReference", "jetbrains.mps.lang.generator.structure.IGeneratorParameter", "jetbrains.mps.lang.generator.structure.ITemplateCall", "jetbrains.mps.lang.generator.structure.IfMacro", "jetbrains.mps.lang.generator.structure.IfMacro_Condition", "jetbrains.mps.lang.generator.structure.IncludeMacro", "jetbrains.mps.lang.generator.structure.InlineSwitch_Case", "jetbrains.mps.lang.generator.structure.InlineSwitch_RuleConsequence", "jetbrains.mps.lang.generator.structure.InlineTemplateWithContext_RuleConsequence", "jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence", "jetbrains.mps.lang.generator.structure.InsertMacro", "jetbrains.mps.lang.generator.structure.InsertMacro_CreateNodeQuery", "jetbrains.mps.lang.generator.structure.LabelMacro", "jetbrains.mps.lang.generator.structure.LoopMacro", "jetbrains.mps.lang.generator.structure.MapSrcListMacro", "jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction", "jetbrains.mps.lang.generator.structure.MapSrcMacro_PostMapperFunction", "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro", "jetbrains.mps.lang.generator.structure.MappingConfiguration", "jetbrains.mps.lang.generator.structure.MappingConfiguration_Condition", "jetbrains.mps.lang.generator.structure.MappingLabelDeclaration", "jetbrains.mps.lang.generator.structure.MappingScript", "jetbrains.mps.lang.generator.structure.MappingScriptReference", "jetbrains.mps.lang.generator.structure.MappingScript_CodeBlock", "jetbrains.mps.lang.generator.structure.NodeMacro", "jetbrains.mps.lang.generator.structure.PatternReduction_MappingRule", "jetbrains.mps.lang.generator.structure.PropertyMacro", "jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue", "jetbrains.mps.lang.generator.structure.ReductionRule", "jetbrains.mps.lang.generator.structure.Reduction_MappingRule", "jetbrains.mps.lang.generator.structure.ReferenceMacro", "jetbrains.mps.lang.generator.structure.ReferenceMacro_GetReferent", "jetbrains.mps.lang.generator.structure.RootTemplateAnnotation", "jetbrains.mps.lang.generator.structure.Root_MappingRule", "jetbrains.mps.lang.generator.structure.RuleConsequence", "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro", "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery", "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery", "jetbrains.mps.lang.generator.structure.SwitchMacro", "jetbrains.mps.lang.generator.structure.TemplateArgumentLinkPatternRefExpression", "jetbrains.mps.lang.generator.structure.TemplateArgumentParameterExpression", "jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef", "jetbrains.mps.lang.generator.structure.TemplateArgumentPatternVarRefExpression", "jetbrains.mps.lang.generator.structure.TemplateArgumentPropertyPatternRefExpression", "jetbrains.mps.lang.generator.structure.TemplateArgumentQuery", "jetbrains.mps.lang.generator.structure.TemplateArgumentQueryExpression", "jetbrains.mps.lang.generator.structure.TemplateCallMacro", "jetbrains.mps.lang.generator.structure.TemplateDeclaration", "jetbrains.mps.lang.generator.structure.TemplateDeclarationReference", "jetbrains.mps.lang.generator.structure.TemplateFragment", "jetbrains.mps.lang.generator.structure.TemplateFragment_ContextNodeQuery", "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_mainContextNode", "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_outputNode", "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_parentOutputNode", "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode", "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_templatePropertyValue", "jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_templateReferent", "jetbrains.mps.lang.generator.structure.TemplateParameterDeclaration", "jetbrains.mps.lang.generator.structure.TemplateQueryBase", "jetbrains.mps.lang.generator.structure.TemplateSwitch", "jetbrains.mps.lang.generator.structure.TemplateSwitchReference", "jetbrains.mps.lang.generator.structure.TraceMacro", "jetbrains.mps.lang.generator.structure.VarMacro", "jetbrains.mps.lang.generator.structure.VarMacro_ValueQuery", "jetbrains.mps.lang.generator.structure.WeaveEach_RuleConsequence", "jetbrains.mps.lang.generator.structure.WeaveMacro", "jetbrains.mps.lang.generator.structure.Weaving_MappingRule", "jetbrains.mps.lang.generator.structure.Weaving_MappingRule_ContextNodeQuery"};
}
