package jetbrains.mps.execution.settings.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import java.util.List;
import jetbrains.mps.execution.settings.behavior.SettingsEditor_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class EditorOperationCall_Constraints extends BaseConstraintsDescriptor {
  public EditorOperationCall_Constraints() {
    super("jetbrains.mps.execution.settings.structure.EditorOperationCall");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("editorOperationDeclaration", new BaseReferenceConstraintsDescriptor("editorOperationDeclaration", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            SNode instance = SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
            SNode editorType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(instance), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.execution.settings.structure.SettingsEditorType"), false);
            if ((editorType == null) || (SLinkOperations.getTarget(editorType, "configuration", false) == null)) {
              return Sequence.fromIterable(Collections.<SNode>emptyList());
            }
            List<SNode> operations = SettingsEditor_Behavior.call_getDeclaredOperations_946964771156067031(SLinkOperations.getTarget(SLinkOperations.getTarget(editorType, "configuration", false), "editor", true));
            return ListSequence.fromList(operations).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode it) {
                return ((SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.execution.settings.structure.SettingsEditor", false, false) != null) ?
                  (BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), it, "virtual_getJavaMethod_946964771156066991", new Object[]{}) != null) :
                  (BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), it, "virtual_getPublicJavaMethod_203908296139519011", new Object[]{}) != null)
                );
              }
            });
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_ow8wt3_a0a1a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_ow8wt3_a0a1a0a0a1a0b0a1a1 = new SNodePointer("r:26cd452e-c5c2-4d47-ad13-dda4362e8616(jetbrains.mps.execution.settings.constraints)", "946964771156067150");
}
