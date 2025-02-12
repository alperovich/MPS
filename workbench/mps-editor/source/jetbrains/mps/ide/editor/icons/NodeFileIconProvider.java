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
package jetbrains.mps.ide.editor.icons;

import com.intellij.ide.FileIconProvider;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.DefaultIconDeferrer;
import com.intellij.ui.IconDeferrer;
import jetbrains.mps.fileTypes.MPSFileTypeFactory;
import jetbrains.mps.ide.editor.MPSEditorUtil;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelFileTracker;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.Computable;
import jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 * evgeny, 12/25/11
 */
public class NodeFileIconProvider implements FileIconProvider, ApplicationComponent {
  @Override
  @NonNls
  @NotNull
  public String getComponentName() {
    return "MPS Node File Icon Provider";
  }

  @Override
  public void initComponent() {
  }

  @Override
  public void disposeComponent() {
  }

  @Override
  @Nullable
  public Icon getIcon(final VirtualFile file, int flags, final Project project) {
    if (file instanceof MPSNodeVirtualFile) {
      final MPSNodeVirtualFile nodeFile = (MPSNodeVirtualFile) file;
      return ModelAccess.instance().runReadAction(new Computable<Icon>() {
        @Override
        public Icon compute() {
          if (IconDeferrer.getInstance() instanceof DefaultIconDeferrer) {
            SNode node = MPSEditorUtil.getCurrentEditedNode(project, nodeFile);
            if (node != null) {
              return IconManager.getIconWithoutAdditionalPart(node);
            }
          }
          SNode node = nodeFile.getNode();
          if (node != null) {
            return IconManager.getIconWithoutAdditionalPart(node);
          }
          return null;
        }
      });
    } else if(file.getFileType().equals(MPSFileTypeFactory.MPS_ROOT_FILE_TYPE)) {
      return ModelAccess.instance().runReadAction(new Computable<Icon>(){
        @Override
        public Icon compute() {
          SModel descr = SModelFileTracker.getInstance().findModel(VirtualFileUtils.toIFile(file.getParent()));
          if(descr == null) return null;

          for (SNode node : descr.getRootNodes()) {
            if(node.getName().equals(file.getNameWithoutExtension())) {
              return IconManager.getIconFor(node, true);
            }
          }
          return null;
        }
      });
    }
    return null;
  }
}
