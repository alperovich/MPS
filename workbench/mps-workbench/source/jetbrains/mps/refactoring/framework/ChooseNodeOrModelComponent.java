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

import com.intellij.ui.ScrollPaneFactory;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.ide.ui.tree.MPSTree;
import jetbrains.mps.ide.ui.tree.MPSTreeNode;
import jetbrains.mps.ide.ui.tree.TextTreeNode;
import jetbrains.mps.ide.ui.tree.smodel.SModelTreeNode;
import jetbrains.mps.ide.ui.tree.smodel.SNodeTreeNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.smodel.SModelRepository;
import org.jetbrains.mps.util.Condition;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.awt.GridBagConstraints.BOTH;
import static java.awt.GridBagConstraints.HORIZONTAL;

@Deprecated
//left for compatibility with old refactorings
public class ChooseNodeOrModelComponent extends JPanel implements IChooseComponent<Object> {
  private String myCaption;
  private String myPropertyName;
  private MyTree myTree = new MyTree();
  private MyChooseItemComponent myChooseItemComponent = new MyChooseItemComponent();
  private String myConceptFQName;
  private IOperationContext myOperationContext;
  private Set<SModel> myModels = new HashSet<SModel>();
  private SModel myModel = null;
  boolean myMayBeModel;
  boolean myMayBeNode;
  boolean myReturnLoadedModels = false;

  private Condition myCondition = Condition.TRUE_CONDITION;

  public ChooseNodeOrModelComponent(IOperationContext operationContext, String conceptFQName, boolean mayBeModel, boolean mayBeNode) {
    myOperationContext = operationContext;
    myMayBeModel = mayBeModel;
    myMayBeNode = mayBeNode;
    myConceptFQName = conceptFQName;
  }

  @Override
  public void initComponent() {
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.fill = HORIZONTAL;
    constraints.weightx = 1;
    constraints.weighty = 0;
    add(new JLabel(myCaption), constraints);
    constraints.gridy++;
    constraints.fill = BOTH;
    constraints.weighty = 0.5;
    add(myChooseItemComponent, constraints);
    constraints.gridy++;
    constraints.fill = BOTH;
    constraints.weighty = 1;
    add(ScrollPaneFactory.createScrollPane(myTree), constraints);

    myTree.setRootVisible(true);
    updateModels(myCondition);
    myTree.rebuildNow();
    myChooseItemComponent.rebuild();
    myTree.expandPath(new TreePath(myTree.getRootNode()));
  }


  public ChooseNodeOrModelComponent(IOperationContext operationContext, String conceptFQName, boolean mayBeModel, boolean mayBeNode,
    boolean useLoadedModels) {
    this(operationContext, conceptFQName, mayBeModel, mayBeNode);
    myReturnLoadedModels = useLoadedModels;
  }

  @Override
  public void setCaption(String caption) {
    myCaption = caption;
  }

  @Override
  public JComponent getComponentToFocus() {
    return myChooseItemComponent.getTextField();
  }

  @Override
  public void setCondition(Condition<Object> condition) {
    myCondition = condition;
    Condition modelCondition = Condition.TRUE_CONDITION;
    if (myMayBeModel) {
      modelCondition = myCondition;
    }
    updateModels(modelCondition);
    myTree.rebuildNow();
    myChooseItemComponent.rebuild();
  }

  private void updateModels(Condition<Object> modelCondition) {
    myModels = getModelsFrom(modelCondition);
  }

  private Set<SModel> getModelsFrom(Condition<Object> condition) {
    Set<SModel> models = new HashSet<SModel>(SModelRepository.getInstance().getModelDescriptors());
    for (SModel model : new ArrayList<SModel>(models)) {
      if (SModelOperations.isReadOnly(model)) {
        models.remove(model);
      } else if (myReturnLoadedModels && !condition.met(model)) {
        models.remove(model);
      } else if (!myReturnLoadedModels && !condition.met(model)) {
        models.remove(model);
      }
    }
    return models;
  }

  private final class MyTree extends MPSTree {
    {
      setShowsRootHandles(true);
    }

    @Override
    public boolean isRootVisible() {
      return true;
    }

    @Override
    protected MPSTreeNode rebuild() {
      MPSTreeNode root;
      if (myModel != null) {
        Condition<SNode> nodeCondition = Condition.FALSE_CONDITION;
        if (myMayBeNode) {
          nodeCondition = myCondition;
        }
        root = new SModelTreeNode(myModel, null, myOperationContext, nodeCondition);
      } else {
        root = new TextTreeNode("no model is selected");
        root.setIcon(Icons.DEFAULT_ICON);
      }

      return root;
    }
  }

  @Override
  public Object submit() throws InvalidInputValueException {
    if (myTree.getSelectionPath() == null) {

      if (myChooseItemComponent.getSelectedItem() != null && myMayBeModel) {
        return myChooseItemComponent.getSelectedItem();
      }

      throw new InvalidInputValueException(myCaption + ": nothing is selected");
    }

    MPSTreeNode node = (MPSTreeNode) myTree.getSelectionPath().getLastPathComponent();
    if (node instanceof SNodeTreeNode) {
      if (!myMayBeNode) {
        throw new InvalidInputValueException(myCaption + ": selected value should not not be a node");
      }
      SNode sNode = ((SNodeTreeNode) node).getSNode();
      if (myConceptFQName != null && !sNode.getConcept().isSubConceptOf(SConceptRepository.getInstance().getConcept(myConceptFQName))) {
        throw new InvalidInputValueException(myCaption + ": selected node should be an istance of " + myConceptFQName);
      }
      return sNode;
    }
    if (node instanceof SModelTreeNode) {
      if (!myMayBeModel) {
        throw new InvalidInputValueException(myCaption + ": selected value should not not be a model");
      }
      SModel modelDescriptor = ((SModelTreeNode) node).getSModelDescriptor();
      if (myReturnLoadedModels) {
        return modelDescriptor;
      } else {
        return modelDescriptor;
      }
    }
    throw new InvalidInputValueException(myCaption + ": nothing is selected");
  }

  @Override
  public String getPropertyName() {
    return myPropertyName;
  }

  @Override
  public void setPropertyName(String propertyName) {
    myPropertyName = propertyName;
  }

  @Override
  public void setInitialValue(Object initialValue) {
    if (myReturnLoadedModels && initialValue instanceof SModel) {
      initialValue = ((SModel) initialValue);
    }
    TreeNode treeNode = myTree.findNodeWith(initialValue);
    if (treeNode != null) {
      myTree.selectNode(treeNode);
    }
  }

  @Override
  public JComponent getMainComponent() {
    return this;
  }

  class MyChooseItemComponent extends ChooseItemComponent<SModel> {
    public MyChooseItemComponent() {
      super(null);
      setMinimumSize(new Dimension(400, 100));
      setPreferredSize(new Dimension(400, 100));
    }

    @Override
    protected String getItemPresentation(SModel sm) {
      return sm.getReference().getModelName();
    }

    @Override
    public void doChoose(SModel sModelDescriptor) {
      myModel = sModelDescriptor;
      myTree.rebuildNow();//selectNode(myTree.findNodeWith(sModelDescriptor));
    }

    public void rebuild() {
      getNames().clear();
      getItemsMap().clear();
      for (SModel modelDescriptor : myModels) {
        putItem(modelDescriptor.getReference().getModelName(), modelDescriptor);
      }
      makeNamesConsistent();
    }
  }
}
