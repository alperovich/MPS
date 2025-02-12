package jetbrains.mps.lang.editor.intentions;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class UseIndentLayoutInRefNodeList_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public UseIndentLayoutInRefNodeList_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList";
  }

  public String getPresentation() {
    return "UseIndentLayoutInRefNodeList";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.lang.editor.intentions.UseIndentLayoutInRefNodeList_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.lang.editor";
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
    return new SNodePointer("r:00000000-0000-4000-0000-011c8959029b(jetbrains.mps.lang.editor.intentions)", "1237386846745");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new UseIndentLayoutInRefNodeList_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent"))) {
        return "Use Indent Layout";
      } else {
        return "Use Horizontal Layout";
      }
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent"))) {
        SNodeFactoryOperations.setNewChild(node, "cellLayout", "jetbrains.mps.lang.editor.structure.CellLayout_Indent");
      } else {
        SNodeFactoryOperations.setNewChild(node, "cellLayout", "jetbrains.mps.lang.editor.structure.CellLayout_Horizontal");
      }
    }

    public IntentionDescriptor getDescriptor() {
      return UseIndentLayoutInRefNodeList_Intention.this;
    }
  }
}
