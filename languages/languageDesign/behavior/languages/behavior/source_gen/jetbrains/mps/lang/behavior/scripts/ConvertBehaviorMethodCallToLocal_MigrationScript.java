package jetbrains.mps.lang.behavior.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;

public class ConvertBehaviorMethodCallToLocal_MigrationScript extends BaseMigrationScript {
  public ConvertBehaviorMethodCallToLocal_MigrationScript(IOperationContext operationContext) {
    super("Convert BehaviorMethodCall to Local");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Convert to local behavior method call";
      }

      public String getAdditionalInfo() {
        return "Convert to local behavior method call";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SNodeOperations.isInstanceOf(SNodeOperation_Behavior.call_getLeftExpression_1213877508894(node), "jetbrains.mps.lang.behavior.structure.ThisNodeExpression");
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode call = SConceptOperations.createNewNode("jetbrains.mps.lang.behavior.structure.LocalBehaviorMethodCall", null);
        SLinkOperations.setTarget(call, "baseMethodDeclaration", SLinkOperations.getTarget(node, "baseMethodDeclaration", false), false);
        ListSequence.fromList(SLinkOperations.getTargets(call, "actualArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)));
        SNodeOperations.replaceWithAnother(IOperation_Behavior.call_getDotExpression_1224687669172(node), call);
      }

      public boolean isShowAsIntention() {
        return true;
      }
    });
  }
}
