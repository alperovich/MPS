package jetbrains.mps.refactoring.tests;

/*Generated by MPS */

import jetbrains.mps.project.Project;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.Language;
import org.jetbrains.mps.openapi.module.ModelAccess;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.refactoring.framework.IRefactoring;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.project.ProjectOperationContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.ThreadUtils;

public class RenameLinkRefactoringTester_Simple implements IRefactoringTester {
  public RenameLinkRefactoringTester_Simple() {
  }

  @Override
  public boolean testRefactoring(final Project project, final SModel sandbox1, final SModel sandbox2, final Language testRefactoringLanguage, final Language testRefactoringTargetLanguage) {
    final String newLinkName = "sister";
    final ModelAccess modelAccess = project.getRepository().getModelAccess();
    final Wrappers._T<IRefactoring> refactoring = new Wrappers._T<IRefactoring>();
    modelAccess.runReadAction(new Runnable() {
      public void run() {
        refactoring.value = RefactoringUtil.getRefactoringByClassName(BehaviorReflection.invokeVirtual(String.class, SNodeOperations.getNode("r:de5b7214-45ee-4f6d-89bf-acde59cdb050(jetbrains.mps.lang.structure.refactorings)", "1347577327951781638"), "virtual_getFqName_1213877404258", new Object[]{}));
      }
    });

    final RefactoringContext refactoringContext = new RefactoringContext(project, refactoring.value);
    refactoringContext.setCurrentOperationContext(new ProjectOperationContext(project));

    modelAccess.runReadAction(new Runnable() {
      public void run() {
        SModel structureModelDescriptor = testRefactoringLanguage.getStructureModelDescriptor();
        SModel model = structureModelDescriptor;
        SNode node = SModelOperations.getRootByName(model, "MyVeryGoodConcept1");
        SNode link = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"), "linkDeclaration", true)).first();
        refactoringContext.setSelectedNode(link);
        refactoringContext.setSelectedModel(structureModelDescriptor);
        refactoringContext.setParameter("newName", newLinkName);
      }
    });
    new RefactoringTestFacade().doExecuteInTest(refactoringContext);
    final boolean[] result = new boolean[]{false};
    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      @Override
      public void run() {
        modelAccess.runReadAction(new Runnable() {
          public void run() {
            try {
              if (sandbox1.isLoaded()) {
                System.err.println("test environment is invalid: model sandbox1 is already initialized, should be not");
                result[0] = false;
                return;
              }
              SModel sModel = sandbox1;
              SNode root = sModel.getRootNodes().iterator().next();
              SNode referent = root.getReferenceTarget(newLinkName);
              if (referent == null) {
                System.err.println("referent is null");
                result[0] = false;
                return;
              }
              result[0] = "MyGood2".equals(referent.getName());
            } catch (Throwable t) {
              t.printStackTrace();
              result[0] = false;
              return;
            }
          }
        });
      }
    });
    return result[0];
  }
}
