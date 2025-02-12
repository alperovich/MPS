package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class SurroundWithSynchronized_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public SurroundWithSynchronized_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Statement";
  }

  public String getPresentation() {
    return "SurroundWithSynchronized";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.intentions.SurroundWithSynchronized_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.baseLanguage";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902c6(jetbrains.mps.baseLanguage.intentions)", "3366354716707929843");
  }

  public boolean isSurroundWith() {
    return true;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SurroundWithSynchronized_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Synchronized";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNode synchronizedStatement = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.SynchronizedStatement", null);
      List<SNode> selectedNodes = editorContext.getSelectedNodes();
      SNodeOperations.insertNextSiblingChild(node, synchronizedStatement);
      for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
        ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(synchronizedStatement, "block", true), "statement", true)).addElement(SNodeOperations.getAncestor(selectedNode, "jetbrains.mps.baseLanguage.structure.Statement", true, false));
      }
      editorContext.select(SLinkOperations.getTarget(synchronizedStatement, "expression", true));
    }

    public IntentionDescriptor getDescriptor() {
      return SurroundWithSynchronized_Intention.this;
    }
  }
}
