package jetbrains.mps.lang.constraints.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.smodel.behaviour.BehaviorConstants;
import jetbrains.mps.lang.constraints.behavior.ConstraintFunction_ReferentSearchScope_Factory_Behavior;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_6490356536635245644(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    SModel model = _context.getOriginalInputModel();
    return (Language.getModelAspect(model) == LanguageAspect.CONSTRAINTS) && !(ListSequence.fromList(SModelOperations.getRoots(model, null)).isEmpty());

  }

  public static Object propertyMacro_GetPropertyValue_1213106242798(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3749568622064120906(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_context.getNode(), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_3043699116664595687(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_context.getNode(), "defaultConcreteConcept", false));
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252323000(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252323013(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeChild", true).getNodeId().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252358760(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252358773(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeParent", true).getNodeId().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252358999(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252359012(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true).getNodeId().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252398461(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252398474(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true).getNodeId().toString();
  }

  public static Object propertyMacro_GetPropertyValue_3749568622064121023(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3749568622064121036(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3749568622064121075(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3749568622064121137(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3749568622064121197(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3749568622064121384(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelUtil.getGenuineLinkRole(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false));
  }

  public static Object propertyMacro_GetPropertyValue_3749568622064121397(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelUtil.getGenuineLinkRole(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false));
  }

  public static Object propertyMacro_GetPropertyValue_1213106765283(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "static_" + BehaviorConstants.CAN_BE_A_CHILD_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_1213106765314(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "static_" + BehaviorConstants.CAN_BE_A_PARENT_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_1227085912913(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "static_" + BehaviorConstants.CAN_BE_A_ROOT_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_7855321458717409144(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "static_" + BehaviorConstants.CAN_BE_AN_ANCESTOR_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252434626(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7423954551252434639(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalCopiedInputNode((ConstraintFunction_ReferentSearchScope_Factory_Behavior.call_isValidatorGenerated_522233044824082130(((SNode) _context.getVariable("factory"))) ?
      ConstraintFunction_ReferentSearchScope_Factory_Behavior.call_getValidator_2990203945683058946(((SNode) _context.getVariable("factory"))) :
      ((SNode) _context.getVariable("factory"))
    )).getNodeId().toString();
  }

  public static Object propertyMacro_GetPropertyValue_7093837644838476833(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_4623703450343115877(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode constraints = ListSequence.fromList(SModelOperations.getRoots(_context.getOriginalInputModel(), null)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraints") && SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), "concept", false) == _context.getNode();
      }
    }).first();
    return SModelOperations.getModelName(_context.getOriginalInputModel()) + "." + SPropertyOperations.getString(SNodeOperations.cast(constraints, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5934496548013422568(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_5934496548013422581(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalCopiedInputNode(((SNode) _context.getVariable("factory"))).getNodeId().toString();
  }

  public static Object propertyMacro_GetPropertyValue_3602553488694021819(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.cast(((SNode) _context.getVariable("factory")), "jetbrains.mps.lang.constraints.structure.InheritedNodeScopeFactory"), "kind", false));
  }

  public static Object referenceMacro_GetReferent_1199971770629(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return "_context";
  }

  public static Object referenceMacro_GetReferent_1198586190309(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode propertyConstraint = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.constraints.structure.NodePropertyConstraint", false, false);
    SNode property = SLinkOperations.getTarget(propertyConstraint, "applicableProperty", false);
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if (dataType == null) {
      return null;
    }
    SNode bltype = BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), dataType, "virtual_toBaseLanguageType_1213877229718", new Object[]{});
    if (SNodeOperations.isInstanceOf(bltype, "jetbrains.mps.baseLanguage.structure.IntegerType")) {
      return SLinkOperations.getTarget(_quotation_createNode_x583g4_a0a0f0fb(), "baseMethodDeclaration", false);
    }
    if (SNodeOperations.isInstanceOf(bltype, "jetbrains.mps.baseLanguage.structure.BooleanType")) {
      return SLinkOperations.getTarget(_quotation_createNode_x583g4_a0a0g0fb(), "baseMethodDeclaration", false);
    }
    return SLinkOperations.getTarget(_quotation_createNode_x583g4_a0h0fb(), "baseMethodDeclaration", false);
  }

  public static boolean ifMacro_Condition_7294282772021338867(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "alternativeIcon", true) != null;
  }

  public static boolean ifMacro_Condition_7294282772021338898(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "defaultConcreteConcept", false) != null);
  }

  public static boolean ifMacro_Condition_7423954551252433615(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "defaultScope", true) != null);
  }

  public static boolean ifMacro_Condition_5934496548013463515(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "defaultScope", true), "searchScopeFactory", true), "jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory");
  }

  public static boolean ifMacro_Condition_7423954551252433663(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "defaultScope", true) != null);
  }

  public static boolean ifMacro_Condition_7423954551252398534(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeChild", true) != null;
  }

  public static boolean ifMacro_Condition_7423954551252315731(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeChild", true) != null;
  }

  public static boolean ifMacro_Condition_7423954551252326090(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeParent", true) != null;
  }

  public static boolean ifMacro_Condition_7423954551252358806(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeParent", true) != null;
  }

  public static boolean ifMacro_Condition_7423954551252358919(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true) != null;
  }

  public static boolean ifMacro_Condition_7423954551252358934(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true) != null;
  }

  public static boolean ifMacro_Condition_7423954551252359090(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true) != null;
  }

  public static boolean ifMacro_Condition_7423954551252359188(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true) != null;
  }

  public static boolean ifMacro_Condition_3749568622064121054(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertyGetter", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064121098(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertyGetter", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064121114(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertySetter", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064121158(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertySetter", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064121174(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertyValidator", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064121220(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertyValidator", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064154251(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "property", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_3749568622064121413(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "referentSetHandler", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064121458(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "referentSetHandler", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064121489(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "referentSetHandler", true) != null);
  }

  public static boolean ifMacro_Condition_3749568622064121505(final IOperationContext operationContext, final IfMacroContext _context) {
    // todo: ? 
    return (SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true) != null);
  }

  public static boolean ifMacro_Condition_5934496548013463270(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true), "jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory");
  }

  public static boolean ifMacro_Condition_3749568622064121608(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "referent", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_1213106765274(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeChild", true) != null;
  }

  public static boolean ifMacro_Condition_1213106765305(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeParent", true) != null;
  }

  public static boolean ifMacro_Condition_1227085790509(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true) != null);
  }

  public static boolean ifMacro_Condition_7852712695066963272(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true) != null);
  }

  public static boolean ifMacro_Condition_5979740912231475953(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("presentation")) != null);
  }

  public static boolean ifMacro_Condition_5979740912231475969(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("presentation")) != null);
  }

  public static boolean ifMacro_Condition_5979740912231476080(final IOperationContext operationContext, final IfMacroContext _context) {
    return ConstraintFunction_ReferentSearchScope_Factory_Behavior.call_isValidatorGenerated_522233044824082130(((SNode) _context.getVariable("factory")));
  }

  public static boolean ifMacro_Condition_7093837644838477078(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getOriginalInputModel(), null)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraints") && SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), "concept", false) == _context.getNode();
      }
    }).isNotEmpty();
  }

  public static boolean ifMacro_Condition_4623703450343115772(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getOriginalInputModel(), null)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraints") && SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), "concept", false) == _context.getNode();
      }
    }).isEmpty();
  }

  public static boolean ifMacro_Condition_5934496548013422436(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("presentation")) != null);
  }

  public static boolean ifMacro_Condition_5934496548013422465(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("presentation")) != null);
  }

  public static boolean ifMacro_Condition_2547162710961896342(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("factory")) != null);
  }

  public static boolean ifMacro_Condition_4934456136458576074(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(((SNode) _context.getVariable("factory")), "jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Scope");
  }

  public static boolean ifMacro_Condition_3602553488694021787(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(((SNode) _context.getVariable("factory")), "jetbrains.mps.lang.constraints.structure.InheritedNodeScopeFactory");
  }

  public static boolean ifMacro_Condition_2547162710961862306(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("factory")) != null);
  }

  public static SNode sourceNodeQuery_3043699116664545625(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "alternativeIcon", true), "body", true);
  }

  public static SNode sourceNodeQuery_3749568622064121088(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertyGetter", true), "body", true);
  }

  public static SNode sourceNodeQuery_3749568622064121148(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertySetter", true), "body", true);
  }

  public static SNode sourceNodeQuery_3749568622064121210(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertyValidator", true), "body", true);
  }

  public static SNode sourceNodeQuery_3749568622064121436(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ((SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "keepsReference", true), "body", true) != null) ?
      SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "keepsReference", true), "body", true) :
      _quotation_createNode_x583g4_a0a0zc()
    );
  }

  public static SNode sourceNodeQuery_3749568622064121479(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "referentSetHandler", true), "body", true);
  }

  public static SNode sourceNodeQuery_1213106765261(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeChild", true), "body", true);
  }

  public static SNode sourceNodeQuery_1213106765292(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeParent", true), "body", true);
  }

  public static SNode sourceNodeQuery_1227085938282(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true), "body", true);
  }

  public static SNode sourceNodeQuery_4581029622790076870(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true), "body", true);
  }

  public static SNode sourceNodeQuery_5979740912231422679(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(((SNode) _context.getVariable("presentation")), "body", true);
  }

  public static SNode sourceNodeQuery_5979740912231476010(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(((SNode) _context.getVariable("factory")), "body", true);
  }

  public static SNode sourceNodeQuery_5979740912231476063(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(ConstraintFunction_ReferentSearchScope_Factory_Behavior.call_getValidator_2990203945683058946(((SNode) _context.getVariable("factory"))), "body", true);
  }

  public static SNode sourceNodeQuery_5934496548013422454(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(((SNode) _context.getVariable("presentation")), "body", true);
  }

  public static SNode sourceNodeQuery_4934456136458576070(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(((SNode) _context.getVariable("factory")), "jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Scope"), "body", true);
  }

  public static Object templateArgumentQuery_7423954551252433684(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "defaultScope", true), "searchScopeFactory", true);
  }

  public static Object templateArgumentQuery_7423954551252433693(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "defaultScope", true), "presentation", true);
  }

  public static Object templateArgumentQuery_5934496548013463593(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "defaultScope", true), "searchScopeFactory", true);
  }

  public static Object templateArgumentQuery_5934496548013463600(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "defaultScope", true), "presentation", true);
  }

  public static Object templateArgumentQuery_3749568622064121527(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true);
  }

  public static Object templateArgumentQuery_3749568622064121534(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "presentation", true);
  }

  public static Object templateArgumentQuery_5934496548013463448(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true);
  }

  public static Object templateArgumentQuery_5934496548013463452(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "presentation", true);
  }

  public static Iterable sourceNodesQuery_3749568622064121229(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "property", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "propertyGetter", true) != null) || (SLinkOperations.getTarget(it, "propertySetter", true) != null) || (SLinkOperations.getTarget(it, "propertyValidator", true) != null);
      }
    });
  }

  public static Iterable sourceNodesQuery_3749568622064121542(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "referent", true);
  }

  public static Iterable sourceNodesQuery_7093837644838476730(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SModelOperations.getNodes(_context.getOriginalInputModel(), null)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraints");
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), "concept", false);
      }
    });
  }

  private static SNode _quotation_createNode_x583g4_a0a0f0fb() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("baseMethodDeclaration", SReference.create("baseMethodDeclaration", quotedNode_1, facade.createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), facade.createNodeId("6599163591527298626")));
    quotedNode_1.setReference("classConcept", SReference.create("classConcept", quotedNode_1, facade.createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), facade.createNodeId("6599163591527298519")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_x583g4_a0a0g0fb() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("baseMethodDeclaration", SReference.create("baseMethodDeclaration", quotedNode_1, facade.createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), facade.createNodeId("6599163591527298668")));
    quotedNode_1.setReference("classConcept", SReference.create("classConcept", quotedNode_1, facade.createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), facade.createNodeId("6599163591527298519")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_x583g4_a0h0fb() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("baseMethodDeclaration", SReference.create("baseMethodDeclaration", quotedNode_1, facade.createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), facade.createNodeId("6599163591527298583")));
    quotedNode_1.setReference("classConcept", SReference.create("classConcept", quotedNode_1, facade.createModelReference("r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)"), facade.createNodeId("6599163591527298519")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_x583g4_a0a0zc() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, null, GlobalScope.getInstance(), false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ReturnStatement", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_3, "value", "true");
    quotedNode_2.addChild("expression", quotedNode_3);
    quotedNode_1.addChild("statement", quotedNode_2);
    return quotedNode_1;
  }
}
