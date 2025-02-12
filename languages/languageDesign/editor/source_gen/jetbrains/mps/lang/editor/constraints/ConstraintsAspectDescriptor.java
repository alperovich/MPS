package jetbrains.mps.lang.editor.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0b, fqName)) {
      case 8:
        return new CellModel_Component_Constraints();
      case 5:
        return new CellMenuComponentFeature_Link_Constraints();
      case 10:
        return new CellModel_RefCell_Constraints();
      case 16:
        return new ConceptEditorDeclaration_Constraints();
      case 9:
        return new CellModel_Property_Constraints();
      case 6:
        return new CellMenuComponentFeature_Property_Constraints();
      case 15:
        return new CellModel_WithRole_Constraints();
      case 7:
        return new CellMenuPart_ReplaceNode_CustomNodeConcept_Constraints();
      case 12:
        return new CellModel_RefNodeList_Constraints();
      case 11:
        return new CellModel_RefNode_Constraints();
      case 23:
        return new StyleClassItem_Constraints();
      case 14:
        return new CellModel_TransactionalProperty_Constraints();
      case 22:
        return new RGBColor_Constraints();
      case 1:
        return new CellActionMapDeclaration_Constraints();
      case 18:
        return new EditorComponentDeclaration_Constraints();
      case 3:
        return new CellKeyMapDeclaration_Constraints();
      case 4:
        return new CellMenuComponent_Constraints();
      case 24:
        return new StyleSheet_Constraints();
      case 19:
        return new NavigatableReferenceStyleClassItem_Constraints();
      case 13:
        return new CellModel_ReferencePresentation_Constraints();
      case 20:
        return new PreDefinedStyleSheetClass_Constraints();
      case 25:
        return new StyleSheetClass_Constraints();
      case 17:
        return new ConceptEditorHintDeclaration_Constraints();
      case 0:
        return new AbstractComponent_Constraints();
      case 21:
        return new PropertyDeclarationCellSelector_Constraints();
      case 2:
        return new CellIdReferenceSelector_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_2qnle6_a0a0b = new String[]{"jetbrains.mps.lang.editor.structure.AbstractComponent", "jetbrains.mps.lang.editor.structure.CellActionMapDeclaration", "jetbrains.mps.lang.editor.structure.CellIdReferenceSelector", "jetbrains.mps.lang.editor.structure.CellKeyMapDeclaration", "jetbrains.mps.lang.editor.structure.CellMenuComponent", "jetbrains.mps.lang.editor.structure.CellMenuComponentFeature_Link", "jetbrains.mps.lang.editor.structure.CellMenuComponentFeature_Property", "jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceNode_CustomNodeConcept", "jetbrains.mps.lang.editor.structure.CellModel_Component", "jetbrains.mps.lang.editor.structure.CellModel_Property", "jetbrains.mps.lang.editor.structure.CellModel_RefCell", "jetbrains.mps.lang.editor.structure.CellModel_RefNode", "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList", "jetbrains.mps.lang.editor.structure.CellModel_ReferencePresentation", "jetbrains.mps.lang.editor.structure.CellModel_TransactionalProperty", "jetbrains.mps.lang.editor.structure.CellModel_WithRole", "jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration", "jetbrains.mps.lang.editor.structure.ConceptEditorHintDeclaration", "jetbrains.mps.lang.editor.structure.EditorComponentDeclaration", "jetbrains.mps.lang.editor.structure.NavigatableReferenceStyleClassItem", "jetbrains.mps.lang.editor.structure.PreDefinedStyleSheetClass", "jetbrains.mps.lang.editor.structure.PropertyDeclarationCellSelector", "jetbrains.mps.lang.editor.structure.RGBColor", "jetbrains.mps.lang.editor.structure.StyleClassItem", "jetbrains.mps.lang.editor.structure.StyleSheet", "jetbrains.mps.lang.editor.structure.StyleSheetClass"};
}
