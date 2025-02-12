package jetbrains.mps.lang.editor.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.intentions.IndentLayoutUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class MigrationToIndentLayout_MigrationScript extends BaseMigrationScript {
  public MigrationToIndentLayout_MigrationScript(IOperationContext operationContext) {
    super("Migration to Indent Layout");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "MoveEditor to indent Layout";
      }

      public String getAdditionalInfo() {
        return "MoveEditor to indent Layout";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.CellModel_Collection";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.CellModel_Collection")) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent"));
      }

      public void doUpdateInstanceNode(SNode node) {
        IndentLayoutUtil.moveToIndentLayout(node);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "CellModel_RefNodeList migration";
      }

      public String getAdditionalInfo() {
        return "CellModel_RefNodeList migration";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SLinkOperations.getTarget(node, "cellLayout", true) == null;
      }

      public void doUpdateInstanceNode(SNode node) {
        SLinkOperations.setTarget(node, "cellLayout", SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellLayout_Indent", null), true);
        if (SPropertyOperations.getBoolean(node, "vertical")) {
          SPropertyOperations.set(node, "vertical", "" + (false));
          SNode indentStyle = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem", null);
          SPropertyOperations.set(indentStyle, "flag", "" + (true));
          ListSequence.fromList(SLinkOperations.getTargets(node, "styleItem", true)).addElement(indentStyle);
        }
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }
}
