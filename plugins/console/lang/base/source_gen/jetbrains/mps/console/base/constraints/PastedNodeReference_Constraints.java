package jetbrains.mps.console.base.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferencePresentationContext;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class PastedNodeReference_Constraints extends BaseConstraintsDescriptor {
  public PastedNodeReference_Constraints() {
    super("jetbrains.mps.console.base.structure.PastedNodeReference");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("target", new BaseReferenceConstraintsDescriptor("target", this) {
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
            return BehaviorReflection.invokeVirtual(String.class, _context.getReferenceNode(), "virtual_getTextWhenBroken_328850564593858078", new Object[]{});
          }
        };
      }
    });
    return references;
  }
}
