package jetbrains.mps.baseLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SReference;

public class ShowJavaUtilReferences_MigrationScript extends BaseMigrationScript {
  public ShowJavaUtilReferences_MigrationScript(IOperationContext operationContext) {
    super("Show java.util.* References");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "find java util refrences";
      }

      public String getAdditionalInfo() {
        return "find java util refrences";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.core.structure.BaseConcept";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        for (SReference ref : node.getReferences()) {
          String targetModelFQName = ref.getTargetSModelReference().getModelName();
          if ("java.util@java_stub".equals(targetModelFQName)) {
            return true;
          }
        }
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }
}
