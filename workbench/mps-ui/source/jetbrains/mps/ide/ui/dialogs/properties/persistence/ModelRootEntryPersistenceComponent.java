/*
 * Copyright 2003-2012 JetBrains s.r.o.
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
package jetbrains.mps.ide.ui.dialogs.properties.persistence;

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.ide.ui.dialogs.properties.roots.editors.ModelRootEntryPersistence;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.jetbrains.annotations.NotNull;

public class ModelRootEntryPersistenceComponent implements ApplicationComponent {
  private static final Logger LOG = LogManager.getLogger(ModelRootEntryPersistenceComponent.class);

  @Override
  public void initComponent() {
    ModelRootEntryPersistence registry = ModelRootEntryPersistence.getInstance();

    ModelRootEntryEP[] extensions = ModelRootEntryEP.EP_NAME.getExtensions();
    for (ModelRootEntryEP extension : extensions) {
      registry.addModelRootEntry(extension.rootType, extension.getModelRootEntryFactory());
    }
  }

  @Override
  public void disposeComponent() {

  }

  @NotNull
  @Override
  public String getComponentName() {
    return "MPS ModelRootEntry custom persistence";
  }
}
