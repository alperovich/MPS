package jetbrains.mps.lang.editor.editorTest.structure;

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
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.AttractsFocusBlock").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").children(new String[]{"child"}, new boolean[]{false}).alias("attracts focus", "").create();
      case 1:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").children(new String[]{"left", "right"}, new boolean[]{false, false}).abstract_().create();
      case 2:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.BracesBlock").super_("jetbrains.mps.lang.editor.editorTest.structure.TestBlockList").parents("jetbrains.mps.lang.editor.editorTest.structure.TestBlockList", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").create();
      case 3:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.BracesStubBlock").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").alias("braces stub", "").create();
      case 4:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.ClassReference").super_("jetbrains.mps.baseLanguage.structure.Statement").parents("jetbrains.mps.baseLanguage.structure.Statement").references("class").alias("classref", "").create();
      case 5:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").interface_().create();
      case 6:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.InspectorBlock").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").children(new String[]{"block"}, new boolean[]{false}).alias("inspector", "").create();
      case 7:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.IntegerLiteral").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").properties("value").create();
      case 8:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.NonEmptyProperty").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").properties("value").alias("non-empty-property", "").create();
      case 9:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.NotEditableVaraileReference").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").references("variableDeclaration").alias("{<{variableDeclaration}>} not editable", "").create();
      case 10:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.PlusExpression").super_("jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression").parents("jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression").alias("+", "").create();
      case 11:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.ReferenceAnnotataion").super_("jetbrains.mps.lang.core.structure.LinkAttribute").parents("jetbrains.mps.lang.core.structure.LinkAttribute").create();
      case 12:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.SideTranformWrapper").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").properties("rightOpen").children(new String[]{"child"}, new boolean[]{false}).alias("side-transform-wrapper", "").create();
      case 13:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.StubBlock").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").alias("stub", "").create();
      case 14:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.TestBlockList").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").children(new String[]{"statement"}, new boolean[]{true}).alias("{", "").create();
      case 15:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationBlock").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").create();
      case 16:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationReference").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").references("var").create();
      case 17:
        return new ConceptDescriptorBuilder("jetbrains.mps.lang.editor.editorTest.structure.VerticalLayoutBlockList").super_("jetbrains.mps.lang.editor.editorTest.structure.TestBlockList").parents("jetbrains.mps.lang.editor.editorTest.structure.TestBlockList", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock").alias("vericalLayout", "").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"jetbrains.mps.lang.editor.editorTest.structure.AttractsFocusBlock", "jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression", "jetbrains.mps.lang.editor.editorTest.structure.BracesBlock", "jetbrains.mps.lang.editor.editorTest.structure.BracesStubBlock", "jetbrains.mps.lang.editor.editorTest.structure.ClassReference", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock", "jetbrains.mps.lang.editor.editorTest.structure.InspectorBlock", "jetbrains.mps.lang.editor.editorTest.structure.IntegerLiteral", "jetbrains.mps.lang.editor.editorTest.structure.NonEmptyProperty", "jetbrains.mps.lang.editor.editorTest.structure.NotEditableVaraileReference", "jetbrains.mps.lang.editor.editorTest.structure.PlusExpression", "jetbrains.mps.lang.editor.editorTest.structure.ReferenceAnnotataion", "jetbrains.mps.lang.editor.editorTest.structure.SideTranformWrapper", "jetbrains.mps.lang.editor.editorTest.structure.StubBlock", "jetbrains.mps.lang.editor.editorTest.structure.TestBlockList", "jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationBlock", "jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationReference", "jetbrains.mps.lang.editor.editorTest.structure.VerticalLayoutBlockList"};
}
