package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellModel_Constant_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_8hdu2g_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_8hdu2g_a_0(editorContext, node);
  }

  private EditorCell createCollection_8hdu2g_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_8hdu2g_a");
    editorCell.setBig(true);
    Style style = new StyleImpl();
    Styles_StyleSheet.applyRootCellModelStyle(style, editorCell);
    editorCell.getStyle().putAll(style);
    if (renderingCondition_8hdu2g_a0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_8hdu2g_a0(editorContext, node));
    }
    editorCell.addEditorCell(this.createProperty_8hdu2g_b0(editorContext, node));
    if (renderingCondition_8hdu2g_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_8hdu2g_c0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createComponent_8hdu2g_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.editor.editor._OpenTag");
    return editorCell;
  }

  private static boolean renderingCondition_8hdu2g_a0a(SNode node, EditorContext editorContext, IScope scope) {
    return EditorCellModel_Behavior.call_getOpeningTag_1220340471382(node).length() > 0;
  }

  private EditorCell createProperty_8hdu2g_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("text");
    provider.setNoTargetText("<constant>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_text");
    Style style = new StyleImpl();
    Styles_StyleSheet.applyBordered(style, editorCell);
    style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(CellModel_Constant_Editor._StyleParameter_QueryFunction_8hdu2g_a0b0((editorCell == null ?
      null :
      editorCell.getContext()
    ), (editorCell == null ?
      null :
      editorCell.getSNode()
    ))));
    style.set(StyleAttributes.BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(CellModel_Constant_Editor._StyleParameter_QueryFunction_8hdu2g_a1b0((editorCell == null ?
      null :
      editorCell.getContext()
    ), (editorCell == null ?
      null :
      editorCell.getSNode()
    ))));
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(CellModel_Constant_Editor._StyleParameter_QueryFunction_8hdu2g_a2b0((editorCell == null ?
      null :
      editorCell.getContext()
    ), (editorCell == null ?
      null :
      editorCell.getSNode()
    ))));
    style.set(StyleAttributes.FONT_STYLE, CellModel_Constant_Editor._StyleParameter_QueryFunction_8hdu2g_a3b0((editorCell == null ?
      null :
      editorCell.getContext()
    ), (editorCell == null ?
      null :
      editorCell.getSNode()
    )));
    style.set(StyleAttributes.FONT_SIZE, CellModel_Constant_Editor._StyleParameter_QueryFunction_8hdu2g_a4b0((editorCell == null ?
      null :
      editorCell.getContext()
    ), (editorCell == null ?
      null :
      editorCell.getSNode()
    )));
    style.set(StyleAttributes.UNDERLINED, CellModel_Constant_Editor._StyleParameter_QueryFunction_8hdu2g_a5b0((editorCell == null ?
      null :
      editorCell.getContext()
    ), (editorCell == null ?
      null :
      editorCell.getSNode()
    )));
    style.set(StyleAttributes.STRIKE_OUT, CellModel_Constant_Editor._StyleParameter_QueryFunction_8hdu2g_a6b0((editorCell == null ?
      null :
      editorCell.getContext()
    ), (editorCell == null ?
      null :
      editorCell.getSNode()
    )));
    editorCell.getStyle().putAll(style);
    editorCell.addKeyMap(new _SplitConctantCellIntoWordsKeyMap());
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

  private static Color _StyleParameter_QueryFunction_8hdu2g_a0b0(EditorContext editorContext, SNode node) {
    return EditorCellModel_Behavior.call_getTextBackgroundColor_1220972190901(node);
  }

  private static Color _StyleParameter_QueryFunction_8hdu2g_a1b0(EditorContext editorContext, SNode node) {
    return EditorCellModel_Behavior.call_getBackgroundColor_1220969182195(node);
  }

  private static Color _StyleParameter_QueryFunction_8hdu2g_a2b0(EditorContext editorContext, SNode node) {
    return EditorCellModel_Behavior.call_getForegroundColor_1220960215403(node);
  }

  private static int _StyleParameter_QueryFunction_8hdu2g_a3b0(EditorContext editorContext, SNode node) {
    return EditorCellModel_Behavior.call_getFontStyle_1221053923273(node);
  }

  private static int _StyleParameter_QueryFunction_8hdu2g_a4b0(EditorContext editorContext, SNode node) {
    return EditorCellModel_Behavior.call_getFontSize_1221216397365(node);
  }

  private static boolean _StyleParameter_QueryFunction_8hdu2g_a5b0(EditorContext editorContext, SNode node) {
    return EditorCellModel_Behavior.call_isUnderlined_1221220594206(node);
  }

  private static boolean _StyleParameter_QueryFunction_8hdu2g_a6b0(EditorContext editorContext, SNode node) {
    return EditorCellModel_Behavior.call_isStrikeOut_1223390694337(node);
  }

  private EditorCell createComponent_8hdu2g_c0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.editor.editor._CloseTag");
    return editorCell;
  }

  private static boolean renderingCondition_8hdu2g_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return EditorCellModel_Behavior.call_getClosingTag_1220340488560(node).length() > 0;
  }

  private EditorCell createCollection_8hdu2g_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_8hdu2g_a_0");
    editorCell.setBig(true);
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createComponent_8hdu2g_a0_0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_8hdu2g_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_8hdu2g_c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_8hdu2g_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_8hdu2g_a0_0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.editor.editor._CellModel_Common");
    return editorCell;
  }

  private EditorCell createConstant_8hdu2g_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_8hdu2g_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_8hdu2g_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "Constant cell:");
    editorCell.setCellId("Constant_8hdu2g_c0");
    Style style = new StyleImpl();
    Styles_StyleSheet.applyHeader(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_8hdu2g_d0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_8hdu2g_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.DRAW_BORDER, true);
    editorCell.getStyle().putAll(style);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_8hdu2g_a3a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_8hdu2g_b3a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_8hdu2g_a3a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_8hdu2g_a3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.DRAW_BORDER, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_8hdu2g_a0d0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_8hdu2g_b0d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_8hdu2g_a0d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "text");
    editorCell.setCellId("Constant_8hdu2g_a0d0");
    Style style = new StyleImpl();
    Styles_StyleSheet.applyProperty(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_8hdu2g_b0d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("text");
    provider.setNoTargetText("<none>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_text_1");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, true);
    style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.yellow));
    style.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.cyan));
    editorCell.getStyle().putAll(style);
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

  private EditorCell createCollection_8hdu2g_b3a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_8hdu2g_b3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.DRAW_BORDER, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_8hdu2g_a1d0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_8hdu2g_b1d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_8hdu2g_a1d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "text*");
    editorCell.setCellId("Constant_8hdu2g_a1d0");
    Style style = new StyleImpl();
    Styles_StyleSheet.applyProperty(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_8hdu2g_b1d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("nullText");
    provider.setNoTargetText("<none>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_nullText");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, true);
    style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.yellow));
    style.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.cyan));
    editorCell.getStyle().putAll(style);
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
}
