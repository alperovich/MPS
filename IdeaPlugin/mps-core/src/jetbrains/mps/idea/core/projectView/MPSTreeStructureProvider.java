/*
 * Copyright 2003-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetbrains.mps.idea.core.projectView;

import com.intellij.ide.projectView.SelectableTreeStructureProvider;
import com.intellij.ide.projectView.ViewSettings;
import com.intellij.ide.projectView.impl.nodes.PsiDirectoryNode;
import com.intellij.ide.projectView.impl.nodes.PsiFileNode;
import com.intellij.ide.util.treeView.AbstractTreeNode;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.options.ex.SingleConfigurableEditor;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import jetbrains.mps.fileTypes.MPSFileTypeFactory;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.ide.ui.dialogs.properties.MPSPropertiesConfigurable;
import jetbrains.mps.ide.ui.dialogs.properties.ModelPropertiesConfigurable;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.idea.core.MPSBundle;
import jetbrains.mps.idea.core.MPSDataKeys;
import jetbrains.mps.idea.core.projectView.edit.SNodeCutCopyProvider;
import jetbrains.mps.idea.core.projectView.edit.SNodeDeleteProvider;
import jetbrains.mps.idea.core.projectView.edit.SNodePasteProvider;
import jetbrains.mps.idea.core.psi.impl.MPSPsiModel;
import jetbrains.mps.idea.core.psi.impl.MPSPsiNodeBase;
import jetbrains.mps.idea.core.psi.impl.MPSPsiProvider;
import jetbrains.mps.idea.core.psi.impl.MPSPsiRootNode;
import jetbrains.mps.idea.core.psi.impl.file.FileSourcePsiFile;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SModelFileTracker;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.module.SModule;

import javax.swing.SwingUtilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User: fyodor
 * Date: 2/27/13
 */
public class MPSTreeStructureProvider implements SelectableTreeStructureProvider, DumbAware {

  @Nullable
  @Override
  public PsiElement getTopLevelElement(PsiElement element) {
    return null;
  }

  @Override
  public Collection<AbstractTreeNode> modify(AbstractTreeNode treeNode, Collection<AbstractTreeNode> children, ViewSettings settings) {
    if (treeNode instanceof PsiDirectoryNode && !(treeNode instanceof MPSPsiModelTreeNode)) {
        return modifyDirectoryChildren(treeNode, children, settings);
    }
    if (!(treeNode instanceof MPSPsiModelTreeNode)) return children;

    MPSPsiModel psiModel = ((MPSPsiModelTreeNode) treeNode).getValue();

    List<AbstractTreeNode> newChildren = new ArrayList<AbstractTreeNode>();
    for (PsiElement psiElement : psiModel.getChildren()) {
      newChildren.add(new MPSPsiElementTreeNode(treeNode.getProject(), (MPSPsiRootNode) psiElement, settings));
    }

    return newChildren;
  }

  private Collection<AbstractTreeNode> modifyDirectoryChildren(AbstractTreeNode treeNode, Collection<AbstractTreeNode> children, ViewSettings settings) {
    List<AbstractTreeNode> updatedChildren = null;
    MPSPsiProvider mpsPsiProvider = MPSPsiProvider.getInstance(treeNode.getProject());

    for (AbstractTreeNode child : children) {
      if (child instanceof PsiFileNode) {
        PsiFile value = ((PsiFileNode) child).getValue();
        if (value instanceof FileSourcePsiFile) {
          SModelReference modelReference = ((FileSourcePsiFile) value).getModelReference();

          MPSPsiModel psiModel = mpsPsiProvider.getPsi(modelReference);

          if (updatedChildren == null) updatedChildren = new ArrayList<AbstractTreeNode>(children);

          int idx = updatedChildren.indexOf(child);
          updatedChildren.remove(idx);
          updatedChildren.add(idx, new MPSPsiModelTreeNode(treeNode.getProject(), psiModel, settings));
        } else if(value instanceof MPSPsiRootNode) {
          if (updatedChildren == null) updatedChildren = new ArrayList<AbstractTreeNode>(children);
          int idx = updatedChildren.indexOf(child);
          updatedChildren.remove(idx);
          updatedChildren.add(idx, new MPSPsiElementTreeNode(treeNode.getProject(), (MPSPsiRootNode) value, settings));
        }
      } else if(child instanceof PsiDirectoryNode) {
        final SModel perRootModel = SModelFileTracker.getInstance().findModel(VirtualFileUtils.toIFile(((PsiDirectoryNode) child).getVirtualFile()));
        if(perRootModel != null) {
          if (updatedChildren == null) updatedChildren = new ArrayList<AbstractTreeNode>(children);

          int idx = updatedChildren.indexOf(child);
          updatedChildren.remove(idx);
          updatedChildren.add(idx, new PsiDirectoryNode(treeNode.getProject(), ((PsiDirectoryNode) child).getValue(), settings) {
            @Override
            public boolean canNavigate() { return true; }

            @Override
            public String getNavigateActionText(boolean focusEditor) { return MPSBundle.message("open.model.properties.action"); }

            @Override
            public void navigate(boolean requestFocus) {
              MPSPropertiesConfigurable configurable = new ModelPropertiesConfigurable(perRootModel, ProjectHelper.toMPSProject(myProject), true);
              final SingleConfigurableEditor dialog = new SingleConfigurableEditor(myProject, configurable);
              configurable.setParentForCallBack(dialog);
              SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                  dialog.show();
                }
              });
            }
          });
        }
      }
    }

    return updatedChildren != null ? updatedChildren : children;
  }


  @Nullable
  @Override
  public Object getData(Collection<AbstractTreeNode> selected, String dataName) {
    if (selected == null) {
      return null;
    }

    if (PlatformDataKeys.COPY_PROVIDER.is(dataName) || PlatformDataKeys.CUT_PROVIDER.is(dataName)) {
      return getProvider(selected, CUT_COPY_PROVIDER_FACTORY);
    }
    if (PlatformDataKeys.DELETE_ELEMENT_PROVIDER.is(dataName)) {
      return getProvider(selected, DELETE_PROVIDER_FACTORY);
    }
    if (MPSDataKeys.MODEL_FILES.is(dataName)) {
      return getModelFiles(selected);
    }

    if (selected.size() != 1) {
      return null;
    }

    // Applicable only to single element selection
    AbstractTreeNode selectedNode = selected.iterator().next();

    if (PlatformDataKeys.VIRTUAL_FILE_ARRAY.is(dataName)) {
      return getModelFilesArray(selectedNode);
    }
    if (PlatformDataKeys.PASTE_PROVIDER.is(dataName)) {
      return getModelProvider(selectedNode, PASTE_PROVIDER_FACTORY);
    }
    if (MPSCommonDataKeys.CONTEXT_MODEL.is(dataName)) {
      return getModel(selectedNode);
    }
    if (MPSCommonDataKeys.MODEL.is(dataName)) {
      return getModel(selectedNode);
    }
    if (MPSCommonDataKeys.MODULE.is(dataName)) {
      return getModule(selectedNode);
    }
    if (LangDataKeys.MODULE.is(dataName)) {
      return getIdeaModule(selectedNode);
    }
    return null;
  }

  private <T> T getProvider (Collection<AbstractTreeNode> selected, ProviderFactory<T> createProvider) {
    if (selected.size() == 0) return null;

    List<SNodeReference> selectedNodePointers = new ArrayList<SNodeReference>();
    Project project = null;
    EditableSModelDescriptor modelDescriptor = null;

    for (AbstractTreeNode treeNode : selected) {
      if (!(treeNode instanceof MPSPsiElementTreeNode)) return null; // only root nodes please

      MPSPsiRootNode mpsPsiNode = ((MPSPsiElementTreeNode) treeNode).getValue();
      if (!mpsPsiNode.isValid()) return null;

      selectedNodePointers.add(mpsPsiNode.getSNodeReference());

      if (project == null) {
        project = treeNode.getProject();
      } else if (project != treeNode.getProject()) {
        return null; // only same project
      }

      if (modelDescriptor == null) {
        modelDescriptor = getModel(mpsPsiNode);
      } else if (modelDescriptor != getModel(mpsPsiNode)) {
        return null; // only same model
      }

    }
    jetbrains.mps.project.Project mpsProject = ProjectHelper.toMPSProject(project);
    if (mpsProject == null || modelDescriptor == null) return null;

    SModel sModel = modelDescriptor;
    if (sModel == null) return null;

    return createProvider.create(selectedNodePointers, modelDescriptor, sModel, mpsProject);
  }

  private <T> T getModelProvider (AbstractTreeNode treeNode, ModelProviderFactory<T> createProvider) {
    if (!(treeNode instanceof MPSPsiModelTreeNode)) return null; // only model

    MPSPsiModel psiModel = ((MPSPsiModelTreeNode) treeNode).getModel();
    if (!psiModel.isValid()) return null;

    Project project = treeNode.getProject();
    EditableSModelDescriptor modelDescriptor = getModel(treeNode);

    jetbrains.mps.project.Project mpsProject = ProjectHelper.toMPSProject(project);
    if (mpsProject == null || modelDescriptor == null) return null;

    SModel sModel = modelDescriptor;
    if (sModel == null) return null;

    return createProvider.create(modelDescriptor, sModel, mpsProject);
  }

  private Set<IFile> getModelFiles(Collection<AbstractTreeNode> selected) {
    Set<IFile> modelFiles = new HashSet<IFile>();
    for (AbstractTreeNode nextTreeNode : selected) {
      IFile nextModelFile = getModelFile(nextTreeNode);
      if (nextModelFile != null) {
        modelFiles.add(nextModelFile);
      }
    }
    return modelFiles;
  }

  private IFile getModelFile (AbstractTreeNode treeNode) {
    if (treeNode instanceof MPSPsiElementTreeNode) {
      return getModelFile(treeNode.getParent());
    }
    else if (treeNode instanceof MPSPsiModelTreeNode) {
      MPSPsiModelTreeNode fileNode = (MPSPsiModelTreeNode) treeNode;
      VirtualFile virtualFile = fileNode.getVirtualFile();
      if (virtualFile == null || virtualFile.getFileType() != MPSFileTypeFactory.MPS_FILE_TYPE || virtualFile.getFileType() != MPSFileTypeFactory.MPS_HEADER_FILE_TYPE) return null;

      return FileSystem.getInstance().getFileByPath(virtualFile.getPath());
    }
    return null;
  }

  private VirtualFile[] getModelFilesArray (AbstractTreeNode treeNode) {
    VirtualFile virtualFile = getVirtualFile(treeNode);
    if (virtualFile == null) return null;

    return new VirtualFile[] {virtualFile};
  }

  private VirtualFile getVirtualFile(AbstractTreeNode treeNode) {
    if (!(treeNode instanceof MPSPsiModelTreeNode)) {
      return null;
    }
    MPSPsiModelTreeNode modelTreeNode = (MPSPsiModelTreeNode) treeNode;
    VirtualFile modelVFile = modelTreeNode.getVirtualFile();
    if (modelVFile == null || (modelVFile.getFileType() != MPSFileTypeFactory.MPS_FILE_TYPE && modelVFile.getFileType() != MPSFileTypeFactory.MPS_HEADER_FILE_TYPE)) return null;
    return modelVFile;
  }

  private Module getIdeaModule (AbstractTreeNode treeNode) {
    VirtualFile modelVFile = getVirtualFile(treeNode);
    if (modelVFile == null) return null;
    return ModuleUtilCore.findModuleForFile(modelVFile, treeNode.getProject());
  }

  private SModule getModule(AbstractTreeNode selectedNode) {
    EditableSModelDescriptor contextModel = getContextModel(selectedNode);
    return contextModel != null ? contextModel.getModule() : null;
  }

  private EditableSModelDescriptor getModel(AbstractTreeNode selectedNode) {
    return selectedNode instanceof MPSPsiModelTreeNode ? getContextModel(selectedNode) : null;
  }

  private EditableSModelDescriptor getContextModel(AbstractTreeNode selectedNode) {
    if (selectedNode instanceof MPSPsiElementTreeNode) {
      MPSPsiNodeBase value = ((MPSPsiElementTreeNode) selectedNode).getValue();
      return getModel(value);
    }
    else if (selectedNode instanceof MPSPsiModelTreeNode) {
      MPSPsiModel psiModel = ((MPSPsiModelTreeNode) selectedNode).getModel();
      SModel sModel = psiModel.getSModelReference().resolve(MPSModuleRepository.getInstance());
      return (EditableSModelDescriptor) sModel;
    }
    return null;
  }

  private EditableSModelDescriptor getModel(MPSPsiNodeBase mpsPsiNode) {
    MPSPsiModel containingModel = mpsPsiNode.getContainingModel();
    SModel sModel = containingModel.getSModelReference().resolve(MPSModuleRepository.getInstance());
    return (EditableSModelDescriptor) sModel;
  }

  private static interface ProviderFactory<T> {
    T create(Collection<SNodeReference> selectedNodes, @NotNull EditableSModelDescriptor modelDescriptor, SModel sModel, @NotNull jetbrains.mps.project.Project project);
  }

  private static interface ModelProviderFactory<T> {
    T create(@NotNull EditableSModelDescriptor modelDescriptor, SModel sModel, @NotNull jetbrains.mps.project.Project project);
  }

  private static ProviderFactory<SNodeCutCopyProvider> CUT_COPY_PROVIDER_FACTORY = new ProviderFactory<SNodeCutCopyProvider>() {
    @Override
    public SNodeCutCopyProvider create(Collection<SNodeReference> selectedNodes, @NotNull EditableSModelDescriptor modelDescriptor, SModel sModel, @NotNull jetbrains.mps.project.Project project) {
      return new SNodeCutCopyProvider(selectedNodes, modelDescriptor, project);
    }
  };

  private static ProviderFactory<SNodeDeleteProvider> DELETE_PROVIDER_FACTORY = new ProviderFactory<SNodeDeleteProvider>() {
    @Override
    public SNodeDeleteProvider create(Collection<SNodeReference> selectedNodes, @NotNull EditableSModelDescriptor modelDescriptor, SModel sModel, @NotNull jetbrains.mps.project.Project project) {
      return new SNodeDeleteProvider(selectedNodes, modelDescriptor, project);
    }
  };

  private static ModelProviderFactory<SNodePasteProvider> PASTE_PROVIDER_FACTORY = new ModelProviderFactory<SNodePasteProvider>() {
    @Override
    public SNodePasteProvider create(@NotNull EditableSModelDescriptor modelDescriptor, SModel sModel, @NotNull jetbrains.mps.project.Project project) {
      return new SNodePasteProvider(sModel, project, modelDescriptor);
    }
  };

}
