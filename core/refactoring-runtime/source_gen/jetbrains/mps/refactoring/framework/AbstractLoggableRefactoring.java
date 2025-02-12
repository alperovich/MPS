package jetbrains.mps.refactoring.framework;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.project.DevKit;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.ide.findusages.model.SearchResults;
import java.util.Map;
import java.util.HashMap;

public abstract class AbstractLoggableRefactoring {
  public AbstractLoggableRefactoring() {
  }

  public String getUserFriendlyName() {
    return null;
  }

  public String getKeyStroke() {
    return "";
  }

  public Class getOverridenRefactoringClass() {
    return null;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    return true;
  }

  public boolean isOneTargetOnly() {
    return false;
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return false;
  }

  public boolean isApplicableToModel(SModel model) {
    return true;
  }

  public boolean isApplicableToModule(SModule module) {
    if (getRefactoringTarget() == RefactoringTarget.SOLUTION) {
      return module instanceof Solution;
    }
    if (getRefactoringTarget() == RefactoringTarget.LANGUAGE) {
      return module instanceof Language;
    }
    if (getRefactoringTarget() == RefactoringTarget.DEVKIT) {
      return module instanceof DevKit;
    }
    return false;
  }

  public boolean refactorImmediatelyIfNoUsages() {
    return false;
  }

  public void doRefactor(RefactoringContext refactoringContext) {
  }

  public boolean doesUpdateModel() {
    return false;
  }

  public List<SModel> getModelsToUpdate(RefactoringContext refactoringContext) {
    return new ArrayList<SModel>();
  }

  public boolean showsAffectedNodes() {
    return false;
  }

  public SearchResults getAffectedNodes(RefactoringContext refactoringContext) {
    return null;
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
  }

  public Map<SModule, List<SModel>> getModelsToGenerate(RefactoringContext refactoringContext) {
    return new HashMap<SModule, List<SModel>>();
  }

  public List<SNode> getNodesToOpen(RefactoringContext refactoringContext) {
    return new ArrayList<SNode>();
  }
}
