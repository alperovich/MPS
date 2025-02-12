/*
 * Copyright 2003-2012 JetBrains s.r.o.
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
package org.jetbrains.mps.openapi.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.mps.openapi.util.TreeIterator;
import org.jetbrains.mps.util.Condition;

import java.util.Collections;
import java.util.Iterator;

/**
 * This class implement complex operations on the node structure.
 * Unlike the SNode implementations, which may focus on their specific needs, this class should consider all cases,
 * e.g. replacing a node with a root node from another model
 */
public class SNodeUtil {

  /**
   * Returns whether the given node belongs to the repository (or to one of its parent repositories).
   */
  public static boolean isAccessible(@NotNull SNode node, SRepository inRepository) {
    inRepository.getModelAccess().checkReadAccess();

    SModel model = node.getModel();
    if (model == null) return false;

    SRepository mrep = model.getRepository();
    if (mrep == null) return false;

    SRepository repository = inRepository;
    while (repository != null && repository != mrep) {
      repository = repository.getParent();
    }
    return repository != null;
  }

  public static boolean isInstanceOf(@Nullable SNode node, @NotNull SAbstractConcept concept) {
    if (node == null) return false;
    SConcept c = node.getConcept();
    if (c == null) return false;
    return c.isSubConceptOf(concept);
  }

  /**
   * Replaces a node with another, preserving attributes
   */
  public static SNode replaceWithAnother(@NotNull SNode node, SNode replacer) {
    SNode nodeParent = node.getParent();
    if (nodeParent == null) {
      SModel model = node.getModel();
      if (model != null && node.getParent() == null) {
        node.delete();
        model.addRootNode(replacer);
      }
      return replacer;
    }

    if (replacer != null) {
      SNode replacerParent = replacer.getParent();
      if (replacerParent != null) {
        replacerParent.removeChild(replacer);
      }

      String role = node.getRoleInParent();
      assert role != null;
      // old and new child can have the same node Id
      // thus it is important to remove old child first
      SNode anchor = node.getNextSibling();
      nodeParent.removeChild(node);
      nodeParent.insertChildBefore(role, replacer, anchor);
    } else {
      nodeParent.removeChild(node);
    }

    return replacer;
  }

  public static String getDebugText(@NotNull SNode node) {
    String roleText = "";
    if (node.getModel() != null) {
      SNode parent = node.getParent();
      roleText = parent == null ? "[root]" : "[" + node.getRoleInParent() + "]";
    }
    String nameText;
    String modelName;
    try {
      String role = SNodeAccessUtil.getProperty(node, "role");
      if (role != null) {
        nameText = '"' + role + '"';
      } else {
        nameText = "<no ref>";
      }

      nameText = nameText + "[" + node.getNodeId() + "]";

      SModel model = node.getModel();
      modelName = model != null ? model.getModelName() : "<no model>";

    } catch (Exception e) {
      nameText = "<??name??>";
      modelName = "<??model??>";
    }
    return roleText + " " + node.getConcept().getName() + " " + nameText + " in " + modelName;
  }

  /**
   * Iterates over all nodes in the given model.
   */
  public static Iterable<SNode> getDescendants(@NotNull SModel model) {
    return new NodesIterable(model);
  }

  /**
   * Iterates over the subtree starting at the given node.
   */
  @NotNull
  public static Iterable<SNode> getDescendants(@NotNull SNode node) {
    return new DescendantsIterable(node, null, true);
  }

  /**
   * Iterates over the subtree starting at the given node.
   *
   * @param condition    if not null, acts like a filter
   * @param includeFirst false to skip the root node from the returned sequence
   */
  @NotNull
  public static Iterable<SNode> getDescendants(@NotNull SNode node, @Nullable Condition<SNode> condition, boolean includeFirst) {
    return new DescendantsIterable(node, condition, includeFirst);
  }


  private static class DescendantsIterable implements Iterable<SNode> {
    @NotNull
    private final SNode myNode;
    @Nullable
    private final Condition<SNode> myCondition;
    private final boolean myIncludeFirst;

    private DescendantsIterable(@NotNull SNode node, @Nullable final Condition<SNode> condition, boolean includeFirst) {
      myNode = node;
      myCondition = condition;
      myIncludeFirst = includeFirst;
    }

    @Override
    public TreeIterator<SNode> iterator() {
      return new DescendantsIterator(myNode, myIncludeFirst ? myNode : myNode.getFirstChild(), myCondition);
    }
  }

  private static class DescendantsIterator implements TreeIterator<SNode> {
    private SNode original;
    private SNode current;
    private Condition<SNode> condition;
    private SNode prev;

    DescendantsIterator(SNode original, SNode first, @Nullable Condition<SNode> condition) {
      this.original = original;
      this.current = first;
      this.condition = condition;
      while (current != null && condition != null && !condition.met(current)) {
        current = nextInternal(current, false);
      }
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public SNode next() {
      SNode result = current;
      do {
        current = nextInternal(current, false);
      } while (current != null && condition != null && !condition.met(current));
      prev = result;
      return result;
    }

    @Override
    public void skipChildren() {
      if (prev == null) throw new IllegalStateException("no element");
      current = nextInternal(prev, true);
      while (current != null && condition != null && !condition.met(current)) {
        current = nextInternal(current, false);
      }
    }

    private SNode nextInternal(SNode curr, boolean skipChildren) {
      if (curr == null) return null;
      if (!skipChildren) {
        SNode firstChild = curr.getFirstChild();
        if (firstChild != null) return firstChild;
      }
      if (curr == original) return null;
      do {
        if (curr.getNextSibling() != null) {
          return curr.getNextSibling();
        }
        curr = curr.getParent();
      } while (curr != original);
      return null;
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }

    public Iterator<SNode> iterator() {
      return this;
    }
  }

  private static class NodesIterable implements Iterable<SNode> {
    private SModel mySModel;

    public NodesIterable(SModel sModel) {
      mySModel = sModel;
    }

    @Override
    public Iterator<SNode> iterator() {
      return new NodesIterator(mySModel.getRootNodes().iterator());
    }
  }

  private static class NodesIterator implements Iterator<SNode> {
    private Iterator<SNode> myRoots;
    private Iterator<SNode> myCurrent;

    public NodesIterator(Iterator<SNode> roots) {
      myRoots = roots;
      myCurrent = getIterForNextRoot(roots);
    }

    @Override
    public boolean hasNext() {
      moveToNextRootIfNeeded();
      return myCurrent.hasNext();
    }

    @Override
    public SNode next() {
      moveToNextRootIfNeeded();
      return myCurrent.next();
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }

    private void moveToNextRootIfNeeded() {
      if (myCurrent.hasNext()) return;
      if (!myRoots.hasNext()) return;

      while (myRoots.hasNext() && !(myCurrent.hasNext())) {
        myCurrent = getIterForNextRoot(myRoots);
      }
    }

    private Iterator<SNode> getIterForNextRoot(Iterator<SNode> roots) {
      if (!roots.hasNext()) return Collections.<SNode>emptyList().iterator();

      SNode next = roots.next();
      return SNodeUtil.getDescendants(next).iterator();
    }
  }
}

