package jetbrains.mps.build.mps.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.build.mps.util.VisibleModules;
import jetbrains.mps.build.mps.util.PathConverter;
import java.util.Iterator;
import jetbrains.mps.build.mps.util.ModuleLoader;
import jetbrains.mps.build.mps.util.ModuleChecker;
import jetbrains.mps.build.mps.util.ModuleLoaderException;
import org.apache.log4j.Priority;
import jetbrains.mps.intentions.IntentionDescriptor;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class ReloadModulesFromDisk_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public ReloadModulesFromDisk_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.build.structure.BuildProject";
  }

  public String getPresentation() {
    return "ReloadModulesFromDisk";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.build.mps.intentions.ReloadModulesFromDisk_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.build.mps";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.build.mps.structure.BuildMps_AbstractModule", false, new String[]{})).isNotEmpty();
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:e8fca550-89ba-41bb-ae28-dc9cae640a8a(jetbrains.mps.build.mps.intentions)", "1753793013241722025");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new ReloadModulesFromDisk_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Reload modules from disk";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      VisibleModules visible = new VisibleModules(node, null);
      visible.collect();

      PathConverter pathConverter = new PathConverter(node);

      {
        Iterator<SNode> module_it = ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.build.mps.structure.BuildMps_AbstractModule", false, new String[]{})).iterator();
        SNode module_var;
        while (module_it.hasNext()) {
          module_var = module_it.next();
          if (SNodeOperations.isInstanceOf(module_var, "jetbrains.mps.build.mps.structure.BuildMps_Generator")) {
            continue;
          }
          try {
            ModuleLoader.createModuleChecker(module_var, visible, pathConverter).check(ModuleChecker.CheckType.LOAD_IMPORTANT_PART);
          } catch (ModuleLoaderException ex) {
            if (LOG.isEnabledFor(Priority.ERROR)) {
              LOG.error(ex.getMessage(), ex);
            }
            // TODO report? 
          }
        }
      }
    }

    public IntentionDescriptor getDescriptor() {
      return ReloadModulesFromDisk_Intention.this;
    }
  }

  protected static Logger LOG = LogManager.getLogger(ReloadModulesFromDisk_Intention.class);
}
