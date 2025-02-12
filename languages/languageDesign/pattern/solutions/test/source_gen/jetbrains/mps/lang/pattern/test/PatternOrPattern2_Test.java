package jetbrains.mps.lang.pattern.test;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import junit.framework.TestCase;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.runtime.PatternUtil;
import jetbrains.mps.util.IterableUtil;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

@MPSLaunch
public class PatternOrPattern2_Test extends BaseTransformationTest4 {
  public PatternOrPattern2_Test() {
  }

  @Test
  public void testMethod() throws Throwable {
    this.initTest("${mps_home}", "r:ef0e231b-e6bd-436f-9003-b53de4081716(jetbrains.mps.lang.pattern.test)");
    this.runTest("jetbrains.mps.lang.pattern.test.PatternOrPattern2_Test$TestBody", "testOrPattern2", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public TestBody() {
    }

    public void testOrPattern2() {
      TestCase.assertTrue(match());
    }

    public boolean match() {
      SNode nodeToMatch = _quotation_createNode_49ctdq_a0a0c2();
      GeneratedMatchingPattern pattern = new PatternOrPattern2_Test.TestBody.Pattern_49ctdq_a0a1a2c();
      boolean matchNeeded = true;
      boolean matches = pattern.match(nodeToMatch);
      if (matchNeeded != matches) {
        return false;
      }
      if (!(matchNeeded)) {
        return true;
      }
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), _quotation_createNode_49ctdq_a6a2c()), ListSequence.fromListAndArray(new ArrayList<SNode>(), (SNode) pattern.getFieldValue("patternVar_s"))));
      return true;
    }

    public static class Pattern_49ctdq_a0a1a2c extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode patternVar_body;
      /*package*/ SNode patternVar_s;
      private GeneratedMatchingPattern myOrPattern_pf9dr6_a0a;

      public Pattern_49ctdq_a0a1a2c() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_OrPattern2_pf9dr6_a0;
          nodeToMatch_OrPattern2_pf9dr6_a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.IfStatement".equals(nodeToMatch_OrPattern2_pf9dr6_a0.getConcept().getQualifiedName()))) {
            return false;
          }
          {
            String childRole_OrPattern2_pf9dr6_ = "ifTrue";
            if (!(PatternUtil.hasNChildren(nodeToMatch_OrPattern2_pf9dr6_a0, childRole_OrPattern2_pf9dr6_, 1))) {
              return false;
            }
            {
              SNode childVar_OrPattern2_pf9dr6_a0a = IterableUtil.get(nodeToMatch_OrPattern2_pf9dr6_a0.getChildren(childRole_OrPattern2_pf9dr6_), 0);
              {
                SNode nodeToMatch_OrPattern2_pf9dr6_a0a;
                nodeToMatch_OrPattern2_pf9dr6_a0a = childVar_OrPattern2_pf9dr6_a0a;
                if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_OrPattern2_pf9dr6_a0a.getConcept().getQualifiedName()))) {
                  return false;
                }
                {
                  String childRole_OrPattern2_pf9dr6__0 = "statement";
                  if (!(PatternUtil.hasNChildren(nodeToMatch_OrPattern2_pf9dr6_a0a, childRole_OrPattern2_pf9dr6__0, 1))) {
                    return false;
                  }
                  {
                    SNode childVar_OrPattern2_pf9dr6_a0a0 = IterableUtil.get(nodeToMatch_OrPattern2_pf9dr6_a0a.getChildren(childRole_OrPattern2_pf9dr6__0), 0);
                    this.patternVar_body = childVar_OrPattern2_pf9dr6_a0a0;
                  }
                }
              }
            }
          }
          {
            String childRole_OrPattern2_pf9dr6__1 = "condition";
            if (!(PatternUtil.hasNChildren(nodeToMatch_OrPattern2_pf9dr6_a0, childRole_OrPattern2_pf9dr6__1, 1))) {
              return false;
            }
            {
              SNode childVar_OrPattern2_pf9dr6_a0a_0 = IterableUtil.get(nodeToMatch_OrPattern2_pf9dr6_a0.getChildren(childRole_OrPattern2_pf9dr6__1), 0);
              {
                SNode nodeToMatch_OrPattern2_pf9dr6_a0a_0;
                nodeToMatch_OrPattern2_pf9dr6_a0a_0 = childVar_OrPattern2_pf9dr6_a0a_0;
                {
                  boolean orMatches = false;
                  GeneratedMatchingPattern orPattern;
                  orPattern = new PatternOrPattern2_Test.TestBody.Pattern_49ctdq_a0a1a2c.Pattern_49ctdq_a0a0a2a2a1a1a1a1a1a2a0a0a0a1a2c();
                  if (orPattern.match(nodeToMatch_OrPattern2_pf9dr6_a0a_0)) {
                    orMatches = true;
                    myOrPattern_pf9dr6_a0a = orPattern;
                  }
                  orPattern = new PatternOrPattern2_Test.TestBody.Pattern_49ctdq_a0a1a2c.Pattern_49ctdq_a0a0a3a2a1a1a1a1a1a2a0a0a0a1a2c();
                  if (orPattern.match(nodeToMatch_OrPattern2_pf9dr6_a0a_0)) {
                    orMatches = true;
                    myOrPattern_pf9dr6_a0a = orPattern;
                  }
                  if (!(orMatches)) {
                    return false;
                  }
                }
              }
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
          patternVar_body = (SNode) pattern.getFieldValue("patternVar_body");
          patternVar_s = (SNode) pattern.getFieldValue("patternVar_s");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("patternVar_body".equals(fieldName)) {
          return patternVar_body;
        }
        if ("patternVar_s".equals(fieldName)) {
          return patternVar_s;
        }
        return null;
      }

      public void performActions(Object o) {
      }

      public class Pattern_49ctdq_a0a0a2a2a1a1a1a1a1a2a0a0a0a1a2c extends GeneratedMatchingPattern implements IMatchingPattern {
        public Pattern_49ctdq_a0a0a2a2a1a1a1a1a1a2a0a0a0a1a2c() {
        }

        public boolean match(SNode nodeToMatch) {
          {
            SNode nodeToMatch_OrPattern2_pf9dr6_a0a0a;
            nodeToMatch_OrPattern2_pf9dr6_a0a0a = nodeToMatch;
            if (!("jetbrains.mps.baseLanguage.structure.NotEqualsExpression".equals(nodeToMatch_OrPattern2_pf9dr6_a0a0a.getConcept().getQualifiedName()))) {
              return false;
            }
            {
              String childRole_OrPattern2_pf9dr6__2 = "rightExpression";
              if (!(PatternUtil.hasNChildren(nodeToMatch_OrPattern2_pf9dr6_a0a0a, childRole_OrPattern2_pf9dr6__2, 1))) {
                return false;
              }
              {
                SNode childVar_OrPattern2_pf9dr6_a0a0a0 = IterableUtil.get(nodeToMatch_OrPattern2_pf9dr6_a0a0a.getChildren(childRole_OrPattern2_pf9dr6__2), 0);
                {
                  SNode nodeToMatch_OrPattern2_pf9dr6_a0a0a0;
                  nodeToMatch_OrPattern2_pf9dr6_a0a0a0 = childVar_OrPattern2_pf9dr6_a0a0a0;
                  if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_OrPattern2_pf9dr6_a0a0a0.getConcept().getQualifiedName()))) {
                    return false;
                  }
                }
              }
            }
            {
              String childRole_OrPattern2_pf9dr6__3 = "leftExpression";
              if (!(PatternUtil.hasNChildren(nodeToMatch_OrPattern2_pf9dr6_a0a0a, childRole_OrPattern2_pf9dr6__3, 1))) {
                return false;
              }
              {
                SNode childVar_OrPattern2_pf9dr6_a0a0a0_0 = IterableUtil.get(nodeToMatch_OrPattern2_pf9dr6_a0a0a.getChildren(childRole_OrPattern2_pf9dr6__3), 0);
                {
                  SNode nodeToMatch_OrPattern2_pf9dr6_a0a0a0_0;
                  nodeToMatch_OrPattern2_pf9dr6_a0a0a0_0 = childVar_OrPattern2_pf9dr6_a0a0a0_0;
                  patternVar_s = nodeToMatch_OrPattern2_pf9dr6_a0a0a0_0;
                }
              }
            }
          }
          return true;
        }

        public boolean hasAntiquotations() {
          return false;
        }

        public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
        }

        public Object getFieldValue(String fieldName) {
          return null;
        }

        public void performActions(Object o) {
        }
      }

      public class Pattern_49ctdq_a0a0a3a2a1a1a1a1a1a2a0a0a0a1a2c extends GeneratedMatchingPattern implements IMatchingPattern {
        public Pattern_49ctdq_a0a0a3a2a1a1a1a1a1a2a0a0a0a1a2c() {
        }

        public boolean match(SNode nodeToMatch) {
          {
            SNode nodeToMatch_OrPattern2_pf9dr6_a1a0a;
            nodeToMatch_OrPattern2_pf9dr6_a1a0a = nodeToMatch;
            if (!("jetbrains.mps.baseLanguage.structure.NotEqualsExpression".equals(nodeToMatch_OrPattern2_pf9dr6_a1a0a.getConcept().getQualifiedName()))) {
              return false;
            }
            {
              String childRole_OrPattern2_pf9dr6__4 = "rightExpression";
              if (!(PatternUtil.hasNChildren(nodeToMatch_OrPattern2_pf9dr6_a1a0a, childRole_OrPattern2_pf9dr6__4, 1))) {
                return false;
              }
              {
                SNode childVar_OrPattern2_pf9dr6_a0b0a0 = IterableUtil.get(nodeToMatch_OrPattern2_pf9dr6_a1a0a.getChildren(childRole_OrPattern2_pf9dr6__4), 0);
                {
                  SNode nodeToMatch_OrPattern2_pf9dr6_a0b0a0;
                  nodeToMatch_OrPattern2_pf9dr6_a0b0a0 = childVar_OrPattern2_pf9dr6_a0b0a0;
                  patternVar_s = nodeToMatch_OrPattern2_pf9dr6_a0b0a0;
                }
              }
            }
            {
              String childRole_OrPattern2_pf9dr6__5 = "leftExpression";
              if (!(PatternUtil.hasNChildren(nodeToMatch_OrPattern2_pf9dr6_a1a0a, childRole_OrPattern2_pf9dr6__5, 1))) {
                return false;
              }
              {
                SNode childVar_OrPattern2_pf9dr6_a0b0a0_0 = IterableUtil.get(nodeToMatch_OrPattern2_pf9dr6_a1a0a.getChildren(childRole_OrPattern2_pf9dr6__5), 0);
                {
                  SNode nodeToMatch_OrPattern2_pf9dr6_a0b0a0_0;
                  nodeToMatch_OrPattern2_pf9dr6_a0b0a0_0 = childVar_OrPattern2_pf9dr6_a0b0a0_0;
                  if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_OrPattern2_pf9dr6_a0b0a0_0.getConcept().getQualifiedName()))) {
                    return false;
                  }
                }
              }
            }
          }
          return true;
        }

        public boolean hasAntiquotations() {
          return false;
        }

        public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
        }

        public Object getFieldValue(String fieldName) {
          return null;
        }

        public void performActions(Object o) {
        }
      }
    }

    private static SNode _quotation_createNode_49ctdq_a0a0c2() {
      PersistenceFacade facade = PersistenceFacade.getInstance();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IfStatement", null, null, GlobalScope.getInstance(), false);
      quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, null, GlobalScope.getInstance(), false);
      quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Statement", null, null, GlobalScope.getInstance(), false);
      quotedNode_2.addChild("statement", quotedNode_4);
      quotedNode_1.addChild("ifTrue", quotedNode_2);
      quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NotEqualsExpression", null, null, GlobalScope.getInstance(), false);
      quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral", null, null, GlobalScope.getInstance(), false);
      quotedNode_3.addChild("leftExpression", quotedNode_5);
      quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", null, null, GlobalScope.getInstance(), false);
      quotedNode_6.setReference("classifier", SReference.create("classifier", quotedNode_6, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(JDK/java.io@java_stub)"), facade.createNodeId("~BufferedOutputStream")));
      quotedNode_3.addChild("rightExpression", quotedNode_6);
      quotedNode_1.addChild("condition", quotedNode_3);
      return quotedNode_1;
    }

    private static SNode _quotation_createNode_49ctdq_a6a2c() {
      PersistenceFacade facade = PersistenceFacade.getInstance();
      SNode quotedNode_1 = null;
      quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", null, null, GlobalScope.getInstance(), false);
      quotedNode_1.setReference("classifier", SReference.create("classifier", quotedNode_1, facade.createModelReference("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(JDK/java.io@java_stub)"), facade.createNodeId("~BufferedOutputStream")));
      return quotedNode_1;
    }
  }
}
