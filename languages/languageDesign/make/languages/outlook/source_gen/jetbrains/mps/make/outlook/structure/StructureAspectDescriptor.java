package jetbrains.mps.make.outlook.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.make.outlook.structure.Outlook").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"facet"}, new boolean[]{true}).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.make.outlook.structure.Outlook"};
}
