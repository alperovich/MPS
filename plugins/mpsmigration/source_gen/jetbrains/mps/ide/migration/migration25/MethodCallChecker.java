package jetbrains.mps.ide.migration.migration25;

/*Generated by MPS */

import jetbrains.mps.ide.modelchecker.platform.actions.SpecificChecker;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.modelchecker.platform.actions.ModelCheckerIssue;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.AbstractModule;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.modelchecker.platform.actions.ModelChecker;
import jetbrains.mps.ide.modelchecker.platform.actions.IModelCheckerFix;
import jetbrains.mps.ide.java.platform.highlighters.MethodDeclarationsFixer;
import java.util.Map;
import java.util.HashMap;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.smodel.SModelRepository;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.module.SModule;

public class MethodCallChecker extends SpecificChecker {
  public MethodCallChecker() {
  }

  @Override
  public List<SearchResult<ModelCheckerIssue>> checkModel(final SModel model, ProgressMonitor monitor, IOperationContext operationContext) {
    List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());
    if (model == null || model == null || model.getModule() == null) {
      return results;
    }
    final IScope scope = ((AbstractModule) model.getModule()).getScope();
    monitor.start("unresolved references to method declaration", 1);

    for (final SNode node : ListSequence.fromList(SModelOperations.getNodes(model, "jetbrains.mps.baseLanguage.structure.IMethodCall"))) {
      if (monitor.isCanceled()) {
        break;
      }
      for (SReference ref : Sequence.fromIterable(SNodeOperations.getReferences(node))) {
        if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.LinkAttribute("jetbrains.mps.lang.generator.structure.ReferenceMacro", SLinkOperations.getRole(ref))) != null)) {
          continue;
        }
        if (!("baseMethodDeclaration".equals(SLinkOperations.getRole(ref)))) {
          continue;
        }
        if (jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(ref) == null) {
          addIssue(results, node, "Unresolved reference to method declaration: " + SLinkOperations.getResolveInfo(ref), ModelChecker.SEVERITY_ERROR, "unresolved reference to method declaration", new IModelCheckerFix() {
            public boolean doFix() {
              MethodDeclarationsFixer fixer = new MethodDeclarationsFixer();
              final Map<SNode, SNode> reResolvedTargets = new HashMap<SNode, SNode>();
              fixer.testAndFixMethodCall(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.IMethodCall"), reResolvedTargets);
              for (SNode methodCall : reResolvedTargets.keySet()) {
                SNode referent = reResolvedTargets.get(methodCall);
                if (referent != null && !(jetbrains.mps.util.SNodeOperations.isDisposed(referent))) {
                  SLinkOperations.setTarget(methodCall, "baseMethodDeclaration", referent, false);
                }
              }
              fixer.clearCaches();
              return true;
            }
          });
        }
        // copied from UnresolvedReferencesChecker 
        final SModelReference uid = ref.getTargetSModelReference();
        if (uid == null) {
          continue;
        }
        SModel descriptor = SModelRepository.getInstance().getModelDescriptor(uid);
        if (scope.resolve(uid) == null && descriptor != null) {
          addIssue(results, node, "Target module " + descriptor.getModule().getModuleName() + " should be imported", ModelChecker.SEVERITY_ERROR, "target module not imported", new IModelCheckerFix() {
            public boolean doFix() {
              if (scope.getModelDescriptor(uid) == null && SModelRepository.getInstance().getModelDescriptor(uid) != null) {
                SModel sm = SModelRepository.getInstance().getModelDescriptor(uid);
                check_lz161n_a1a0a5a0a7a1a5a1(((AbstractModule) check_lz161n_a0a0b0a0f0a0h0b0f0b_0(model)), sm);
                return true;
              }
              return false;
            }
          });
        }
      }
    }
    monitor.done();
    return results;
  }

  private static void check_lz161n_a1a0a5a0a7a1a5a1(AbstractModule checkedDotOperand, SModel sm) {
    if (null != checkedDotOperand) {
      checkedDotOperand.addDependency(check_lz161n_a0a1a0a5a0a7a1a5a1(check_lz161n_a0a0b0a0f0a0h0b0f0b(sm)), false);
    }

  }

  private static SModuleReference check_lz161n_a0a1a0a5a0a7a1a5a1(SModule checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModuleReference();
    }
    return null;
  }

  private static SModule check_lz161n_a0a0b0a0f0a0h0b0f0b(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModule();
    }
    return null;
  }

  private static SModule check_lz161n_a0a0b0a0f0a0h0b0f0b_0(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModule();
    }
    return null;
  }
}
