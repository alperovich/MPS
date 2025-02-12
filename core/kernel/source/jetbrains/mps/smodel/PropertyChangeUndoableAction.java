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
package jetbrains.mps.smodel;import org.jetbrains.mps.openapi.model.SModelReference;import org.jetbrains.mps.openapi.model.SModel;import org.jetbrains.mps.openapi.model.SModel;import org.jetbrains.mps.openapi.model.SModelId;import org.jetbrains.mps.openapi.model.SReference;import org.jetbrains.mps.openapi.model.SNodeReference;import org.jetbrains.mps.openapi.model.SNodeId;import org.jetbrains.mps.openapi.model.SNode;

import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

class PropertyChangeUndoableAction extends SNodeUndoableAction {
  private String myProperty;
  private String myOldValue;
  private String myNewValue;

  PropertyChangeUndoableAction(SNode node, String property, String oldValue, String newValue) {
    super(node);
    myProperty = property;
    myOldValue = oldValue;
    myNewValue = newValue;
  }

  @Override
  protected void doUndo() {
    SNodeAccessUtil.setProperty(getAffectedNode(), myProperty, myOldValue);
  }

  @Override
  protected void doRedo() {
    SNodeAccessUtil.setProperty(getAffectedNode(), myProperty, myNewValue);
  }
}
