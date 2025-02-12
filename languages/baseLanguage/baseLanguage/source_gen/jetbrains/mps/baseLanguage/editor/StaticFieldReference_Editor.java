package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.editor.runtime.style.FocusPolicy;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.editor.generator.internal.PrimaryReferentMenuCellMenuPart;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_Group;
import java.util.List;

public class StaticFieldReference_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_ji2wba_a(editorContext, node);
  }

  private EditorCell createCollection_ji2wba_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_ji2wba_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefCell_ji2wba_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_ji2wba_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_ji2wba_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createRefCell_ji2wba_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("classifier");
    provider.setNoTargetText("<no classifier>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new StaticFieldReference_Editor._Inline_ji2wba_a0a());
    editorCell = provider.createEditorCell(editorContext);
    StaticFieldReference_Actions.setCellActions(editorCell, node, editorContext);
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

  public static class _Inline_ji2wba_a0a extends InlineCellProvider {
    public _Inline_ji2wba_a0a() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_ji2wba_a0a0(editorContext, node);
    }

    private EditorCell createProperty_ji2wba_a0a0(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name");
      if (editorCell.getRole() == null) {
        editorCell.setReferenceCell(true);
        editorCell.setRole("classifier");
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
  }

  private EditorCell createConstant_ji2wba_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ".");
    editorCell.setCellId("Constant_ji2wba_b0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.applyDot(style, editorCell);
    editorCell.getStyle().putAll(style);
    StaticFieldReference_DeleteDot.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefCell_ji2wba_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("staticFieldDeclaration");
    provider.setNoTargetText("<no static member>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new StaticFieldReference_Editor._Inline_ji2wba_a2a());
    editorCell = provider.createEditorCell(editorContext);
    Style style = new StyleImpl();
    style.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
    editorCell.getStyle().putAll(style);
    StaticFieldReference_DeleteDot.setCellActions(editorCell, node, editorContext);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new StaticFieldReference_Editor.StaticFieldReference_generic_cellMenu_ji2wba_a0c0(), new StaticFieldReference_Editor.StaticFieldReference_staticFieldDeclaration_cellMenu_ji2wba_b0c0(), new StaticFieldReference_Editor.StaticFieldReference_customReplace_cellMenu_ji2wba_c0c0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class _Inline_ji2wba_a2a extends InlineCellProvider {
    public _Inline_ji2wba_a2a() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_ji2wba_a0c0(editorContext, node);
    }

    private EditorCell createProperty_ji2wba_a0c0(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name_1");
      if (editorCell.getRole() == null) {
        editorCell.setReferenceCell(true);
        editorCell.setRole("variableDeclaration");
      }
      Style style = new StyleImpl();
      BaseLanguageStyle_StyleSheet.applyStaticField(style, editorCell);
      editorCell.getStyle().putAll(style);
      if (true) {
        editorCell.getStyle().set(StyleAttributes.FOCUS_POLICY, FocusPolicy.ATTRACTS_FOCUS);
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
  }

  public static class StaticFieldReference_generic_cellMenu_ji2wba_a0c0 extends AbstractCellMenuPart_Generic_Item {
    public StaticFieldReference_generic_cellMenu_ji2wba_a0c0() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      SNode expr = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", null);
      SLinkOperations.setTarget(expr, "classifier", SLinkOperations.getTarget(node, "classifier", false), false);
      SNodeOperations.replaceWithAnother(node, expr);
    }

    public String getMatchingText() {
      return "class";
    }
  }

  public static class StaticFieldReference_staticFieldDeclaration_cellMenu_ji2wba_b0c0 extends PrimaryReferentMenuCellMenuPart {
    public StaticFieldReference_staticFieldDeclaration_cellMenu_ji2wba_b0c0() {
    }
  }

  public static class StaticFieldReference_customReplace_cellMenu_ji2wba_c0c0 extends AbstractCellMenuPart_ReplaceNode_Group {
    public StaticFieldReference_customReplace_cellMenu_ji2wba_c0c0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return QueriesUtil.replaceNodeMenu_parameterObjects(SLinkOperations.getTarget(node, "classifier", false), node);
    }

    public SNode createReplacementNode(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return this.createReplacementNode_impl((SNode) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public SNode createReplacementNode_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return QueriesUtil.replaceNodeMenu_createNewNode(SLinkOperations.getTarget(node, "classifier", false), parameterObject, node);
    }

    public boolean isReferentPresentation() {
      return true;
    }
  }
}
