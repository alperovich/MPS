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
package jetbrains.mps.ide.persistence;

import jetbrains.mps.project.Project;
import org.jetbrains.mps.openapi.persistence.ModelRoot;

import javax.swing.JComponent;

/**
 * evgeny, 10/24/12
 */
public interface ModelRootSettingsEditor {
  //project here wil be removed since we have per-project repos
  void reset(Project p, ModelRoot root);

  void apply(ModelRoot root);

  JComponent getComponent();
}
