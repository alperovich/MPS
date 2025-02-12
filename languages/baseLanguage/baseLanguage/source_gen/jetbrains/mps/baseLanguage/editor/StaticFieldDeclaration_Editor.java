package jetbrains.mps.baseLanguage.editor;

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
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class StaticFieldDeclaration_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_t6d1qn_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_t6d1qn_a_0(editorContext, node);
  }

  private EditorCell createCollection_t6d1qn_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_t6d1qn_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createComponent_t6d1qn_a0(editorContext, node));
    editorCell.addEditorCell(this.createComponent_t6d1qn_b0(editorContext, node));
    editorCell.addEditorCell(this.createComponent_t6d1qn_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_t6d1qn_d0(editorContext, node));
    if (renderingCondition_t6d1qn_a4a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_t6d1qn_e0(editorContext, node));
    }
    editorCell.addEditorCell(this.createRefNode_t6d1qn_f0(editorContext, node));
    editorCell.addEditorCell(this.createComponent_t6d1qn_g0(editorContext, node));
    if (renderingCondition_t6d1qn_a7a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_t6d1qn_h0(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstant_t6d1qn_i0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_t6d1qn_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.baseLanguage.editor._DeprecatedPart");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }

  private EditorCell createComponent_t6d1qn_b0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.baseLanguage.editor.HasAnnotation_AnnotationComponent");
    return editorCell;
  }

  private EditorCell createComponent_t6d1qn_c0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.baseLanguage.editor._Component_Visibility");
    return editorCell;
  }

  private EditorCell createConstant_t6d1qn_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "static");
    editorCell.setCellId("Constant_t6d1qn_d0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyKeyWord(style, editorCell);
    editorCell.getStyle().putAll(style);
    DeleteStaticInField.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_t6d1qn_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "final");
    editorCell.setCellId("Constant_t6d1qn_e0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyKeyWord(style, editorCell);
    editorCell.getStyle().putAll(style);
    DeleteFinalInStaticField.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private static boolean renderingCondition_t6d1qn_a4a(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "isFinal");
  }

  private EditorCell createRefNode_t6d1qn_f0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("type");
    provider.setNoTargetText("<no type>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("type");
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

  private EditorCell createComponent_t6d1qn_g0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.baseLanguage.editor.VariableDeclaration_NameCellComponent");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyStaticField(style, editorCell);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }

  private EditorCell createCollection_t6d1qn_h0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_t6d1qn_h0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_t6d1qn_a7a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_t6d1qn_b7a(editorContext, node));
    return editorCell;
  }

  private static boolean renderingCondition_t6d1qn_a7a(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "initializer", true) != null;
  }

  private EditorCell createConstant_t6d1qn_a7a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "=");
    editorCell.setCellId("Constant_t6d1qn_a7a");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyOperator(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_t6d1qn_b7a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("initializer");
    provider.setNoTargetText("<no initializer>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setRole("initializer");
    }
    Style style = new StyleImpl();
    style.set(StyleAttributes.AUTO_DELETABLE, false);
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

  private EditorCell createConstant_t6d1qn_i0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ";");
    editorCell.setCellId("Constant_t6d1qn_i0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applySemicolon(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCollection_t6d1qn_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_t6d1qn_a_0");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_t6d1qn_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_t6d1qn_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_t6d1qn_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_t6d1qn_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_t6d1qn_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "isFinal");
    editorCell.setCellId("Constant_t6d1qn_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_t6d1qn_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("isFinal");
    provider.setNoTargetText("<no isFinal>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_isFinal");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
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

  private EditorCell createConstant_t6d1qn_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "annotations:");
    editorCell.setCellId("Constant_t6d1qn_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_t6d1qn_d0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new StaticFieldDeclaration_Editor.annotationListHandler_t6d1qn_d0(node, "annotation", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_annotation");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private static class annotationListHandler_t6d1qn_d0 extends RefNodeListHandler {
    public annotationListHandler_t6d1qn_d0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }
  }
}
