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
package jetbrains.mps.lang.editor.cellProviders;

import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.NodeReadAccessCasterInEditor;
import jetbrains.mps.smodel.SNodeUtil;
import jetbrains.mps.util.IterableUtil;
import org.jetbrains.mps.openapi.model.SNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class RefNodeListHandler extends AbstractCellListHandler {

  private SNode myChildConcept;
  private SNode myLinkDeclaration;
  private boolean myIsReverseOrder = false;

  public RefNodeListHandler(final SNode ownerNode, final String childRole, EditorContext editorContext) {
    super(ownerNode, childRole, editorContext);
    NodeReadAccessCasterInEditor.runReadTransparentAction(new Runnable() {
      @Override
      public void run() {
        myLinkDeclaration = ((jetbrains.mps.smodel.SNode) ownerNode).getLinkDeclaration(childRole);
        assert myLinkDeclaration != null : "link declaration was not found for role: \"" + childRole + "\" in concept: " + ownerNode.getConcept().getQualifiedName();
        SNode genuineLink = SModelUtil.getGenuineLinkDeclaration(myLinkDeclaration);
        myChildConcept = SModelUtil.getLinkDeclarationTarget(myLinkDeclaration);
        if (SNodeUtil.getLinkDeclaration_IsReference(genuineLink)) {
          throw new RuntimeException("Only Aggregation links can be used in list");
        }
        myElementRole = SModelUtil.getLinkDeclarationRole(genuineLink);
      }
    });
  }

  public RefNodeListHandler(SNode ownerNode, String childRole, EditorContext editorContext, boolean isReverseOrder) {
    this(ownerNode, childRole, editorContext);
    myIsReverseOrder = isReverseOrder;
  }

  public SNode getLinkDeclaration() {
    return myLinkDeclaration;
  }

  public SNode getChildConcept() {
    return myChildConcept;
  }

  @Override
  public EditorCell createNodeCell(EditorContext editorContext, SNode node) {
    return createNodeCell((jetbrains.mps.nodeEditor.EditorContext) editorContext, node);
  }

  /**
   * @deprecated starting from MPS 3.0 another method should be used:
   *             <code>createNodeCell(jetbrains.mps.openapi.editor.EditorContext editorContext)</code>
   *             This method should be removed, content moved to:
   *             <code>createNodeCell(jetbrains.mps.openapi.editor.EditorContext editorContext)</code>
   */
  @Override
  @Deprecated
  public jetbrains.mps.nodeEditor.cells.EditorCell createNodeCell(jetbrains.mps.nodeEditor.EditorContext editorContext, SNode node) {
    return editorContext.createNodeCell(node);
  }

  @Override
  protected EditorCell createEmptyCell(EditorContext editorContext) {
    return createEmptyCell((jetbrains.mps.nodeEditor.EditorContext) editorContext);
  }

  /**
   * @deprecated starting from MPS 3.0 another method should be used:
   *             <code>createEmptyCell(jetbrains.mps.openapi.editor.EditorContext editorContext)</code>
   *             This method should be removed, content moved to:
   *             <code>createEmptyCell(jetbrains.mps.openapi.editor.EditorContext editorContext)</code>
   */
  @Override
  @Deprecated
  protected jetbrains.mps.nodeEditor.cells.EditorCell createEmptyCell(jetbrains.mps.nodeEditor.EditorContext editorContext) {
    EditorCell_Constant emptyCell = new EditorCell_Constant(editorContext, getOwner(), null);
    emptyCell.setDefaultText("<< ... >>");
    emptyCell.setEditable(true);
    emptyCell.setSubstituteInfo(new DefaultChildSubstituteInfo(getOwner(), null, getLinkDeclaration(), editorContext));
    emptyCell.setRole(getElementRole());
    emptyCell.setCellId("empty_" + getElementRole());
    return emptyCell;
  }


  @Override
  protected SNode getAnchorNode(EditorCell anchorCell) {
    SNode anchorNode = (anchorCell != null ? anchorCell.getSNode() : null);
    if (anchorNode != null) {
      Collection<? extends SNode> listElements1 = IterableUtil.asCollection(getOwner().getChildren(getElementRole()));
      // anchor should be directly referenced from "list owner"
      while (anchorNode != null && !listElements1.contains(anchorNode)) {
        anchorNode = anchorNode.getParent();
      }
    }
    return anchorNode;
  }

  @Override
  protected void doInsertNode(SNode anchorNode, boolean insertBefore) {
    insertBefore = insertBefore != myIsReverseOrder;
    if (anchorNode == null && insertBefore) {
      getOwner().addChild(getElementRole(), myInsertedNode);
    } else {
      jetbrains.mps.util.SNodeOperations.insertChild(getOwner(), getElementRole(), myInsertedNode, anchorNode, insertBefore);
    }
  }

  @Override
  protected List<SNode> getNodesForList() {
    List<SNode> resultList = new ArrayList<SNode>();
    if (!myIsReverseOrder) {
      resultList.addAll(IterableUtil.asCollection(myOwnerNode.getChildren(getElementRole())));
    } else {
      List<? extends SNode> children = IterableUtil.copyToList(myOwnerNode.getChildren(getElementRole()));
      Collections.reverse(children);
      resultList.addAll(children);
    }

    Iterator<SNode> it = resultList.iterator();
    while (it.hasNext()) {
      if (!filter(it.next(), getEditorContext().getScope())) {
        it.remove();
      }
    }
    return resultList;
  }

  protected boolean filter(SNode childNode, IScope scope) {
    return true;
  }
}
