package jetbrains.mps.workbench.findusages;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.mps.openapi.persistence.FindUsagesParticipant;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import org.jetbrains.mps.openapi.model.SModel;
import java.util.Set;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.util.Consumer;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.util.containers.MultiMap;
import jetbrains.mps.util.Mapper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import jetbrains.mps.findUsages.FindUsagesUtil;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.smodel.SModelStereotype;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.util.containers.SetBasedMultiMap;
import jetbrains.mps.persistence.java.library.JavaClassStubModelDescriptor;
import jetbrains.mps.util.containers.ManyToManyMap;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.extapi.persistence.FolderSetDataSource;
import gnu.trove.THashSet;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import org.apache.log4j.Priority;
import com.intellij.openapi.vfs.VfsUtilCore;
import com.intellij.openapi.vfs.VirtualFileVisitor;
import com.intellij.util.indexing.FileBasedIndex;
import com.intellij.psi.impl.cache.impl.id.IdIndex;
import com.intellij.psi.impl.cache.impl.id.IdIndexEntry;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class StubModelsFastFindSupport implements ApplicationComponent, FindUsagesParticipant {
  public StubModelsFastFindSupport() {
  }

  @Override
  public void initComponent() {
    PersistenceFacade.getInstance().addFindUsagesParticipant(this);
  }

  @Override
  public void disposeComponent() {
    PersistenceFacade.getInstance().removeFindUsagesParticipant(this);
  }

  @NotNull
  @Override
  public String getComponentName() {
    return StubModelsFastFindSupport.class.getSimpleName();
  }



  @Override
  public void findUsages(Collection<SModel> models, Set<SNode> nodes, Consumer<SReference> consumer, Consumer<SModel> processedConsumer) {
    nodes = SetSequence.fromSetWithValues(new HashSet<SNode>(), SetSequence.fromSet(nodes).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return it.getNodeId() instanceof SNodeId.Foreign;
      }
    }));
    MultiMap<SModel, SNode> candidates = findCandidates(models, nodes, processedConsumer, new Mapper<SNode, String>() {
      @Override
      public String value(SNode key) {
        return key.getNodeId().toString();
      }
    });
    for (SNode node : SetSequence.fromSet(nodes)) {
      SNode snode = ((SNode) node);
      if (!(SNodeOperations.isInstanceOf(snode, "jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration"))) {
        continue;
      }
      candidates.putValue(SNodeOperations.getModel(snode), node);
    }

    for (Map.Entry<SModel, Collection<SNode>> e : candidates.entrySet()) {
      FindUsagesUtil.collectUsages(e.getKey(), e.getValue(), consumer);
    }
  }

  @Override
  public void findInstances(Collection<SModel> models, Set<SAbstractConcept> concepts, Consumer<SNode> consumer, Consumer<SModel> processedConsumer) {
    final String blName = "jetbrains.mps.baseLanguage";
    concepts = SetSequence.fromSetWithValues(new HashSet<SAbstractConcept>(), SetSequence.fromSet(concepts).where(new IWhereFilter<SAbstractConcept>() {
      public boolean accept(SAbstractConcept it) {
        return it.getLanguage().getQualifiedName().equals(blName);
      }
    }));

    MultiMap<SModel, SAbstractConcept> candidates = findCandidates(models, concepts, processedConsumer, null);
    for (Map.Entry<SModel, Collection<SAbstractConcept>> e : candidates.entrySet()) {
      FindUsagesUtil.collectInstances(e.getKey(), e.getValue(), consumer);
    }
  }

  @Override
  public void findModelUsages(Collection<SModel> scope, Set<SModelReference> modelReferences, Consumer<SModel> consumer, Consumer<SModel> processedConsumer) {
    modelReferences = SetSequence.fromSetWithValues(new HashSet<SModelReference>(), SetSequence.fromSet(modelReferences).where(new IWhereFilter<SModelReference>() {
      public boolean accept(SModelReference it) {
        return "java_stub".equals(SModelStereotype.getStereotype(it.getModelName()));
      }
    }));
    MultiMap<SModel, SModelReference> candidates = findCandidates(scope, modelReferences, processedConsumer, new Mapper<SModelReference, String>() {
      @Override
      public String value(SModelReference key) {
        return key.getModelName();
      }
    });
    for (Map.Entry<SModel, Collection<SModelReference>> e : candidates.entrySet()) {
      if (FindUsagesUtil.hasModelUsages(e.getKey(), e.getValue())) {
        consumer.consume(e.getKey());
      }
    }


  }

  private <T> MultiMap<SModel, T> findCandidates(Collection<SModel> models, Set<T> elems, Consumer<SModel> processedConsumer, @Nullable Mapper<T, String> id) {
    MultiMap<SModel, T> result = new SetBasedMultiMap<SModel, T>();
    if (elems.isEmpty()) {
      for (SModel sm : models) {
        if (sm instanceof JavaClassStubModelDescriptor) {
          processedConsumer.consume(sm);
        }
      }
      return result;
    }

    // get all files in scope 
    final ManyToManyMap<SModel, VirtualFile> scopeFiles = new ManyToManyMap<SModel, VirtualFile>();

    Set<FolderSetDataSource> sources = new THashSet<FolderSetDataSource>();
    final Set<VirtualFile> dirs = new THashSet<VirtualFile>();

    for (final SModel sm : models) {
      if (!(sm instanceof JavaClassStubModelDescriptor)) {
        continue;
      }

      processedConsumer.consume(sm);
      FolderSetDataSource source = ((JavaClassStubModelDescriptor) sm).getSource();
      if (!(sources.add(source))) {
        continue;
      }

      Collection<IFile> files = source.getAffectedFiles();
      for (IFile path : files) {
        final VirtualFile vf = VirtualFileUtils.getVirtualFile(path);
        if (vf == null) {
          if (LOG.isEnabledFor(Priority.WARN)) {
            LOG.warn("File " + path + ", which belows to model source of model " + sm.getReference().toString() + ", was not found in VFS. Assuming no usages in this file.");
          }
          continue;
        }
        VfsUtilCore.visitChildrenRecursively(vf, new VirtualFileVisitor<Object>() {
          @Override
          public boolean visitFile(@NotNull VirtualFile file) {
            if (file.isDirectory()) {
              return dirs.add(file);
            }
            scopeFiles.addLink(sm, file);
            return true;
          }
        });
      }
    }

    for (T elem : elems) {
      String nodeId = (id == null ?
        elem.toString() :
        id.value(elem)
      );
      // filter files with usages 
      ConcreteFilesGlobalSearchScope allFiles = new ConcreteFilesGlobalSearchScope(scopeFiles.getSecond());
      Collection<VirtualFile> matchingFiles = FileBasedIndex.getInstance().getContainingFiles(IdIndex.NAME, new IdIndexEntry(nodeId, true), allFiles);
      // back-transform 
      for (VirtualFile file : matchingFiles) {
        for (SModel m : scopeFiles.getBySecond(file)) {
          result.putValue(m, elem);
        }
      }
    }
    return result;
  }

  protected static Logger LOG = LogManager.getLogger(StubModelsFastFindSupport.class);
}
