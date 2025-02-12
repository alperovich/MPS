package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;
import jetbrains.mps.util.IterableUtil;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SNodePointer;

public class supertypesOf_ClassifierType_Collection_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public supertypesOf_ClassifierType_Collection_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode ct, TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    return _quotation_createNode_832k9i_a0a2(((SNode) status.getPattern().getFieldValue("patternVar_ELEMENT")));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      GeneratedMatchingPattern pattern = new supertypesOf_ClassifierType_Collection_SubtypingRule.Pattern_832k9i_a0a0a0a4();
      this.myMatchingPattern = pattern;
      boolean b = pattern.match(argument);
      return new IsApplicableStatus(b, pattern);
    }
  }

  public boolean isWeak() {
    return true;
  }

  public static class Pattern_832k9i_a0a0a0a4 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode patternVar_ELEMENT;

    public Pattern_832k9i_a0a0a0a4() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_supertypesOf_ClassifierType_Collection_g8re64_a0a;
        nodeToMatch_supertypesOf_ClassifierType_Collection_g8re64_a0a = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_supertypesOf_ClassifierType_Collection_g8re64_a0a.getConcept().getQualifiedName()))) {
          return false;
        }
        {
          SNodeReference pointer = SNODE_POINTER_832k9i_a0a0a0a0b0c0a0a0a0a0a0e;
          if (!(PatternUtil.matchReferentWithNode(pointer, nodeToMatch_supertypesOf_ClassifierType_Collection_g8re64_a0a.getReferenceTarget("classifier")))) {
            return false;
          }
        }
        {
          String childRole_supertypesOf_ClassifierType_Collection_g8re64_ = "parameter";
          if (!(PatternUtil.hasNChildren(nodeToMatch_supertypesOf_ClassifierType_Collection_g8re64_a0a, childRole_supertypesOf_ClassifierType_Collection_g8re64_, 1))) {
            return false;
          }
          {
            SNode childVar_supertypesOf_ClassifierType_Collection_g8re64_a0a0 = IterableUtil.get(nodeToMatch_supertypesOf_ClassifierType_Collection_g8re64_a0a.getChildren(childRole_supertypesOf_ClassifierType_Collection_g8re64_), 0);
            this.patternVar_ELEMENT = childVar_supertypesOf_ClassifierType_Collection_g8re64_a0a0;
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return false;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_ELEMENT = (SNode) pattern.getFieldValue("patternVar_ELEMENT");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_ELEMENT".equals(fieldName)) {
        return patternVar_ELEMENT;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }

  private static SNode _quotation_createNode_832k9i_a0a2(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.CollectionType", null, null, GlobalScope.getInstance(), false);
    quotedNode_3 = (SNode) parameter_1;
    if (quotedNode_3 != null) {
      quotedNode_2.addChild("elementType", HUtil.copyIfNecessary(quotedNode_3));
    }
    return quotedNode_2;
  }

  private static SNodePointer SNODE_POINTER_832k9i_a0a0a0a0b0c0a0a0a0a0a0e = new SNodePointer("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(JDK/java.util@java_stub)", "~Collection");
}
