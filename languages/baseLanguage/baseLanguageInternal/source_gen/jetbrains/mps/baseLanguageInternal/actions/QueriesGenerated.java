package jetbrains.mps.baseLanguageInternal.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {
  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_Expression_499690473982088312(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addSequence(ListSequence.fromList(ChildSubstituteActionsHelper.createDefaultSubstituteActions(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.WeakClassReference"), _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext)));
    return result;
  }

  public static List<SubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_InternalClassifierType_4672968395964803373(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addSequence(ListSequence.fromList(ChildSubstituteActionsHelper.createDefaultSubstituteActions(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalClassifierType"), _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext)));
    return result;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_InternalClassifierType_4672968395964803374(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept") && (SPropertyOperations.hasValue(_context.getLink(), "role", SPropertyOperations.getString(SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.ClassConcept", "superclass"), "role")) || SPropertyOperations.hasValue(_context.getLink(), "role", SPropertyOperations.getString(SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.ClassConcept", "implementedInterface"), "role"))) || SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.Interface") && SPropertyOperations.hasValue(_context.getLink(), "role", SPropertyOperations.getString(SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.Interface", "extendedInterface"), "role"));
  }
}
