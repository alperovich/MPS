package jetbrains.mps.testbench.junit.suites;

/*Generated by MPS */

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import org.jetbrains.mps.openapi.model.SNode;
import java.lang.reflect.InvocationTargetException;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.testbench.junit.runners.MpsTestsSupport;
import jetbrains.mps.testbench.junit.runners.ContextProjextSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.scope.Scope;
import org.junit.Test;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.smodel.constraints.ModelConstraints;
import jetbrains.mps.util.CollectionUtil;
import junit.framework.Assert;

/**
 * todo: extract common part with BaseCheckModulesTest
 */
@RunWith(Parameterized.class)
public class ScopesTest {
  @Parameterized.Parameters
  public static List<SNode[]> getNodesToCheck() throws InvocationTargetException, InterruptedException {
    final Project project = initTestEnvironmentAndLoadContextProject();

    return ModelAccess.instance().runReadAction(new Computable<List<SNode[]>>() {
      public List<SNode[]> compute() {
        List<SNode[]> nodesToCheck = ListSequence.fromList(new ArrayList<SNode[]>());

        for (SModel model : project.getProjectModels()) {
          for (SNode root : model.getRootNodes()) {
            // todo: use fast nodes finder here 
            ListSequence.fromList(nodesToCheck).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(root, "jetbrains.mps.lang.test.structure.ScopesTest", true, new String[]{})).select(new ISelector<SNode, SNode[]>() {
              public SNode[] select(SNode it) {
                return new SNode[]{it};
              }
            }));
          }
        }

        return nodesToCheck;
      }
    });
  }

  public static Project initTestEnvironmentAndLoadContextProject() throws InvocationTargetException, InterruptedException {
    MpsTestsSupport.initEnv(false);
    return ContextProjextSupport.getContextProject();
  }


  private SNode myNode;

  public ScopesTest(SNode node) {
    myNode = node;
  }

  public List<SNode> getExpectedNodes(SNode forNode) {
    List<SNode> expected = new ArrayList<SNode>();
    for (SNode child : SLinkOperations.getTargets(forNode, "nodes", true)) {
      expected.add(SLinkOperations.getTarget(child, "ref", false));
    }
    return expected;
  }

  public List<SNode> getScopeNodes(Scope scope) {
    List<SNode> scopeSet = new ArrayList<SNode>();
    for (SNode node : scope.getAvailableElements(null)) {
      scopeSet.add(node);
    }
    return scopeSet;
  }

  public StringBuilder getFailMessage(List<SNode> unExpected, List<SNode> notFounded) {
    StringBuilder builder = new StringBuilder(System.getProperty("line.separator"));
    builder.append("\tIn node " + SLinkOperations.getTarget(myNode, "checkingReference", false));
    builder.append(System.getProperty("line.separator"));

    if (!(unExpected.isEmpty())) {
      builder.append("\t\tUnexpected scope elements:");
      builder.append(System.getProperty("line.separator"));
      for (SNode node : unExpected) {
        builder.append("\t\t\t");
        builder.append(node);
        builder.append(System.getProperty("line.separator"));
      }
    }

    if (!(notFounded.isEmpty())) {
      builder.append("\t\tNot founded scope elements:");
      builder.append(System.getProperty("line.separator"));
      for (SNode node : notFounded) {
        builder.append("\t\t\t");
        builder.append(node);
        builder.append(System.getProperty("line.separator"));
      }
    }
    builder.append(System.getProperty("line.separator"));

    return builder;
  }

  @Test
  public void test() {
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        SReference reference = null;
        for (SReference ref : SNodeOperations.getReferences(SNodeOperations.getParent(ScopesTest.this.myNode))) {
          if (SLinkOperations.getTargetNode(ref) == SLinkOperations.getTarget(ScopesTest.this.myNode, "checkingReference", false)) {
            reference = ref;
            break;
          }
        }
        Scope scope = ModelConstraints.getScope(reference);

        List<SNode> expected = ScopesTest.this.getExpectedNodes(myNode);
        List<SNode> scopeSet = ScopesTest.this.getScopeNodes(scope);

        List<SNode> unExpected = CollectionUtil.subtract(expected, scopeSet);
        List<SNode> notFounded = CollectionUtil.subtract(scopeSet, expected);

        Assert.assertTrue(ScopesTest.this.getFailMessage(unExpected, notFounded).toString(), unExpected.isEmpty() && notFounded.isEmpty());

      }
    });
  }
}
