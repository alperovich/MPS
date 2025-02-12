package jetbrains.mps.baseLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.datatransfer.PastePostProcessor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BL_CopyPasteHandlers_PastePostProcessor_0 implements PastePostProcessor {
  public SNode getApplicableConcept() {
    return SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference");
  }

  public void postProcesNode(SNode pastedNode) {
    // todo: not working for IVariableReference. Unify and fix it. 
    if (Scope.parent(pastedNode) != null) {
      if (Scope.getScope(Scope.parent(pastedNode), pastedNode, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.VariableDeclaration")).contains(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), pastedNode, "virtual_getVariable_1023687332192481693", new Object[]{}))) {
        SNode variableReference = SNodeFactoryOperations.replaceWithNewChild(pastedNode, "jetbrains.mps.baseLanguage.structure.VariableReference");
        SLinkOperations.setTarget(variableReference, "variableDeclaration", SNodeOperations.cast(BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), pastedNode, "virtual_getVariable_1023687332192481693", new Object[]{}), "jetbrains.mps.baseLanguage.structure.VariableDeclaration"), false);
      }
    }
  }
}
