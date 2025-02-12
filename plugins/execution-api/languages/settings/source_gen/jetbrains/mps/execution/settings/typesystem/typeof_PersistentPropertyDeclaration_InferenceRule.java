package jetbrains.mps.execution.settings.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_PersistentPropertyDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_PersistentPropertyDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode persistentPropertyDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode primitive = SLinkOperations.getTarget(_quotation_createNode_sacma3_a0a0a1(), "descriptor", false);
    {
      SNode _nodeToCheck_1029348928467 = persistentPropertyDeclaration;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "6981317760235477761", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) SLinkOperations.getTarget(persistentPropertyDeclaration, "type", true), (SNode) _quotation_createNode_sacma3_a0b0b(primitive), false, true, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.execution.settings.structure.PersistentPropertyDeclaration";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  private static SNode _quotation_createNode_sacma3_a0a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeRef", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("descriptor", SReference.create("descriptor", quotedNode_1, facade.createModelReference("r:00000000-0000-4000-0000-011c895902de(jetbrains.mps.baseLanguage.blTypes.primitiveDescriptors)"), facade.createNodeId("1196683941620")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_sacma3_a0b0b(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    SNode quotedNode_6 = null;
    SNode quotedNode_7 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3.setReference("classifier", SReference.create("classifier", quotedNode_3, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Cloneable")));
    quotedNode_2.addChild("argument", quotedNode_3);
    quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_4.setReference("classifier", SReference.create("classifier", quotedNode_4, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Enum")));
    quotedNode_2.addChild("argument", quotedNode_4);
    quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_5.setReference("classifier", SReference.create("classifier", quotedNode_5, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~String")));
    quotedNode_2.addChild("argument", quotedNode_5);
    quotedNode_6 = (SNode) parameter_1;
    if (quotedNode_6 != null) {
      quotedNode_2.addChild("argument", HUtil.copyIfNecessary(quotedNode_6));
    }
    quotedNode_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType", null, null, GlobalScope.getInstance(), false);
    quotedNode_2.addChild("argument", quotedNode_7);
    return quotedNode_2;
  }
}
