package jetbrains.mps.baseLanguage.collections.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.structure.ExtensionPoint;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.dependency.GlobalModuleDependenciesManager;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CustomContainersRegistry {
  /*package*/ static CustomContainersRegistry INSTANCE = new CustomContainersRegistry();
  private List<_FunctionTypes._return_P0_E0<? extends List<SNode>>> providers = ListSequence.fromList(new ArrayList<_FunctionTypes._return_P0_E0<? extends List<SNode>>>());

  private CustomContainersRegistry() {
    for (_FunctionTypes._return_P0_E0<? extends List<SNode>> provider : ExtensionPoint.<_FunctionTypes._return_P0_E0<? extends List<SNode>>>generify(new ExtensionPoint("jetbrains.mps.baseLanguage.collections.customContainers", _FunctionTypes._return_P0_E0.class)).getObjects()) {
      ListSequence.fromList(providers).addElement(provider);
    }
  }

  public List<SNode> allCustomContainerDeclarations() {
    Iterable<SNode> allCustomContainers = this.primAllCustomContainers();
    List<SNode> res = new ArrayList<SNode>();
    ListSequence.fromList(res).addSequence(Sequence.fromIterable(allCustomContainers).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode cc) {
        return SLinkOperations.getTargets(cc, "containerDeclaration", true);
      }
    }));
    return res;
  }

  public List<SNode> accessibleCustomContainerDeclarations(SModel fromModel) {
    List<SNode> res = new ArrayList<SNode>();
    SModule om = this.getOwningModule(fromModel);
    if (om != null) {
      final Iterable<SModule> allVisibleModules = new GlobalModuleDependenciesManager(om).getModules(GlobalModuleDependenciesManager.Deptype.VISIBLE);
      final Iterable<Language> allUsedLanguages = new GlobalModuleDependenciesManager(om).getUsedLanguages();
      Iterable<SNode> allCustomContainers = this.primAllCustomContainers();
      ListSequence.fromList(res).addSequence(Sequence.fromIterable(allCustomContainers).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode cc) {
          SModule owner = CustomContainersRegistry.this.getOwningModule(SNodeOperations.getModel(cc));
          return Sequence.fromIterable(allVisibleModules).contains(owner) || (owner instanceof Language && Sequence.fromIterable(allUsedLanguages).contains((Language) owner));
        }
      }).translate(new ITranslator2<SNode, SNode>() {
        public Iterable<SNode> translate(SNode cc) {
          return SLinkOperations.getTargets(cc, "containerDeclaration", true);
        }
      }));
    }
    return res;
  }

  public SModule getOwningModule(SModel model) {
    SModel fmdesc = model;
    return (fmdesc != null ?
      fmdesc.getModule() :
      null
    );
  }

  private Iterable<SNode> primAllCustomContainers() {
    List<_FunctionTypes._return_P0_E0<? extends List<SNode>>> providersCopy;
    synchronized (this) {
      providersCopy = ListSequence.fromListWithValues(new ArrayList<_FunctionTypes._return_P0_E0<? extends List<SNode>>>(), this.providers);
    }
    return ListSequence.fromList(providersCopy).translate(new ITranslator2<_FunctionTypes._return_P0_E0<? extends List<SNode>>, SNode>() {
      public Iterable<SNode> translate(_FunctionTypes._return_P0_E0<? extends List<SNode>> prov) {
        return prov.invoke();
      }
    });
  }
}
