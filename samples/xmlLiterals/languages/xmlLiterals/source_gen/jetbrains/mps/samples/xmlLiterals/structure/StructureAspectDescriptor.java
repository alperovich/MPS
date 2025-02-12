package jetbrains.mps.samples.xmlLiterals.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.samples.xmlLiterals.structure.ElementMacro").super_("jetbrains.mps.core.xml.structure.XmlContent").parents("jetbrains.mps.core.xml.structure.XmlContent").children(new String[]{"expression"}, new boolean[]{false}).alias("$${", "element macro").create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.samples.xmlLiterals.structure.TextMacro").super_("jetbrains.mps.core.xml.structure.XmlText").parents("jetbrains.mps.core.xml.structure.XmlText").children(new String[]{"expression"}, new boolean[]{false}).alias("${", "").create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.samples.xmlLiterals.structure.XmlLiteral").super_("jetbrains.mps.baseLanguage.structure.Expression").parents("jetbrains.mps.baseLanguage.structure.Expression").children(new String[]{"element"}, new boolean[]{false}).alias("xml literal", "").staticScope(StaticScope.NONE).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.samples.xmlLiterals.structure.ElementMacro", "jetbrains.mps.samples.xmlLiterals.structure.TextMacro", "jetbrains.mps.samples.xmlLiterals.structure.XmlLiteral"};
}
