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

package jetbrains.mps.idea.core.facet.ui;

import com.intellij.facet.ui.FacetEditorContext;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.util.Disposer;
import jetbrains.mps.extapi.persistence.FileBasedModelRoot;
import jetbrains.mps.ide.ui.dialogs.properties.roots.editors.ContentEntriesEditor;
import jetbrains.mps.ide.ui.dialogs.properties.roots.editors.ModelRootEntryContainer;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.idea.core.facet.MPSConfigurationBean;
import jetbrains.mps.idea.core.ui.SModuleConfigurationTab;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import org.jetbrains.mps.openapi.ui.persistence.ModelRootEntry.ModelRootEntryListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MPSFacetSourcesTab implements SModuleConfigurationTab {
  private JPanel myRootPanel;

  private FacetEditorContext myContext;
  private Disposable myParentDisposable;

  private ContentEntriesEditor myContentEntriesEditor;

  public MPSFacetSourcesTab(FacetEditorContext context, Disposable parentDisposable) {
    myContext = context;
    myParentDisposable = parentDisposable;
    myRootPanel = new JPanel(new BorderLayout());
    myRootPanel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
  }

  public JPanel getRootPanel() {
    return myRootPanel;
  }

  @Override
  public void onTabEntering() {
  }

  public void reset(MPSConfigurationBean data) {
    if(myContentEntriesEditor != null) {
      Disposer.dispose(myContentEntriesEditor);
      myContentEntriesEditor = null;
    }
    myContentEntriesEditor = new ContentEntriesEditor(data.getSolutionDescriptor());
    Disposer.register(myParentDisposable, myContentEntriesEditor);
    myContentEntriesEditor.setDefaultFolder(myContext.getModule().getModuleFile() != null
      ? myContext.getModule().getModuleFile().getParent().getCanonicalPath()
      : myContext.getProject().getBasePath());
    myRootPanel.removeAll();
    myRootPanel.add(myContentEntriesEditor.getComponent(), BorderLayout.CENTER);

    //Watch for changes in model root source folders
    for(ModelRootEntryContainer container : myContentEntriesEditor.getModelRootsEntries()) {
      container.getModelRootEntry().addModelRootEntryListener(new ModelRootEntryListener() {
        @Override
        public void fireDataChanged() {
          final ModifiableRootModel modifiableRootModel = myContext.getModifiableRootModel();

          for (ModelRoot path : myContentEntriesEditor.getModelRoots()) {
            if(path instanceof FileBasedModelRoot) {
              for(String file : ((FileBasedModelRoot) path).getFiles(FileBasedModelRoot.SOURCE_ROOTS)) {
                for(ContentEntry contentEntry : modifiableRootModel.getContentEntries()) {
                  if(!file.contains(contentEntry.getFile().getPath()))
                    continue;
                  //Just add new source folder - do not watch after delete
                  contentEntry.addSourceFolder(VirtualFileUtils.getVirtualFile(file), false);
                  break;
                }
              }
            }
          }
        }
      });
    }
  }

  public void apply(MPSConfigurationBean data) {
    data.setModelRoots(myContentEntriesEditor.getModelRoots());
  }

  public boolean isModified(MPSConfigurationBean data) {
    return myContentEntriesEditor.isModified();
  }
}
