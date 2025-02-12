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
package jetbrains.mps.ide.devkit.generator;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.project.Project;
import jetbrains.mps.generator.IGenerationTracer;
import jetbrains.mps.ide.devkit.generator.TracerNode.Kind;
import jetbrains.mps.ide.devkit.generator.icons.Icons;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.ide.ui.tree.MPSTreeNode;
import jetbrains.mps.openapi.navigation.NavigationSupport;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.action.BaseAction;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;

import java.util.Map;

public class GenerationTracerTreeNode extends MPSTreeNode {
  private static final Logger LOG = LogManager.getLogger(GenerationTracerTreeNode.class);

  private TracerNode myTracerNode;
  private Project myProject;

  public GenerationTracerTreeNode(TracerNode tracerNode, Project project) {
    super(null);
    myProject = project;
    myTracerNode = tracerNode;

    SNodeReference nodePointer = myTracerNode.getNodePointer();
    if (nodePointer != null) {
      setNodeIdentifier("" + nodePointer.hashCode());
    } else {
      setNodeIdentifier("<" + myTracerNode.getKind() + ">");
    }
    setIcon(Icons.getIcon(myTracerNode));

    if (myTracerNode.getDepth() < 1000) {
      for (TracerNode childTracerNode : myTracerNode.getChildren()) {
        add(new GenerationTracerTreeNode(childTracerNode, project));
      }
    }
  }

  @Override
  protected void doUpdatePresentation() {
    Kind kind = myTracerNode.getKind();
    SNodeReference nodePointer = myTracerNode.getNodePointer();
    if (nodePointer != null) {
      if (kind == Kind.APPROXIMATE_OUTPUT || kind == Kind.APPROXIMATE_INPUT) {
        setText("[approximate location] " + nodePointer.toString());
      } else {
        setText(nodePointer.toString());
      }
      SModelReference modelRef = nodePointer.getModelReference();
      if (modelRef != null) {
        setAdditionalText(modelRef.getModelName());
      }
    } else {
      setText("<" + kind + ">");
    }
    setAutoExpandable(getChildCount() == 1);
  }

  public TracerNode getTracerNode() {
    return myTracerNode;
  }

  final ActionGroup getTracerActionGroup() {
    if (myTracerNode.getKind() == Kind.INPUT ||
        myTracerNode.getKind() == Kind.APPROXIMATE_INPUT) {
      return createActionGroupForInputNode();
    }
    if (myTracerNode.getKind() == Kind.OUTPUT ||
        myTracerNode.getKind() == Kind.APPROXIMATE_OUTPUT) {
      return createActionGroupForOutputNode();
    }
    return null;
  }

  @Override
  public int getToggleClickCount() {
    return -1;
  }

  private ActionGroup createActionGroupForInputNode() {
    final GenerationTracer tracer = (GenerationTracer) myProject.getComponent(IGenerationTracer.class);

    final TracerNode tracerNode = this.getTracerNode();
    final boolean enable = tracerNode != null && tracerNode.getNodePointer() != null && tracerNode.getNodePointer().resolve(
        MPSModuleRepository.getInstance()) != null;

    DefaultActionGroup group = new DefaultActionGroup();
    // is traceback shown?
    GenerationTracerTreeNode rootNode = (GenerationTracerTreeNode) getRoot();
    TracerNode rootTracerNode = rootNode.getTracerNode();
    if (rootTracerNode != null && rootTracerNode.getKind() == Kind.OUTPUT) {
      group.add(new BaseAction("Show Trace") {
        @Override
        protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
          tracer.showTraceInputData(tracerNode.getNodePointer().resolve(MPSModuleRepository.getInstance()));
        }

        @Override
        protected void doUpdate(AnActionEvent e, Map<String, Object> _params) {
          boolean enabled = enable && tracer.hasTraceInputData(tracerNode.getNodePointer().getModelReference());
          setEnabledState(e.getPresentation(), enabled);
        }
      });
    }

    group.add(new BaseAction("Show Prev Step Traceback") {
      @Override
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        tracer.showTracebackData(tracerNode.getNodePointer().resolve(MPSModuleRepository.getInstance()));
      }

      @Override
      protected void doUpdate(AnActionEvent e, Map<String, Object> _params) {
        boolean enabled = enable && tracer.hasTracebackData(tracerNode.getNodePointer().getModelReference());
        setEnabledState(e.getPresentation(), enabled);
      }
    });
    return group;
  }

  private ActionGroup createActionGroupForOutputNode() {
    final GenerationTracer tracer = (GenerationTracer) myProject.getComponent(IGenerationTracer.class);

    DefaultActionGroup group = new DefaultActionGroup();

    final TracerNode tracerNode = this.getTracerNode();
    final boolean enable = tracerNode != null && tracerNode.getNodePointer() != null && tracerNode.getNodePointer().resolve(
        MPSModuleRepository.getInstance()) != null;

    // is trace (forward) shown?
    GenerationTracerTreeNode rootNode = (GenerationTracerTreeNode) getRoot();
    TracerNode rootTracerNode = rootNode.getTracerNode();
    if (rootTracerNode != null && (rootTracerNode.getKind() == Kind.INPUT || rootTracerNode.getKind() == Kind.RULE)) {
      group.add(new BaseAction("Show Traceback") {
        @Override
        protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
          tracer.showTracebackData(tracerNode.getNodePointer().resolve(MPSModuleRepository.getInstance()));
        }

        @Override
        protected void doUpdate(AnActionEvent e, Map<String, Object> _params) {
          boolean enabled = enable && tracer.hasTracebackData(tracerNode.getNodePointer().getModelReference());
          setEnabledState(e.getPresentation(), enabled);
        }
      });
    }

    group.add(new BaseAction("Show Next Step Trace") {
      @Override
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        tracer.showTraceInputData(tracerNode.getNodePointer().resolve(MPSModuleRepository.getInstance()));
      }

      @Override
      protected void doUpdate(AnActionEvent e, Map<String, Object> _params) {
        boolean enabled = enable && tracer.hasTraceInputData(tracerNode.getNodePointer().getModelReference());
        setEnabledState(e.getPresentation(), enabled);
      }
    });
    return group;
  }


  @Override
  public void autoscroll() {
    super.autoscroll();
    ModelAccess.instance().runWriteInEDT(new Runnable() {
      @Override
      public void run() {
        SNode nodeToOpen = myTracerNode.getNodePointer().resolve(MPSModuleRepository.getInstance());
        if (nodeToOpen == null) return;

        IOperationContext context = new ProjectOperationContext(ProjectHelper.toMPSProject(myProject));
        NavigationSupport.getInstance().openNode(context, nodeToOpen, true, true);
      }
    });
  }

  @Override
  public void doubleClick() {
    ModelAccess.instance().runWriteInEDT(new Runnable() {
      @Override
      public void run() {
        SNodeReference nodePointer = myTracerNode.getNodePointer();
        if (nodePointer == null) return;
        SNode node = nodePointer.resolve(MPSModuleRepository.getInstance());
        if (node == null) {
          LOG.info("clicked node was deleted");
          return;
        }
        IOperationContext context = new ProjectOperationContext(ProjectHelper.toMPSProject(myProject));
        NavigationSupport.getInstance().openNode(context, node, true, !(node.getModel() != null && node.getParent() == null));
      }
    });
  }

  @Override
  public boolean isLeaf() {
    return getChildCount() == 0;
  }
}
