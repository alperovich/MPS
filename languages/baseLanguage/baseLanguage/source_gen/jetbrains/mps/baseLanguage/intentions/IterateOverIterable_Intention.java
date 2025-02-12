package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.intentions.IntentionDescriptor;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;
import jetbrains.mps.util.IterableUtil;

public class IterateOverIterable_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public IterateOverIterable_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ExpressionStatement";
  }

  public String getPresentation() {
    return "IterateOverIterable";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.intentions.IterateOverIterable_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.baseLanguage";
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
    return (TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "expression", true)), new IterateOverIterable_Intention.Pattern_w1n2qe_a1a0a0a0j(), true) != null);
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902c6(jetbrains.mps.baseLanguage.intentions)", "1238764345596");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new IterateOverIterable_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Iterate over Iterable";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      {
        GeneratedMatchingPattern pattern_6isygg_a0a = new IterateOverIterable_Intention.Pattern_w1n2qe_a0a0a0a2n();
        SNode coercedNode_6isygg_a0a = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "expression", true)), pattern_6isygg_a0a);
        if (coercedNode_6isygg_a0a != null) {
          SNode foreachStatement = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ForeachStatement", null);
          SNode variableDeclaration = SNodeFactoryOperations.setNewChild(foreachStatement, "variable", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
          SLinkOperations.setTarget(variableDeclaration, "type", SNodeOperations.copyNode(((SNode) pattern_6isygg_a0a.getFieldValue("patternVar_elem"))), true);
          SPropertyOperations.set(variableDeclaration, "name", NameUtil.toValidIdentifier(BehaviorReflection.invokeVirtual(String.class, ((SNode) pattern_6isygg_a0a.getFieldValue("patternVar_elem")), "virtual_getPresentation_1213877396640", new Object[]{})));
          SLinkOperations.setTarget(foreachStatement, "iterable", SNodeOperations.copyNode(SLinkOperations.getTarget(node, "expression", true)), true);
          SNodeOperations.insertNextSiblingChild(node, foreachStatement);
          SNodeOperations.deleteNode(node);
        } else {
        }
      }
    }

    public IntentionDescriptor getDescriptor() {
      return IterateOverIterable_Intention.this;
    }
  }

  public static class Pattern_w1n2qe_a1a0a0a0j extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_elem;

    public Pattern_w1n2qe_a1a0a0a0j() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_IterateOverIterable_6isygg_a0a0a0a0;
        nodeToMatch_IterateOverIterable_6isygg_a0a0a0a0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_IterateOverIterable_6isygg_a0a0a0a0.getConcept().getQualifiedName()))) {
          return false;
        }
        {
          SNodeReference pointer = SNODE_POINTER_w1n2qe_a0a0a0a0b0c0a0a0b0a0a0a9;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_IterateOverIterable_6isygg_a0a0a0a0.getReferenceTarget("classifier")))) {
            return false;
          }
        }
        {
          String childRole_IterateOverIterable_6isygg__0 = "parameter";
          if (!(PatternUtil.hasNChildren(nodeToMatch_IterateOverIterable_6isygg_a0a0a0a0, childRole_IterateOverIterable_6isygg__0, 1))) {
            return false;
          }
          {
            SNode childVar_IterateOverIterable_6isygg_a0a0a0a0a = IterableUtil.get(nodeToMatch_IterateOverIterable_6isygg_a0a0a0a0.getChildren(childRole_IterateOverIterable_6isygg__0), 0);
            this.patternVar_elem = childVar_IterateOverIterable_6isygg_a0a0a0a0a;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_elem = (SNode) pattern.getFieldValue("patternVar_elem");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_elem".equals(fieldName)) {
        return patternVar_elem;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }

  public static class Pattern_w1n2qe_a0a0a0a2n extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_elem;

    public Pattern_w1n2qe_a0a0a0a2n() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_IterateOverIterable_6isygg_a0a0a0;
        nodeToMatch_IterateOverIterable_6isygg_a0a0a0 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_IterateOverIterable_6isygg_a0a0a0.getConcept().getQualifiedName()))) {
          return false;
        }
        {
          SNodeReference pointer = SNODE_POINTER_w1n2qe_a0a0a0a0b0c0a0a0a0a0a0c31;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_IterateOverIterable_6isygg_a0a0a0.getReferenceTarget("classifier")))) {
            return false;
          }
        }
        {
          String childRole_IterateOverIterable_6isygg_ = "parameter";
          if (!(PatternUtil.hasNChildren(nodeToMatch_IterateOverIterable_6isygg_a0a0a0, childRole_IterateOverIterable_6isygg_, 1))) {
            return false;
          }
          {
            SNode childVar_IterateOverIterable_6isygg_a0a0a0a = IterableUtil.get(nodeToMatch_IterateOverIterable_6isygg_a0a0a0.getChildren(childRole_IterateOverIterable_6isygg_), 0);
            this.patternVar_elem = childVar_IterateOverIterable_6isygg_a0a0a0a;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_elem = (SNode) pattern.getFieldValue("patternVar_elem");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_elem".equals(fieldName)) {
        return patternVar_elem;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }

  private static SNodePointer SNODE_POINTER_w1n2qe_a0a0a0a0b0c0a0a0b0a0a0a9 = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Iterable");
  private static SNodePointer SNODE_POINTER_w1n2qe_a0a0a0a0b0c0a0a0a0a0a0c31 = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Iterable");
}
