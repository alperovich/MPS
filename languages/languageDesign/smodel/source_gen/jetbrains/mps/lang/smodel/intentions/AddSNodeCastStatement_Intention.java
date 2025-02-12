package jetbrains.mps.lang.smodel.intentions;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.IntentionDescriptor;

public class AddSNodeCastStatement_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public AddSNodeCastStatement_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IfStatement";
  }

  public String getPresentation() {
    return "AddSNodeCastStatement";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.lang.smodel.intentions.AddSNodeCastStatement_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.lang.smodel";
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
    boolean isApplicable = false;
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "condition", true), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      SNode dotExpression = SNodeOperations.cast(SLinkOperations.getTarget(node, "condition", true), "jetbrains.mps.baseLanguage.structure.DotExpression");
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(dotExpression, "operation", true), "jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation")) {
        SNode iioo = SNodeOperations.cast(SLinkOperations.getTarget(dotExpression, "operation", true), "jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation");
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(iioo, "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.RefConcept_Reference")) {
          SNode rc = SNodeOperations.cast(SLinkOperations.getTarget(iioo, "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.RefConcept_Reference");
          isApplicable = (SLinkOperations.getTarget(rc, "conceptDeclaration", false) != null);
        }
      }
    }
    return isApplicable;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902ff(jetbrains.mps.lang.smodel.intentions)", "1193745200272");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new AddSNodeCastStatement_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Insert Cast Variable Declaration";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNode castVariable = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", null);
      SNode de = SNodeOperations.cast(SLinkOperations.getTarget(node, "condition", true), "jetbrains.mps.baseLanguage.structure.DotExpression");
      SNode conceptDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(de, "operation", true), "jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation"), "conceptArgument", true), "jetbrains.mps.lang.smodel.structure.RefConcept_Reference"), "conceptDeclaration", false);
      SNode declaration = SLinkOperations.getTarget(castVariable, "localVariableDeclaration", true);
      SLinkOperations.setTarget(SNodeFactoryOperations.setNewChild(declaration, "type", "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", conceptDeclaration, false);
      SPropertyOperations.set(declaration, "name", NameUtil.decapitalize(SPropertyOperations.getString(conceptDeclaration, "name")));
      SNode expression = SLinkOperations.getTarget(de, "operand", true);
      if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(expression), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
        SNode nodeTypeCastExpression = SNodeFactoryOperations.setNewChild(declaration, "initializer", "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression");
        SLinkOperations.setTarget(nodeTypeCastExpression, "concept", conceptDeclaration, false);
        SLinkOperations.setTarget(nodeTypeCastExpression, "leftExpression", SNodeOperations.copyNode(expression), true);
      } else {
        SNode castExpression = SNodeFactoryOperations.setNewChild(declaration, "initializer", "jetbrains.mps.baseLanguage.structure.CastExpression");
        SLinkOperations.setTarget(castExpression, "type", SNodeOperations.copyNode(SLinkOperations.getTarget(declaration, "type", true)), true);
        SLinkOperations.setTarget(castExpression, "expression", SNodeOperations.copyNode(expression), true);
      }
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "ifTrue", true), "statement", true)).insertElement(0, castVariable);
    }

    public IntentionDescriptor getDescriptor() {
      return AddSNodeCastStatement_Intention.this;
    }
  }
}
