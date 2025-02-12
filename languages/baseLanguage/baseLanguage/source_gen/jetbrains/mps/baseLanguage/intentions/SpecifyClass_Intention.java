package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.IntentionDescriptor;

public class SpecifyClass_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public SpecifyClass_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.LocalMethodCall";
  }

  public String getPresentation() {
    return "SpecifyClass";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.intentions.SpecifyClass_Intention";
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
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902c6(jetbrains.mps.baseLanguage.intentions)", "1230290102486");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SpecifyClass_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Specify Class";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNode method = SNodeOperations.cast(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
      SNode classConcept = SNodeOperations.cast(SNodeOperations.getParent(method), "jetbrains.mps.baseLanguage.structure.ClassConcept");
      SNode smc = SNodeOperations.replaceWithAnother(node, SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null));
      SLinkOperations.setTarget(smc, "classConcept", classConcept, false);
      SLinkOperations.setTarget(smc, "baseMethodDeclaration", method, false);
      List<SNode> args = SLinkOperations.getTargets(node, "actualArgument", true);
      for (SNode arg : args) {
        ListSequence.fromList(SLinkOperations.getTargets(smc, "actualArgument", true)).addElement(SNodeOperations.detachNode(arg));
      }
      editorContext.selectWRTFocusPolicy(smc);
    }

    public IntentionDescriptor getDescriptor() {
      return SpecifyClass_Intention.this;
    }
  }
}
