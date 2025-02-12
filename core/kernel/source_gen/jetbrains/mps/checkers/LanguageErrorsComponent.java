package jetbrains.mps.checkers;

/*Generated by MPS */

import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.Set;
import jetbrains.mps.errors.IErrorReporter;
import java.util.HashMap;
import java.util.HashSet;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.QuickFixProvider;
import jetbrains.mps.errors.SimpleErrorReporter;
import jetbrains.mps.errors.MessageStatus;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.smodel.event.SModelChildEvent;
import jetbrains.mps.smodel.event.SModelReferenceEvent;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.AbstractNodesReadListener;
import jetbrains.mps.smodel.NodeReadEventsCaster;
import jetbrains.mps.smodel.SModelAdapter;
import jetbrains.mps.smodel.SModelRepositoryAdapter;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.module.SModule;

public class LanguageErrorsComponent {
  private Map<SNode, Set<IErrorReporter>> myNodesToErrors = new HashMap<SNode, Set<IErrorReporter>>();
  private Map<SNode, Set<SNode>> myDependenciesToNodes = new HashMap<SNode, Set<SNode>>();
  private Map<SNode, Set<SNode>> myNodesToDependecies = new HashMap<SNode, Set<SNode>>();
  private Set<SNode> myInvalidNodes = new HashSet<SNode>();
  private Set<SNode> myInvalidation = new HashSet<SNode>();
  private LanguageErrorsComponent.MyModelListener myModelListener = new LanguageErrorsComponent.MyModelListener();
  private LanguageErrorsComponent.MyModelRepositoryListener myModelRepositoryListener = new LanguageErrorsComponent.MyModelRepositoryListener();
  private Set<SModel> myListenedModels = new HashSet<SModel>();
  private boolean myCheckedRoot = false;
  private SNode myCurrentNode = null;
  private SNode myRoot;

  public LanguageErrorsComponent(SNode root) {
    myRoot = root;
    SModelRepository.getInstance().addModelRepositoryListener(myModelRepositoryListener);
  }

  public void dispose() {
    this.removeModelListener();
    SModelRepository.getInstance().removeModelRepositoryListener(myModelRepositoryListener);
  }

  private void removeModelListener() {
    for (SModel modelDescriptor : myListenedModels) {
      ((SModelInternal) modelDescriptor).removeModelListener(myModelListener);
    }
    SetSequence.fromSet(myListenedModels).clear();
  }

  public void addDependency(SNode dependency) {
    if (myCurrentNode != null) {
      addDependency(myCurrentNode, dependency);
    }
  }

  public void addDependency(SNode currentNode, SNode dependency) {
    if (dependency == null) {
      return;
    }
    Set<SNode> errorNodes = MapSequence.fromMap(myDependenciesToNodes).get(dependency);
    if (errorNodes == null) {
      errorNodes = new HashSet<SNode>(1);
      MapSequence.fromMap(myDependenciesToNodes).put(dependency, errorNodes);
    }
    SetSequence.fromSet(errorNodes).addElement(currentNode);
    Set<SNode> additional = MapSequence.fromMap(myNodesToDependecies).get(currentNode);
    if (additional == null) {
      additional = new HashSet<SNode>(1);
      MapSequence.fromMap(myNodesToDependecies).put(currentNode, additional);
    }
    SetSequence.fromSet(additional).addElement(dependency);
    addModelListener(SNodeOperations.getModel(dependency));
  }

  public void addError(SNode node, String errorString, SNode ruleNode) {
    for (SNode anc : ListSequence.fromList(SNodeOperations.getAncestors(node, null, false))) {
      addDependency(anc);
    }
    addError(node, errorString, ruleNode, new NodeMessageTarget());
  }

  public void addError(SNode errorNode, String errorString, SNode ruleNode, MessageTarget messageTarget) {
    addError(errorNode, errorString, ruleNode, messageTarget, null);
  }

  public void addError(SNode errorNode, String errorString, SNode ruleNode, MessageTarget messageTarget, QuickFixProvider intentionProvider) {
    if (!(ErrorReportUtil.shouldReportError(errorNode))) {
      return;
    }
    String id = (ruleNode == null ?
      null :
      ruleNode.getNodeId().toString()
    );
    String modelId = (ruleNode == null ?
      null :
      check_29uvfh_a0a0c0s(ruleNode.getModel()) + ""
    );
    SimpleErrorReporter reporter = new SimpleErrorReporter(errorNode, errorString, modelId, id, MessageStatus.ERROR, messageTarget);
    if (intentionProvider != null) {
      reporter.setIntentionProvider(intentionProvider);
    }
    Set<IErrorReporter> reporters = MapSequence.fromMap(myNodesToErrors).get(errorNode);
    if (reporters == null) {
      reporters = new HashSet<IErrorReporter>(1);
      MapSequence.fromMap(myNodesToErrors).put(errorNode, reporters);
    }
    SetSequence.fromSet(reporters).addElement(reporter);
  }

  private void addModelListener(SModel modelDescriptor) {
    if (modelDescriptor == null) {
      return;
    }
    if (!(SetSequence.fromSet(myListenedModels).contains(modelDescriptor))) {
      ((SModelInternal) modelDescriptor).addModelListener(myModelListener);
      SetSequence.fromSet(myListenedModels).addElement(modelDescriptor);
    }
  }

  private void invalidate(SNode errorNode) {
    SetSequence.fromSet(myInvalidNodes).addElement(errorNode);
    MapSequence.fromMap(myNodesToErrors).removeKey(errorNode);
    Set<SNode> additionals = MapSequence.fromMap(myNodesToDependecies).removeKey(errorNode);
    if (additionals != null) {
      for (SNode additional : additionals) {
        Set<SNode> errors = MapSequence.fromMap(myDependenciesToNodes).get(additional);
        if (errors != null) {
          SetSequence.fromSet(errors).removeElement(errorNode);
          if (SetSequence.fromSet(errors).isEmpty()) {
            MapSequence.fromMap(myDependenciesToNodes).removeKey(additional);
          }
        }
      }
    }

  }

  public boolean check(SNode root, Set<AbstractConstraintsChecker> checkers, IOperationContext operationContext) {
    // returns whether state has been changed after check 
    if (root == null) {
      return false;
    }
    invalidate();
    if (myCheckedRoot && SetSequence.fromSet(myInvalidNodes).isEmpty()) {
      return false;
    }
    Set<SNode> frontier = new HashSet<SNode>(1);
    SetSequence.fromSet(frontier).addElement(root);
    Set<SNode> newFrontier = new HashSet<SNode>(1);
    IScope scope = check_29uvfh_a0h0v(((AbstractModule) check_29uvfh_a0a0a7a12(SNodeOperations.getModel(root))));
    while (!(SetSequence.fromSet(frontier).isEmpty())) {
      for (SNode node : frontier) {
        if (!(myCheckedRoot) || SetSequence.fromSet(myInvalidNodes).contains(node)) {
          try {
            myCurrentNode = node;
            addDependency(node);
            for (AbstractConstraintsChecker checker : checkers) {
              checker.checkNode(node, this, operationContext, scope);
            }
          } finally {
            myCurrentNode = null;
            SetSequence.fromSet(myInvalidNodes).removeElement(node);
          }
        }
        SetSequence.fromSet(newFrontier).addSequence(ListSequence.fromList(SNodeOperations.getChildren(node)));
      }
      frontier = newFrontier;
      newFrontier = new HashSet<SNode>(1);
    }
    myCheckedRoot = true;
    return true;
  }

  public Set<IErrorReporter> getErrors() {
    Set<IErrorReporter> result = new HashSet<IErrorReporter>(1);
    for (SNode errorNode : MapSequence.fromMap(myNodesToErrors).keySet()) {
      SetSequence.fromSet(result).addSequence(SetSequence.fromSet(MapSequence.fromMap(myNodesToErrors).get(errorNode)));
    }
    return result;
  }

  public void invalidate() {
    if (SetSequence.fromSet(myInvalidation).isEmpty()) {
      return;
    }
    for (SNode toInvalidate : myInvalidation) {
      processNodeChange(toInvalidate);
    }
    SetSequence.fromSet(myInvalidation).clear();
  }

  private void processNodeChange(SNode affectedNode) {
    Set<SNode> nodes = MapSequence.fromMap(myDependenciesToNodes).removeKey(affectedNode);
    if (nodes != null) {
      for (SNode errorNode : nodes) {
        invalidate(errorNode);
      }
    }
  }

  public void processEvent(SModelChildEvent event) {
    SetSequence.fromSet(myInvalidation).addElement(event.getParent());
    if (event.isRemoved()) {
      SetSequence.fromSet(myInvalidation).addElement(event.getChild());
    }
    if (event.isAdded()) {
      SetSequence.fromSet(myInvalidNodes).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(((SNode) event.getChild()), null, false, new String[]{})));
      SetSequence.fromSet(myInvalidNodes).addElement(event.getChild());
    }
  }

  public void processEvent(SModelReferenceEvent event) {
    SetSequence.fromSet(myInvalidation).addElement(event.getReference().getSourceNode());
  }

  public void processEvent(SModelPropertyEvent event) {
    SetSequence.fromSet(myInvalidation).addElement(event.getNode());
  }

  public void processBeforeModelDisposed(SModel model) {
    if (!(jetbrains.mps.util.SNodeOperations.isDisposed(myRoot)) && SNodeOperations.getModel(myRoot) == model) {
      return;
    }
    for (SNode additional : new HashSet<SNode>(MapSequence.fromMap(myDependenciesToNodes).keySet())) {
      if (jetbrains.mps.util.SNodeOperations.isDisposed(additional) || SNodeOperations.getModel(additional) == model) {
        processNodeChange(additional);
      }
    }
  }

  public void processModelRemoved(SModel modelDescriptor) {
    SetSequence.fromSet(myListenedModels).removeElement(modelDescriptor);
  }

  public void clear() {
    myCheckedRoot = false;
    SetSequence.fromSet(myInvalidation).clear();
    SetSequence.fromSet(myInvalidNodes).clear();
    myCurrentNode = null;
    MapSequence.fromMap(myDependenciesToNodes).clear();
    MapSequence.fromMap(myNodesToDependecies).clear();
    MapSequence.fromMap(myNodesToErrors).clear();
    removeModelListener();
  }

  public <Result> Result runCheckingAction(_FunctionTypes._return_P0_E0<? extends Result> action) {
    final Set<SNode> accessedNodes = new HashSet<SNode>();
    final Object[] result = new Object[1];
    try {
      AbstractNodesReadListener listener = new AbstractNodesReadListener() {
        @Override
        public void nodeUnclassifiedReadAccess(SNode node) {
          SetSequence.fromSet(accessedNodes).addElement(node);
        }

        @Override
        public void nodePropertyReadAccess(SNode node, String name, String value) {
          SetSequence.fromSet(accessedNodes).addElement(node);
        }

        @Override
        public void nodeReferentReadAccess(SNode node, String role, SNode referent) {
          SetSequence.fromSet(accessedNodes).addElement(node);
          SetSequence.fromSet(accessedNodes).addElement(referent);
        }

        @Override
        public void nodeChildReadAccess(SNode node, String role, SNode child) {
          SetSequence.fromSet(accessedNodes).addElement(node);
          SetSequence.fromSet(accessedNodes).addElement(child);
        }
      };
      NodeReadEventsCaster.setNodesReadListener(listener);
      result[0] = action.invoke();
    } finally {
      NodeReadEventsCaster.removeNodesReadListener();
    }
    for (SNode accessedNode : accessedNodes) {
      addDependency(accessedNode);
    }
    return (Result) result[0];
  }

  public class MyModelListener extends SModelAdapter {
    public MyModelListener() {
    }

    @Override
    public void beforeModelDisposed(SModel model) {
      processBeforeModelDisposed(model);
    }

    @Override
    public void referenceRemoved(SModelReferenceEvent event) {
      processEvent(event);
    }

    @Override
    public void referenceAdded(SModelReferenceEvent event) {
      processEvent(event);
    }

    @Override
    public void childRemoved(SModelChildEvent event) {
      processEvent(event);
    }

    @Override
    public void childAdded(SModelChildEvent event) {
      processEvent(event);
    }

    @Override
    public void propertyChanged(SModelPropertyEvent event) {
      processEvent(event);
    }
  }

  public class MyModelRepositoryListener extends SModelRepositoryAdapter {
    public MyModelRepositoryListener() {
    }

    @Override
    public void modelRemoved(SModel descriptor) {
      processModelRemoved(descriptor);
    }
  }

  private static SModelReference check_29uvfh_a0a0c0s(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getReference();
    }
    return null;
  }

  private static IScope check_29uvfh_a0h0v(AbstractModule checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getScope();
    }
    return null;
  }

  private static SModule check_29uvfh_a0a0a7a12(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModule();
    }
    return null;
  }
}
