package jetbrains.mps.build.mps.tests.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.util.VisibleArtifacts;
import jetbrains.mps.build.util.RequiredDependenciesBuilder;
import jetbrains.mps.build.util.DependenciesHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;

public class BuildModuleTestsPlugin_Behavior {
  public static void init(SNode thisNode) {
  }

  public static Iterable<SNode> virtual_getImportedLibraries_4101476690142937969(SNode thisNode) {
    BehaviorReflection.invokeSuper((Class<Iterable<SNode>>) ((Class) Object.class), thisNode, "jetbrains.mps.build.structure.BuildPlugin", "virtual_getImportedLibraries_4101476690142937969", new Object[]{});
    return Sequence.<SNode>singleton(SLinkOperations.getTarget(createBwfTaskLibraryDependency_s7wj2j_a0a0b0a(), "target", false));
  }

  public static void virtual_fetchDependencies_5908258303322131137(SNode thisNode, VisibleArtifacts artifacts, RequiredDependenciesBuilder builder) {
    SNode project = artifacts.getProject();

    // find mps-test.jar 
    DependenciesHelper helper = new DependenciesHelper(artifacts.getGenContext(), project);
    SNode originalProject = SNodeOperations.as(DependenciesHelper.getOriginalNode(project, artifacts.getGenContext()), "jetbrains.mps.build.structure.BuildProject");
    SNode mpsTestModule = SNodeOperations.as(BehaviorReflection.invokeVirtual(Scope.class, originalProject, "virtual_getScope_7722139651431880752", new Object[]{SConceptOperations.findConceptDeclaration("jetbrains.mps.build.structure.BuildSource_JavaModule"), "parts", 0}).resolve(originalProject, "mps-test"), "jetbrains.mps.build.structure.BuildSource_JavaModule");
    if ((mpsTestModule != null)) {
      SNode mpsTestJar = SNodeOperations.as(artifacts.findArtifact(mpsTestModule), "jetbrains.mps.build.structure.BuildLayout_Node");
      if ((mpsTestJar != null)) {
        // specify explicitly what we need maybe? 
        helper.artifacts().put("mps-test-folder", SNodeOperations.getParent(mpsTestJar));
        helper.artifacts().put("mps-test", mpsTestJar);
        builder.add(mpsTestJar, mpsTestModule);
      }
    }
  }

  private static SNode createBwfTaskLibraryDependency_s7wj2j_a0a0b0a() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode n1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.workflow.structure.BwfTaskLibraryDependency", null, GlobalScope.getInstance(), false);
    n1.setReference("target", SReference.create("target", n1, facade.createModelReference("r:e6234636-faf1-4112-be6c-55df7ec7314a(jetbrains.mps.build.mps.tests.accessories)"), facade.createNodeId("398731435597190701")));
    return n1;
  }
}
