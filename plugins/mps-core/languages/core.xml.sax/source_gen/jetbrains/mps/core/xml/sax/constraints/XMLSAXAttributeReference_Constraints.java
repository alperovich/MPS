package jetbrains.mps.core.xml.sax.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import jetbrains.mps.smodel.runtime.ReferencePresentationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.scope.EmptyScope;
import jetbrains.mps.smodel.SNodePointer;

public class XMLSAXAttributeReference_Constraints extends BaseConstraintsDescriptor {
  public XMLSAXAttributeReference_Constraints() {
    super("jetbrains.mps.core.xml.sax.structure.XMLSAXAttributeReference");
  }

  @Override
  public boolean hasOwnCanBeChildMethod() {
    return true;
  }

  @Override
  public boolean canBeChild(@Nullable SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext, @Nullable final CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAChild(node, parentNode, link, childConcept, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
    }

    return result;
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("attribute", new BaseReferenceConstraintsDescriptor("attribute", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public boolean hasPresentation() {
            return true;
          }

          @Override
          public String getPresentation(final IOperationContext operationContext, final ReferencePresentationContext _context) {
            if (SNodeOperations.getAncestor(_context.getContextNode(), "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRule", true, false) != SNodeOperations.getParent(_context.getParameterNode())) {
              SNode nodeRule = SNodeOperations.as(SNodeOperations.getParent(_context.getParameterNode()), "jetbrains.mps.core.xml.sax.structure.XMLSAXNodeRule");
              return ((nodeRule == null ?
                "<unknown>" :
                SPropertyOperations.getString(nodeRule, "name")
              )) + "." + SPropertyOperations.getString(_context.getParameterNode(), "name");
            }
            return SPropertyOperations.getString(_context.getParameterNode(), "name");
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_4osf4s_a0a2a0a0a1a0b0a1a3;
          }

          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Scope scope = Scope.getScope(_context.getContextNode(), _context.getContextRole(), _context.getPosition(), (SNode) SConceptOperations.findConceptDeclaration("jetbrains.mps.core.xml.sax.structure.XMLSAXAttributeRule"));
              return (scope == null ?
                new EmptyScope() :
                scope
              );
            }
          }
        };
      }
    });
    return references;
  }

  public static boolean static_canBeAChild(SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext) {
    return (SNodeOperations.getAncestor(parentNode, "jetbrains.mps.core.xml.sax.structure.XMLSAXParser", true, false) != null);
  }

  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:a2a452cd-a0b4-4774-9b7e-00f9c8226bfa(jetbrains.mps.core.xml.sax.constraints)", "2264311582634140728");
  private static SNodePointer breakingNode_4osf4s_a0a2a0a0a1a0b0a1a3 = new SNodePointer("r:a2a452cd-a0b4-4774-9b7e-00f9c8226bfa(jetbrains.mps.core.xml.sax.constraints)", "980633948652566941");
}
