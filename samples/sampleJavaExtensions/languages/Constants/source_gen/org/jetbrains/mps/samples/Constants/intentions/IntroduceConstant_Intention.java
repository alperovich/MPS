package org.jetbrains.mps.samples.Constants.intentions;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class IntroduceConstant_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public IntroduceConstant_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Expression";
  }

  public String getPresentation() {
    return "IntroduceConstant";
  }

  public String getPersistentStateKey() {
    return "org.jetbrains.mps.samples.Constants.intentions.IntroduceConstant_Intention";
  }

  public String getLanguageFqName() {
    return "org.jetbrains.mps.samples.Constants";
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
    return SNodeOperations.getAncestor(node, "org.jetbrains.mps.samples.Constants.structure.Constant", false, false) != null;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:42e1ac37-7eb5-465e-8f7a-fef5bc98a099(org.jetbrains.mps.samples.Constants.intentions)", "3986994675334574125");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new IntroduceConstant_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Introduce Constant";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNode constant = SConceptOperations.createNewNode("org.jetbrains.mps.samples.Constants.structure.Constant", null);
      SNodeOperations.insertPrevSiblingChild(SNodeOperations.getAncestor(node, "org.jetbrains.mps.samples.Constants.structure.Constant", false, false), constant);
      SNode constantReference = SConceptOperations.createNewNode("org.jetbrains.mps.samples.Constants.structure.ConstantReference", null);
      SLinkOperations.setTarget(constantReference, "original", constant, false);
      SNodeOperations.replaceWithAnother(node, constantReference);
      SLinkOperations.setTarget(constant, "initializer", node, true);
      editorContext.selectWRTFocusPolicy(constant);
    }

    public IntentionDescriptor getDescriptor() {
      return IntroduceConstant_Intention.this;
    }
  }
}
