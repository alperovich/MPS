package jetbrains.mps.smodel.test.reflection;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest4;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import junit.framework.Assert;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.List;

@MPSLaunch
public class SNodeGetChildrenOperation_Test extends BaseTransformationTest4 {
  @Test
  public void test_childContainingLinks() throws Throwable {
    this.initTest("${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)");
    this.runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childContainingLinks", true);
  }

  @Test
  public void test_childContaininLinksForSpecializedChildren() throws Throwable {
    this.initTest("${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)");
    this.runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childContaininLinksForSpecializedChildren", true);
  }

  @Test
  public void test_childContainingRoles() throws Throwable {
    this.initTest("${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)");
    this.runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childContainingRoles", true);
  }

  @Test
  public void test_unspecifiedChildren() throws Throwable {
    this.initTest("${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)");
    this.runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_unspecifiedChildren", true);
  }

  @Test
  public void test_childOperationsOnNull() throws Throwable {
    this.initTest("${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)");
    this.runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childOperationsOnNull", true);
  }

  @Test
  public void test_childrenByLinkDeclaration() throws Throwable {
    this.initTest("${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)");
    this.runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childrenByLinkDeclaration", true);
  }

  @Test
  public void test_childrenByLinkDeclarationSpecialized() throws Throwable {
    this.initTest("${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)");
    this.runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childrenByLinkDeclarationSpecialized", true);
  }

  @Test
  public void test_childrenByLinkDeclarationOnNull() throws Throwable {
    this.initTest("${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)");
    this.runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childrenByLinkDeclarationOnNull", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_childContainingLinks() throws Exception {
      this.addNodeById("8758390115029078425");
      this.addNodeById("5815925154349132136");
      this.addNodeById("2166349271756548530");
      TestUtilities.assertEquals(Sequence.fromArray(new SNode[]{SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Root", "child_1_n"), SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Root", "childSubConcept_0_n")}), ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("8758390115029078426"), "jetbrains.mps.lang.smodelTests.structure.Root"))).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return SNodeOperations.getContainingLinkDeclaration(it);
        }
      }));
    }

    public void test_childContaininLinksForSpecializedChildren() throws Exception {
      this.addNodeById("8758390115029078425");
      this.addNodeById("5815925154349132136");
      this.addNodeById("2166349271756548530");
      Assert.assertEquals(SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Child", "grandChild_0_1"), SNodeOperations.getContainingLinkDeclaration(SNodeOperations.cast(this.getNodeById("2600026384779198859"), "jetbrains.mps.lang.smodelTests.structure.GrandChild")));
    }

    public void test_childContainingRoles() throws Exception {
      this.addNodeById("8758390115029078425");
      this.addNodeById("5815925154349132136");
      this.addNodeById("2166349271756548530");
      TestUtilities.assertEquals(Sequence.fromArray(new String[]{SPropertyOperations.getString(SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Root", "child_1_n"), "role"), SPropertyOperations.getString(SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Root", "childSubConcept_0_n"), "role")}), ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("8758390115029078426"), "jetbrains.mps.lang.smodelTests.structure.Root"))).select(new ISelector<SNode, String>() {
        public String select(SNode it) {
          return SNodeOperations.getContainingLinkRole(it);
        }
      }));
    }

    public void test_unspecifiedChildren() throws Exception {
      this.addNodeById("8758390115029078425");
      this.addNodeById("5815925154349132136");
      this.addNodeById("2166349271756548530");
      int initialSize = ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("2166349271756548531"), "jetbrains.mps.lang.smodelTests.structure.Root"))).count();
      SNode unspecifiedChild = SConceptOperations.createNewNode("jetbrains.mps.lang.smodelTests.structure.GrandChild", null);
      String unspecifiedChildRole = this.addUnspecifiedChild(SNodeOperations.cast(this.getNodeById("2166349271756548531"), "jetbrains.mps.lang.smodelTests.structure.Root"), unspecifiedChild);
      Assert.assertEquals(initialSize + 1, ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("2166349271756548531"), "jetbrains.mps.lang.smodelTests.structure.Root"))).count());
      Iterable<SNode> unspecifiedChildren = ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("2166349271756548531"), "jetbrains.mps.lang.smodelTests.structure.Root"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return (SNodeOperations.getContainingLinkDeclaration(it) == null);
        }
      });
      Assert.assertEquals(1, Sequence.fromIterable(unspecifiedChildren).count());
      SNode theChild = Sequence.fromIterable(unspecifiedChildren).first();
      Assert.assertEquals(unspecifiedChildRole, SNodeOperations.getContainingLinkRole(theChild));
      Assert.assertEquals(unspecifiedChild, theChild);
    }

    public void test_childOperationsOnNull() throws Exception {
      this.addNodeById("8758390115029078425");
      this.addNodeById("5815925154349132136");
      this.addNodeById("2166349271756548530");
      SNode nullNode = null;
      Assert.assertNull(SNodeOperations.getContainingLinkDeclaration(nullNode));
      Assert.assertNull(SNodeOperations.getContainingLinkRole(nullNode));
    }

    public void test_childrenByLinkDeclaration() throws Exception {
      this.addNodeById("8758390115029078425");
      this.addNodeById("5815925154349132136");
      this.addNodeById("2166349271756548530");
      List<SNode> singleChild = SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("8758390115029078426"), "jetbrains.mps.lang.smodelTests.structure.Root"), SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Root", "child_1_n"));
      Assert.assertEquals(1, ListSequence.fromList(singleChild).count());
      Assert.assertEquals(SNodeOperations.cast(this.getNodeById("8758390115029078427"), "jetbrains.mps.lang.smodelTests.structure.Child"), ListSequence.fromList(singleChild).first());
      List<SNode> twins = SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("5815925154349132137"), "jetbrains.mps.lang.smodelTests.structure.Root"), SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Root", "child_1_n"));
      TestUtilities.assertEquals(Sequence.fromArray(new SNode[]{SNodeOperations.cast(this.getNodeById("5815925154349132142"), "jetbrains.mps.lang.smodelTests.structure.Child"), SNodeOperations.cast(this.getNodeById("5815925154349132138"), "jetbrains.mps.lang.smodelTests.structure.Child")}), twins);
    }

    public void test_childrenByLinkDeclarationSpecialized() throws Exception {
      this.addNodeById("8758390115029078425");
      this.addNodeById("5815925154349132136");
      this.addNodeById("2166349271756548530");
      TestUtilities.assertEquals(Sequence.fromArray(new SNode[]{SNodeOperations.cast(this.getNodeById("2600026384779198859"), "jetbrains.mps.lang.smodelTests.structure.GrandChild")}), SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("8758390115029078430"), "jetbrains.mps.lang.smodelTests.structure.ChildSubConcept"), SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.ChildSubConcept", "specializedGranChild_0_1")));
      TestUtilities.assertEquals(Sequence.fromArray(new SNode[]{SNodeOperations.cast(this.getNodeById("2600026384779198859"), "jetbrains.mps.lang.smodelTests.structure.GrandChild")}), SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("8758390115029078430"), "jetbrains.mps.lang.smodelTests.structure.ChildSubConcept"), SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Child", "grandChild_0_1")));
    }

    public void test_childrenByLinkDeclarationOnNull() throws Exception {
      this.addNodeById("8758390115029078425");
      this.addNodeById("5815925154349132136");
      this.addNodeById("2166349271756548530");
      SNode nullNode = null;
      Assert.assertTrue(ListSequence.fromList(SNodeOperations.getChildren(nullNode, SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.smodelTests.structure.Root", "child_0_n"))).isEmpty());
      SNode nullLinkDeclaration = null;
      Assert.assertTrue(ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(this.getNodeById("8758390115029078426"), "jetbrains.mps.lang.smodelTests.structure.Root"), nullLinkDeclaration)).isEmpty());
    }

    public String addUnspecifiedChild(SNode input, SNode unspecifiedChild) {
      String unspecifiedChildRole = "unspecifiedChild";
      input.addChild(unspecifiedChildRole, unspecifiedChild);
      return unspecifiedChildRole;
    }
  }
}
