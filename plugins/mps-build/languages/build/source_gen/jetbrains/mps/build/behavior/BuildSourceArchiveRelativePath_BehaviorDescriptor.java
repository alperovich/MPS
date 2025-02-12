package jetbrains.mps.build.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.IDontSubstituteByDefault_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.VisibleArtifacts;
import jetbrains.mps.build.util.RequiredDependenciesBuilder;
import jetbrains.mps.build.util.Context;
import org.jetbrains.annotations.Nullable;

public class BuildSourceArchiveRelativePath_BehaviorDescriptor extends BuildRelativePath_BehaviorDescriptor implements BuildExternalDependency_BehaviorDescriptor, IWorkflowParticipant_BehaviorDescriptor, IDontSubstituteByDefault_BehaviorDescriptor {
  public BuildSourceArchiveRelativePath_BehaviorDescriptor() {
  }

  public void virtual_fetchDependencies_5908258303322131137(SNode thisNode, VisibleArtifacts artifacts, RequiredDependenciesBuilder builder) {
    BuildSourceArchiveRelativePath_Behavior.virtual_fetchDependencies_5908258303322131137(thisNode, artifacts, builder);
  }

  public String virtual_getAntPath_8563603456895173701(SNode thisNode, Context context) {
    return BuildSourceArchiveRelativePath_Behavior.virtual_getAntPath_8563603456895173701(thisNode, context);
  }

  @Nullable
  public String virtual_getBasePath_4959435991187140515(SNode thisNode, Context context) {
    return BuildSourceArchiveRelativePath_Behavior.virtual_getBasePath_4959435991187140515(thisNode, context);
  }

  public String virtual_getRelativePath_5481553824944787371(SNode thisNode) {
    return BuildSourceArchiveRelativePath_Behavior.virtual_getRelativePath_5481553824944787371(thisNode);
  }

  public SNode virtual_getTargetTask_6854204111265837872(SNode thisNode) {
    return BuildSourceArchiveRelativePath_Behavior.virtual_getTargetTask_6854204111265837872(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.build.structure.BuildSourceArchiveRelativePath";
  }
}
