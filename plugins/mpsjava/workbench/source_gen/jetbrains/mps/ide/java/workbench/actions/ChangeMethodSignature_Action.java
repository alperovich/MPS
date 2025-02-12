package jetbrains.mps.ide.java.workbench.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import org.apache.log4j.Priority;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import org.jetbrains.mps.openapi.module.ModelAccess;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import com.intellij.openapi.ui.Messages;
import java.awt.Frame;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.smodel.IOperationContext;
import java.util.List;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ChangeMethodSignatureRefactoring;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.platform.refactoring.RefactoringAccess;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ChangeMethodSignature_Action extends BaseAction {
  private static final Icon ICON = null;

  public ChangeMethodSignature_Action() {
    super("Change Method Signature", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return RefactoringUtil.isApplicable(RefactoringUtil.getRefactoringByClassName("jetbrains.mps.baseLanguage.refactorings" + "." + "ChangeMethodSignature"), ((SNode) MapSequence.fromMap(_params).get("method")));
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action doUpdate method failed. Action:" + "ChangeMethodSignature", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"))) {
          node = null;
        }
      }
      MapSequence.fromMap(_params).put("method", node);
    }
    if (MapSequence.fromMap(_params).get("method") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSCommonDataKeys.MPS_PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSCommonDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final Wrappers._T<SNode> baseMethod = new Wrappers._T<SNode>();
      final Wrappers._T<String> message = new Wrappers._T<String>("");
      ModelAccess modelAccess = ((MPSProject) MapSequence.fromMap(_params).get("project")).getRepository().getModelAccess();

      modelAccess.runWriteAction(new Runnable() {
        public void run() {
          SModelRepository.getInstance().saveAll();
          baseMethod.value = BehaviorReflection.invokeNonVirtual((Class<SNode>) ((Class) Object.class), ((SNode) MapSequence.fromMap(_params).get("method")), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", "call_getBaseMethod_5014346297260519893", new Object[]{});
          if (baseMethod.value != null) {
            message.value = "Method " + ((SNode) MapSequence.fromMap(_params).get("method")).getPresentation() + " overrides method from " + SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(baseMethod.value), "jetbrains.mps.baseLanguage.structure.Classifier"), "name") + ".\n";
            message.value += "Do you want to change signature of this method instead?";
          }
        }
      });

      final SNode methodToRefactor;
      if (baseMethod.value != null && Messages.showYesNoDialog(((Frame) MapSequence.fromMap(_params).get("frame")), message.value, "Warinig", null) == 0) {
        methodToRefactor = baseMethod.value;
      } else {
        methodToRefactor = ((SNode) MapSequence.fromMap(_params).get("method"));
      }

      ChangeMethodSignatureDialog dialog = new ChangeMethodSignatureDialog(ProjectHelper.toIdeaProject(((MPSProject) MapSequence.fromMap(_params).get("project"))), methodToRefactor, ((IOperationContext) MapSequence.fromMap(_params).get("context")));
      dialog.show();
      final List<ChangeMethodSignatureRefactoring> myRefactorings = dialog.getAllRefactorings();
      if (ListSequence.fromList(myRefactorings).isEmpty()) {
        return;
      }
      modelAccess.runReadInEDT(new Runnable() {
        public void run() {
          SNode node = ((SNode) ((SNode) MapSequence.fromMap(_params).get("method")));
          if (!(node.getModel() != null) || jetbrains.mps.util.SNodeOperations.isDisposed(((SNode) ((SNode) MapSequence.fromMap(_params).get("method"))))) {
            return;
          }
          SNode node1 = ((SNode) methodToRefactor);
          if (!(node1.getModel() != null) || jetbrains.mps.util.SNodeOperations.isDisposed(((SNode) methodToRefactor))) {
            return;
          }

          RefactoringAccess.getInstance().getRefactoringFacade().execute(RefactoringContext.createRefactoringContextByName("jetbrains.mps.baseLanguage.refactorings.ChangeMethodSignature", Arrays.asList("myRefactorings"), Arrays.asList(myRefactorings), methodToRefactor, ((MPSProject) MapSequence.fromMap(_params).get("project"))));
        }
      });
    } catch (Throwable t) {
      if (LOG.isEnabledFor(Priority.ERROR)) {
        LOG.error("User's action execute method failed. Action:" + "ChangeMethodSignature", t);
      }
    }
  }

  protected static Logger LOG = LogManager.getLogger(ChangeMethodSignature_Action.class);
}
