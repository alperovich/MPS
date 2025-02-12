package jetbrains.mps.lang.script.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class check_FactoryMigrationScriptPath_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_FactoryMigrationScriptPath_NonTypesystemRule() {
  }

  public void applyRule(final SNode part, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode returnType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(part, "factoryMethod", true));
    if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(returnType, _quotation_createNode_5hdosv_b0a0b0b()))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(part, "Factory method should return subtype of Iterable<AbstractMigrationRefactoring> (now \"" + BehaviorReflection.invokeVirtual(String.class, returnType, "virtual_getPresentation_1213877396640", new Object[]{}) + "\")", "r:00000000-0000-4000-0000-011c89590320(jetbrains.mps.lang.script.typesystem)", "2598676492883176352", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.script.structure.FactoryMigrationScriptPart";
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

  private static SNode _quotation_createNode_5hdosv_b0a0b0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Iterable")));
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_2.setReference("classifier", SReference.create("classifier", quotedNode_2, facade.createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.lang.script.runtime(MPS.Core/jetbrains.mps.lang.script.runtime@java_stub)"), facade.createNodeId("~AbstractMigrationRefactoring")));
    quotedNode_1.addChild("parameter", quotedNode_2);
    return quotedNode_1;
  }
}
