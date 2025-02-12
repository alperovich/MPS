package testRefactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("testRefactoring.structure.MyVeryGoodConcept1").super_("testRefactoringTargetLang.structure.AbstractGoodConcept").parents("testRefactoringTargetLang.structure.AbstractGoodConcept", "jetbrains.mps.lang.core.structure.INamedConcept").references("brother").create();
      case 1:
        return new ConceptDescriptorBuilder("testRefactoring.structure.YetAnotherGoodConcept").super_("testRefactoringTargetLang.structure.AnsotherGoodConcept").parents("testRefactoringTargetLang.structure.AnsotherGoodConcept").properties("niceProperty").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"testRefactoring.structure.MyVeryGoodConcept1", "testRefactoring.structure.YetAnotherGoodConcept"};
}
