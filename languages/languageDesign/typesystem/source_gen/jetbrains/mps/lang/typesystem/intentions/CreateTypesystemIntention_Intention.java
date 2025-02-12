package jetbrains.mps.lang.typesystem.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.IntentionDescriptor;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class CreateTypesystemIntention_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public CreateTypesystemIntention_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.typesystem.structure.MessageStatement";
  }

  public String getPresentation() {
    return "CreateTypesystemIntention";
  }

  public String getPersistentStateKey() {
    return "jetbrains.mps.lang.typesystem.intentions.CreateTypesystemIntention_Intention";
  }

  public String getLanguageFqName() {
    return "jetbrains.mps.lang.typesystem";
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
    return ListSequence.fromList(SLinkOperations.getTargets(node, "helginsIntention", true)).isEmpty();
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895902b2(jetbrains.mps.lang.typesystem.intentions)", "3302086321380606109");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new CreateTypesystemIntention_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Create New QuickFix";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNode quickFixNode = _quotation_createNode_wv8vj7_a0a0a();

      SNode quickFixCall = _quotation_createNode_wv8vj7_a0c0a(quickFixNode);

      SModelOperations.addRootNode(SNodeOperations.getModel(node), quickFixNode);
      ListSequence.fromList(SLinkOperations.getTargets(node, "helginsIntention", true)).addElement(quickFixCall);
    }

    public IntentionDescriptor getDescriptor() {
      return CreateTypesystemIntention_Intention.this;
    }
  }

  private static SNode _quotation_createNode_wv8vj7_a0a0a() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypesystemQuickFix", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_1, "name", "fix_");
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.QuickFixExecuteBlock", null, null, GlobalScope.getInstance(), false);
    quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, null, GlobalScope.getInstance(), false);
    quotedNode_2.addChild("body", quotedNode_4);
    quotedNode_1.addChild("executeBlock", quotedNode_2);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.OriginalNodeId", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_3, "nodeId", "3302086321380616758");
    SNodeAccessUtil.setProperty(quotedNode_3, "modelId", "jetbrains.mps.lang.typesystem.intentions");
    quotedNode_1.addChild("smodelAttribute", quotedNode_3);
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_wv8vj7_a0c0a(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypesystemIntention", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "quickFix", (SNode) parameter_1);
    return quotedNode_2;
  }
}
