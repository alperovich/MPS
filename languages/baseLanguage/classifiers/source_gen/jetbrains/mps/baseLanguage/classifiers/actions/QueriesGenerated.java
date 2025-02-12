package jetbrains.mps.baseLanguage.classifiers.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.Computable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.baseLanguage.classifiers.behavior.ThisClassifierExpression_Behavior;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.smodel.constraints.ModelConstraints;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;

public class QueriesGenerated {
  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_1205921334476(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    final SNode contextClassifier = new Computable<SNode>() {
      public SNode compute() {
        SNode contextPart = SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart"}, true, false);
        if (SNodeOperations.isInstanceOf(contextPart, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier")) {
          return SNodeOperations.cast(contextPart, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier");
        } else {
          return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(contextPart, "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart"), "virtual_getMainClassifier_1213877255428", new Object[]{});
        }
      }
    }.compute();
    final boolean multipleClassifiers = new Computable<Boolean>() {
      public Boolean compute() {
        return ListSequence.fromList(SNodeOperations.getAncestorsWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart", "jetbrains.mps.baseLanguage.structure.Classifier"}, true)).count() > 1;
      }
    }.compute();
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Iterable<SNode> queryResult = new Computable<Iterable<SNode>>() {
          public Iterable<SNode> compute() {
            return BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), contextClassifier, "virtual_getMembers_1213877528020", new Object[]{_context.getParentNode()});
          }
        }.compute();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
                SNodeFactoryOperations.setNewChild(result, "operand", "jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression");
                if (multipleClassifiers) {
                  SLinkOperations.setTarget(SNodeOperations.cast(SLinkOperations.getTarget(result, "operand", true), "jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression"), "classifier", contextClassifier, false);
                }
                SLinkOperations.setTarget(result, "operation", BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), (item), "virtual_createOperation_1213877353000", new Object[]{}), true);
                return result;
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_Expression_1205921340852(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart"}, true, false) != null;
  }

  public static List<SubstituteAction> sideTransform_ActionsFactory_ThisClassifierExpression_1219068300355(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    {
      Iterable<SNode> parameterObjects = new Computable<Iterable<SNode>>() {
        public Iterable<SNode> compute() {
          return ThisClassifierExpression_Behavior.call_getPossibleClassifiers_1219068414643(_context.getSourceNode());
        }
      }.compute();
      if (parameterObjects != null) {
        for (final SNode item : parameterObjects) {
          ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression"), item, _context.getSourceNode()) {
            public SNode doSubstitute(@Nullable final EditorContext editorContext, String pattern) {
              SNode expr = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression", null);
              SLinkOperations.setTarget(expr, "classifier", (item), false);
              SNodeOperations.replaceWithAnother(_context.getSourceNode(), expr);
              return expr;
            }

            public String getMatchingText(String pattern) {
              return (item) + ".";
            }

            public String getVisibleMatchingText(String pattern) {
              return getMatchingText(pattern);
            }

            @Override
            protected boolean isEnabled() {
              SNode sourceNode = getSourceNode();
              SNode parent = SNodeOperations.getParent(sourceNode);
              SNode containingLink = SNodeOperations.getContainingLinkDeclaration(sourceNode);
              return parent == null || containingLink == null || (ModelConstraints.canBeParent(parent, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression"), containingLink, null, null) && ModelConstraints.canBeAncestor(parent, null, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression"), null));
            }
          });
        }
      }
    }
    return result;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_ThisClassifierExpression_1219068300393(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "classifier", false) == null);
  }
}
