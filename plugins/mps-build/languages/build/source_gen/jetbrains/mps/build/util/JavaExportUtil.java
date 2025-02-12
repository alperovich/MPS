package jetbrains.mps.build.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.build.behavior.BuildSource_JavaLibrary_Behavior;
import java.util.List;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import org.jetbrains.annotations.Nullable;

public class JavaExportUtil {
  public JavaExportUtil() {
  }

  public static void requireLibrary(final VisibleArtifacts artifacts, SNode library, SNode contextNode, final RequiredDependenciesBuilder builder) {
    if (SNodeOperations.getContainingRoot(library) == SNodeOperations.getContainingRoot(contextNode)) {
      return;
    }


    SNode target = SNodeOperations.as(artifacts.toOriginalNode(library), "jetbrains.mps.build.structure.BuildSource_JavaLibrary");
    if (target == null || SNodeOperations.getModel(target).getModule() instanceof TransientModelsModule) {
      // problem with transient models, already reported 
      return;
    }

    if (BuildSource_JavaLibrary_Behavior.call_canExportByParts_5610619299014309362(target)) {
      List<Tuples._2<SNode, Boolean>> result = ListSequence.fromList(new ArrayList<Tuples._2<SNode, Boolean>>());

      for (SNode element : ListSequence.fromList(SLinkOperations.getTargets(target, "elements", true))) {
        SNode jcp = SNodeOperations.as(element, "jetbrains.mps.build.structure.BuildSource_JavaLibraryCP");
        if ((jcp == null)) {
          return;
        }
        SNode classpath = SLinkOperations.getTarget(jcp, "classpath", true);
        if (SNodeOperations.isInstanceOf(classpath, "jetbrains.mps.build.structure.BuildSource_JavaJar")) {
          Tuples._2<SNode, String> resource = artifacts.getResource(SLinkOperations.getTarget(SNodeOperations.cast(classpath, "jetbrains.mps.build.structure.BuildSource_JavaJar"), "path", true));
          SNode jarArtifact = SNodeOperations.as(resource._0(), "jetbrains.mps.build.structure.BuildLayout_Node");
          if (jarArtifact != null) {
            ListSequence.fromList(result).addElement(MultiTuple.<SNode,Boolean>from(jarArtifact, isNotEmpty_4xqa58_a1a0a0a2a3a2a6a1(resource._1())));
          }
        } else if (SNodeOperations.isInstanceOf(classpath, "jetbrains.mps.build.structure.BuildSource_JavaLibraryExternalJar")) {
          Tuples._2<SNode, Boolean> requiredJar = requireJar(artifacts, SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(classpath, "jetbrains.mps.build.structure.BuildSource_JavaLibraryExternalJar"), "extJar", true), "jar", false), contextNode);
          if (requiredJar != null) {
            ListSequence.fromList(result).addElement(requiredJar);
          }
        } else if (SNodeOperations.isInstanceOf(classpath, "jetbrains.mps.build.structure.BuildSource_JavaLibraryExternalJarFolder")) {
          SNode requiredJarFolder = requireJarFolder(artifacts, SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(classpath, "jetbrains.mps.build.structure.BuildSource_JavaLibraryExternalJarFolder"), "extFolder", true), "folder", false), contextNode);
          if (requiredJarFolder != null) {
            ListSequence.fromList(result).addElement(MultiTuple.<SNode,Boolean>from(requiredJarFolder, true));
          }
        } else {
          // fatal, unknown element 
          ListSequence.fromList(result).clear();
          break;
        }
      }

      if (ListSequence.fromList(result).isNotEmpty()) {
        artifacts.needsFetch(contextNode);
        for (Tuples._2<SNode, Boolean> pair : ListSequence.fromList(result)) {
          if ((boolean) pair._1()) {
            builder.addWithContent(pair._0());
          } else {
            builder.add(pair._0());
          }
        }
        return;
      }
    }

    SNode artifact = SNodeOperations.as(artifacts.findArtifact(target), "jetbrains.mps.build.structure.BuildLayout_Node");
    if (artifact != null) {
      artifacts.needsFetch(contextNode);
      if (SNodeOperations.isInstanceOf(artifact, "jetbrains.mps.build.structure.BuildLayout_ExportAsJavaLibrary")) {
        ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(artifact, "jetbrains.mps.build.structure.BuildLayout_ExportAsJavaLibrary"), "children", true)).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SNodeOperations.as(artifacts.findArtifact(it), "jetbrains.mps.build.structure.BuildLayout_Node");
          }
        }).visitAll(new IVisitor<SNode>() {
          public void visit(SNode it) {
            if (it != null) {
              builder.add(it);
            }
          }
        });
      } else {
        builder.add(artifact, target);
      }
    }
  }

  public static void requireModule(VisibleArtifacts artifacts, SNode module, SNode contextNode, RequiredDependenciesBuilder builder) {

    SNode target = SNodeOperations.as(artifacts.toOriginalNode(module), "jetbrains.mps.build.structure.BuildSource_JavaModule");

    // dependencies closure 
    JavaModulesClosure closure = new JavaModulesClosure(artifacts.getGenContext(), target).closure(true);

    // searh for artifacts 
    Iterable<SNode> required = Sequence.fromIterable(((Iterable<SNode>) closure.getModules())).concat(Sequence.fromIterable(((Iterable<SNode>) closure.getJars())).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "path", true);
      }
    })).concat(Sequence.fromIterable(Sequence.<SNode>singleton(target)));
    boolean hasDependencies = false;
    for (SNode n : Sequence.fromIterable(required)) {
      if (SNodeOperations.getContainingRoot(n) == SNodeOperations.getContainingRoot(contextNode)) {
        continue;
      }

      SNode artifact = SNodeOperations.as(artifacts.findArtifact(n), "jetbrains.mps.build.structure.BuildLayout_Node");
      if (artifact != null) {
        builder.add(artifact, n);
        hasDependencies = true;
      }
    }

    for (SNode lib : Sequence.fromIterable((Iterable<SNode>) closure.getLibraries())) {
      if (SNodeOperations.getContainingRoot(lib) == SNodeOperations.getContainingRoot(contextNode)) {
        continue;
      }

      requireLibrary(artifacts, lib, contextNode, builder);
    }

    for (SNode extJar : CollectionSequence.fromCollection(closure.getExternalJars())) {
      if (SNodeOperations.getContainingRoot(extJar) == SNodeOperations.getContainingRoot(contextNode)) {
        continue;
      }

      Tuples._2<SNode, Boolean> jarImport = requireJar(artifacts, extJar, contextNode);
      if (jarImport != null) {
        if ((boolean) jarImport._1()) {
          builder.addWithContent(jarImport._0());
        } else {
          builder.add(jarImport._0());
        }
        hasDependencies = true;
      }
    }

    for (Tuples._2<SNode, String> extJarInFolder : CollectionSequence.fromCollection(closure.getExternalJarsInFolder())) {
      if (SNodeOperations.getContainingRoot(extJarInFolder._0()) == SNodeOperations.getContainingRoot(contextNode)) {
        continue;
      }

      SNode folderNode = requireJarFolder(artifacts, extJarInFolder._0(), contextNode);
      if (folderNode != null) {
        builder.addWithContent(folderNode);
        hasDependencies = true;
      }
    }

    if (hasDependencies) {
      artifacts.needsFetch(contextNode);
    }
  }

  @Nullable
  public static Tuples._2<SNode, Boolean> requireJar(VisibleArtifacts artifacts, SNode jar, SNode contextNode) {
    if (SNodeOperations.getContainingRoot(jar) == SNodeOperations.getContainingRoot(contextNode)) {
      return null;
    }

    SNode target = SNodeOperations.as(artifacts.toOriginalNode(jar), "jetbrains.mps.build.structure.BuildSource_SingleFile");
    if (target == null) {
      return null;
    }

    SNode artifact = null;
    boolean withContent = false;
    if (SNodeOperations.isInstanceOf(target, "jetbrains.mps.build.structure.BuildLayout_Node")) {
      artifact = SNodeOperations.as(artifacts.findArtifact(target), "jetbrains.mps.build.structure.BuildLayout_Node");
    } else if (SNodeOperations.isInstanceOf(target, "jetbrains.mps.build.structure.BuildInputSingleFile")) {
      Tuples._2<SNode, String> resource = artifacts.getResource(SLinkOperations.getTarget(SNodeOperations.cast(target, "jetbrains.mps.build.structure.BuildInputSingleFile"), "path", true));
      artifact = SNodeOperations.as(resource._0(), "jetbrains.mps.build.structure.BuildLayout_Node");
      withContent = isNotEmpty_4xqa58_a0a2a0h0d(resource._1());
    }
    if (artifact == null) {
      return null;
    }
    return MultiTuple.<SNode,Boolean>from(artifact, withContent);
  }

  @Nullable
  public static SNode requireJarFolder(VisibleArtifacts artifacts, SNode jarFolder, SNode contextNode) {
    if (SNodeOperations.getContainingRoot(jarFolder) == SNodeOperations.getContainingRoot(contextNode)) {
      return null;
    }

    SNode target = SNodeOperations.as(artifacts.toOriginalNode(jarFolder), "jetbrains.mps.build.structure.BuildSource_SingleFolder");
    if (target == null) {
      return null;
    }

    SNode artifact = null;
    if (SNodeOperations.isInstanceOf(target, "jetbrains.mps.build.structure.BuildLayout_AbstractContainer")) {
      artifact = SNodeOperations.as(artifacts.findArtifact(target), "jetbrains.mps.build.structure.BuildLayout_AbstractContainer");
    } else if (SNodeOperations.isInstanceOf(target, "jetbrains.mps.build.structure.BuildInputSingleFolder")) {
      artifact = SNodeOperations.as(artifacts.getResource(SLinkOperations.getTarget(SNodeOperations.cast(target, "jetbrains.mps.build.structure.BuildInputSingleFolder"), "path", true))._0(), "jetbrains.mps.build.structure.BuildLayout_AbstractContainer");
    }
    return artifact;

  }

  public static boolean isNotEmpty_4xqa58_a1a0a0a2a3a2a6a1(String str) {
    return str != null && str.length() > 0;
  }

  public static boolean isNotEmpty_4xqa58_a0a2a0h0d(String str) {
    return str != null && str.length() > 0;
  }
}
