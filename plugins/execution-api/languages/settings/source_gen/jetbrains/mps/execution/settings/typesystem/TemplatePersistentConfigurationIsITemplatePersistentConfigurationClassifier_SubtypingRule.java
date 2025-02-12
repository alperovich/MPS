package jetbrains.mps.execution.settings.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class TemplatePersistentConfigurationIsITemplatePersistentConfigurationClassifier_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public TemplatePersistentConfigurationIsITemplatePersistentConfigurationClassifier_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode templatePersistentConfigurationType, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return _quotation_createNode_ov7vps_a0a1();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean isWeak() {
    return false;
  }

  private static SNode _quotation_createNode_ov7vps_a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("r:76273c4a-4818-4f7c-8673-bfc2aeb6debb(jetbrains.mps.execution.api.settings)"), facade.createNodeId("3908032508224771790")));
    return quotedNode_1;
  }
}
