package jetbrains.mps.core.properties.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.core.properties.structure.PropertiesComment").super_("jetbrains.mps.core.properties.structure.PropertiesLine").parents("jetbrains.mps.core.properties.structure.PropertiesLine").properties("text").alias("#", "").staticScope(StaticScope.NONE).create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.core.properties.structure.PropertiesDeclaration").super_("jetbrains.mps.core.properties.structure.PropertiesLine").parents("jetbrains.mps.core.properties.structure.PropertiesLine", "jetbrains.mps.lang.core.structure.INamedConcept").properties("value").alias("property", "").create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.core.properties.structure.PropertiesFile").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.traceable.structure.UnitConcept").children(new String[]{"lines"}, new boolean[]{true}).alias("properties file", "").create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.core.properties.structure.PropertiesLine").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").alias("<empty line>", "").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.core.properties.structure.PropertiesComment", "jetbrains.mps.core.properties.structure.PropertiesDeclaration", "jetbrains.mps.core.properties.structure.PropertiesFile", "jetbrains.mps.core.properties.structure.PropertiesLine"};
}
