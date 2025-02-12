package jetbrains.mps.lang.textGen.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class SetWithIndent_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public SetWithIndent_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.textGen.structure.AbstractAppendPart";
  }

  public String getPresentation() {
    return "SetWithIndent";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.lang.textGen.intentions.SetWithIndent_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.lang.textGen";
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
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.textGen.structure.NodeAppendPart");
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:7651b6e0-753b-4bcf-af83-d3dfc31e29e7(jetbrains.mps.lang.textGen.intentions)", "1236698667104");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SetWithIndent_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Append " + (BehaviorReflection.invokeVirtual(Boolean.TYPE, node, "virtual_withIndent_1237466287046", new Object[]{}) ?
        "without" :
        "with"
      ) + " Indent";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      boolean indent = BehaviorReflection.invokeVirtual(Boolean.TYPE, node, "virtual_withIndent_1237466287046", new Object[]{});
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart")) {
        SPropertyOperations.set(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart"), "withIndent", "" + (!(indent)));
      } else {
        SPropertyOperations.set(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.NodeAppendPart"), "withIndent", "" + (!(indent)));
      }
    }

    public IntentionDescriptor getDescriptor() {
      return SetWithIndent_Intention.this;
    }
  }
}
