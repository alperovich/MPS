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
package jetbrains.mps.ide.navigation;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.openapi.navigation.NavigationSupport;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.MPSModuleRepository;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.annotations.NotNull;

/**
 * evgeny, 11/6/11
 */
public class NodeNavigatable extends BaseNavigatable {
  private static final Logger LOG = LogManager.getLogger(NodeNavigatable.class);

  @NotNull
  private SNodeReference nodePointer;

  public NodeNavigatable(@NotNull Project project, @NotNull SNodeReference nodePointer) {
    super(project);
    this.nodePointer = nodePointer;
  }

  @Override
  public void doNavigate(final boolean focus) {
    SNode node = nodePointer.resolve(MPSModuleRepository.getInstance());
    if (node == null) {
      LOG.info("clicked node was deleted");
      return;
    }

    ModuleContext context = new ModuleContext(node.getModel().getModule(), project);
    NavigationSupport.getInstance().openNode(context, node, focus, !(node.getModel() != null && node.getParent() == null));
  }

  public SNodeReference getNodePointer() {
    return nodePointer;
  }
}
