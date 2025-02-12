package jetbrains.mps.build.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.Context;
import jetbrains.mps.build.util.UnpackHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.build.util.LocalSourcePathArtifact;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ITranslator2;

public class BuildLayout_Folder_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String virtual_getChildrenOutputDir_WithMacro_4701820937132344011(SNode thisNode, Context context) {
    return BuildLayout_NamedContainer_Behavior.call_getOutputPath_WithMacro_280273048052535414(thisNode, context);
  }

  public static void virtual_unpack_7128123785277710736(SNode thisNode, UnpackHelper helper, Iterable<Object> artifacts) {
    SNode parent = helper.parent(thisNode);
    String parentLocation = helper.contentLocations().get(parent);
    String folderLocation = parentLocation + "/" + BuildString_Behavior.call_getText_4380385936562005550(SLinkOperations.getTarget(thisNode, "containerName", true), helper.getMacroHelper());
    helper.locations().put(thisNode, folderLocation);
    helper.contentLocations().put(thisNode, folderLocation);
    for (SNode ic : Sequence.fromIterable(BuildLayout_Folder_Behavior.call_getImportContentChildren_7045211410692956036(thisNode))) {
      SNode node = SNodeOperations.as(SLinkOperations.getTarget(ic, "target", false), "jetbrains.mps.build.structure.BuildLayout_PathElement");
      if ((node != null)) {
        // note: if node is imported directly - do not override its original location 
        if (!(helper.locations().containsKey(node))) {
          helper.locations().put(node, folderLocation);
        }
        if (!(helper.contentLocations().containsKey(node))) {
          helper.contentLocations().put(node, folderLocation);
        }
      }
    }
  }

  public static boolean virtual_isFolder_1368030936106753980(SNode thisNode) {
    return true;
  }

  public static boolean virtual_isValidPart_9184644532456897464(SNode thisNode, String propertyValue, String role) {
    return !(propertyValue.contains("$") || propertyValue.contains("\\"));
  }

  public static boolean virtual_exports_6547494638219603457(SNode thisNode, Object object) {
    if (object instanceof SNode) {
      final SNode node = (SNode) object;
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.build.structure.BuildLayout_Node")) {
        return Sequence.fromIterable(BuildLayout_Folder_Behavior.call_getImportContentChildren_7045211410692956036(thisNode)).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SLinkOperations.getTarget(it, "target", false) == node;
          }
        });
      }
    }
    if (object instanceof LocalSourcePathArtifact) {
      LocalSourcePathArtifact art = (LocalSourcePathArtifact) object;
      if (!(art.isFolder()) || art.getRoot() != SNodeOperations.getContainingRoot(thisNode)) {
        return false;
      }

      for (SNode c : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "children", true))) {
        if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.build.structure.BuildLayout_Files")) {
          SNode files = SNodeOperations.as(c, "jetbrains.mps.build.structure.BuildLayout_Files");
          if (ListSequence.fromList(SLinkOperations.getTargets(files, "parameters", true)).isEmpty() && eq_n0rd9q_a0a1a0a3a1a5(art.getSourcePath(), BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(files, "path", true), "virtual_getRelativePath_5481553824944787371", new Object[]{}))) {
            return true;
          }
        } else if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.build.structure.BuildLayout_AbstractCopy")) {
          SNode copy = SNodeOperations.as(c, "jetbrains.mps.build.structure.BuildLayout_Copy");
          if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(copy, "fileset", true), "jetbrains.mps.build.structure.BuildInputFiles")) {
            SNode inputSet = SNodeOperations.cast(SLinkOperations.getTarget(copy, "fileset", true), "jetbrains.mps.build.structure.BuildInputFiles");
            if (ListSequence.fromList(SLinkOperations.getTargets(inputSet, "selectors", true)).isEmpty() && eq_n0rd9q_a0a1a1a0a0d0b0f(art.getSourcePath(), BehaviorReflection.invokeVirtual(String.class, SLinkOperations.getTarget(inputSet, "dir", true), "virtual_getRelativePath_5481553824944787371", new Object[]{}))) {
              return true;
            }
          }
        }
      }
    }
    return BehaviorReflection.invokeSuper(Boolean.TYPE, thisNode, "jetbrains.mps.build.structure.BuildLayout_NamedContainer", "virtual_exports_6547494638219603457", new Object[]{object});
  }

  public static Iterable<SNode> call_getImportContentChildren_7045211410692956036(SNode thisNode) {
    List<SNode> list = ListSequence.fromList(SLinkOperations.getTargets(thisNode, "children", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.build.structure.BuildLayout_ImportContent");
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SNodeOperations.cast(it, "jetbrains.mps.build.structure.BuildLayout_ImportContent");
      }
    }).toListSequence();
    return ListSequence.fromList(list).concat(ListSequence.fromList(list).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it, "target", false), "jetbrains.mps.build.structure.BuildLayout_Folder");
      }
    }).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return BuildLayout_Folder_Behavior.call_getImportContentChildren_7045211410692956036(SNodeOperations.cast(SLinkOperations.getTarget(it, "target", false), "jetbrains.mps.build.structure.BuildLayout_Folder"));
      }
    }));
  }

  private static boolean eq_n0rd9q_a0a1a0a3a1a5(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_n0rd9q_a0a1a1a0a0d0b0f(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
