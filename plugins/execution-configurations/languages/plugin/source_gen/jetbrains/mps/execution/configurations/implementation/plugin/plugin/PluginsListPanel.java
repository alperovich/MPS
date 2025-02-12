package jetbrains.mps.execution.configurations.implementation.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.lib.ui.ListPanel;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.MPSModuleRepository;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import java.util.Set;
import org.jetbrains.mps.openapi.module.FindUsagesFacade;
import jetbrains.mps.project.GlobalScope;
import java.util.Collections;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import com.intellij.openapi.progress.ProgressManager;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.ide.platform.dialogs.choosers.NodeChooserDialog;
import java.util.List;
import jetbrains.mps.workbench.choose.nodes.BaseNodePointerModel;
import com.intellij.navigation.NavigationItem;
import jetbrains.mps.workbench.choose.nodes.BaseNodePointerItem;
import org.jetbrains.annotations.Nullable;
import com.intellij.navigation.ItemPresentation;
import jetbrains.mps.workbench.choose.nodes.NodePointerPresentation;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.util.Computable;
import jetbrains.mps.smodel.IScope;

public class PluginsListPanel extends ListPanel<SNodeReference> {


  public PluginsListPanel() {
    super("Plugins to deploy");
  }

  @Override
  protected SNodeReference wrap(SNode node) {
    return new SNodePointer(node);
  }

  @Override
  protected SNodeReference unwrap(SNodeReference reference) {
    return reference;
  }

  @Override
  protected String getFqName(final SNodeReference element) {
    final Wrappers._T<String> fqName = new Wrappers._T<String>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        fqName.value = SPropertyOperations.getString(SLinkOperations.getTarget(((SNode) element.resolve(MPSModuleRepository.getInstance())), "plugin", false), "id");
      }
    });
    return fqName.value;
  }

  @Override
  protected void collectCandidates() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SAbstractConcept c = SConceptRepository.getInstance().getConcept("jetbrains.mps.build.mps.structure.BuildMpsLayout_Plugin");
        Set<SNode> usages = FindUsagesFacade.getInstance().findInstances(GlobalScope.getInstance(), Collections.singleton(c), false, new ProgressMonitorAdapter(ProgressManager.getInstance().getProgressIndicator()));
        synchronized (myLock) {
          ListSequence.fromList(myCandidates).clear();
          for (SNode node : SetSequence.fromSet(usages)) {
            ListSequence.fromList(myCandidates).addElement(new SNodePointer(node));
          }
        }
      }
    });
  }

  @Override
  public NodeChooserDialog createNodeChooserDialog(final List<SNodeReference> nodesList) {
    // todo: rewrite 
    return new NodeChooserDialog(myProject, nodesList, new BaseNodePointerModel(myProject) {
      @Override
      public NavigationItem doGetNavigationItem(final SNodeReference nodeReference) {
        return new BaseNodePointerItem(nodeReference) {
          @Override
          public void navigate(boolean requestFocus) {
          }

          @Nullable
          @Override
          public ItemPresentation getPresentation() {
            return new NodePointerPresentation(nodeReference) {
              @NotNull
              @Override
              protected String calculatePresentableTextInternal() {
                String text = ModelAccess.instance().runReadAction(new Computable<String>() {
                  public String compute() {
                    SNode node = (SNode) nodeReference.resolve(MPSModuleRepository.getInstance());
                    if (node == null) {
                      return "null plugin";
                    }
                    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "plugin", false), "id");
                  }
                });
                return ((text == null || text.length() == 0) ?
                  super.calculatePresentableTextInternal() :
                  text
                );
              }
            };
          }
        };
      }

      @Override
      public SNodeReference[] find(boolean checkboxState) {
        return ListSequence.fromList(nodesList).toGenericArray(SNodeReference.class);
      }

      @Override
      public SNodeReference[] find(IScope scope) {
        throw new UnsupportedOperationException("must not be used");
      }

      @Override
      public boolean loadInitialCheckBoxState() {
        return false;
      }

      @Override
      public boolean willOpenEditor() {
        return false;
      }
    });
  }
}
