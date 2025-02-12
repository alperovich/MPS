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
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class SplitStringIntoConcatenation_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public SplitStringIntoConcatenation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.StringLiteral";
  }

  public String getPresentation() {
    return "SplitStringIntoConcatenation";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.intentions.SplitStringIntoConcatenation_Intention";
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
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902c6(jetbrains.mps.baseLanguage.intentions)", "1195647385815");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SplitStringIntoConcatenation_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Split String into Concatenation";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      EditorCell_Label cell = ((EditorCell_Label) editorContext.getContextCell());
      int caretPosition = cell.getCaretPosition();
      String s1 = SPropertyOperations.getString(node, "value").substring(0, caretPosition);
      String s2 = SPropertyOperations.getString(node, "value").substring(caretPosition);
      SNode plusExpression = SNodeFactoryOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.PlusExpression");
      SPropertyOperations.set(SNodeFactoryOperations.setNewChild(plusExpression, "leftExpression", "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value", s1);
      SPropertyOperations.set(SNodeFactoryOperations.setNewChild(plusExpression, "rightExpression", "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value", s2);
    }

    public IntentionDescriptor getDescriptor() {
      return SplitStringIntoConcatenation_Intention.this;
    }
  }
}
