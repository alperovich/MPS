package jetbrains.mps.baseLanguage.logging.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.logging.structure.LogStatement").super_("jetbrains.mps.baseLanguage.structure.Statement").parents("jetbrains.mps.baseLanguage.structure.Statement", "jetbrains.mps.lang.core.structure.IDontSubstituteByDefault").properties("hasException", "severity").children(new String[]{"logExpression", "exception"}, new boolean[]{false, false}).staticScope(StaticScope.NONE).create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.baseLanguage.logging.structure.PrintStatement").super_("jetbrains.mps.baseLanguage.structure.Statement").parents("jetbrains.mps.baseLanguage.structure.Statement").children(new String[]{"textExpression"}, new boolean[]{true}).alias("print", "").staticScope(StaticScope.NONE).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.baseLanguage.logging.structure.LogStatement", "jetbrains.mps.baseLanguage.logging.structure.PrintStatement"};
}
