package jetbrains.mps.baseLanguage.collections.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuComponent;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_Group;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.util.NameUtil;

public class replace_withAnotherSequenceType extends AbstractCellMenuComponent {
  public replace_withAnotherSequenceType() {
    super(new SubstituteInfoPartExt[]{new replace_withAnotherSequenceType.Type_customReplace_cellMenu_qhej2e_a0()});
  }

  public static class Type_customReplace_cellMenu_qhej2e_a0 extends AbstractCellMenuPart_ReplaceNode_Group {
    public Type_customReplace_cellMenu_qhej2e_a0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      List<SNode> others = ListSequence.fromListAndArray(new ArrayList<SNode>(), SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType"), SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType"), SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SetType"), SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedSetType"));
      SNode act = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.AbstractContainerType");
      return ListSequence.fromList(SConceptOperations.getAllSubConcepts(act, SNodeOperations.getModel(node), scope)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return !(SPropertyOperations.getBoolean(it, "abstract"));
        }
      }).concat(ListSequence.fromList(others)).toListSequence();
    }

    public SNode createReplacementNode(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return this.createReplacementNode_impl((SNode) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public SNode createReplacementNode_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(parameterObject), node);
    }

    public boolean isReferentPresentation() {
      return false;
    }
  }
}
