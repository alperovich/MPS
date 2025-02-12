package jetbrains.mps.ide.ui.finders;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.ide.findusages.model.holders.IHolder;
import jetbrains.mps.ide.findusages.model.holders.ModuleHolder;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.project.DevKit;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.project.dependency.GlobalModuleDependenciesManager;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.SModelOperations;
import java.util.Set;
import java.util.HashSet;
import org.jetbrains.mps.openapi.module.SDependency;

public class ModuleUsagesFinder implements IFinder {
  private static final String USED_BY = "used by";
  private static final String DEPENDENT_MODULES = "dependent modules";
  private static final String RUNTIME_MODULES = "runtime modules";
  private static final String EXTENDING_LANGUAGES = "extending languages";
  private static final String EXTENDING_GENERATORS = "extending generators";
  private static final String EXPORTED_BY = "exported by";
  private static final String MODELS_WRITTEN_IN_LANGUAGE = "models written in language";
  private static final String NODES_IN_LANGUAGE = "nodes written in language";


  public ModuleUsagesFinder() {
  }

  @Override
  public SearchResults find(SearchQuery query, ProgressMonitor monitor) {
    SearchResults searchResults = new SearchResults();
    IHolder objectHolder = query.getObjectHolder();
    if (!((objectHolder instanceof ModuleHolder))) {
      return searchResults;
    }
    ModuleHolder moduleHolder = (ModuleHolder) objectHolder;
    SModule searchedModule = moduleHolder.getObject();
    SearchScope scope = query.getScope();
    for (SModule module : scope.getModules()) {
      if (monitor.isCanceled()) {
        return searchResults;
      }

      if (module instanceof Solution) {
        collectUsagesInSolution(searchedModule, (Solution) module, searchResults);
      } else if (module instanceof Language) {
        collectUsagesInLanguage(searchedModule, (Language) module, searchResults);
      } else if (module instanceof DevKit) {
        collectUsagesInDevKit(searchedModule, (DevKit) module, searchResults);
      } else if (module instanceof Generator) {
        collectUsagesInGenerator(searchedModule, (Generator) module, searchResults);
      }

    }

    return searchResults;
  }

  private void collectUsagesInSolution(SModule searchedModule, Solution solution, SearchResults searchResults) {
    if (getDeclaredDependenciesTargets(solution).contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<Solution>(solution, ModuleUsagesFinder.DEPENDENT_MODULES));
    }
    if (new GlobalModuleDependenciesManager(solution).getUsedLanguages().contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<Solution>(solution, ModuleUsagesFinder.USED_BY));
      collectUsagesInModels(searchedModule, solution, searchResults);
    }
  }

  private void collectUsagesInLanguage(SModule searchedModule, Language language, SearchResults searchResults) {
    if (language.getExtendedLanguageRefs().contains(searchedModule.getModuleReference())) {
      searchResults.getSearchResults().add(new SearchResult<Language>(language, ModuleUsagesFinder.EXTENDING_LANGUAGES));
    }
    if (new GlobalModuleDependenciesManager(language).getUsedLanguages().contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<Language>(language, ModuleUsagesFinder.USED_BY));
      collectUsagesInModels(searchedModule, language, searchResults);
    }
    if (getDeclaredDependenciesTargets(language).contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<Language>(language, ModuleUsagesFinder.DEPENDENT_MODULES));
    }
    if (language.getRuntimeModulesReferences().contains(searchedModule.getModuleReference())) {
      searchResults.getSearchResults().add(new SearchResult<Language>(language, ModuleUsagesFinder.RUNTIME_MODULES));
      collectUsagesInModels(searchedModule, language, searchResults);
    }
  }

  private void collectUsagesInDevKit(SModule searchedModule, DevKit devKit, SearchResults searchResults) {
    if (devKit.getExportedLanguages().contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<DevKit>(devKit, ModuleUsagesFinder.EXPORTED_BY));
    }
    if (getDeclaredDependenciesTargets(devKit).contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<DevKit>(devKit, ModuleUsagesFinder.DEPENDENT_MODULES));
    }
  }

  private void collectUsagesInGenerator(SModule searchedModule, Generator generator, SearchResults searchResults) {
    if (generator.getReferencedGenerators().contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<Generator>(generator, ModuleUsagesFinder.EXTENDING_GENERATORS));
    }
    if (getDeclaredDependenciesTargets(generator).contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<Generator>(generator, ModuleUsagesFinder.DEPENDENT_MODULES));
    }
    if (new GlobalModuleDependenciesManager(generator).getUsedLanguages().contains(searchedModule)) {
      searchResults.getSearchResults().add(new SearchResult<Generator>(generator, ModuleUsagesFinder.USED_BY));
      collectUsagesInModels(searchedModule, generator, searchResults);
    }

  }

  private void collectUsagesInModels(SModule searchedModule, SModule owner, SearchResults searchResults) {
    for (SModel modelDescriptor : owner.getModels()) {
      if (!(SModelStereotype.isUserModel(modelDescriptor))) {
        continue;
      }
      if (SModelOperations.hasLanguage(modelDescriptor, searchedModule.getModuleReference())) {
        SModel model = modelDescriptor;
        searchResults.getSearchResults().add(new SearchResult<SModel>(model, ModuleUsagesFinder.MODELS_WRITTEN_IN_LANGUAGE));
      }
    }
  }

  private static Set<SModule> getDeclaredDependenciesTargets(SModule module) {
    Set<SModule> result = new HashSet<SModule>();
    for (SDependency dep : module.getDeclaredDependencies()) {
      result.add(dep.getTarget());
    }
    return result;
  }
}
