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

package jetbrains.mps.idea.core.psi.impl;

import com.intellij.lang.FileASTNode;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileSystemItem;
import com.intellij.psi.PsiManager;
import com.intellij.psi.SingleRootFileViewProvider;
import com.intellij.psi.search.PsiElementProcessor;
import com.intellij.testFramework.LightVirtualFile;
import com.intellij.util.IncorrectOperationException;
import jetbrains.mps.fileTypes.MPSFileTypeFactory;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.util.Computable;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNodeId;
import org.jetbrains.mps.openapi.model.SNodeReference;

import javax.swing.Icon;

/**
 * User: fyodor
 * Date: 3/5/13
 */
public class MPSPsiRootNode extends MPSPsiNodeBase implements PsiFile {

  private final FileViewProvider myViewProvider;
  private final SNodeId myNodeId;
  private String myName;
  private MPSPsiModel myModel;

  public MPSPsiRootNode (SNodeId nodeId, String name,  PsiManager manager) {
    this(nodeId, name, manager, null);
  }

  public MPSPsiRootNode (SNodeId nodeId, String name,  PsiManager manager, @Nullable VirtualFile virtualFile) {
    super(manager);
    myNodeId = nodeId;
    myName = name;
    myViewProvider = virtualFile == null
      ? new SingleRootFileViewProvider(manager, new LightVirtualFile(), false)
      : new SingleRootFileViewProvider(manager, virtualFile);
  }

  @Override
  protected Icon getBaseIcon() {
    return ModelAccess.instance().runReadAction(new Computable<Icon>() {
      @Override
      public Icon compute() {
        return IconManager.getIconFor(getSNodeReference().resolve(MPSModuleRepository.getInstance()), true);
      }
    });
  }

  @Nullable
  @Override
  protected Icon getElementIcon(@IconFlags int flags) {
    return getBaseIcon();
  }

  @Nullable
  @Override
  public VirtualFile getVirtualFile() {
    if(!(myViewProvider.getVirtualFile() instanceof LightVirtualFile))
      return myViewProvider.getVirtualFile();
    return MPSNodesVirtualFileSystem.getInstance().getFileFor(getSNodeReference());
  }

  @Override
  public boolean processChildren(PsiElementProcessor<PsiFileSystemItem> processor) {
    return false;
  }

  public void setModel(MPSPsiModel model) {
    myModel = model;
  }

  @Override
  public MPSPsiModel getContainingModel() {
    return myModel != null ? myModel : super.getContainingModel();
  }

  @Nullable
  @Override
  public PsiDirectory getContainingDirectory() {
    return getContainingModel();
  }

  @Override
  public boolean isDirectory() {
    return false;
  }

  @Nullable
  @Override
  public PsiDirectory getParent() {
    if(myViewProvider.getVirtualFile().getFileType() == MPSFileTypeFactory.MPS_ROOT_FILE_TYPE && super.getParent() instanceof MPSPsiModel)
      return ((MPSPsiModel) super.getParent()).getParentDirectory();
    return (PsiDirectory) super.getParent();
  }

  @Override
  public String toString() {
    return "Root: " + myNodeId.toString();
  }

  @Override
  public long getModificationStamp() {
    return getVirtualFile().getModificationStamp();
  }

  @NotNull
  @Override
  public PsiFile getOriginalFile() {
    return this;
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return MPSFileTypeFactory.MPS_NODE_FILE_TYPE;
  }

  @Override
  public String getName() {
    return myName;
  }

  @NotNull
  @Override
  public PsiFile[] getPsiRoots() {
    return new PsiFile[] {this};
  }

  @NotNull
  @Override
  public FileViewProvider getViewProvider() {
    return myViewProvider;
  }

  @Override
  public FileASTNode getNode() {
    return null;
  }

  @Override
  public void navigate(boolean requestFocus) {
    super.navigate(requestFocus);    //To change body of overridden methods use File | Settings | File Templates.
  }

  @Override
  public boolean isPhysical() {
    return true;
  }

  @Override
  public void subtreeChanged() {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void checkSetName(String name) throws IncorrectOperationException {
    throw new IncorrectOperationException("Not implemented");
  }

  @Override
  public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
    throw new IncorrectOperationException("Not implemented");
  }

  public SNodeId getNodeId() {
    return myNodeId;
  }

  public SNodeReference getSNodeReference() {
    MPSPsiModel psiModel = getContainingModel();
    if (psiModel == null) return null;
    return new SNodePointer(psiModel.getSModelReference(), myNodeId);
  }

  // added for idea search scope to work with our virtual files
  // see PsiSearchScopeUtil.isInScope
  @Override
  public PsiElement getContext() {
    return null;
  }

  @Override
  public boolean isWritable() {
    return true;
  }

  @Override
  public String getText() {
    // implemented to avoid assertion error in PsiDocumentManagerImpl.getDocument(PsiFile)
    // document.getTextLength() != file.getTextLength() fails
    return myViewProvider.getPsi(getLanguage()).getText();
  }

}
