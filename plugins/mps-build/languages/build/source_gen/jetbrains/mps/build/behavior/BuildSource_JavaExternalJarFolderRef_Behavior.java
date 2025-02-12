package jetbrains.mps.build.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.VisibleArtifacts;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.build.util.JavaExportUtil;

public class BuildSource_JavaExternalJarFolderRef_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_getDependencyTarget_5610619299014531753(SNode thisNode, VisibleArtifacts artifacts) {
    if (SNodeOperations.getContainingRoot(thisNode) == SNodeOperations.getContainingRoot(SLinkOperations.getTarget(thisNode, "folder", false))) {
      return null;
    }

    return JavaExportUtil.requireJarFolder(artifacts, SLinkOperations.getTarget(thisNode, "folder", false), thisNode);
  }
}
