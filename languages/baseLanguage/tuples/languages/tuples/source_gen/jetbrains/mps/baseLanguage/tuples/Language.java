package jetbrains.mps.baseLanguage.tuples;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.baseLanguage.tuples.editor.EditorAspectDescriptorImpl;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.baseLanguage.tuples.typesystem.TypesystemDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.runtime.LanguageAspectDescriptor;
import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;

public class Language extends LanguageRuntime {
  public static String MODULE_REF = "a247e09e-2435-45ba-b8d2-07e93feba96a(jetbrains.mps.baseLanguage.tuples)";
  private static String[] EXTENDED_LANGUAGE_IDS = new String[]{"jetbrains.mps.baseLanguage"};
  private EditorAspectDescriptorImpl myEditorAspectDescriptor;

  public Language() {

  }

  @Override
  public String getNamespace() {
    return "jetbrains.mps.baseLanguage.tuples";
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
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "a150150e-46ee-4c9e-b080-08d136e4eefb(jetbrains.mps.baseLanguage.tuples#1238919486295)"));
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
