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
package jetbrains.mps.ide.ui.smodel;

import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.ide.ui.tree.MPSTreeNodeEx;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.mps.openapi.model.SNode;

import javax.swing.tree.DefaultTreeModel;

public class PropertiesTreeNode extends MPSTreeNodeEx {
  private SNode myNode;
  private boolean myInitialized = false;

  public PropertiesTreeNode(IOperationContext operationContext, SNode node) {
    super(operationContext);
    myNode = node;

    setIcon(Icons.PROPERTY_ICON);
    setNodeIdentifier("properties");
  }

  @Override
  public SNode getSNode() {
    return myNode;
  }

  @Override
  public boolean isInitialized() {
    return myInitialized;
  }

  @Override
  protected void doInit() {
    super.doInit();

    for (String name : myNode.getPropertyNames()) {
      add(new PropertyTreeNode(getOperationContext(), myNode, name));
    }

    myInitialized = true;

    ((DefaultTreeModel) getTree().getModel()).nodeStructureChanged(this);
  }

  @Override
  protected void doUpdate() {
    this.removeAllChildren();
    myInitialized = false;
  }

}
