package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.ReferenceMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Iterator;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_AnonymousClass_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_AnonymousClass_InferenceRule() {
  }

  public void applyRule(final SNode anonymousClass, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode cdecl = SLinkOperations.getTarget(anonymousClass, "baseMethodDeclaration", false);
    if (cdecl == null) {
      return;
    }
    final SNode classifier = SLinkOperations.getTarget(anonymousClass, "classifier", false);
    if ((classifier == null)) {
      return;
    }

    if (!(ListSequence.fromList(SLinkOperations.getTargets(anonymousClass, "typeParameter", true)).isEmpty() || (int) ListSequence.fromList(SLinkOperations.getTargets(anonymousClass, "typeParameter", true)).count() == (int) ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).count())) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        errorTarget = new ReferenceMessageTarget("classifier");
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(anonymousClass, "wrong number of type parameters", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2925336694746296749", null, errorTarget);
      }
    }

    for (SNode parameter : SLinkOperations.getTargets(anonymousClass, "typeParameter", true)) {
      if (!(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(parameter, SLinkOperations.getTarget(_quotation_createNode_fj2vg7_a1a0a0a7a1(), "descriptor", false), false)))) {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(parameter, "primitive type not allowed", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "2925336694746296785", null, errorTarget);
      }
    }

    final Map<SNode, SNode> subs = MapSequence.fromMap(new HashMap<SNode, SNode>());
    // TODO: this is to avoid collecting generics from explicitly substituted types 
    List<SNode> typeParam = ListSequence.fromList(SLinkOperations.getTargets(anonymousClass, "typeParameter", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode tp) {
        final SNode TP_typevar_5449655299304737730 = typeCheckingContext.createNewRuntimeTypesVariable();
        SNode tmp = typeCheckingContext.getRepresentative(TP_typevar_5449655299304737730);
        {
          SNode _nodeToCheck_1029348928467 = tp;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5449655299304737735", 0, null);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.getRepresentative(TP_typevar_5449655299304737730), (SNode) tp, _info_12389875345);
        }
        return tmp;
      }
    }).toListSequence();
    SNode newType = _quotation_createNode_fj2vg7_a0m0b(anonymousClass, typeParam);
    BehaviorReflection.invokeVirtual(Void.class, newType, "virtual_collectGenericSubstitutions_4107091686347010321", new Object[]{subs});

    List<SNode> argl = SLinkOperations.getTargets(anonymousClass, "actualArgument", true);
    List<SNode> typel = BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), cdecl, "virtual_getTypeApplicationParameters_8277080359323839095", new Object[]{ListSequence.fromList(argl).count()});
    for (SNode type : ListSequence.fromList(typel)) {
      if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.IGenericType")) {
        BehaviorReflection.invokeVirtual(Void.class, SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.IGenericType"), "virtual_collectGenericSubstitutions_4107091686347010321", new Object[]{subs});
      }
    }

    {
      Iterator<SNode> type_it = ListSequence.fromList(typel).iterator();
      Iterator<SNode> arg_it = ListSequence.fromList(argl).iterator();
      SNode type_var;
      SNode arg_var;
      while (type_it.hasNext() && arg_it.hasNext()) {
        type_var = type_it.next();
        arg_var = arg_it.next();
        if (SNodeOperations.isInstanceOf(type_var, "jetbrains.mps.baseLanguage.structure.IGenericType")) {
          {
            SNode _nodeToCheck_1029348928467 = arg_var;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5449655299304749819", 0, null);
            typeCheckingContext.createGreaterThanInequality((SNode) BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), SNodeOperations.cast(type_var, "jetbrains.mps.baseLanguage.structure.IGenericType"), "virtual_expandGenerics_4107091686347199582", new Object[]{subs}), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5449655299304749821", true), false, true, _info_12389875345);
          }
        } else {
          if (!(typeCheckingContext.isSingleTypeComputation())) {
            {
              SNode _nodeToCheck_1029348928467 = arg_var;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5449655299304749835", 0, null);
              typeCheckingContext.createGreaterThanInequality((SNode) type_var, (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5449655299304749837", true), true, true, _info_12389875345);
            }
          }
        }
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = anonymousClass;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5449655299304749841", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "5449655299304749843", true), (SNode) newType, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }

  private static SNode _quotation_createNode_fj2vg7_a1a0a0a7a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeRef", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("descriptor", SReference.create("descriptor", quotedNode_1, facade.createModelReference("r:00000000-0000-4000-0000-011c895902de(jetbrains.mps.baseLanguage.blTypes.primitiveDescriptors)"), facade.createNodeId("1196683941620")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_fj2vg7_a0m0b(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "classifier", (SNode) parameter_1);
    {
      List<SNode> nodes = (List<SNode>) parameter_2;
      for (SNode child : nodes) {
        quotedNode_3.addChild("parameter", HUtil.copyIfNecessary(child));
      }
    }
    return quotedNode_3;
  }
}
