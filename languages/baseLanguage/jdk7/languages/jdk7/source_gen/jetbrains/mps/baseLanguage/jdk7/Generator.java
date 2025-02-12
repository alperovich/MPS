package jetbrains.mps.baseLanguage.jdk7;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateModule;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.TemplateMappingPriorityRule;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.classloading.ClassLoaderManager;
import jetbrains.mps.smodel.ModuleRepositoryFacade;

public class Generator implements TemplateModule {
  public static String MODULE_REF = "2ec34c1e-7442-4656-9a59-44fa731a9286(jetbrains.mps.baseLanguage.jdk7#616711547384942258)";
  private Language sourceLanguage;
  private final Collection<TemplateModel> models;
  private Collection<String> usedLanguages;

  public Generator(Language sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    models = TemplateUtil.<TemplateModel>asCollection(getTemplateModel("jetbrains.mps.baseLanguage.jdk7.generator.template.main.TemplateModelImpl"));
    usedLanguages = TemplateUtil.<String>asCollection("jetbrains.mps.baseLanguage", "jetbrains.mps.baseLanguageInternal");
  }

  @Override
  public String getAlias() {
    return "jetbrains.mps.baseLanguage.jdk7/baseLanguage";
  }

  @Override
  public Collection<TemplateModel> getModels() {
    return models;
  }

  @Override
  public Collection<TemplateMappingPriorityRule> getPriorities() {
    return null;
  }

  @Override
  public SModuleReference getReference() {
    return PersistenceFacade.getInstance().createModuleReference(MODULE_REF);
  }

  @Override
  public Collection<String> getUsedLanguages() {
    return usedLanguages;
  }

  @Override
  public LanguageRuntime getSourceLanguage() {
    return sourceLanguage;
  }

  @Override
  public Collection<String> getReferencedModules() {
    return null;
  }

  private TemplateModel getTemplateModel(String modelName) {
    Class<TemplateModel> clazz = ClassLoaderManager.getInstance().getClass(ModuleRepositoryFacade.getInstance().getModule(getReference()), modelName);
    try {
      return clazz.getConstructor(TemplateModule.class).newInstance(this);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
