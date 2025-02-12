package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class MoveStaticMethodRefactoring extends BasicMoveRefactoring {
  public MoveStaticMethodRefactoring(SNode moving, SNode destination) {
    super(moving, destination);
  }

  private void replaceFields() {
    SNode classNode = SNodeOperations.getAncestor(this.myMoving, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    for (SNode field : ListSequence.fromList(SNodeOperations.getDescendants(this.myMoving, "jetbrains.mps.baseLanguage.structure.VariableReference", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
      }
    })) {
      SNodeOperations.replaceWithAnother(field, _quotation_createNode_f5lqsg_a0a0a1a1(classNode, SLinkOperations.getTarget(field, "variableDeclaration", false)));
    }
  }

  private void replaceMethods() {
    SNode classNode = SNodeOperations.getAncestor(this.myMoving, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    for (SNode call : ListSequence.fromList(SNodeOperations.getDescendants(this.myMoving, "jetbrains.mps.baseLanguage.structure.LocalMethodCall", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it, "baseMethodDeclaration", false), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
      }
    }).toListSequence()) {
      if (SLinkOperations.getTarget(call, "baseMethodDeclaration", false) != this.myMoving) {
        SNode newCall = _quotation_createNode_f5lqsg_a0a0a0b0c(classNode, SLinkOperations.getTarget(call, "baseMethodDeclaration", false));
        ListSequence.fromList(SLinkOperations.getTargets(newCall, "actualArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(call, "actualArgument", true)));
        ListSequence.fromList(SLinkOperations.getTargets(newCall, "typeArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(call, "typeArgument", true)));
        SNodeOperations.replaceWithAnother(call, newCall);
      }
    }
  }

  @Override
  protected void correctMoving() {
    this.replaceFields();
    this.replaceMethods();
  }

  @Override
  public void replaceSingleUsage(SNode usage) {
    super.replaceSingleUsage(usage);
    if (SNodeOperations.isInstanceOf(usage, "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
      SNode newCall;
      if (SNodeOperations.getAncestor(usage, "jetbrains.mps.baseLanguage.structure.Classifier", false, false) == this.myDestination) {
        newCall = _quotation_createNode_f5lqsg_a0a0b0b0e(this.myReplacing);
      } else {
        newCall = _quotation_createNode_f5lqsg_a0a0a1a1a4(this.myDestination, this.myReplacing);
      }
      ListSequence.fromList(SLinkOperations.getTargets(newCall, "actualArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(usage, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "actualArgument", true)));
      ListSequence.fromList(SLinkOperations.getTargets(newCall, "typeArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(usage, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "typeArgument", true)));
      SNodeOperations.replaceWithAnother(usage, newCall);
    }
  }

  private static SNode _quotation_createNode_f5lqsg_a0a0a1a1(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "classifier", (SNode) parameter_1);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "variableDeclaration", (SNode) parameter_2);
    return quotedNode_3;
  }

  private static SNode _quotation_createNode_f5lqsg_a0a0a0b0c(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "baseMethodDeclaration", (SNode) parameter_2);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "classConcept", (SNode) parameter_1);
    return quotedNode_3;
  }

  private static SNode _quotation_createNode_f5lqsg_a0a0b0b0e(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalMethodCall", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, "baseMethodDeclaration", (SNode) parameter_1);
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_f5lqsg_a0a0a1a1a4(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "baseMethodDeclaration", (SNode) parameter_2);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "classConcept", (SNode) parameter_1);
    return quotedNode_3;
  }
}
