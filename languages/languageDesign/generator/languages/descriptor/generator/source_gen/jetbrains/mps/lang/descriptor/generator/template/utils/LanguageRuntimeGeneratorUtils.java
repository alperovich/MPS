package jetbrains.mps.lang.descriptor.generator.template.utils;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import org.jetbrains.mps.openapi.model.SModel;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;

public class LanguageRuntimeGeneratorUtils {
  public static boolean isAspectOfLanguage(SNode modelReference, LanguageAspect aspect, TemplateQueryContext genContext, final SNode rootConcept) {
    SNode language = SNodeOperations.cast(SNodeOperations.getParent(modelReference), "jetbrains.mps.lang.project.structure.Language");
    if (language == null) {
      genContext.showErrorMessage(modelReference, "Parent of ModelReference is not a Language: " + SPropertyOperations.getString(modelReference, "qualifiedName"));
      return false;
    }
    SModuleReference moduleReference = PersistenceFacade.getInstance().createModuleReference(BehaviorReflection.invokeVirtual(String.class, language, "virtual_getModuleReference_9020561928507315628", new Object[]{}));
    Language languageModule = ModuleRepositoryFacade.getInstance().getModule(moduleReference, Language.class);
    if (languageModule == null) {
      genContext.showErrorMessage(language, "No language in repository: " + SPropertyOperations.getString(language, "namespace"));
      return false;
    }
    SModel aspectModel = aspect.get(languageModule);
    if (aspectModel == null || !(aspectModel.getModelId().toString().equals(SPropertyOperations.getString(modelReference, "uuid")))) {
      return false;
    }
    List<SNode> roots = SModelOperations.getRoots(((SModel) aspectModel), null);
    return (rootConcept == null ?
      ListSequence.fromList(roots).isNotEmpty() :
      ListSequence.fromList(roots).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SConceptOperations.isSubConceptOf(SNodeOperations.getConceptDeclaration(it), NameUtil.nodeFQName(rootConcept));
        }
      }).isNotEmpty()
    );
  }
}
