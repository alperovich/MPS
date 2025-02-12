package jetbrains.mps.build.mps.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import java.util.Collection;
import java.util.Collections;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.build.editor.buildStyles_StyleSheet;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;

public class SourcesKindComponent implements ConceptEditorComponent {
  public Collection<String> getContextHints() {
    return Collections.emptyList();
  }

  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_qubgco_a(editorContext, node);
  }

  private EditorCell createCollection_qubgco_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_qubgco_a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    delete_sourcesKind.setCellActions(editorCell, node, editorContext);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPartExt[]{new SourcesKindComponent.BuildMps_Solution_generic_cellMenu_qubgco_a0a()}));
    editorCell.addEditorCell(this.createConstant_qubgco_a0(editorContext, node));
    if (renderingCondition_qubgco_a1a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_qubgco_b0(editorContext, node));
    }
    if (renderingCondition_qubgco_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_qubgco_c0(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstant_qubgco_d0(editorContext, node));
    return editorCell;
  }

  public static class BuildMps_Solution_generic_cellMenu_qubgco_a0a extends AbstractCellMenuPart_Generic_Group {
    public BuildMps_Solution_generic_cellMenu_qubgco_a0a() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return SEnumOperations.getEnumMembers(SEnumOperations.getEnum("r:e9081cad-d8c3-45f2-b4ad-1dabd5ff82af(jetbrains.mps.build.structure)", "BuildSource_JavaContentFolderKind"));
    }

    protected void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((SNode) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public void handleAction_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, "sourcesKind", "" + (parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((SNode) parameterObject);
    }

    public String getMatchingText_internal(SNode parameterObject) {
      return "(with " + SEnumOperations.getEnumMemberName(parameterObject) + ")";
    }
  }

  private EditorCell createConstant_qubgco_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(with");
    editorCell.setCellId("Constant_qubgco_a0");
    Style style = new StyleImpl();
    buildStyles_StyleSheet.applyKeyword(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_qubgco_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("sourcesKind");
    provider.setNoTargetText("<no sourcesKind>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_sourcesKind");
    Style style = new StyleImpl();
    buildStyles_StyleSheet.applyKeyword(style, editorCell);
    style.set(StyleAttributes.EDITABLE, false);
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

  private static boolean renderingCondition_qubgco_a1a(SNode node, EditorContext editorContext, IScope scope) {
    return isNotEmpty_qubgco_a0a0g(SPropertyOperations.getString_def(node, "sourcesKind", null));
  }

  private EditorCell createConstant_qubgco_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "sources");
    editorCell.setCellId("Constant_qubgco_c0");
    Style style = new StyleImpl();
    buildStyles_StyleSheet.applyKeyword(style, editorCell);
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPartExt[]{new SourcesKindComponent.BuildMps_Solution_generic_cellMenu_qubgco_a0c0()}));
    return editorCell;
  }

  private static boolean renderingCondition_qubgco_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return isEmpty_qubgco_a0a0i(SPropertyOperations.getString_def(node, "sourcesKind", null));
  }

  public static class BuildMps_Solution_generic_cellMenu_qubgco_a0c0 extends AbstractCellMenuPart_Generic_Group {
    public BuildMps_Solution_generic_cellMenu_qubgco_a0c0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return SEnumOperations.getEnumMembers(SEnumOperations.getEnum("r:0353b795-df17-4050-9687-ee47eeb7094f(jetbrains.mps.build.mps.structure)", "BuildMps_ModuleSourcesKind"));
    }

    protected void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((SNode) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public void handleAction_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, "sourcesKind", "" + (parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((SNode) parameterObject);
    }

    public String getMatchingText_internal(SNode parameterObject) {
      return "(with " + SEnumOperations.getEnumMemberName(parameterObject) + ")";
    }
  }

  private EditorCell createConstant_qubgco_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_qubgco_d0");
    Style style = new StyleImpl();
    buildStyles_StyleSheet.applyKeyword(style, editorCell);
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public static boolean isNotEmpty_qubgco_a0a0g(String str) {
    return str != null && str.length() > 0;
  }

  public static boolean isEmpty_qubgco_a0a0i(String str) {
    return str == null || str.length() == 0;
  }
}
