package jetbrains.mps.build.mps.typesystem;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.build.mps.util.MPSModulesClosure;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class IdeaPluginDependenciesHelper {
  private SNode plugin;
  private Set<SNode> visible;

  public IdeaPluginDependenciesHelper(SNode plugin) {
    this.plugin = plugin;
  }

  private void buildVisible() {
    visible = new HashSet<SNode>();
    Set<SNode> seenPlugins = new HashSet<SNode>();
    collectVisible(plugin, seenPlugins);
  }

  private void collectVisible(SNode plugin, Set<SNode> seen) {
    if (!(seen.add(plugin))) {
      return;
    }

    visible.addAll(ListSequence.fromList(SLinkOperations.getTargets(plugin, "content", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.mps.structure.BuildMps_IdeaPluginModule");
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.build.mps.structure.BuildMps_IdeaPluginModule"), "target", false);
      }
    }).toListSequence());
    visible.addAll(ListSequence.fromList(SLinkOperations.getTargets(plugin, "content", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.mps.structure.BuildMps_IdeaPluginGroup");
      }
    }).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.build.mps.structure.BuildMps_IdeaPluginGroup"), "group", false), "modules", true);
      }
    }).toListSequence());
    for (SNode dep : ListSequence.fromList(SLinkOperations.getTargets(plugin, "dependencies", true))) {
      collectVisible(SLinkOperations.getTarget(dep, "target", false), seen);
    }
  }

  public Iterable<SNode> getUnsatisfiedDependencies(SNode module) {
    if (visible == null) {
      buildVisible();
    }
    if (SNodeOperations.isInstanceOf(module, "jetbrains.mps.build.mps.structure.BuildMps_Module")) {
      MPSModulesClosure runtimeDependencies = new MPSModulesClosure(null, SNodeOperations.cast(module, "jetbrains.mps.build.mps.structure.BuildMps_Module")).runtimeClosure();
      Iterable<SNode> seq = Sequence.fromIterable(runtimeDependencies.getAllModules()).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return !(visible.contains(it));
        }
      });
      return seq;
    }
    return Sequence.fromIterable(Collections.<SNode>emptyList());
  }

  public void printUnsatisfiedDependencies(StringBuilder sb, SNode module, boolean includeModuleName) {
    for (SNode uns : getUnsatisfiedDependencies(module)) {
      if (includeModuleName) {
        sb.append("unsatisfied dependency: module " + SPropertyOperations.getString(module, "name") + " requires " + SPropertyOperations.getString(uns, "name"));
      } else {
        sb.append("unsatisfied dependency on " + SPropertyOperations.getString(uns, "name"));
      }
      sb.append('\n');
    }
  }
}
