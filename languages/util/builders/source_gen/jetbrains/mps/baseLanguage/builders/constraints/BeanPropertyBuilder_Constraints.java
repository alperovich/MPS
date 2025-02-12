package jetbrains.mps.baseLanguage.builders.constraints;

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
import jetbrains.mps.smodel.runtime.ReferencePresentationContext;
import jetbrains.mps.baseLanguage.builders.behavior.BeanPropertyBuilder_Behavior;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.baseLanguage.builders.behavior.Builder_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.scopes.Members;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class BeanPropertyBuilder_Constraints extends BaseConstraintsDescriptor {
  public BeanPropertyBuilder_Constraints() {
    super("jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("setter", new BaseReferenceConstraintsDescriptor("setter", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public boolean hasPresentation() {
            return true;
          }

          @Override
          public String getPresentation(final IOperationContext operationContext, final ReferencePresentationContext _context) {
            return BeanPropertyBuilder_Behavior.call_getPropertyName_2679357232284040711(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder"))), SPropertyOperations.getString(_context.getParameterNode(), "name"));
          }

          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            SNode contextBuilder = Builder_Behavior.call_getContextBuilder_7057666463730366732(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.Builder"))), _context.getEnclosingNode());
            SNode classifierType = TypeChecker.getInstance().getRuntimeSupport().coerce_(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), contextBuilder, "virtual_getResultType_7057666463730718251", new Object[]{}), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
            if (classifierType == null) {
              return Sequence.fromIterable(Collections.<SNode>emptyList());
            }
            List<SNode> methods = new ArrayList<SNode>();
            for (SNode method : Members.visibleInstanceMethods(classifierType, _context.getEnclosingNode())) {
              if ((int) ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == 1 && BeanPropertyBuilder_Behavior.call_getPropertyName_2679357232284040711(SConceptRepository.getInstance().getConcept(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder"))), SPropertyOperations.getString(method, "name")) != null) {
                ListSequence.fromList(methods).addElement(method);
              }
            }
            return methods;
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_uhv5x2_a0a3a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_uhv5x2_a0a3a0a0a1a0b0a1a1 = new SNodePointer("r:971d5c35-6139-4f76-9019-ac96d9713d41(jetbrains.mps.baseLanguage.builders.constraints)", "2679357232283837712");
}
