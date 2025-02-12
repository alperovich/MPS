package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class SurroundWithNegation_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public SurroundWithNegation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Expression";
  }

  public String getPresentation() {
    return "SurroundWithNegation";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.intentions.SurroundWithNegation_Intention";
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
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(node), "jetbrains.mps.baseLanguage.structure.BooleanType");
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902c6(jetbrains.mps.baseLanguage.intentions)", "418779379562176548");
  }

  public boolean isSurroundWith() {
    return true;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SurroundWithNegation_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "!(expr)";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNodeFactoryOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.NotExpression");
    }

    public IntentionDescriptor getDescriptor() {
      return SurroundWithNegation_Intention.this;
    }
  }
}
