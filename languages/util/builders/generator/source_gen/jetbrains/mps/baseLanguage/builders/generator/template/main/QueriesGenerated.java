package jetbrains.mps.baseLanguage.builders.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.builders.behavior.Builder_Behavior;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.MapSrcMacroContext;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_7057666463730697096(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "creator", true), "jetbrains.mps.baseLanguage.builders.structure.BuilderCreator");
  }

  public static Object propertyMacro_GetPropertyValue_7057666463730728185(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("result_", _context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_8009360033694992865(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("result_", _context.getNode());
  }

  public static Object referenceMacro_GetReferent_7057666463730728201(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "creator", true), "jetbrains.mps.baseLanguage.builders.structure.BuilderCreator"), "builder", true), "builderVar");
  }

  public static Object referenceMacro_GetReferent_1301175864894276286(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode builder = Builder_Behavior.call_getContextBuilder_7057666463730366732(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.Builder"))), _context.getNode());
    return _context.getOutputNodeByInputNodeAndMappingLabel(builder, "builderVar");
  }

  public static SNode sourceNodeQuery_7057666463730879245(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "creator", true), "jetbrains.mps.baseLanguage.builders.structure.BuilderCreator"), "builder", true);
  }

  public static SNode sourceNodeQuery_7057666463730728106(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), _context.getNode(), "virtual_getResultType_7057666463730718251", new Object[]{});
  }

  public static SNode sourceNodeQuery_7057666463730783295(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "builder", true);
  }

  public static SNode sourceNodeQuery_8009360033694992840(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), _context.getNode(), "virtual_getResultType_7057666463730718251", new Object[]{});
  }

  public static SNode sourceNodeQuery_8009360033695057975(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.builders.structure.AsBuilderStatement"), "expression", true);
  }

  public static SNode sourceNodeQuery_8009360033694992829(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "builder", true);
  }

  public static Iterable sourceNodesQuery_5157691191963265878(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "creator", true), "jetbrains.mps.baseLanguage.builders.structure.BuilderCreator"), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_5157691191963264583(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "body", true), "statement", true);
  }

  public static Iterable sourceNodesQuery_5157691191963262385(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "body", true), "statement", true);
  }

  public static SNode mapSrcMacro_mapper_5867364036373952047(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    SNode context = Builder_Behavior.call_getContextBuilder_7057666463730306577(_context.getNode());
    SNode ref = _quotation_createNode_x583g4_a0b0o(_context.getOutputNodeByInputNodeAndMappingLabel(context, "builderVar"));
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), _context.getNode(), "virtual_getCreatorExpression_7057666463730727863", new Object[]{ref});
  }

  public static SNode mapSrcMacro_mapper_5867364036373950596(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    SNode childRef = _quotation_createNode_x583g4_a0a0p(_context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "builder", true), "builderVar"));
    SNode parentBuilder = Builder_Behavior.call_getContextBuilder_7057666463730306577(SLinkOperations.getTarget(_context.getNode(), "builder", true));
    SNode parentRef = _quotation_createNode_x583g4_a0c0p(_context.getOutputNodeByInputNodeAndMappingLabel(parentBuilder, "builderVar"));
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), parentBuilder, "virtual_getAttachStatement_7288041816792215495", new Object[]{SLinkOperations.getTarget(_context.getNode(), "builder", true), parentRef, childRef});
  }

  private static SNode _quotation_createNode_x583g4_a0b0o(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VariableReference", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "variableDeclaration", (SNode) parameter_1);
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_x583g4_a0a0p(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VariableReference", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "variableDeclaration", (SNode) parameter_1);
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_x583g4_a0c0p(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VariableReference", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "variableDeclaration", (SNode) parameter_1);
    return quotedNode_2;
  }
}
