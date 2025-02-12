package jetbrains.mps.lang.access.intentions;

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

public class SurroundWithExecuteLightweightCommandStatement_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public SurroundWithExecuteLightweightCommandStatement_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Statement";
  }

  public String getPresentation() {
    return "SurroundWithExecuteLightweightCommandStatement";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.lang.access.intentions.SurroundWithExecuteLightweightCommandStatement_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.lang.access";
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
    return new SNodePointer("r:4df57e9b-2a09-44c7-b16d-4af6620e3aaa(jetbrains.mps.lang.access.intentions)", "1616052750811363739");
  }

  public boolean isSurroundWith() {
    return true;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SurroundWithExecuteLightweightCommandStatement_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Read Action";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNode readActionStatement = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.access.structure.ExecuteLightweightCommandStatement", null);
      List<SNode> selectedNodes = editorContext.getSelectedNodes();
      SNodeOperations.insertNextSiblingChild(node, readActionStatement);
      for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
        ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(readActionStatement, "commandClosureLiteral", true), "body", true), "statement", true)).addElement(SNodeOperations.getAncestor(selectedNode, "jetbrains.mps.baseLanguage.structure.Statement", true, false));
      }
      editorContext.select(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(readActionStatement, "commandClosureLiteral", true), "body", true), "statement", true)).first());
    }

    public IntentionDescriptor getDescriptor() {
      return SurroundWithExecuteLightweightCommandStatement_Intention.this;
    }
  }
}
