package jetbrains.mps.baseLanguage.checkedDots;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.baseLanguage.checkedDots.editor.EditorAspectDescriptorImpl;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.runtime.LanguageAspectDescriptor;
import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;

public class Language extends LanguageRuntime {
  public static String MODULE_REF = "774bf8a0-62e5-41e1-af63-f4812e60e48b(jetbrains.mps.baseLanguage.checkedDots)";
  private static String[] EXTENDED_LANGUAGE_IDS = new String[]{"jetbrains.mps.baseLanguage"};
  private EditorAspectDescriptorImpl myEditorAspectDescriptor;

  public Language() {

  }

  @Override
  public String getNamespace() {
    return "jetbrains.mps.baseLanguage.checkedDots";
  }

  @Override
  protected String[] getExtendedLanguageIDs() {
    return EXTENDED_LANGUAGE_IDS;
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  @Override
  public Collection<TemplateModule> getGenerators() {
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "2cd07afb-c963-4f7c-ad2c-e1e97d9e859e(jetbrains.mps.baseLanguage.checkedDots#4549711462050000009)"));
  }

  @Override
  public <T extends LanguageAspectDescriptor> T getAspectDescriptor(Class<T> descriptorClass) {
    if (descriptorClass == EditorAspectDescriptor.class) {
      if (myEditorAspectDescriptor == null) {
        myEditorAspectDescriptor = new EditorAspectDescriptorImpl();
      }
      return (T) myEditorAspectDescriptor;
    }
    return null;
  }
}
