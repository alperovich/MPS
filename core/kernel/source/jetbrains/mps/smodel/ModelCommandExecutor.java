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
package jetbrains.mps.smodel;import org.jetbrains.mps.openapi.model.SModelReference;import org.jetbrains.mps.openapi.model.SModel;import org.jetbrains.mps.openapi.model.SModel;import org.jetbrains.mps.openapi.model.SModelId;import org.jetbrains.mps.openapi.model.SReference;import org.jetbrains.mps.openapi.model.SNodeReference;import org.jetbrains.mps.openapi.model.SNodeId;import org.jetbrains.mps.openapi.model.SNode;

import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.project.Project;
import jetbrains.mps.util.Computable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.ConcurrentMap;

/**
 * Evgeny Gryaznov, Sep 3, 2010
 */
public interface ModelCommandExecutor {

  boolean canRead();

  void checkReadAccess();

  boolean canWrite();

  void checkWriteAccess();

  void runReadAction(Runnable r);

  void runWriteAction(Runnable r);

  void runWriteInEDT(Runnable r);

  /**
   * Enables canRead() without actually acquiring the read lock (screw you, ReadWriteLock!).
   * Requires read lock in the "parent" thread.
   * Thread local. Returns previous value, to which it must be reset after use (in finally{}).
   *
   * @param flag
   * @return
   */
  boolean setReadEnabledFlag(boolean flag);

  boolean isInEDT();

  <T> T runReadAction(Computable<T> c);

  void writeFilesInEDT(@NotNull final Runnable action);

  public interface RunnableWithProgress {
    void run(@NotNull ProgressMonitor monitor);
  }

  void runWriteActionWithProgressSynchronously(@NotNull RunnableWithProgress runnable, String progressTitle, boolean canBeCanceled,
                                               jetbrains.mps.project.Project project);

  <T> T runWriteAction(Computable<T> c);

  <T> T runReadInWriteAction(Computable<T> c);

  void runReadInEDT(Runnable r);

  void runCommandInEDT(@NotNull Runnable r, @NotNull Project p);

  void executeCommand(Runnable r, Project project);

  /**
   * use runWriteActionInCommand(final Computable<T> c, Project project)
   */
  @Deprecated
  <T> T runWriteActionInCommand(Computable<T> c);

  /**
   * use runWriteActionInCommand(Runnable r, Project project)
   */
  @Deprecated
  void runWriteActionInCommand(Runnable r);

  <T> T runWriteActionInCommand(Computable<T> c, Project project);

  <T> T runWriteActionInCommand(Computable<T> c, @Nullable String name, @Nullable Object groupId, boolean requestUndoConfirmation, Project project);

  void runWriteActionInCommand(Runnable r, Project project);

  void runWriteActionInCommand(Runnable r, @Nullable String name, @Nullable Object groupId, boolean requestUndoConfirmation, Project project);

  /**
   * use runCommandInEDT
   */
  @Deprecated
  void runWriteActionInCommandAsync(Runnable r, Project project);

  void runUndoTransparentCommand(Runnable r);

  void runUndoTransparentCommand(Runnable r, Project project);

  boolean isInsideCommand();

  void runIndexing(Runnable r);

  void addCommandListener(ModelAccessListener l);

  void removeCommandListener(ModelAccessListener l);

  /**
   * Returns true iff the locking and the operation were successful.
   *
   * @param r
   * @return
   */
  boolean tryRead(Runnable r);

  /**
   * Returns the result of the computation, null if locking was unsuccessful.
   *
   * @param c
   * @param <T>
   * @return
   */
  <T> T tryRead(Computable<T> c);

  /**
   * Does everything to ensure the locking and the operation success, including asking for the user confirmation.
   * Throws a RuntimeException if nothing helped.
   *
   * @param r
   * @return
   */
  void requireRead(Runnable r);

  /**
   * Does everything to ensure the locking and the operation success, including asking for the user confirmation.
   * Throws a RuntimeException if nothing helped.
   * Returns the result of the computation.
   *
   * @param c
   * @return
   */
  <T> T requireRead(Computable<T> c);

  void flushEventQueue();

  /**
   * Returns true iff the locking and the operation were successful.
   *
   * @param r
   * @return
   */
  boolean tryWrite(Runnable r);

  /**
   * Returns the result of the computation, null if locking was unsuccessful.
   *
   * @param c
   * @param <T>
   * @return
   */
  <T> T tryWrite(Computable<T> c);

  /**
   * Does everything to ensure the locking and the operation success, including asking for the user confirmation.
   * Throws a RuntimeException if nothing helped.
   *
   * @param r
   */
  void requireWrite(Runnable r);

  /**
   * Does everything to ensure the locking and the operation success, including asking for the user confirmation.
   * Throws a RuntimeException if nothing helped.
   * Returns the result of the computation.
   *
   * @param c
   * @return
   */
  <T> T requireWrite(Computable<T> c);

  boolean tryWriteInCommand(Runnable r, Project p);

  <T> T tryWriteInCommand(Computable<T> r, Project p);

  @Nullable
  public <K, V> ConcurrentMap<K, V> getRepositoryStateCache(String repositoryKey);
}
