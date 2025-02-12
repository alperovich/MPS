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
package jetbrains.mps.ide.editorTabs;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.IdeActions;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.Separator;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.impl.FileEditorManagerImpl;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ShadowAction;
import com.intellij.openapi.vcs.FileStatusManager;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.ide.editor.BaseNodeEditor;
import jetbrains.mps.ide.editor.MPSEditorDataKeys;
import jetbrains.mps.ide.editorTabs.tabfactory.NodeChangeCallback;
import jetbrains.mps.ide.editorTabs.tabfactory.TabComponentFactory;
import jetbrains.mps.ide.editorTabs.tabfactory.TabsComponent;
import jetbrains.mps.ide.editorTabs.tabfactory.tabs.CreateGroupsBuilder;
import jetbrains.mps.ide.editorTabs.tabfactory.tabs.CreateModeCallback;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.nodeEditor.EditorSettings;
import jetbrains.mps.nodeEditor.EditorSettingsListener;
import jetbrains.mps.openapi.editor.EditorState;
import jetbrains.mps.plugins.relations.RelationDescriptor;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelAdapter;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SNodeUtil;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;
import org.jdom.Element;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;

import javax.swing.JComponent;
import java.awt.BorderLayout;
import java.util.List;
import java.util.Set;

public class TabbedEditor extends BaseNodeEditor {
  private TabsComponent myTabsComponent;
  private SModelListener myModelListener = new MyNameListener();
  private SNodeReference myBaseNode;
  private Set<RelationDescriptor> myPossibleTabs;
  private IOperationContext myContext;
  private BaseNavigationAction myNextTabAction;
  private BaseNavigationAction myPrevTabAction;

  private EditorSettingsListener mySettingsListener = new EditorSettingsListener() {
    @Override
    public void settingsChanged() {
      SNodeReference node = getCurrentlyEditedNode();
      JComponent comp = myTabsComponent.getComponent();
      if (comp != null) {
        getComponent().remove(comp);
      }
      installTabsComponent();
      if (node != null) {
        myTabsComponent.setLastNode(node);
      }
    }
  };
  private MPSNodeVirtualFile myVirtualFile;

  public TabbedEditor(SNodeReference baseNode, Set<RelationDescriptor> possibleTabs, @NotNull IOperationContext context) {
    super(context);
    myBaseNode = baseNode;
    myPossibleTabs = possibleTabs;
    myContext = context;

    myVirtualFile = MPSNodesVirtualFileSystem.getInstance().getFileFor(myBaseNode);

    installTabsComponent();

    showNode(myBaseNode.resolve(MPSModuleRepository.getInstance()), false);

    myNextTabAction = new BaseNavigationAction(IdeActions.ACTION_NEXT_EDITOR_TAB, getComponent()) {
      @Override
      public void actionPerformed(AnActionEvent e) {
        ModelAccess.instance().runReadAction(new Runnable() {
          @Override
          public void run() {
            myTabsComponent.nextTab();
          }
        });
      }
    };
    myPrevTabAction = new BaseNavigationAction(IdeActions.ACTION_PREVIOUS_EDITOR_TAB, getComponent()) {
      @Override
      public void actionPerformed(AnActionEvent e) {
        ModelAccess.instance().runReadAction(new Runnable() {
          @Override
          public void run() {
            myTabsComponent.prevTab();
          }
        });
      }
    };

    EditorSettings.getInstance().addEditorSettingsListener(mySettingsListener);
  }

  private void installTabsComponent() {
    if (myTabsComponent != null) {
      myTabsComponent.dispose();
    }
    myTabsComponent = TabComponentFactory.createTabsComponent(myBaseNode, myPossibleTabs, getComponent(), new NodeChangeCallback() {
        @Override
        public void changeNode(SNode newNode) {
          showNodeInternal(newNode, !(newNode.getModel() != null && newNode.getParent() == null), true);
        }
      }, new CreateModeCallback() {
        @Override
        public void exitCreateMode() {
          showEditor();
        }

        @Override
        public void enterCreateMode(JComponent replace) {
          showComponent(replace);
        }
      }, myContext
    );

    JComponent c = myTabsComponent.getComponent();
    if (c != null) {
      getComponent().add(c, BorderLayout.SOUTH);
    }
  }

  @Override
  public void dispose() {
    EditorSettings.getInstance().removeEditorSettingsListener(mySettingsListener);

    myNextTabAction.dispose();
    myPrevTabAction.dispose();
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        SModel model = getCurrentNodeModel();
        if (model == null) return;
        ((SModelInternal) model).removeModelListener(myModelListener);
      }
    });
    myTabsComponent.dispose();
    super.dispose();
  }

  @Override
  public boolean isTabbed() {
    return true;
  }

  @Override
  public List<Document> getAllEditedDocuments() {
    return myTabsComponent.getAllEditedDocuments();
  }

  @Override
  public void showNode(SNode node, boolean select) {
    showNodeInternal(node, select, false);
  }

  private void showNodeInternal(SNode node, boolean select, boolean fromTabs) {
    SNode containingRoot = node.getModel() != null && node.getParent() == null ? node : node.getContainingRoot();
    SNodeReference currentlyEditedNode = getCurrentlyEditedNode();
    if (getCurrentEditorComponent() == null) {
      showEditor();
    }

    boolean rootChange = getCurrentlyEditedNode() == null || (containingRoot != currentlyEditedNode.resolve(MPSModuleRepository.getInstance()));

    if (!fromTabs) {
      myTabsComponent.setLastNode(new jetbrains.mps.smodel.SNodePointer(node));
    }

    if (rootChange) {
      SModel model = getCurrentNodeModel();
      if (model != null) {
        ((SModelInternal) model).removeModelListener(myModelListener);
      }

      SModel md = containingRoot.getModel();
      SModule module = md.getModule();
      assert module != null : md.getReference().toString() + "; node is disposed = " + jetbrains.mps.util.SNodeOperations.isDisposed(node);
      editNode(new SNodePointer(containingRoot), new ModuleContext(module, myContext.getProject()), select);

      model = getCurrentNodeModel();
      assert model != null;

      ((SModelInternal) model).addModelListener(myModelListener);

      executeInEDT(new PrioritizedTask(TaskType.UPDATE_PROPERTIES, myType2TaskMap) {
        @Override
        public void performTask() {
          updateProperties();
        }
      });
    }
  }

  private SModel getCurrentNodeModel() {
    SNodeReference n = getCurrentlyEditedNode();
    if (n == null) return null;
    return SModelRepository.getInstance().getModelDescriptor(n.getModelReference());
  }

  private boolean updateProperties() {
    final Project project = ProjectHelper.toIdeaProject(getOperationContext().getProject());
    FileEditorManagerImpl manager = (FileEditorManagerImpl) FileEditorManager.getInstance(project);
    VirtualFile virtualFile = manager.getCurrentFile();
    if (virtualFile == null) return true;

    FileStatusManager.getInstance(project).fileStatusChanged(virtualFile);
    manager.updateFilePresentation(virtualFile);
    return false;
  }


  @Override
  public Object getData(@NonNls String dataId) {
    if (MPSEditorDataKeys.EDITOR_CREATE_GROUP.getName().equals(dataId)) return getCreateGroup();
    if (dataId.equals(LangDataKeys.VIRTUAL_FILE.getName())) {
      return myVirtualFile;
    }

    return null;
  }

  private AnAction getCreateGroup() {
    DefaultActionGroup result = new DefaultActionGroup();

    List<DefaultActionGroup> groups = CreateGroupsBuilder.getCreateGroups(myBaseNode, myPossibleTabs, myTabsComponent.getCurrentTabAspect(), new NodeChangeCallback() {
      @Override
      public void changeNode(SNode node) {
        myTabsComponent.setLastNode(new jetbrains.mps.smodel.SNodePointer(node));
        showNode(node, !(node.getModel() != null && node.getParent() == null));
      }
    });
    for (DefaultActionGroup group : groups) {
      group.setPopup(false);
      result.add(group);
      result.add(new Separator());
    }

    return result;
  }

  private class MyNameListener extends SModelAdapter {
    @Override
    public void propertyChanged(SModelPropertyEvent event) {
      SNodeReference pointer = new jetbrains.mps.smodel.SNodePointer(event.getNode());
      if (event.getPropertyName().equals(SNodeUtil.property_INamedConcept_name) && pointer.equals(getCurrentlyEditedNode())) {
        updateProperties();
      }
    }
  }

  @Override
  public EditorState saveState(boolean full) {
    TabbedEditorState state = new TabbedEditorState();
    state.myCurrentNode = getCurrentlyEditedNode();

    BaseEditorState superState = (BaseEditorState) super.saveState(full);
    state.refCopyFrom(superState);
    return state;
  }

  @Override
  public void loadState(@NotNull final EditorState state) {
    super.loadState(state);
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        if (state instanceof TabbedEditorState) {
          SNodeReference nodePointer = ((TabbedEditorState) state).myCurrentNode;
          SNode node = nodePointer == null ? null : nodePointer.resolve(MPSModuleRepository.getInstance());
          if (node != null) {
            showNode(node, false);
          }
        } else {
          //regular editor was shown for that node last time
          showNode(myBaseNode.resolve(MPSModuleRepository.getInstance()), false);
        }
      }
    });
  }

  public static class TabbedEditorState extends BaseEditorState implements EditorState {
    private static final String NODE = "node";
    private static final String NODE_REF = "node_ref";


    private SNodeReference myCurrentNode;

    @Override
    public void save(Element e) {
      super.save(e);
      Element node = new Element(NODE);
      node.setAttribute(NODE_REF, jetbrains.mps.smodel.SNodePointer.serialize(myCurrentNode));
      e.addContent(node);
    }

    @Override
    public void load(Element e) {
      super.load(e);
      Element nodeElem = e.getChild(NODE);

      String val = nodeElem.getAttributeValue(NODE_REF);
      if (val != null) {
        myCurrentNode = jetbrains.mps.smodel.SNodePointer.deserialize(val);
      } else {
        //todo remove after 3.0
        String nodeId = nodeElem.getAttributeValue("nodeId");
        String modelId = nodeElem.getAttributeValue("modelId");
        myCurrentNode = new jetbrains.mps.smodel.SNodePointer(modelId, nodeId);
      }
    }

    public int hashCode() {
      return super.hashCode() * 13 + myCurrentNode.hashCode();
    }

    public boolean equals(Object obj) {
      if (!(obj instanceof TabbedEditorState)) return false;
      if (!super.equals(obj)) return false;
      return EqualUtil.equals(myCurrentNode, ((TabbedEditorState) obj).myCurrentNode);
    }
  }

  private abstract static class BaseNavigationAction extends AnAction {
    private final ShadowAction myShadow;

    protected BaseNavigationAction(String copyFromID, JComponent component) {
      myShadow = new ShadowAction(this, ActionManager.getInstance().getAction(copyFromID), component);
      setEnabledInModalContext(true);
    }

    public void dispose() {
      myShadow.dispose();
    }
  }
}
