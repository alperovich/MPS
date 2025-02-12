package jetbrains.mps.testbench.suite.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import org.jetbrains.mps.openapi.module.SModuleReference;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.AbstractModule;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ModuleSuite_Behavior {
  public static void init(SNode thisNode) {
  }

  public static IScope call_scope_1280144168199518341(SNode thisNode) {
    SModuleReference moduleReference = BehaviorReflection.invokeVirtual(SModuleReference.class, SLinkOperations.getTarget(thisNode, "moduleRef", true), "virtual_moduleReference_1280144168199513544", new Object[]{});
    if (moduleReference == null) {
      return null;
    }

    SModule module = MPSModuleRepository.getInstance().getModule(moduleReference);
    if (module == null) {
      return null;
    }

    return ((AbstractModule) module).getScope();
  }

  public static Iterable<SModel> call_models_1280144168199531863(SNode thisNode) {
    SModuleReference moduleReference = BehaviorReflection.invokeVirtual(SModuleReference.class, SLinkOperations.getTarget(thisNode, "moduleRef", true), "virtual_moduleReference_1280144168199513544", new Object[]{});
    if (moduleReference == null) {
      return null;
    }

    SModule module = MPSModuleRepository.getInstance().getModule(moduleReference);
    if (module == null) {
      return null;
    }

    return module.getModels();
  }

  public static Iterable<SNode> call_getNotMutedTests_8605005254686521789(SNode thisNode) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "testRef", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(SPropertyOperations.getBoolean(it, "muted"));
      }
    });
  }
}
