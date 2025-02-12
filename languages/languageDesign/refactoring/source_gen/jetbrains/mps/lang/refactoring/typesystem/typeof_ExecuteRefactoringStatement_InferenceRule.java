package jetbrains.mps.lang.refactoring.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.ReferenceMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SReference;

public class typeof_ExecuteRefactoringStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ExecuteRefactoringStatement_InferenceRule() {
  }

  public void applyRule(final SNode statement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode target = SLinkOperations.getTarget(SLinkOperations.getTarget(statement, "refactoring", false), "target", true);
    if (SPropertyOperations.getBoolean(target, "allowMultiple") == false) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(statement, "target", true);
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983838", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983840", true), (SNode) typeCheckingContext.typeOf(target, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983845", true), false, true, _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(statement, "target", true);
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983854", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983856", true), (SNode) _quotation_createNode_yfen1i_a0a0a1a1(typeCheckingContext.typeOf(target, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983865", true)), false, true, _info_12389875345);
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(statement, "project", true);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983867", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983872", true), (SNode) _quotation_createNode_yfen1i_a0c0b(), false, true, _info_12389875345);
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(statement, "parameters", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(statement, "refactoring", false), "parameter", true)).count()) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        errorTarget = new ReferenceMessageTarget("parameters");
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(statement, "wrong number of parameters", "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983878", null, errorTarget);
      }
    }
    {
      Iterator<SNode> inputParameter_it = ListSequence.fromList(SLinkOperations.getTargets(statement, "parameters", true)).iterator();
      Iterator<SNode> declaredParameter_it = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(statement, "refactoring", false), "parameter", true)).iterator();
      SNode inputParameter_var;
      SNode declaredParameter_var;
      while (inputParameter_it.hasNext() && declaredParameter_it.hasNext()) {
        inputParameter_var = inputParameter_it.next();
        declaredParameter_var = declaredParameter_it.next();
        {
          SNode _nodeToCheck_1029348928467 = inputParameter_var;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983908", 0, null);
          typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983910", true), (SNode) typeCheckingContext.typeOf(declaredParameter_var, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983913", true), false, true, _info_12389875345);
        }
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = statement;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983915", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "2298239814950983917", true), (SNode) _quotation_createNode_yfen1i_a0f0b(), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.refactoring.structure.ExecuteRefactoringStatement";
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

  private static SNode _quotation_createNode_yfen1i_a0a0a1a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = (SNode) parameter_1;
    if (quotedNode_3 != null) {
      quotedNode_2.addChild("elementType", HUtil.copyIfNecessary(quotedNode_3));
    }
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_yfen1i_a0c0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.project(MPS.Core/jetbrains.mps.project@java_stub)"), facade.createNodeId("~Project")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_yfen1i_a0f0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, null, GlobalScope.getInstance(), false);
    return quotedNode_1;
  }
}
