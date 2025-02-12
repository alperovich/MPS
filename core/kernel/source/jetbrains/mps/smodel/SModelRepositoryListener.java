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
package jetbrains.mps.smodel;

import org.jetbrains.mps.openapi.model.SModel;

import java.util.Set;

/**
 * use {@link org.jetbrains.mps.openapi.module.SRepositoryContentAdapter} via
 * {@link jetbrains.mps.extapi.module.SRepositoryRegistry#addGlobalListener(org.jetbrains.mps.openapi.module.SRepositoryListener)}
 */
@Deprecated
public interface SModelRepositoryListener {

  void beforeModelRemoved(SModel modelDescriptor);

  void modelRemoved(SModel modelDescriptor);

  void modelAdded(SModel modelDescriptor);

  void modelRenamed(SModel modelDescriptor);

  /**
   * This method will be called by SModelRepository to notify clients that underlying
   * SModel instances was replaced by another one (as a result of reloadFromDisk(),
   * or replaceModel() methods execution).
   * <p/>
   * It is guaranteed that this method will be executed in event dispatch thread if EDT is available.
   * <p/>
   * Old instance of SModel will not be attached to any SModel and will not
   * be disposed till the end of notifications processing.
   *
   * @param md model descriptor with replaced SModel instance
   */

  void modelsReplaced(Set<SModel> reloadedModels);

  SModelRepositoryListenerPriority getPriority();

  public enum SModelRepositoryListenerPriority {
    PLATFORM,
    CLIENT
  }
}

