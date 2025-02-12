package jetbrains.mps.lang.structure.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import org.jetbrains.mps.util.Condition;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;

public class ConceptLink_Constraints extends BaseConstraintsDescriptor {
  public ConceptLink_Constraints() {
    super("jetbrains.mps.lang.structure.structure.ConceptLink");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("conceptLinkDeclaration", new BaseReferenceConstraintsDescriptor("conceptLinkDeclaration", this) {
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
            // concept links declared in hierarchy of enclosing concept 
            SNode enclosingConcept = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", true, false);
            return (List<SNode>) new ConceptAndSuperConceptsScope(enclosingConcept).getNodes(new Condition<SNode>() {
              @Override
              public boolean met(SNode node) {
                return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.ConceptLinkDeclaration");
              }
            });
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_ujvcv0_a0a1a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNodePointer breakingNode_ujvcv0_a0a1a0a0a1a0b0a1a1 = new SNodePointer("r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)", "1213104858463");
}
