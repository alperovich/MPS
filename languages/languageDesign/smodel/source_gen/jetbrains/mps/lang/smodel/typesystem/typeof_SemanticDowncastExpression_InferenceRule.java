package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

public class typeof_SemanticDowncastExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SemanticDowncastExpression_InferenceRule() {
  }

  public void applyRule(final SNode expr, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if ((SLinkOperations.getTarget(expr, "leftExpression", true) != null)) {
      final SNode LeftType_typevar_1186060911559 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expr, "leftExpression", true);
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060923030", 0, null);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060928458", true), _info_12389875345);
      }
      //  this when concrete has a sense of overloading 
      {
        final SNode v = typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559);
        typeCheckingContext.whenConcrete(v, new Runnable() {
          public void run() {
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SModelType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712100028", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712100030", true), (SNode) _quotation_createNode_kyl6z5_a0a0a0d0a0b(), _info_12389875345);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712107220", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712107222", true), (SNode) _quotation_createNode_kyl6z5_a0a0a0a3a0a1(), _info_12389875345);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SConceptType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712110099", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203712110101", true), (SNode) _quotation_createNode_kyl6z5_a0a0a0a0d0a0b(), _info_12389875345);
              }
            } else
            if (SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SNodeListType")) {
              {
                final SNode lt = typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559);
                typeCheckingContext.whenConcrete(lt, new Runnable() {
                  public void run() {
                    {
                      SNode _nodeToCheck_1029348928467 = expr;
                      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206060275783", 0, null);
                      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1206060275785", true), (SNode) _quotation_createNode_kyl6z5_a0a0a0a0a0a3a0a1(SLinkOperations.getTarget(SNodeOperations.cast(typeCheckingContext.getExpandedNode(lt), "jetbrains.mps.lang.smodel.structure.SNodeListType"), "elementConcept", false)), _info_12389875345);
                    }
                  }
                }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "2930785965020102451", false, false);
              }
            } else if (SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559), "jetbrains.mps.lang.smodel.structure.SearchScopeType")) {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162518298", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162512076", true), (SNode) _quotation_createNode_kyl6z5_a0a0a0a0a0d0a0b(), _info_12389875345);
              }
            } else {
              {
                SNode _nodeToCheck_1029348928467 = expr;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162640570", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1221162630424", true), (SNode) ClassifierTypeUtil.getTypeCoercedToClassifierType(typeCheckingContext.getRepresentative(LeftType_typevar_1186060911559)), _info_12389875345);
              }
            }
          }
        }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186061035207", true, false);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression";
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

  private static SNode _quotation_createNode_kyl6z5_a0a0a0d0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), facade.createNodeId("~SModel")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_kyl6z5_a0a0a0a3a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), facade.createNodeId("~SNode")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_kyl6z5_a0a0a0a0d0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#8865b7a8-5271-43d3-884c-6fd1d9cfdd34#org.jetbrains.mps.openapi.model(MPS.OpenAPI/org.jetbrains.mps.openapi.model@java_stub)"), facade.createNodeId("~SNode")));
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_kyl6z5_a0a0a0a0a0a3a0a1(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_2.setReference("classifier", SReference.create("classifier", quotedNode_2, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)"), facade.createNodeId("~List")));
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_3, "concept", (SNode) parameter_1);
    quotedNode_2.addChild("parameter", quotedNode_3);
    return quotedNode_2;
  }

  private static SNode _quotation_createNode_kyl6z5_a0a0a0a0a0d0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel.search(MPS.Core/jetbrains.mps.smodel.search@java_stub)"), facade.createNodeId("~ISearchScope")));
    return quotedNode_1;
  }
}
