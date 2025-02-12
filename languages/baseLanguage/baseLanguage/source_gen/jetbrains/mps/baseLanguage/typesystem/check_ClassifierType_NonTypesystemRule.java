package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.Iterator;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class check_ClassifierType_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_ClassifierType_NonTypesystemRule() {
  }

  public void applyRule(final SNode classifierType, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode classifier = SLinkOperations.getTarget(classifierType, "classifier", false);
    if (!(ListSequence.fromList(SLinkOperations.getTargets(classifierType, "parameter", true)).isEmpty() || (int) ListSequence.fromList(SLinkOperations.getTargets(classifierType, "parameter", true)).count() == (int) ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).count())) {
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(classifierType, "wrong number of type parameters", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1195494591081", null, errorTarget);
    }
    Map<SNode, SNode> typeParamsToArgs = MapSequence.fromMap(new HashMap<SNode, SNode>());
    {
      SNode typeParameter;
      SNode typeVar;
      Iterator<SNode> typeParameter_iterator = ListSequence.fromList(SLinkOperations.getTargets(classifierType, "parameter", true)).iterator();
      Iterator<SNode> typeVar_iterator = ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).iterator();
      while (true) {
        if (!(typeParameter_iterator.hasNext())) {
          break;
        }
        if (!(typeVar_iterator.hasNext())) {
          break;
        }
        typeParameter = typeParameter_iterator.next();
        typeVar = typeVar_iterator.next();
        MapSequence.fromMap(typeParamsToArgs).put(typeVar, typeParameter);
      }
    }
    for (SNode typeParameter : SLinkOperations.getTargets(classifierType, "parameter", true)) {
      if (!(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(typeParameter, SLinkOperations.getTarget(_quotation_createNode_i2c76q_a1a0a0a4a1(), "descriptor", false), false)))) {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(typeParameter, "primitive types not allowed", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1195494591112", null, errorTarget);
      }
    }
    if ((int) ListSequence.fromList(SLinkOperations.getTargets(classifierType, "parameter", true)).count() == (int) ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).count()) {
      {
        Iterator<SNode> typeArgument_it = ListSequence.fromList(SLinkOperations.getTargets(classifierType, "parameter", true)).iterator();
        Iterator<SNode> typeVar_it = ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).iterator();
        SNode typeArgument_var;
        SNode typeVar_var;
        while (typeArgument_it.hasNext() && typeVar_it.hasNext()) {
          typeArgument_var = typeArgument_it.next();
          typeVar_var = typeVar_it.next();
          if (SNodeOperations.isInstanceOf(typeArgument_var, "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(typeArgument_var, "jetbrains.mps.baseLanguage.structure.LowerBoundType") || SNodeOperations.isInstanceOf(typeArgument_var, "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
            continue;
          }
          if ((SLinkOperations.getTarget(typeVar_var, "bound", true) != null)) {
            SNode concreteBound = RulesFunctions_BaseLanguage.concretifyType(SLinkOperations.getTarget(typeVar_var, "bound", true), typeParamsToArgs);
            if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(typeArgument_var, concreteBound))) {
              MessageTarget errorTarget = new NodeMessageTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(typeArgument_var, "type parameter is not within its bounds", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2452011492298387662", null, errorTarget);
            }
          }
          for (SNode auxBound : SLinkOperations.getTargets(typeVar_var, "auxBounds", true)) {
            SNode concreteBound = RulesFunctions_BaseLanguage.concretifyType(auxBound, typeParamsToArgs);
            if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(typeArgument_var, concreteBound))) {
              MessageTarget errorTarget = new NodeMessageTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(typeArgument_var, "type parameter is not within its bounds", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2452011492298387681", null, errorTarget);
            }
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
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

  private static SNode _quotation_createNode_i2c76q_a1a0a0a4a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeRef", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("descriptor", SReference.create("descriptor", quotedNode_1, facade.createModelReference("r:00000000-0000-4000-0000-011c895902de(jetbrains.mps.baseLanguage.blTypes.primitiveDescriptors)"), facade.createNodeId("1196683941620")));
    return quotedNode_1;
  }
}
