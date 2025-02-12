package jetbrains.mps.baseLanguage.classifiers.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.StaticScope;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").super_("jetbrains.mps.baseLanguage.structure.Type").parents("jetbrains.mps.baseLanguage.structure.Type").abstract_().staticScope(StaticScope.NONE).create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier").children(new String[]{"field", "method"}, new boolean[]{true, true}).create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation").references("field").staticScope(StaticScope.NONE).create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration").super_("jetbrains.mps.baseLanguage.structure.FieldDeclaration").parents("jetbrains.mps.baseLanguage.structure.FieldDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.IMember").create();
      case 4:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation").references("method").children(new String[]{"actualArgument"}, new boolean[]{true}).staticScope(StaticScope.NONE).create();
      case 5:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration").super_("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration").parents("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.IMember", "jetbrains.mps.baseLanguage.structure.IVisible").create();
      case 6:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType").super_("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").parents("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType").references("classifier").staticScope(StaticScope.NONE).create();
      case 7:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.IClassifier").interface_().parents("jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.baseLanguage.structure.IExtractMethodAvailable").create();
      case 8:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart").interface_().create();
      case 9:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.IMember").interface_().parents("jetbrains.mps.lang.core.structure.INamedConcept").create();
      case 10:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation").interface_().parents("jetbrains.mps.baseLanguage.structure.IOperation").references("member").create();
      case 11:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.SuperClassifierExpresson").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").alias("super", "super classifier").staticScope(StaticScope.NONE).create();
      case 12:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.baseLanguage.structure.IThisExpression").references("classifier").alias("this", "this classifier").staticScope(StaticScope.NONE).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart", "jetbrains.mps.baseLanguage.classifiers.structure.IMember", "jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation", "jetbrains.mps.baseLanguage.classifiers.structure.SuperClassifierExpresson", "jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression"};
}
