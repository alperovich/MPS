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
package jetbrains.mps.ide.ui.tree;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.editor.colors.ColorKey;
import com.intellij.openapi.editor.colors.EditorColorsManager;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.icons.IdeIcons;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.util.Condition;

import javax.swing.Icon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Kostik
 */
public abstract class MPSTreeNode extends DefaultMutableTreeNode implements Iterable<MPSTreeNode> {
  private static final Logger LOG = LogManager.getLogger(MPSTreeNode.class);

  private IOperationContext myOperationContext;
  private MPSTree myTree;
  private boolean myAdded;

  private Icon myCollapsedIcon = IdeIcons.CLOSED_FOLDER;
  private Icon myExpandedIcon = IdeIcons.OPENED_FOLDER;
  private String myNodeIdentifier;
  private String myText;
  private String myAdditionalText = null;
  private String myTooltipText;
  private Color myColor = EditorColorsManager.getInstance().getGlobalScheme().getColor(ColorKey.createColorKey("FILESTATUS_NOT_CHANGED"));
  private int myFontStyle = Font.PLAIN;
  private boolean myAutoExpandable = true;
  private ErrorState myErrorState = ErrorState.NONE;
  private ErrorState myCombinedErrorState = ErrorState.NONE;
  private final Object myTreeMessagesLock = new Object();
  private List<TreeMessage> myTreeMessages = null;
  private Map<TextAttribute, Object> myFontAttributes = new HashMap<TextAttribute, Object>();

  public MPSTreeNode(IOperationContext operationContext) {
    myOperationContext = operationContext;
  }

  public MPSTreeNode(Object userObject, IOperationContext operationContext) {
    super(userObject);
    myOperationContext = operationContext;
  }

  public IOperationContext getOperationContext() {
    return myOperationContext;
  }

  @Override
  public Iterator<MPSTreeNode> iterator() {
    if (children == null) {
      return new Iterator<MPSTreeNode>() {
        @Override
        public boolean hasNext() {
          return false;
        }

        @Override
        public MPSTreeNode next() {
          throw new IllegalStateException();
        }

        @Override
        public void remove() {
          throw new IllegalStateException();
        }
      };
    }
    return children.iterator();
  }

  public MPSTree getTree() {
    if (myTree == null && getParent() != null) {
      return ((MPSTreeNode) getParent()).getTree();
    }
    return myTree;
  }

  /**
   *  returns the closest ancestor (nodes or the containing tree) which implements the given class
   */
  public <T> T getAncestor(@Nullable Class<T> cls) {
    TreeNode parent = getParent();
    while (parent != null) {
      if (cls.isInstance(parent)) return (T) parent;
      parent = parent.getParent();
    }
    if (myTree != null && cls.isInstance(myTree)) return (T) myTree;
    return null;
  }

  public void setTree(MPSTree tree) {
    myTree = tree;
  }

  public boolean isInitialized() {
    return true;
  }

  public boolean hasInfiniteSubtree() {
    return false;
  }

  /**
   * This method is not called anymore (and so marked as final), the containing tree decides which groups to use on specific nodes.
   * see ProjectPaneActionGroups.getActionGroup()
   */
  @Deprecated
  public final ActionGroup getActionGroup() {
    return null;
  }

  /**
   * This method is not called anymore (and so marked as final), the containing tree decides which groups to use on specific nodes.
   * see ProjectPaneActionGroups.getQuickCreateGroup()
   */
  @Deprecated
  public final ActionGroup getQuickCreateGroup(boolean plain) {
    return null;
  }

  public void doubleClick() {
  }

  protected void onRemove() {
    getTree().fireTreeNodeRemoved(this);
  }

  protected void onAdd() {
    updatePresentation();
    getTree().fireTreeNodeAdded(this);
  }

  public void init() {
    if (isInitialized()) {
      return;
    }

    MPSTree tree = ModelAccess.instance().runReadAction(new Computable<MPSTree>() {
      @Override
      public MPSTree compute() {
        doInit();
        return getTree();
      }
    });

    if (tree != null) {
      ((DefaultTreeModel) getTree().getModel()).nodeStructureChanged(this);
    }
  }

  protected void doInit() {
  }

  public void updateSubTree() {
    getTree().runRebuildAction(new Runnable() {
      @Override
      public void run() {
        update();
      }
    }, true);
  }

  public void update() {
    doUpdate();
    ((DefaultTreeModel) getTree().getModel()).nodeStructureChanged(this);
  }

  protected void doUpdate() {
  }

  @Override
  public void remove(int childIndex) {
    if (myAdded && getTree() != null && !getTree().isDisposed()) {
      ((MPSTreeNode) getChildAt(childIndex)).removeThisAndChildren();
    }
    super.remove(childIndex);
    updateErrorState();
  }


  @Override
  public void insert(MutableTreeNode newChild, int childIndex) {
    super.insert(newChild, childIndex);
    if (myAdded && getTree() != null && !getTree().isDisposed()) {
      ((MPSTreeNode) getChildAt(childIndex)).addThisAndChildren();
    }
    updateErrorState();
  }

  public boolean hasChild(MutableTreeNode node) {
    for (int i = 0; i < getChildCount(); i++) {
      if (getChildAt(i) == node) return true;
    }
    return false;
  }

  final void removeThisAndChildren() {
    if (!myAdded) {
      throw new IllegalStateException(
          String.format("Trying to remove tree node which have not been added, tree=%s, node=%s",
              myTree != null ? myTree.getClass().getName() : "null", getClass().getName()));
    }
    try {
      onRemove();
    } catch (Throwable t) {
      LOG.error(null, t);
    }
    myAdded = false;
    if (!isInitialized()) {
      return;
    }
    for (MPSTreeNode node : this) {
      node.removeThisAndChildren();
    }
  }

  final void addThisAndChildren() {
    if (myAdded) {
      throw new IllegalStateException(
          String.format("Trying to add tree node which have already been added, tree=%s, node=%s",
              myTree != null ? myTree.getClass().getName() : "null", getClass().getName()));
    }
    try {
      onAdd();
    } catch (Throwable t) {
      LOG.error(null, t);
    }
    myAdded = true;
    if (!isInitialized()) {
      return;
    }
    for (int i = 0; i < getChildCount(); i++) {
      MPSTreeNode node = (MPSTreeNode) getChildAt(i);
      node.addThisAndChildren();
    }
  }

  @Override
  public boolean isLeaf() {
    return false;
  }

  public MPSTreeNode findExactChildWith(Object userObject) {
    for (MPSTreeNode child : this) {
      if (child.getUserObject() == userObject) return child;
    }
    return null;
  }

  @Nullable
  public final MPSTreeNode findDescendantWith(Object userObject) {
    if (getUserObject() == null ? userObject == null : getUserObject().equals(userObject)) return this;
    if (isInitialized()) {
      for (int i = 0; i < getChildCount(); i++) {
        MPSTreeNode result = ((MPSTreeNode) getChildAt(i)).findDescendantWith(userObject);
        if (result != null) return result;
      }
    }
    return null;
  }

  @Nullable
  public final <T> MPSTreeNode findDescendantWith(Condition<T> condition) {
    if (condition.met((T) getUserObject())) return this;
    if (isInitialized()) {
      for (int i = 0; i < getChildCount(); i++) {
        MPSTreeNode result = ((MPSTreeNode) getChildAt(i)).findDescendantWith(condition);
        if (result != null) return result;
      }
    }
    return null;
  }

  @Nullable
  public final <T> MPSTreeNode findStraightAncestorWith(Condition<T> condition) {
    if (!isInitialized()) init();
    for (int i = 0; i < getChildCount(); i++) {
      MPSTreeNode child = (MPSTreeNode) getChildAt(i);
      if (condition.met((T) child.getUserObject())) return child;
    }
    return null;
  }

  public int getToggleClickCount() {
    return 2;
  }

  //updates and refreshes tree
  public void renewPresentation() {
    updatePresentation();
    updateNodePresentationInTree();
  }

  //todo make final
  protected void updatePresentation() {
    setColor(EditorColorsManager.getInstance().getGlobalScheme().getColor(ColorKey.createColorKey("FILESTATUS_NOT_CHANGED")));
    doUpdatePresentation();
    if (myTree == null) {
      myTree = getTree();
    }
    if (myTree != null) {
      myTree.fireTreeNodeUpdated(this);
    }
    Color c = null;
    String additionalText = null;
    synchronized (myTreeMessagesLock) {
      if (myTreeMessages != null) {
        int maxColorPriority = Integer.MIN_VALUE;
        int maxAdditionalTextPriority = Integer.MIN_VALUE;
        for (TreeMessage message : myTreeMessages) {
          if (maxColorPriority < message.getPriority() && message.alternatesColor()) {
            c = message.getColor();
          }
          if (maxAdditionalTextPriority < message.getPriority() && message.hasAdditionalText()) {
            additionalText = message.getAdditionalText();
          }
        }
      }
    }
    if (c != null) {
      setColor(c);
    }
    if (additionalText != null) {
      setAdditionalText(additionalText);
    }
  }

  public void updatePresentation(final boolean reloadSubTree, final boolean updateAncestors) {
    renewPresentation();
    if (reloadSubTree) {
      updateSubTree();
    }

    if (updateAncestors) {
      updateAncestorsPresentationInTree();
    }
  }

  private void treeMessagesChanged(boolean updatePresentation) {
    if (updatePresentation) {
      ThreadUtils.runInUIThreadNoWait(new Runnable() {
        @Override
        public void run() {
          ModelAccess.instance().runReadAction(new Runnable() {
            @Override
            public void run() {
              IOperationContext context = getOperationContext();
              if (context == null) return;
              if (!context.isValid()) return;
              Project project = context.getProject();
              if (project == null) return;
              if (project.isDisposed()) return;

              renewPresentation();
            }
          });
        }
      });
    }
  }

  public void addTreeMessage(TreeMessage message) {
    addTreeMessage(message, true);
  }

  public void addTreeMessage(@NotNull TreeMessage message, boolean updatePresentation) {
    synchronized (myTreeMessagesLock) {
      if (myTreeMessages == null) {
        myTreeMessages = new ArrayList<TreeMessage>(1);
      }
      myTreeMessages.add(message);
      treeMessagesChanged(updatePresentation);
    }
  }

  public void addTreeMessages(TreeMessage... messages) {
    addTreeMessages(true, messages);
  }

  public void addTreeMessages(boolean updatePresentation, @NotNull TreeMessage... messages) {
    if (messages.length == 0) return;
    synchronized (myTreeMessagesLock) {
      if (myTreeMessages == null) {
        myTreeMessages = new ArrayList<TreeMessage>(1);
      }
      myTreeMessages.addAll(Arrays.asList(messages));
      treeMessagesChanged(updatePresentation);
    }
  }

  public void removeTreeMessage(TreeMessage message) {
    removeTreeMessage(message, true);
  }

  public void removeTreeMessage(@NotNull TreeMessage message, boolean updatePresentation) {
    final boolean[] b = new boolean[]{false};
    synchronized (myTreeMessagesLock) {
      if (myTreeMessages != null) {
        b[0] = myTreeMessages.remove(message);
      }
    }
    if (b[0]) {
      treeMessagesChanged(updatePresentation);
    }
  }

  public Set<TreeMessage> removeTreeMessages(TreeMessageOwner owner, boolean updatePresentation) {
    Set<TreeMessage> result = new HashSet<TreeMessage>(1);
    if (owner == null) return result;
    synchronized (myTreeMessagesLock) {
      if (myTreeMessages == null) return result;
      for (TreeMessage message : new ArrayList<TreeMessage>(myTreeMessages)) {
        if (owner.equals(message.getOwner())) {
          result.add(message);
          myTreeMessages.remove(message);
        }
      }
    }
    if (!result.isEmpty()) {
      treeMessagesChanged(updatePresentation);
    }
    return result;
  }

  protected void doUpdatePresentation() {

  }

  public final Icon getIcon(boolean expanded) {
    if (expanded) {
      return myExpandedIcon;
    } else {
      return myCollapsedIcon;
    }
  }

  public final void setIcon(Icon newIcon, boolean expanded) {
    if (expanded) {
      myExpandedIcon = newIcon;
    } else {
      myCollapsedIcon = newIcon;
    }
  }

  public final void setIcon(Icon newIcon) {
    setIcon(newIcon, true);
    setIcon(newIcon, false);
  }

  public final Color getColor() {
    return myColor;
  }

  public final void setColor(Color color) {
    myColor = color;
  }

  public final int getFontStyle() {
    return myFontStyle;
  }

  public final void setFontStyle(int fontStyle) {
    myFontStyle = fontStyle;
  }

  public final void addFontAttribute(TextAttribute key, Object value) {
    myFontAttributes.put(key, value);
  }

  public final Map getFontAttributes() {
    return myFontAttributes;
  }

  @NotNull
  public final String getNodeIdentifier() {
    if (myNodeIdentifier == null) {
      // extra info for assertion failed due to MPS-12305
      String parentId = null;
      if (getParent() instanceof MPSTreeNode) {
        parentId = ((MPSTreeNode) getParent()).getNodeIdentifier();
      }
      throw new IllegalStateException("MPSTreeNode identifier cannot be null, class="
          + getClass().getName() + ", parent id=" + parentId);
    } else {
      return myNodeIdentifier;
    }
  }

  public final void setNodeIdentifier(@NotNull String newNodeIdentifier) {
    myNodeIdentifier = newNodeIdentifier;
  }

  public final String getAdditionalText() {
    return myAdditionalText;
  }

  public final void setAdditionalText(String newAdditionalText) {
    myAdditionalText = newAdditionalText;
  }

  public final String getText() {
    if (myText == null) {
      return getNodeIdentifier();
    } else {
      return myText;
    }
  }

  public final void setText(String text) {
    myText = text;
  }

  public final String getTooltipText() {
    return myTooltipText;
  }

  public final void setTooltipText(String tooltipText) {
    myTooltipText = tooltipText;
  }

  public final boolean isErrorState() {
    return myErrorState == ErrorState.ERROR;
  }

  public final void setErrorState(ErrorState state) {
    myErrorState = state;
    updateErrorState();
  }

  public final ErrorState getErrorState() {
    return myErrorState;
  }

  public final ErrorState getAggregatedErrorState() {
    return myCombinedErrorState;
  }

  private void updateErrorState() {
    ErrorState state = ErrorState.NONE;
    if (propogateErrorUpwards()) {
      for (MPSTreeNode node : this) {
        state = state.combine(node.getAggregatedErrorState());
      }
    }
    myCombinedErrorState = state.combine(myErrorState);
    if (getParent() != null) {
      ((MPSTreeNode) getParent()).updateErrorState();
    }
  }

  protected boolean propogateErrorUpwards() {
    return true;
  }

  public String toString() {
    return getText();
  }

  public final boolean isAutoExpandable() {
    return myAutoExpandable;
  }

  public final void setAutoExpandable(boolean autoExpandable) {
    myAutoExpandable = autoExpandable;
  }

  public final void updateNodePresentationInTree() {
    if (getTree() == null) return;
    ((DefaultTreeModel) getTree().getModel()).nodeChanged(this);
  }

  public void updateAncestorsPresentationInTree() {
    updateNodePresentationInTree();
    if (getParent() == null) return;
    ((MPSTreeNode) getParent()).updateAncestorsPresentationInTree();
  }

  protected boolean canBeOpened() {
    return true;
  }

  public void autoscroll() {

  }

  public boolean isLoadingEnabled() {
    return false;
  }
}
