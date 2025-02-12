package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.lang.project.editor.ProjectStructure_StyleSheet;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class CheckedModuleQualifiedName_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_e6mmbg_a(editorContext, node);
  }

  private EditorCell createCollection_e6mmbg_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_e6mmbg_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_e6mmbg_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e6mmbg_b0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_e6mmbg_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e6mmbg_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_e6mmbg_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "module qualified name");
    editorCell.setCellId("Constant_e6mmbg_a0");
    Style style = new StyleImpl();
    ProjectStructure_StyleSheet.applyKeyWord(style, editorCell);
    style.set(StyleAttributes.EDITABLE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e6mmbg_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "/");
    editorCell.setCellId("Constant_e6mmbg_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_e6mmbg_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("moduleId");
    provider.setNoTargetText("<no moduleId>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_moduleId");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new CheckedModuleQualifiedName_Editor.CheckedModuleQualifiedName_generic_cellMenu_e6mmbg_a0c0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class CheckedModuleQualifiedName_generic_cellMenu_e6mmbg_a0c0 extends AbstractCellMenuPart_Generic_Group {
    public CheckedModuleQualifiedName_generic_cellMenu_e6mmbg_a0c0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      List<String> res = ListSequence.fromList(new ArrayList<String>());
      for (SModule m : MPSModuleRepository.getInstance().getModules()) {
        ListSequence.fromList(res).addElement(m.getModuleName());
      }
      return res;
    }

    protected void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((String) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public void handleAction_impl(String parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, "moduleId", parameterObject);
    }

    public boolean isReferentPresentation() {
      return false;
    }
  }

  private EditorCell createConstant_e6mmbg_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "/");
    editorCell.setCellId("Constant_e6mmbg_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
