package jetbrains.mps.checkers;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class TargetConceptChecker extends AbstractConstraintsChecker {
  public TargetConceptChecker() {
  }

  @Override
  public void checkNode(SNode node, LanguageErrorsComponent component, IOperationContext operationContext, IScope scope) {
    for (SNode child : ListSequence.fromList(SNodeOperations.getChildren(node)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(SNodeOperations.isAttribute(it));
      }
    })) {
      SNode link = SNodeOperations.getContainingLinkDeclaration(child);
      if (link != null && SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
        component.addDependency(link);
        if (!(SConceptOperations.isSuperConceptOf(SLinkOperations.getTarget(link, "target", false), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(child))))) {
          component.addError(node, "incompatible target concept in role \"" + SNodeOperations.getContainingLinkRole(child) + "\"", null);
        }
      }
    }

    for (SReference reference : Sequence.fromIterable(SNodeOperations.getReferences(node))) {
      SNode link = SLinkOperations.findLinkDeclaration(reference);
      if (link == null || !(SPropertyOperations.hasValue(link, "metaClass", "reference", "reference"))) {
        continue;
      }
      SNode target = SLinkOperations.getTargetNode(reference);
      if (target == null) {
        continue;
      }
      component.addDependency(link);
      if (!(SConceptOperations.isSuperConceptOf(SLinkOperations.getTarget(link, "target", false), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(target))))) {
        component.addError(node, "incompatible target concept in role \"" + SLinkOperations.getRole(reference) + "\"", null);
      }
    }
  }
}
