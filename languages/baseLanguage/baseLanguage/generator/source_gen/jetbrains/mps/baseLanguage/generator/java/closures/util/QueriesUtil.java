package jetbrains.mps.baseLanguage.generator.java.closures.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.smodel.SReference;

public class QueriesUtil {
  public QueriesUtil() {
  }

  public static SNode createClassType_forClosure_enclosingClass(SNode inputClosure, ITemplateGenerator generator) {
    SNode enclosingClass = SNodeOperations.getAncestor(inputClosure, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (enclosingClass == null) {
      // closure is not in class 
      enclosingClass = getJavaLangObject();
    }
    SModel outputModel = generator.getOutputModel();
    SNode outputClassType = SModelOperations.createNewNode(outputModel, null, "jetbrains.mps.baseLanguage.structure.ClassifierType");
    SLinkOperations.setTarget(outputClassType, "classifier", enclosingClass, false);
    for (SNode typeVar : ListSequence.fromList(SLinkOperations.getTargets(enclosingClass, "typeVariableDeclaration", true))) {
      SNode typeVarRef = SLinkOperations.addNewChild(outputClassType, "parameter", "jetbrains.mps.baseLanguage.structure.TypeVariableReference");
      SLinkOperations.setTarget(typeVarRef, "typeVariableDeclaration", typeVar, false);
    }
    return outputClassType;
  }

  public static List<SNode> getTypeVars_from_Closure_enclosingClass(SNode inputClosure, IScope scope) {
    SNode enclosingClass = SNodeOperations.getAncestor(inputClosure, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (enclosingClass == null) {
      // closure is not in class 
      enclosingClass = getJavaLangObject();
    }
    return SLinkOperations.getTargets(enclosingClass, "typeVariableDeclaration", true);
  }

  public static SNode create_enclosingClassObject(SNode nodeInsideClosure) {
    // 
    // must be invoked in $COPY-SRC$ because use ref on class in 'input model' 
    // 
    SNode enclosingClass = SNodeOperations.getAncestor(nodeInsideClosure, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if (enclosingClass == null) {
      return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.NullLiteral", null);
    }
    SNode enclosingMethodOrClosure = SNodeOperations.getAncestorWhereConceptInList(nodeInsideClosure, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", "jetbrains.mps.baseLanguage.structure.Closure"}, false, false);
    // --- in closure 
    if (SNodeOperations.isInstanceOf(enclosingMethodOrClosure, "jetbrains.mps.baseLanguage.structure.Closure")) {
      SNode fieldRef = _quotation_createNode_w9106s_a0a0h0d();
      SNode typeOfField = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(typeOfField, "classifier", enclosingClass, false);
      SLinkOperations.setTarget(fieldRef, "fieldType", typeOfField, true);
      return fieldRef;
    }
    // --- in instance method 
    if (SNodeOperations.isInstanceOf(enclosingMethodOrClosure, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") || SNodeOperations.isInstanceOf(enclosingMethodOrClosure, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration")) {
      SNode thisExpr = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
      SLinkOperations.setTarget(thisExpr, "classConcept", enclosingClass, false);
      return thisExpr;
    }
    // --- none of above 
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.NullLiteral", null);
  }

  private static SNode getJavaLangObject() {
    return SNodeOperations.cast(SLinkOperations.getTarget(_quotation_createNode_w9106s_a0a0a4(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept");
  }

  private static SNode _quotation_createNode_w9106s_a0a0h0d() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalPartialFieldReference", null, null, GlobalScope.getInstance(), false);
    SNodeAccessUtil.setProperty(quotedNode_1, "fieldName", "_enclosingClass");
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.addChild("instance", quotedNode_2);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Type", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.addChild("fieldType", quotedNode_3);
    return quotedNode_1;
  }

  private static SNode _quotation_createNode_w9106s_a0a0a4() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, null, GlobalScope.getInstance(), false);
    quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), facade.createNodeId("~Object")));
    return quotedNode_1;
  }
}
