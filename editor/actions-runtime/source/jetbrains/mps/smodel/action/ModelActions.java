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
package jetbrains.mps.smodel.action;

import jetbrains.mps.nodeEditor.CellSide;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.mps.openapi.model.SNode;

import java.util.List;

/**
 * Igor Alshannikov
 * Mar 29, 2005
 */
public class ModelActions {
  //-------------------
  // child substitute
  //-------------------

  /**
   * Method should be removed after MPS 3.0
   *
   * @deprecated since MPS 3.0 use createChildNodeSubstituteActions() instead
   */
  @Deprecated
  public static List<INodeSubstituteAction> createChildSubstituteActions(SNode parentNode, SNode currentChild, SNode childConcept, IChildNodeSetter childSetter,
      IOperationContext context) {
    return (List) ChildSubstituteActionsHelper.createActions(parentNode, currentChild, childConcept, childSetter, context);
  }

  public static List<SubstituteAction> createChildNodeSubstituteActions(SNode parentNode, SNode currentChild, SNode childConcept, IChildNodeSetter childSetter,
      IOperationContext context) {
    return ChildSubstituteActionsHelper.createActions(parentNode, currentChild, childConcept, childSetter, context);
  }

  //-------------------
  // referent substitute
  //-------------------

  public static List<SubstituteAction> createReferentSubstituteActions(SNode referenceNode, SNode currentReferent, SNode linkDeclaration,
      IOperationContext context) {
    return ReferentSubstituteActionsHelper.createActions(referenceNode, currentReferent, linkDeclaration, context);
  }

  //-------------------
  // right-transform hint substitute
  //-------------------

  public static boolean canCreateSideTransformHintSubstituteActions(SNode sourceNode, CellSide side, String transformTag, IOperationContext context) {
    return new SideTransformHintSubstituteActionsHelper(sourceNode, side, transformTag, context).canCreateActions();
  }

  /**
   * Method should be removed after MPS 3.0
   *
   * @deprecated since MPS 3.0 use createSideTransformHintSubstituteActions() instead
   */
  @Deprecated
  public static List<INodeSubstituteAction> createRightTransformHintSubstituteActions(SNode sourceNode, CellSide side, String transformTag,
      IOperationContext context) {
    return (List) createSideTransformHintSubstituteActions(sourceNode, side, transformTag, context);
  }

  public static List<SubstituteAction> createSideTransformHintSubstituteActions(SNode sourceNode, CellSide side, String transformTag,
      IOperationContext context) {
    return new SideTransformHintSubstituteActionsHelper(sourceNode, side, transformTag, context).createActions();
  }
}
