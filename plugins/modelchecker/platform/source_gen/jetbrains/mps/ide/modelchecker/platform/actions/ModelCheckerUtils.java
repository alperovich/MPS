package jetbrains.mps.ide.modelchecker.platform.actions;

/*Generated by MPS */

import java.util.List;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.project.Project;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchResult;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ModelCheckerUtils {
  private ModelCheckerUtils() {
  }

  public static List<SModel> getModelDescriptors(SModule module) {
    List<SModel> modelDescrpitors = ListSequence.fromList(new ArrayList<SModel>());
    for (SModel modelDescriptor : Sequence.fromIterable(module.getModels())) {
      if (SModelStereotype.isUserModel(modelDescriptor)) {
        ListSequence.fromList(modelDescrpitors).addElement(modelDescriptor);
      }
      if (ModelCheckerSettings.getInstance().isCheckStubs() && SModelStereotype.isStubModelStereotype(SModelStereotype.getStereotype(modelDescriptor))) {
        ListSequence.fromList(modelDescrpitors).addElement(modelDescriptor);
      }
    }
    if (module instanceof Language) {
      Language language = (Language) module;
      for (Generator generator : CollectionSequence.fromCollection(language.getGenerators())) {
        ListSequence.fromList(modelDescrpitors).addSequence(ListSequence.fromList(getModelDescriptors(generator)));
      }
    }
    return modelDescrpitors;
  }

  public static List<SModel> getModelDescriptors(Iterable<? extends SModule> modules) {
    List<SModel> modelDescrpitors = ListSequence.fromList(new ArrayList<SModel>());
    for (SModule module : Sequence.fromIterable(modules)) {
      ListSequence.fromList(modelDescrpitors).addSequence(ListSequence.fromList(getModelDescriptors(module)));
    }
    return modelDescrpitors;
  }

  public static List<SModel> getModelDescriptors(Project project) {
    return getModelDescriptors(project.getModules());
  }

  public static int getIssueCountForSeverity(SearchResults<ModelCheckerIssue> issues, String severity) {
    if (severity == null) {
      return 0;
    }
    int issueCount = 0;
    for (SearchResult<ModelCheckerIssue> issue : ListSequence.fromList(issues.getSearchResults())) {
      if (severity.equals(issue.getCategories().get(0).o2)) {
        issueCount++;
      }
    }
    return issueCount;
  }

  public static boolean isDeclaredLink(SNode linkDeclaration, boolean child) {
    return ((linkDeclaration != null) && child ?
      SPropertyOperations.hasValue(linkDeclaration, "metaClass", "aggregation", "reference") :
      SPropertyOperations.hasValue(linkDeclaration, "metaClass", "reference", "reference")
    );
  }
}
