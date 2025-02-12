package jetbrains.mps.build.mps.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.build.mps.util.VisibleModules;
import jetbrains.mps.build.mps.util.PathConverter;
import jetbrains.mps.build.behavior.BuildProject_Behavior;
import jetbrains.mps.build.util.Context;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.mps.util.ModuleChecker;
import jetbrains.mps.build.mps.util.ModuleLoader;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ModulesImport_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ModulesImport_NonTypesystemRule() {
  }

  public void applyRule(final SNode buildProject, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SNodeOperations.getModel(buildProject).getModule() instanceof TransientModelsModule || SModelStereotype.isGeneratorModel(SNodeOperations.getModel(buildProject)) || !(jetbrains.mps.util.SNodeOperations.isGeneratable(SNodeOperations.getModel(buildProject)))) {
      return;
    }

    VisibleModules visible = new VisibleModules(buildProject, null);
    visible.collect();

    PathConverter pathConverter = new PathConverter(buildProject);

    String workingDir = BuildProject_Behavior.call_getBasePath_4959435991187146924(buildProject, Context.defaultContext());
    if ((workingDir == null || workingDir.length() == 0)) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(buildProject, "working directory is unavailable", "r:473be7a1-ec10-4475-89b9-397d2558ecb0(jetbrains.mps.build.mps.typesystem)", "2531699772406302731", null, errorTarget);
      }
      return;
    }


    for (final SNode module : ListSequence.fromList(SNodeOperations.getDescendants(buildProject, "jetbrains.mps.build.mps.structure.BuildMps_AbstractModule", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "path", true) != null);
      }
    })) {
      final StringBuilder messages = new StringBuilder();
      ModuleChecker.Reporter reporter = new ModuleChecker.Reporter(null) {
        @Override
        public void report(String message, SNode node, Exception cause) {
          if (messages.length() > 0) {
            messages.append("\n");
          }
          messages.append(message);
        }
      };

      ModuleLoader.createModuleChecker(module, visible, pathConverter, null, reporter).check(ModuleChecker.CheckType.CHECK);
      if (messages.length() > 0) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(module, messages.toString(), "r:473be7a1-ec10-4475-89b9-397d2558ecb0(jetbrains.mps.build.mps.typesystem)", "2531699772406302922", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.build.mps.typesystem.ReloadRequired_QuickFix", false);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.build.structure.BuildProject";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
