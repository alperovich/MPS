package jetbrains.mps.baseLanguage.collections.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class add_copy_from_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public add_copy_from_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator";
  }

  public String getPresentation() {
    return "add_copy_from";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.collections.intentions.add_copy_from_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.baseLanguage.collections";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return BehaviorReflection.invokeVirtual(Boolean.TYPE, node, "virtual_canHaveParameter_2261417478150191157", new Object[]{}) && ListSequence.fromList(SLinkOperations.getTargets(node, "initValue", true)).isEmpty() && (SLinkOperations.getTarget(node, "copyFrom", true) == null);
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c8959032c(jetbrains.mps.baseLanguage.collections.intentions)", "1237739246401");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new add_copy_from_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Specify Sequence to Copy From";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNodeFactoryOperations.setNewChild(node, "copyFrom", "jetbrains.mps.baseLanguage.structure.Expression");
    }

    public IntentionDescriptor getDescriptor() {
      return add_copy_from_Intention.this;
    }
  }
}
