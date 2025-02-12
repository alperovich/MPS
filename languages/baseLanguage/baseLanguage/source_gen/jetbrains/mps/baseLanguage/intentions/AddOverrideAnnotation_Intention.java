package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.util.OverridingMethodsFinder;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.intentions.IntentionDescriptor;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class AddOverrideAnnotation_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public AddOverrideAnnotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration";
  }

  public String getPresentation() {
    return "AddOverrideAnnotation";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.baseLanguage.intentions.AddOverrideAnnotation_Intention";
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
    SNode classConcept = SNodeOperations.as(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    if (classConcept == null) {
      return false;
    }
    if (!(OverridingMethodsFinder.canOverride(node)) || ListSequence.fromList(SLinkOperations.getTargets(node, "annotation", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return "java.lang.Override".equals(BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(it, "annotation", false), "virtual_getFqName_1213877404258", new Object[]{}));
      }
    })) {
      return false;
    }
    OverridingMethodsFinder finder = new OverridingMethodsFinder(classConcept, Sequence.<SNode>singleton(node));
    return SetSequence.fromSet(finder.getOverridingMethods()).isNotEmpty();
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902c6(jetbrains.mps.baseLanguage.intentions)", "1645752949779063112");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new AddOverrideAnnotation_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Add @Override annotation";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNode classConcept = SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ClassConcept");
      OverridingMethodsFinder finder = new OverridingMethodsFinder(classConcept, Sequence.<SNode>singleton(node));
      for (SNode meth : SetSequence.fromSet(finder.getOverridingMethods())) {
        ListSequence.fromList(SLinkOperations.getTargets(meth, "annotation", true)).addElement(createAnnotationInstance_4i19oe_a0a0a2a0());
      }

    }

    public IntentionDescriptor getDescriptor() {
      return AddOverrideAnnotation_Intention.this;
    }
  }

  private static SNode createAnnotationInstance_4i19oe_a0a0a2a0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnnotationInstance", null, GlobalScope.getInstance(), false);
    n1.setReference("annotation", SReference.create("annotation", n1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Override")));
    return n1;
  }
}
