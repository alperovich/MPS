package jetbrains.mps.baseLanguage.closures.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Computable;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import org.jetbrains.mps.util.Condition;
import jetbrains.mps.baseLanguage.closures.behavior.ControlMethodUtil;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.smodel.constraints.ModelConstraints;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class QueriesGenerated {
  public static void nodeFactory_NodeSetup_UnrestrictedFunctionType_1232132222405(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNodeFactoryOperations.setNewChild(_context.getNewNode(), "resultType", "jetbrains.mps.baseLanguage.structure.VoidType");
  }

  public static void nodeFactory_NodeSetup_ClosureLiteral_876385242039333160(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
      int idx = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.IMethodCall"), "actualArgument", true)).indexOf(_context.getNewNode());
      if (idx >= 0) {
        List<SNode> params = SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.IMethodCall"), "baseMethodDeclaration", false), "parameter", true);
        if (idx < ListSequence.fromList(params).count()) {
          SNode pdtype = SLinkOperations.getTarget(ListSequence.fromList(params).getElement(idx), "type", true);
          if (SNodeOperations.isInstanceOf(pdtype, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
            Iterable<SNode> methods = Classifier_Behavior.call_methods_5292274854859311639(SLinkOperations.getTarget(SNodeOperations.cast(pdtype, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false));
            if ((int) Sequence.fromIterable(methods).count() == 1) {
              SNode adaptTo = Sequence.fromIterable(methods).first();
              // TODO: generic parameters 
              for (SNode adaptToPD : SLinkOperations.getTargets(adaptTo, "parameter", true)) {
                SNode pd = ListSequence.fromList(SLinkOperations.getTargets(_context.getNewNode(), "parameter", true)).addElement(SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null));
                SPropertyOperations.set(pd, "name", SPropertyOperations.getString(adaptToPD, "name"));
                SLinkOperations.setTarget(pd, "type", SLinkOperations.getTarget(adaptToPD, "type", true), true);
              }
            }
          }
        }
      }
    }
  }

  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ThisExpression_1199651306154(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addSequence(ListSequence.fromList(ChildSubstituteActionsHelper.createDefaultSubstituteActions(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression"), _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext)));
    return result;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_ThisExpression_1199651311977(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return false && (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", true, false) != null);
  }

  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1199711415359(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addSequence(ListSequence.fromList(ChildSubstituteActionsHelper.createDefaultSubstituteActions(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.InvokeExpression"), _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext)));
    return result;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_1199711420040(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false) != null);
  }

  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1200829964795(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    return result;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1200829970134(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    // return statements must be allowed until we find a way to implement early returns 
    // http://www.javac.info 
    return false && (SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", true, false) != null);
  }

  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1201777172707(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    return result;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1201777188086(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    SNode anc = SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"}, true, false);
    return !(SNodeOperations.isInstanceOf(anc, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral"));
  }

  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Statement_1229704829046(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Iterable<SNode> queryResult = new Computable<Iterable<SNode>>() {
          public Iterable<SNode> compute() {
            VisibleClassifiersScope scope = new VisibleClassifiersScope(_context.getParentNode(), IClassifiersSearchScope.STATIC_METHOD, operationContext.getScope());
            List<SNode> nodes = (List<SNode>) (scope.getNodes(new Condition<SNode>() {
              @Override
              public boolean met(SNode smd) {
                return ControlMethodUtil.isControlMethod(smd);
              }
            }));
            return nodes;
          }
        }.compute();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode ccs = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement", null);
                SLinkOperations.setTarget(ccs, "controlMethod", (item), false);
                SNodeFactoryOperations.setNewChild(ccs, "controlClosure", "jetbrains.mps.baseLanguage.closures.structure.ControlClosureLiteral");
                return ccs;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return "custom control statement using " + BehaviorReflection.invokeVirtual(String.class, (item), "virtual_getFqName_1213877404258", new Object[]{});
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1229704835784(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    VisibleClassifiersScope scope = new VisibleClassifiersScope(_context.getParentNode(), IClassifiersSearchScope.STATIC_METHOD, operationContext.getScope());
    List<SNode> nodes = (List<SNode>) (scope.getNodes(new Condition<SNode>() {
      @Override
      public boolean met(SNode smd) {
        return ControlMethodUtil.isControlMethod(smd);
      }
    }));
    return !(ListSequence.fromList(nodes).isEmpty());
  }

  public static List<SubstituteAction> sideTransform_ActionsFactory_ClosureControlStatement_1232456365573(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), _context.getSourceNode()) {
      public SNode doSubstitute(@Nullable final EditorContext editorContext, String pattern) {
        SNodeFactoryOperations.addNewChild(_context.getSourceNode(), "actualParameter", "jetbrains.mps.baseLanguage.structure.Expression");
        return _context.getSourceNode();
      }

      public String getMatchingText(String pattern) {
        return "(";
      }

      public String getVisibleMatchingText(String pattern) {
        return getMatchingText(pattern);
      }

      public String getDescriptionText(String pattern) {
        return "add parameter";
      }

      @Override
      protected boolean isEnabled() {
        SNode sourceNode = getSourceNode();
        SNode parent = SNodeOperations.getParent(sourceNode);
        SNode containingLink = SNodeOperations.getContainingLinkDeclaration(sourceNode);
        return parent == null || containingLink == null || (ModelConstraints.canBeParent(parent, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), containingLink, null, null) && ModelConstraints.canBeAncestor(parent, null, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), null));
      }
    });
    return result;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ClosureControlStatement_1232456372775(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "actualParameter", true)).isEmpty() && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getSourceNode(), "controlClosure", true), "parameter", true)).isEmpty();
  }

  public static List<SubstituteAction> sideTransform_ActionsFactory_ClosureControlStatement_1236960289986(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), _context.getSourceNode()) {
      public SNode doSubstitute(@Nullable final EditorContext editorContext, String pattern) {
        SNodeFactoryOperations.addNewChild(_context.getSourceNode(), "actualParameter", "jetbrains.mps.baseLanguage.structure.Expression");
        return _context.getSourceNode();
      }

      public String getMatchingText(String pattern) {
        return ":";
      }

      public String getVisibleMatchingText(String pattern) {
        return getMatchingText(pattern);
      }

      public String getDescriptionText(String pattern) {
        return "add parameter";
      }

      @Override
      protected boolean isEnabled() {
        SNode sourceNode = getSourceNode();
        SNode parent = SNodeOperations.getParent(sourceNode);
        SNode containingLink = SNodeOperations.getContainingLinkDeclaration(sourceNode);
        return parent == null || containingLink == null || (ModelConstraints.canBeParent(parent, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), containingLink, null, null) && ModelConstraints.canBeAncestor(parent, null, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), null));
      }
    });
    return result;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ClosureControlStatement_1236960289987(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "actualParameter", true)).isEmpty() && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getSourceNode(), "controlClosure", true), "parameter", true)).isNotEmpty();
  }

  public static List<SubstituteAction> sideTransform_ActionsFactory_Expression_1235747446457(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression"), _context.getSourceNode()) {
      public SNode doSubstitute(@Nullable final EditorContext editorContext, String pattern) {
        return SNodeOperations.replaceWithAnother(_context.getSourceNode(), _quotation_createNode_hyoqyy_a0a0a0a0a(_context.getSourceNode()));
      }

      public String getMatchingText(String pattern) {
        return "(";
      }

      public String getVisibleMatchingText(String pattern) {
        return getMatchingText(pattern);
      }

      public String getDescriptionText(String pattern) {
        return "invoke function";
      }

      @Override
      protected boolean isEnabled() {
        SNode sourceNode = getSourceNode();
        SNode parent = SNodeOperations.getParent(sourceNode);
        SNode containingLink = SNodeOperations.getContainingLinkDeclaration(sourceNode);
        return parent == null || containingLink == null || (ModelConstraints.canBeParent(parent, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression"), containingLink, null, null) && ModelConstraints.canBeAncestor(parent, null, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression"), null));
      }
    });
    return result;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1235747455803(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SConceptOperations.isSubConceptOf(SNodeOperations.getConceptDeclaration(TypeChecker.getInstance().getTypeOf(_context.getSourceNode())), "jetbrains.mps.baseLanguage.closures.structure.FunctionType") && !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression")) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionOperation"));
  }

  public static List<SubstituteAction> sideTransform_ActionsFactory_Expression_1236794002431(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression"), _context.getSourceNode()) {
      public SNode doSubstitute(@Nullable final EditorContext editorContext, String pattern) {
        SNodeFactoryOperations.addNewChild(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), "controlClosure", true), "parameter", "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
        return _context.getSourceNode();
      }

      public String getMatchingText(String pattern) {
        return ":";
      }

      public String getVisibleMatchingText(String pattern) {
        return getMatchingText(pattern);
      }

      public String getDescriptionText(String pattern) {
        return "add formal parameter";
      }

      @Override
      protected boolean isEnabled() {
        SNode sourceNode = getSourceNode();
        SNode parent = SNodeOperations.getParent(sourceNode);
        SNode containingLink = SNodeOperations.getContainingLinkDeclaration(sourceNode);
        return parent == null || containingLink == null || (ModelConstraints.canBeParent(parent, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression"), containingLink, null, null) && ModelConstraints.canBeAncestor(parent, null, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression"), null));
      }
    });
    return result;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Expression_1236794030042(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SNodeOperations.getIndexInParent(_context.getSourceNode()) == 0 && SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement") && ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.ClosureControlStatement"), "controlClosure", true), "parameter", true)).isEmpty();
  }

  public static List<SubstituteAction> sideTransform_ActionsFactory_Type_2324090868901292790(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"), _context.getSourceNode()) {
      public SNode doSubstitute(@Nullable final EditorContext editorContext, String pattern) {
        SNodeFactoryOperations.addNewChild(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "throwsType", "jetbrains.mps.baseLanguage.structure.Type");
        return ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "throwsType", true)).first();
      }

      public String getMatchingText(String pattern) {
        return "throws";
      }

      public String getVisibleMatchingText(String pattern) {
        return getMatchingText(pattern);
      }

      @Override
      protected boolean isEnabled() {
        SNode sourceNode = getSourceNode();
        SNode parent = SNodeOperations.getParent(sourceNode);
        SNode containingLink = SNodeOperations.getContainingLinkDeclaration(sourceNode);
        return parent == null || containingLink == null || (ModelConstraints.canBeParent(parent, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"), containingLink, null, null) && ModelConstraints.canBeAncestor(parent, null, SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"), null));
      }
    });
    return result;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Type_2324090868901293319(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    SNode parent = SNodeOperations.getParent(_context.getSourceNode());
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType"), "terminateType", true) == _context.getSourceNode() && (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType"), "throwsType", true)).isEmpty());
    }
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.closures.structure.FunctionType")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "resultType", true) == _context.getSourceNode() && (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "throwsType", true)).isEmpty());
    }
    return false;
  }

  private static SNode _quotation_createNode_hyoqyy_a0a0a0a0a(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = (SNode) parameter_1;
    if (quotedNode_3 != null) {
      quotedNode_2.addChild("function", HUtil.copyIfNecessary(quotedNode_3));
    }
    return quotedNode_2;
  }
}
