package jetbrains.mps.lang.structure.intentions;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class AddDeprecatedAnnotation_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public AddDeprecatedAnnotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.structure.structure.IStructureDeprecatable";
  }

  public String getPresentation() {
    return "AddDeprecatedAnnotation";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.lang.structure.intentions.AddDeprecatedAnnotation_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.lang.structure";
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
    return new SNodePointer("r:e5a8b5c7-85b5-4d59-9e4e-850a142e2560(jetbrains.mps.lang.structure.intentions)", "1224245135252");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new AddDeprecatedAnnotation_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation")) == null)) {
        return "Add Deprecated Annotation";
      }
      return "Remove Deprecated Annotation";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      if ((AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation")) == null)) {
        SNode annotation = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation", null);
        AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation"), annotation);
      } else {
        SNodeOperations.detachNode(AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute("jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation")));
      }
    }

    public IntentionDescriptor getDescriptor() {
      return AddDeprecatedAnnotation_Intention.this;
    }
  }
}
