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
package jetbrains.mps.refactoring.framework;

import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.util.Condition;

import javax.swing.JComponent;

@Deprecated
//left for compatibility with old refactorings
public class ChooseNodeComponent implements IChooseComponent<SNode> {
  private ChooseNodeOrModelComponent myChooseNodeOrModelComponent;

  public ChooseNodeComponent(IOperationContext operationContext, String conceptFQName) {
    myChooseNodeOrModelComponent = new ChooseNodeOrModelComponent(operationContext, conceptFQName, false, true);
  }

  @Override
  public SNode submit() throws InvalidInputValueException {
    return (SNode) myChooseNodeOrModelComponent.submit();
  }

  @Override
  public String getPropertyName() {
    return myChooseNodeOrModelComponent.getPropertyName();
  }

  @Override
  public void setPropertyName(String propertyName) {
    myChooseNodeOrModelComponent.setPropertyName(propertyName);
  }

  @Override
  public void setInitialValue(SNode initialValue) {
    myChooseNodeOrModelComponent.setInitialValue(initialValue);
  }

  @Override
  public void setCondition(Condition<SNode> condition) {
    myChooseNodeOrModelComponent.setCondition((Condition) condition);
  }

  @Override
  public JComponent getComponentToFocus() {
    return myChooseNodeOrModelComponent.getComponentToFocus();
  }

  @Override
  public JComponent getMainComponent() {
    return myChooseNodeOrModelComponent;
  }

  @Override
  public void setCaption(String caption) {
    myChooseNodeOrModelComponent.setCaption(caption);
  }

  @Override
  public void initComponent() {
    myChooseNodeOrModelComponent.initComponent();
  }
}
