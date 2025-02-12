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
package jetbrains.mps.workbench.findusages;

import com.intellij.icons.AllIcons.Nodes;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.project.MPSExtentions;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
* evgeny, 10/27/11
*/
public class ClassFileType implements FileType {
  public static final Icon CLASS_ICON = Nodes.Class;

  @Override
  @NotNull
  @NonNls
  public String getName() {
    return "Class";
  }

  @Override
  @NotNull
  public String getDescription() {
    return "Java Class File";
  }

  @Override
  @NotNull
  @NonNls
  public String getDefaultExtension() {
    return MPSExtentions.CLASSFILE;
  }

  @Override
  @Nullable
  public Icon getIcon() {
    return CLASS_ICON;
  }

  @Override
  public boolean isBinary() {
    return true;
  }

  @Override
  public boolean isReadOnly() {
    return true;
  }

  @Override
  @Nullable
  @NonNls
  public String getCharset(@NotNull VirtualFile file, final byte[] content) {
    return "utf8";//todo ?
  }
}
