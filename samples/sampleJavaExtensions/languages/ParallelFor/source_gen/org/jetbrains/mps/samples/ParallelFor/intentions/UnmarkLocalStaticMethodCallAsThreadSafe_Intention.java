package org.jetbrains.mps.samples.ParallelFor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.intentions.IntentionDescriptor;

public class UnmarkLocalStaticMethodCallAsThreadSafe_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public UnmarkLocalStaticMethodCallAsThreadSafe_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.LocalMethodCall";
  }

  public String getPresentation() {
    return "UnmarkLocalStaticMethodCallAsThreadSafe";
  }

  public String getPersistentStateKey() {
    return "org.jetbrains.mps.samples.ParallelFor.intentions.UnmarkLocalStaticMethodCallAsThreadSafe_Intention";
  }

  public String getLanguageFqName() {
    return "org.jetbrains.mps.samples.ParallelFor";
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
    if (editorContext.getSelectedNode() != node && !(isVisibleInChild(node, editorContext.getSelectedNode(), editorContext))) {
      return false;
    }
    return true;
  }

  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"))) {
      return false;
    }
    return AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute("org.jetbrains.mps.samples.ParallelFor.structure.ThreadSafe")) != null;
  }

  private boolean isVisibleInChild(final SNode node, final SNode childNode, final EditorContext editorContext) {
    return SNodeOperations.getParent(childNode) == node;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:2614090b-4018-4457-8ad5-c503bc8936fb(org.jetbrains.mps.samples.ParallelFor.intentions)", "3540747636396569313");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new UnmarkLocalStaticMethodCallAsThreadSafe_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Unmark as Thread Safe";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute("org.jetbrains.mps.samples.ParallelFor.structure.ThreadSafe"), null);
    }

    public IntentionDescriptor getDescriptor() {
      return UnmarkLocalStaticMethodCallAsThreadSafe_Intention.this;
    }
  }
}
