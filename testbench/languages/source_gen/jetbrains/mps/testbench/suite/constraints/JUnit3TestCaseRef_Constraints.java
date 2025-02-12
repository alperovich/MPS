package jetbrains.mps.testbench.suite.constraints;

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
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.testbench.suite.behavior.ModuleSuite_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.search.VisibleClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SNodePointer;

public class JUnit3TestCaseRef_Constraints extends BaseConstraintsDescriptor {
  public JUnit3TestCaseRef_Constraints() {
    super("jetbrains.mps.testbench.suite.structure.JUnit3TestCaseRef");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("klass", new BaseReferenceConstraintsDescriptor("klass", this) {
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
            IScope ms = ModuleSuite_Behavior.call_scope_1280144168199518341(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.testbench.suite.structure.ModuleSuite", true, false));
            return new VisibleClassifiersScope(_context.getEnclosingNode(), IClassifiersSearchScope.CLASS, (ms != null ?
              ms :
              operationContext.getScope()
            )) {
              @NotNull
              @Override
              public List<SNode> getClassifiers() {
                SNode testCase = SLinkOperations.getTarget(_quotation_createNode_qx1fe9_a0a0a0a0a1a0a(), "classifier", false);
                List<SNode> res = super.getClassifiers();
                for (Iterator<SNode> it = ListSequence.fromList(res).iterator(); it.hasNext();) {
                  if (!(BehaviorReflection.invokeVirtual(Boolean.TYPE, it.next(), "virtual_isDescendant_7165541881557222913", new Object[]{testCase}))) {
                    it.remove();
                  }
                }
                return res;
              }
            };
          }

          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_qx1fe9_a0a1a0a0a1a0b0a1a1;
          }
        };
      }
    });
    return references;
  }

  private static SNode _quotation_createNode_qx1fe9_a0a0a0a0a1a0a() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#83f155ff-422c-4b5a-a2f2-b459302dd215#junit.framework(jetbrains.mps.baseLanguage.unitTest.libs/junit.framework@java_stub)"), facade.createNodeId("~TestCase")));
    return quotedNode_1;
  }

  private static SNodePointer breakingNode_qx1fe9_a0a1a0a0a1a0b0a1a1 = new SNodePointer("r:137cc691-13a2-4fdd-885a-88f9405e83c0(jetbrains.mps.testbench.suite.constraints)", "1280144168199457729");
}
