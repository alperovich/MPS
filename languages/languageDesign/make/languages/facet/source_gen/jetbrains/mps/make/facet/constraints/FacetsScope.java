package jetbrains.mps.make.facet.constraints;

/*Generated by MPS */

import jetbrains.mps.lang.scopes.runtime.SimpleScope;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SModule;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.classloading.ClassLoaderManager;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;

public class FacetsScope extends SimpleScope {
  public FacetsScope(SNode contextNode) {
    super(getAvailableFacets(contextNode));
  }

  public static Iterable<SNode> getAvailableFacets(SNode contextNode) {
    SModule contextModule = contextNode.getModel().getModule();

    Set<SModule> contextModules = SetSequence.fromSet(new HashSet<SModule>());
    for (SModule module : Sequence.fromIterable(((AbstractModule) contextModule).getScope().getModules())) {
      if (ClassLoaderManager.getInstance().canLoad(module)) {
        SetSequence.fromSet(contextModules).addElement(module);
      }
    }
    SetSequence.fromSet(contextModules).addElement(contextModule);

    // collect models 
    Iterable<SModel> models = SetSequence.fromSet(contextModules).translate(new ITranslator2<SModule, SModel>() {
      public Iterable<SModel> translate(SModule it) {
        if (it instanceof Language) {
          return Sequence.<SModel>singleton(LanguageAspect.PLUGIN.get((Language) it));
        } else {
          return it.getModels();
        }
      }
    });

    // collect facets 
    Iterable<SNode> facets = Sequence.fromIterable(models).where(new IWhereFilter<SModel>() {
      public boolean accept(SModel it) {
        return it != null;
      }
    }).translate(new ITranslator2<SModel, SNode>() {
      public Iterable<SNode> translate(SModel it) {
        return (Iterable<SNode>) it.getRootNodes();
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.make.facet.structure.FacetDeclaration");
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SNodeOperations.cast(it, "jetbrains.mps.make.facet.structure.FacetDeclaration");
      }
    });

    return facets;
  }

  @Nullable
  @Override
  public String getReferenceText(@NotNull SNode target) {
    return BehaviorReflection.invokeVirtual(String.class, SNodeOperations.cast(target, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "virtual_getFqName_1213877404258", new Object[]{});
  }
}
