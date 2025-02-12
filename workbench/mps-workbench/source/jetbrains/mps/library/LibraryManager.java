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
package jetbrains.mps.library;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import jetbrains.mps.InternalFlag;
import jetbrains.mps.ide.MPSCoreComponents;
import jetbrains.mps.library.contributor.BootstrapLibContributor;
import jetbrains.mps.workbench.WorkbenchPathManager;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


@State(
  name = "LibraryManager",
  storages = {
    @Storage(
      id = "other",
      file = "$APP_CONFIG$/libraryManager.xml"
    )}
)
public class LibraryManager extends BaseLibraryManager implements ApplicationComponent {
  public static LibraryManager getInstance() {
    return ApplicationManager.getApplication().getComponent(LibraryManager.class);
  }

  /**
   *
   * @param coreComponents
   * @param bootstrapLibContributor for right initialization order
   */
  public LibraryManager(MPSCoreComponents coreComponents, BootstrapLibContributor bootstrapLibContributor) {
    super(coreComponents.getModuleRepository());
  }

  private Map<String, Library> myCustomBuiltInLibraries = new HashMap<String, Library>();
  private Set<Library> myLibs = createLibs();

  @Override
  public void initComponent() {
    myCustomBuiltInLibraries = BuiltInLibrariesIO.readBuiltInLibraries();
    super.initComponent();
  }

  @Override
  public void disposeComponent() {
  }

  @Override
  public Set<Library> getUILibraries() {
    Set<Library> result = new HashSet<Library>(super.getUILibraries());
    result.addAll(myLibs);
    result.addAll(myCustomBuiltInLibraries.values());
    return result;
  }

  private Set<Library> createLibs() {
    Set<Library> result = new HashSet<Library>();
    if (InternalFlag.isInternalMode()) {
      result.add(new Library("mps.workbench") {
        @Override
        @NotNull
        public String getPath() {
          return WorkbenchPathManager.getWorkbenchPath();
        }
      });
    }
    return result;
  }

  //---------------------

  @Override
  @Nls
  public String getDisplayName() {
    return "Global Libraries";
  }

  @Override
  @NotNull
  public String getComponentName() {
    return LibraryManager.class.getSimpleName();
  }

  @Override
  public String getHelpTopic() {
    return "Library_Manager_(IDE)";
  }
}
