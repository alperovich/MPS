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
package jetbrains.mps.ide.projectPane.logicalview.highlighting.visitor;

import com.intellij.icons.AllIcons.General;
import com.intellij.ui.LayeredIcon;
import org.jetbrains.mps.openapi.model.EditableSModel;
import jetbrains.mps.ide.projectPane.logicalview.highlighting.visitor.updates.IconNodeUpdate;
import jetbrains.mps.ide.ui.tree.smodel.SModelTreeNode;
import org.jetbrains.mps.openapi.model.SModel;

import javax.swing.*;

public class ProjectPaneModifiedMarker extends TreeNodeVisitor {
  @Override
  protected void visitModelNode(final SModelTreeNode node) {
    SModel md = node.getSModelDescriptor();
    if (!(md.isLoaded())) return;
    if (!(md instanceof EditableSModel)) return;

    boolean changed = ((EditableSModel) md).isChanged();

    final Icon icon = changed ? new LayeredIcon(node.getDefaultIcon(), General.Modified) : node.getDefaultIcon();
    ourUpdater.addUpdate(node, new IconNodeUpdate(icon));
  }
}
