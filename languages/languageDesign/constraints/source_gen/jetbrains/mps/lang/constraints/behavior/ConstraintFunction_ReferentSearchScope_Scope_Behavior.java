package jetbrains.mps.lang.constraints.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class ConstraintFunction_ReferentSearchScope_Scope_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    return _quotation_createNode_ipbcnm_a0a0();
  }

  private static SNode _quotation_createNode_ipbcnm_a0a0() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("r:314576fc-3aee-4386-a0a5-a38348ac317d(jetbrains.mps.scope)"), facade.createNodeId("3734116213129862372")));
    return quotedNode_1;
  }
}
