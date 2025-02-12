package jetbrains.mps.quickQueryLanguage;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.quickQueryLanguage.editor.EditorAspectDescriptorImpl;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.quickQueryLanguage.typesystem.TypesystemDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.runtime.LanguageAspectDescriptor;
import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;

public class Language extends LanguageRuntime {
  public static String MODULE_REF = "d745e97c-8235-4470-b086-ba3da1f4c03c(jetbrains.mps.quickQueryLanguage)";
  private static String[] EXTENDED_LANGUAGE_IDS = new String[]{"jetbrains.mps.lang.structure", "jetbrains.mps.lang.smodel", "jetbrains.mps.baseLanguage"};
  private EditorAspectDescriptorImpl myEditorAspectDescriptor;

  public Language() {

  }

  @Override
  public String getNamespace() {
    return "jetbrains.mps.quickQueryLanguage";
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
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "59fbbb1e-71f1-44ea-9e9a-726e1e1c4192(jetbrains.mps.quickQueryLanguage#1218799731940)"));
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
