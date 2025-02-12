package jetbrains.mps.lang.resources.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ExtractIconsToPlugin_MigrationScript extends BaseMigrationScript {
  public ExtractIconsToPlugin_MigrationScript(IOperationContext operationContext) {
    super("Extract deprecated Icon accessors to plugin aspect");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "update icon bundle";
      }

      public String getAdditionalInfo() {
        return "update icon bundle";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.behavior.structure.ConceptBehavior";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListSequence.fromList(SLinkOperations.getTargets(node, "method", true)).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode m) {
            return ListSequence.fromList(SNodeOperations.getDescendants(m, "jetbrains.mps.lang.resources.structure.IconResourceExpression", false, new String[]{})).isNotEmpty();
          }
        });
      }

      public void doUpdateInstanceNode(SNode node) {
        ExtractIconsUtil.updateIconResourceBundle(node);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }
}
