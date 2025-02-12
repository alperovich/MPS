package jetbrains.mps.ide.modelchecker.platform.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelStereotype;
import java.util.Collections;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.generator.impl.TemplateModelScanner;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class GeneratorTemplatesChecker extends SpecificChecker {
  public GeneratorTemplatesChecker() {
  }

  @Override
  public List<SearchResult<ModelCheckerIssue>> checkModel(final SModel model, final ProgressMonitor progressMonitor, IOperationContext operationContext) {
    if (!(SModelStereotype.isGeneratorModel(model))) {
      return Collections.emptyList();
    }

    final List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());
    if (progressMonitor.isCanceled()) {
      return results;
    }
    progressMonitor.start("cross-templates references", 1);

    new TemplateModelScanner(model) {
      @Override
      public void scan() {
        for (SNode root : SModelOperations.getRoots(model, null)) {
          if (progressMonitor.isCanceled()) {
            return;
          }
          if (AttributeOperations.getAttribute(root, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation")) != null) {
            scanTemplateNode(root);
          }
        }
      }

      @Override
      protected void scanTemplateNode(SNode node) {
        if (node == null) {
          return;
        }

        try {
          for (SReference ref : Sequence.fromIterable(SNodeOperations.getReferences(node))) {
            if (progressMonitor.isCanceled()) {
              return;
            }
            if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.LinkAttribute("jetbrains.mps.lang.generator.structure.ReferenceMacro", SLinkOperations.getRole(ref))) != null)) {
              continue;
            }
            SNode target = jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(ref);
            if (target == null) {
              continue;
            }
            if (!(SModelStereotype.isGeneratorModel(SNodeOperations.getModel(target)))) {
              continue;
            }
            SNode root = SNodeOperations.getContainingRoot(target);
            if (AttributeOperations.getAttribute(root, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation")) == null) {
              continue;
            }
            if (root == SNodeOperations.getContainingRoot(node)) {
              continue;
            }

            addIssue(results, node, "Reference across root templates in role `" + SLinkOperations.getRole(ref) + "', use mapping label or reference macro", ModelChecker.SEVERITY_WARNING, "reference across templates", null);
          }

        } catch (Exception ex) {
        }
        super.scanTemplateNode(node);
      }
    }.scan();
    return results;
  }
}
