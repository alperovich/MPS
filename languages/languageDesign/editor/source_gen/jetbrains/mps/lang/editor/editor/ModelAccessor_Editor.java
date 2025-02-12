package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ModelAccessor_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_bwxq1q_a(editorContext, node);
  }

  private EditorCell createCollection_bwxq1q_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createCollection_bwxq1q_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_bwxq1q_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_bwxq1q_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_bwxq1q_a0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_bwxq1q_b0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "model accessor");
    editorCell.setCellId("Constant_bwxq1q_a0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_bwxq1q_b0a");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyLeftBrace(style, editorCell);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createCollection_bwxq1q_a1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_a1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createCollection_bwxq1q_a0b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_bwxq1q_b0b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_bwxq1q_c0b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_bwxq1q_d0b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_bwxq1q_e0b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_bwxq1q_f0b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_bwxq1q_g0b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_bwxq1q_h0b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_bwxq1q_i0b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_a0b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_a0b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_bwxq1q_a0a1a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_bwxq1q_b0a1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_a0a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "get");
    editorCell.setCellId("Constant_bwxq1q_a0a1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_b0a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_bwxq1q_b0a1a");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyLeftBrace(style, editorCell);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_b0b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_b0b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createIndentCell_bwxq1q_a1a1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_bwxq1q_b1a1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createIndentCell_bwxq1q_a1a1a(EditorContext editorContext, SNode node) {
    EditorCell_Indent editorCell = new EditorCell_Indent(editorContext, node);
    return editorCell;
  }

  private EditorCell createRefNode_bwxq1q_b1a1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("getter");
    provider.setNoTargetText("<no getter>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("getter");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_c0b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_bwxq1q_c0b0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyRightBrace(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_d0b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_d0b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_bwxq1q_a3a1a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_bwxq1q_b3a1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_a3a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "set");
    editorCell.setCellId("Constant_bwxq1q_a3a1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_b3a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_bwxq1q_b3a1a");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyLeftBrace(style, editorCell);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_e0b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_e0b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createIndentCell_bwxq1q_a4a1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_bwxq1q_b4a1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createIndentCell_bwxq1q_a4a1a(EditorContext editorContext, SNode node) {
    EditorCell_Indent editorCell = new EditorCell_Indent(editorContext, node);
    return editorCell;
  }

  private EditorCell createRefNode_bwxq1q_b4a1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("setter");
    provider.setNoTargetText("<no setter>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("setter");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_f0b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_bwxq1q_f0b0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyRightBrace(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_g0b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_g0b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_bwxq1q_a6a1a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_bwxq1q_b6a1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_a6a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "validate");
    editorCell.setCellId("Constant_bwxq1q_a6a1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_b6a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_bwxq1q_b6a1a");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyLeftBrace(style, editorCell);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_bwxq1q_h0b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_bwxq1q_h0b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createIndentCell_bwxq1q_a7a1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_bwxq1q_b7a1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createIndentCell_bwxq1q_a7a1a(EditorContext editorContext, SNode node) {
    EditorCell_Indent editorCell = new EditorCell_Indent(editorContext, node);
    return editorCell;
  }

  private EditorCell createRefNode_bwxq1q_b7a1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("validator");
    provider.setNoTargetText("<no validator>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("validator");
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_i0b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_bwxq1q_i0b0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyRightBrace(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_bwxq1q_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_bwxq1q_c0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyRightBrace(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
