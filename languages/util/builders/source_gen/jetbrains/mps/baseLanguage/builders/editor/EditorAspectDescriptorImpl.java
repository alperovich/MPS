package jetbrains.mps.baseLanguage.builders.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorHint;

public class EditorAspectDescriptorImpl implements EditorAspectDescriptor {
  public Collection<ConceptEditor> getEditors(ConceptDescriptor descriptor) {
    switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a, descriptor.getConceptFqName())) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new AsBuilderStatement_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new AsTypeBuilder_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new BeanBuilder_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new BeanPropertyBuilder_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Builder_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new BuilderCreator_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new BuilderStatement_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new ResultExpression_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilder_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderChild_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderDeclaration_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderExpression_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderExtensionDeclaration_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderParameter_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderParameterReference_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderProperty_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderPropertyBuilder_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilderPropertyExpression_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new SimpleBuilders_Editor());
      default:
    }
    return Collections.emptyList();
  }

  public Collection<ConceptEditorComponent> getEditorComponents(ConceptDescriptor descriptor, String editorComponentId) {
    return Collections.emptyList();
  }



  public Collection<ConceptEditorHint> getHints() {
    return Collections.emptyList();
  }


  private static String[] stringSwitchCases_xbvbvu_a0a0a = new String[]{"jetbrains.mps.baseLanguage.builders.structure.AsBuilderStatement", "jetbrains.mps.baseLanguage.builders.structure.AsTypeBuilder", "jetbrains.mps.baseLanguage.builders.structure.BeanBuilder", "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder", "jetbrains.mps.baseLanguage.builders.structure.Builder", "jetbrains.mps.baseLanguage.builders.structure.BuilderCreator", "jetbrains.mps.baseLanguage.builders.structure.BuilderStatement", "jetbrains.mps.baseLanguage.builders.structure.ResultExpression", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilder", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderChild", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderDeclaration", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderExpression", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderExtensionDeclaration", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParameter", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderParameterReference", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderProperty", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyExpression", "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilders"};
}
