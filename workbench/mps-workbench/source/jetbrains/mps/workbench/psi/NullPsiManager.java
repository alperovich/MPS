/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.workbench.psi;

import com.intellij.openapi.Disposable;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.LanguageInjector;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiTreeChangeListener;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.psi.impl.PsiManagerEx;
import com.intellij.psi.impl.PsiModificationTrackerImpl;
import com.intellij.psi.impl.PsiTreeChangeEventImpl;
import com.intellij.psi.impl.cache.CacheManager;
import com.intellij.psi.impl.file.impl.FileManager;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.psi.search.PsiSearchHelper;
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.psi.util.PsiModificationTracker;
import com.intellij.util.IncorrectOperationException;
import com.intellij.util.ThrowableRunnable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

class NullPsiManager extends PsiManagerEx {
  private Project myProject;
  private FileManager myFileManager;

  NullPsiManager(Project project) {
    myProject = project;
  }

  @Override
  public boolean isBatchFilesProcessingMode() {
    return false;
  }

  @Override
  public boolean isAssertOnFileLoading(VirtualFile file) {
    return false;
  }

  public void nonPhysicalChange() {

  }

  public void physicalChange() {

  }

  public ResolveCache getResolveCache() {
    return null;
  }

  @Override
  public void registerRunnableToRunOnChange(Runnable runnable) {

  }

  public void registerWeakRunnableToRunOnChange(Runnable runnable) {

  }

  @Override
  public void registerRunnableToRunOnAnyChange(Runnable runnable) {

  }

  @Override
  public void registerRunnableToRunAfterAnyChange(Runnable runnable) {

  }

  @Override
  public FileManager getFileManager() {
    if (myFileManager == null) {
      myFileManager = new NullFileManager();
    }
    return myFileManager;
  }

  @Override
  public void beforeChildAddition(@NotNull PsiTreeChangeEventImpl event) {

  }

  public void invalidateFile(PsiFile file) {

  }

  @Override
  public void beforeChildRemoval(PsiTreeChangeEventImpl event) {

  }

  @Override
  public void beforeChildReplacement(@NotNull PsiTreeChangeEventImpl psiTreeChangeEvent) {

  }

  @Override
  public void beforeChange(boolean isPhysical) {

  }

  @Override
  public void afterChange(boolean isPhysical) {

  }

  public CacheManager getCacheManager() {
    return null;
  }

  @NotNull
  public List<? extends LanguageInjector> getLanguageInjectors() {
    return new ArrayList<LanguageInjector>();
  }

  @Override
  @NotNull
  public Project getProject() {
    return myProject;
  }

  @Override
  @Nullable
  public PsiFile findFile(@NotNull VirtualFile file) {
    return null;
  }

  @Override
  @Nullable
  public FileViewProvider findViewProvider(@NotNull VirtualFile file) {
    return null;
  }

  @Override
  @Nullable
  public PsiDirectory findDirectory(@NotNull VirtualFile file) {
    return null;
  }

  @Override
  public boolean areElementsEquivalent(@Nullable PsiElement element1, @Nullable PsiElement element2) {
    return false;
  }

  @Override
  public void reloadFromDisk(@NotNull PsiFile file) {
  }

  @Override
  public void addPsiTreeChangeListener(@NotNull PsiTreeChangeListener listener) {

  }

  @Override
  public void addPsiTreeChangeListener(@NotNull PsiTreeChangeListener listener, Disposable parentDisposable) {

  }

  @Override
  public void removePsiTreeChangeListener(@NotNull PsiTreeChangeListener listener) {

  }

  @NotNull
  public CodeStyleManager getCodeStyleManager() {
    throw new UnsupportedOperationException();
  }

  @NotNull
  public PsiSearchHelper getSearchHelper() {
    throw new UnsupportedOperationException();
  }

  @Override
  @NotNull
  public PsiModificationTracker getModificationTracker() {
    return new PsiModificationTrackerImpl(myProject) {
      @Override
      public long getModificationCount() {
        return 0;
      }

      @Override
      public long getOutOfCodeBlockModificationCount() {
        return 0;
      }

      @Override
      public long getJavaStructureModificationCount() {
        return 0;
      }
    };
    //throw new UnsupportedOperationException();
  }

  @NotNull
  public CachedValuesManager getCachedValuesManager() {
    throw new UnsupportedOperationException();
  }

  public void moveFile(@NotNull PsiFile file, @NotNull PsiDirectory newParentDir) throws IncorrectOperationException {

  }

  public void moveDirectory(@NotNull PsiDirectory dir, @NotNull PsiDirectory newParentDir) throws IncorrectOperationException {

  }

  public void checkMove(@NotNull PsiElement element, @NotNull PsiElement newContainer) throws IncorrectOperationException {

  }

  @Override
  public void startBatchFilesProcessingMode() {

  }

  @Override
  public void finishBatchFilesProcessingMode() {

  }

  @Override
  public boolean isDisposed() {
    return false;
  }

  @Override
  public void dropResolveCaches() {

  }

  @Override
  public boolean isInProject(@NotNull PsiElement element) {
    return false;
  }

  public void performActionWithFormatterDisabled(Runnable r) {

  }

  public <T extends Throwable> void performActionWithFormatterDisabled(ThrowableRunnable<T> r) throws T {

  }

  public <T> T performActionWithFormatterDisabled(Computable<T> r) {
    return null;
  }

  public void postponeAutoFormattingInside(Runnable runnable) {

  }

  public void registerLanguageInjector(@NotNull LanguageInjector injector) {

  }

  public void registerLanguageInjector(@NotNull LanguageInjector injector, Disposable parentDisposable) {

  }

  public void unregisterLanguageInjector(@NotNull LanguageInjector injector) {

  }
}
