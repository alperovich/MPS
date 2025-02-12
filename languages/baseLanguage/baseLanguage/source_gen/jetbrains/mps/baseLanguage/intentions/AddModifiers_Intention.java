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
import jetbrains.mps.intentions.IntentionDescriptor;

public class AddModifiers_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public AddModifiers_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public String getPresentation() {
    return "AddModifiers";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.intentions.AddModifiers_Intention";
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
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902c6(jetbrains.mps.baseLanguage.intentions)", "3166734731684557381");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new AddModifiers_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Add Generic Modifiers";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNodeFactoryOperations.addNewChild(node, "modifiers", "jetbrains.mps.baseLanguage.structure.Modifier");
    }

    public IntentionDescriptor getDescriptor() {
      return AddModifiers_Intention.this;
    }
  }
}
