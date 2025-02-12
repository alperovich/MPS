package jetbrains.mps.lang.sharedConcepts;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.lang.sharedConcepts.typesystem.TypesystemDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.runtime.LanguageAspectDescriptor;

public class Language extends LanguageRuntime {
  public static String MODULE_REF = "13744753-c81f-424a-9c1b-cf8943bf4e86(jetbrains.mps.lang.sharedConcepts)";
  private static String[] EXTENDED_LANGUAGE_IDS = new String[]{"jetbrains.mps.lang.core", "jetbrains.mps.baseLanguage"};

  public Language() {

  }

  @Override
  public String getNamespace() {
    return "jetbrains.mps.lang.sharedConcepts";
  }

  @Override
  protected String[] getExtendedLanguageIDs() {
    return EXTENDED_LANGUAGE_IDS;
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return new TypesystemDescriptor();
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  @Override
  public Collection<TemplateModule> getGenerators() {
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "51736086-833e-4b0d-b9a6-a1dbbfda2131(jetbrains.mps.lang.sharedConcepts#1161623873951)"));
  }

  @Override
  public <T extends LanguageAspectDescriptor> T getAspectDescriptor(Class<T> descriptorClass) {
    return null;
  }
}
