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
package jetbrains.mps.nodeEditor.cellMenu;

import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.project.GlobalScope;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.action.DefaultChildNodeSetter;
import jetbrains.mps.smodel.action.ModelActions;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.typesystem.inference.InequalitySystem;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.util.NameUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DefaultChildSubstituteInfo extends AbstractNodeSubstituteInfo {
  private static final Logger LOG = Logger.wrap(LogManager.getLogger(DefaultChildSubstituteInfo.class));

  private SNode myParentNode;
  private SNode myCurrentChild;
  private SNode myLinkDeclaration;

  public DefaultChildSubstituteInfo(final SNode sourceNode, final SNode linkDeclaration, final EditorContext editorContext) {
    super(editorContext);
    NodeReadAccessCasterInEditor.runReadTransparentAction(new Runnable() {
      @Override
      public void run() {
        if (isNotAggregation(linkDeclaration)) {
          LOG.error("only aggregation links are allowed here", linkDeclaration);
        }
        SNode genuineLinkDeclaration = SModelUtil.getGenuineLinkDeclaration(linkDeclaration);
        if (SModelUtil.isMultipleLinkDeclaration(genuineLinkDeclaration)) {
          LOG.error("only cardinalities 1 or 0..1 are allowed here", linkDeclaration);
        }

        myParentNode = sourceNode;
        SNode mostSpecificLinkDeclaration = SModelSearchUtil.findMostSpecificLinkDeclaration(((jetbrains.mps.smodel.SNode) myParentNode).getConceptDeclarationNode(), SModelUtil.getLinkDeclarationRole(linkDeclaration));
        myLinkDeclaration = mostSpecificLinkDeclaration;
        Iterable<? extends SNode> ch = sourceNode.getChildren(SModelUtil.getGenuineLinkRole(linkDeclaration));
        myCurrentChild = ch.iterator().hasNext() ? ch.iterator().next() : null;
      }
    });
  }

  public DefaultChildSubstituteInfo(final SNode parentNode, final SNode currChildNode, final SNode linkDeclaration, final EditorContext editorContext) {
    super(editorContext);
    NodeReadAccessCasterInEditor.runReadTransparentAction(new Runnable() {
      @Override
      public void run() {
        if (linkDeclaration == null) {
          LOG.error("link declaration is null", new IllegalArgumentException("link declaration is null"));
        } else if (isNotAggregation(linkDeclaration)) {
          LOG.error("only aggregation links are allowed here", new RuntimeException("only aggregation links are allowed here"), linkDeclaration);
        }
        myParentNode = parentNode;
        SNode mostSpecificLinkDeclaration = SModelSearchUtil.findMostSpecificLinkDeclaration(((jetbrains.mps.smodel.SNode) myParentNode).getConceptDeclarationNode(), SModelUtil.getLinkDeclarationRole(linkDeclaration));
        myLinkDeclaration = mostSpecificLinkDeclaration;
        myCurrentChild = currChildNode;
      }
    });
  }

  @Override
  public List<SubstituteAction> createActions() {
    List<SubstituteAction> actions = ModelActions.createChildNodeSubstituteActions(myParentNode, myCurrentChild,
      SModelUtil.getLinkDeclarationTarget(myLinkDeclaration),
      createDefaultNodeSetter(),
      getOperationContext());
    return actions;
  }

  @Override
  protected InequalitySystem getInequalitiesSystem(EditorCell contextCell) {
    HashMap<SNode, SNode> mapping = new HashMap<SNode, SNode>();
    CopyUtil.copy(Arrays.asList(myParentNode.getContainingRoot()), mapping).get(0);

    boolean holeIsAType = SModelUtil.isAssignableConcept(NameUtil.nodeFQName(SModelUtil.getLinkDeclarationTarget(myLinkDeclaration)), "jetbrains.mps.lang.core.structure.IType");
    SNode hole = null;
    SNode parent = mapping.get(myParentNode);
    String role = SModelUtil.getGenuineLinkRole(myLinkDeclaration);
    hole = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept", null, GlobalScope.getInstance());
    if (myCurrentChild != null) {
      SNode child = mapping.get(myCurrentChild);
      parent.insertChildBefore(role, hole, child);
      parent.removeChild(child);
    } else {
      parent.addChild(role, hole);
    }
    InequalitySystem inequationsForHole = TypeChecker.getInstance().getInequalitiesForHole(hole, holeIsAType);
    inequationsForHole.replaceRefs(mapping);
    return inequationsForHole;
  }

  protected DefaultChildNodeSetter createDefaultNodeSetter() {
    return new DefaultChildNodeSetter(myLinkDeclaration);
  }

  protected SNode getLinkDeclaration() {
    return myLinkDeclaration;
  }

  public static boolean isNotAggregation(SNode linkDeclaration) {
    SNode genuineLinkDeclaration = SModelUtil.getGenuineLinkDeclaration(linkDeclaration);
    return SNodeUtil.getLinkDeclaration_IsReference(genuineLinkDeclaration);
  }

}
