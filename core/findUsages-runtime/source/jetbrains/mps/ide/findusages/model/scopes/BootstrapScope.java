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
package jetbrains.mps.ide.findusages.model.scopes;

import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.library.LibraryInitializer;
import jetbrains.mps.project.Project;
import org.jdom.Element;
import org.jetbrains.mps.openapi.module.SModule;

public class BootstrapScope extends FindUsagesScope {
  public BootstrapScope() {
    for (SModule module : LibraryInitializer.getInstance().getBootstrapModules(SModule.class)) {
      addModule(module);
    }
  }

  public BootstrapScope(Element element, Project project) throws CantLoadSomethingException {
    // nothing saved
    this();
  }

  public String toString() {
    return "bootstrap scope";
  }
}
