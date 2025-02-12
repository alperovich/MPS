package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateModel;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import jetbrains.mps.generator.runtime.TemplateModule;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.generator.runtime.TemplateUtil;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.generator.runtime.TemplateDeclaration;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.model.SNodeId;
import jetbrains.mps.smodel.SNodePointer;

public class TemplateModelImpl implements TemplateModel {
  private final Collection<TemplateMappingConfiguration> mappings;
  private final Collection<TemplateSwitchMapping> switches;
  private final TemplateModule templateModule;
  private final SModelReference model;

  public TemplateModelImpl(TemplateModule module) {
    mappings = TemplateUtil.<TemplateMappingConfiguration>asCollection(new Mappingmain(this));
    switches = TemplateUtil.<TemplateSwitchMapping>asCollection();
    templateModule = module;
    model = PersistenceFacade.getInstance().createModelReference("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)");
  }

  public String getLongName() {
    return "jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput";
  }

  public SModelReference getSModelReference() {
    return model;
  }

  public Collection<TemplateMappingConfiguration> getConfigurations() {
    return mappings;
  }

  public Collection<TemplateSwitchMapping> getSwitches() {
    return switches;
  }

  public TemplateDeclaration loadTemplate(SNodeReference template, Object... arguments) {
    if (!(model.equals(template.getModelReference()))) {
      return null;
    }
    SNodeId id = ((SNodePointer) template).getNodeId();
    if (id instanceof jetbrains.mps.smodel.SNodeId.Regular) {
      long idValue = ((jetbrains.mps.smodel.SNodeId.Regular) id).getId();
      if (idValue == 1202255620269L) {
        if (arguments.length != 0) {
          // TODO report `wrong arguments count` 
          return null;
        }
        return new TemplateOutputRoot__1();
      }
      if (idValue == 1202338159177L) {
        if (arguments.length != 0) {
          // TODO report `wrong arguments count` 
          return null;
        }
        return new TemplateOutputRoot__2();
      }
    }
    return null;
  }

  public TemplateModule getModule() {
    return templateModule;
  }
}
