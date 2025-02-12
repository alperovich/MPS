package jetbrains.mps.build.mps.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.build.util.DependenciesHelper;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModuleFinder {
  public static Iterable<SNode> findModules(Iterable<SNode> modules, final TemplateQueryContext genContext, final SNode node) {
    final SNode project = SNodeOperations.cast(SNodeOperations.getContainingRoot(node), "jetbrains.mps.build.structure.BuildProject");
    if (project == null) {
      genContext.showErrorMessage(node, "no context project defined");
      return ListSequence.fromList(new ArrayList<SNode>());
    }

    final DependenciesHelper helper = new DependenciesHelper(genContext, project);
    return Sequence.fromIterable(modules).select(new ISelector<SNode, String>() {
      public String select(SNode module) {
        SNode mpsModule = SNodeOperations.as(DependenciesHelper.getOriginalNode(module, genContext), "jetbrains.mps.build.mps.structure.BuildMps_AbstractModule");
        SNode layoutNode = helper.artifacts().get(mpsModule);
        if (layoutNode == null && SNodeOperations.isInstanceOf(mpsModule, "jetbrains.mps.build.mps.structure.BuildMps_DevKit")) {
          layoutNode = helper.artifacts().get(SLinkOperations.getTarget(SNodeOperations.cast(mpsModule, "jetbrains.mps.build.mps.structure.BuildMps_DevKit"), "path", true));
        }

        if (layoutNode == null) {
          genContext.showErrorMessage(node, "mps module " + SPropertyOperations.getString(module, "name") + " was not found in the layout of `" + SPropertyOperations.getString(project, "name") + "'");
          return null;
        }
        String val = BehaviorReflection.invokeVirtual(String.class, layoutNode, "virtual_location_7117056644539862594", new Object[]{helper, mpsModule});
        if (val == null) {
          genContext.showErrorMessage(node, "no location for module" + SPropertyOperations.getString(mpsModule, "name"));
          return null;
        }
        return val;
      }
    }).where(new IWhereFilter<String>() {
      public boolean accept(String it) {
        return it != null;
      }
    }).sort(new ISelector<String, String>() {
      public String select(String it) {
        return it;
      }
    }, true).distinct().select(new ISelector<String, SNode>() {
      public SNode select(String it) {
        return createGeneratorInternal_String_8pqt49_a0a0a0e0a(it);
      }
    });
  }

  private static SNode createGeneratorInternal_String_8pqt49_a0a0a0e0a(Object p0) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.mps.structure.GeneratorInternal_String", null, GlobalScope.getInstance(), false);
    n1.setProperty("path", (String) p0);
    return n1;
  }
}
