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

import jetbrains.mps.actions.runtime.impl.NodeFactoryUtil;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.util.InternUtil;
import org.apache.log4j.LogManager;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.project.GlobalScope;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NodeFactoryManager extends NodeFactoryManager_deprecated {
  private static final Logger LOG = Logger.wrap(LogManager.getLogger(NodeFactoryManager.class));

  public static SNode createNode(String conceptFqName, SNode sampleNode, SNode enclosingNode, @Nullable SModel model) {
    SNode conceptDeclaration = SModelUtil.findConceptDeclaration(conceptFqName, GlobalScope.getInstance());
    return createNode(conceptDeclaration, sampleNode, enclosingNode, model, GlobalScope.getInstance());
  }

  public static SNode createNode(SNode enclosingNode, EditorContext editorContext, String linkRole) {
    SNode concept = ((jetbrains.mps.smodel.SNode) enclosingNode).getConceptDeclarationNode();
    SNode linkDeclaration = getTopLinkDeclaration(concept, SModelSearchUtil.findLinkDeclaration(concept, linkRole));
    SNode targetConcept = SModelUtil.getLinkDeclarationTarget(linkDeclaration);
    SModel model = enclosingNode.getModel();
    IScope scope = editorContext.getOperationContext().getScope();
    return createNode(targetConcept, null, enclosingNode, model, scope);
  }

  private static SNode getTopLinkDeclaration(SNode conceptDeclaration, SNode linkDeclaration) {
    SNode result = linkDeclaration;
    List<SNode> linkDeclarations = SModelSearchUtil.getLinkDeclarations(conceptDeclaration);
    for (SNode declaration : linkDeclarations) {
      SNode specializedLink = SModelUtil.getLinkDeclarationSpecializedLink(declaration);
      if (specializedLink == linkDeclaration) {
        result = declaration;
        break;
      }
    }
    return result;
  }

  public static SNode createNode(@NotNull SNode nodeConcept, SNode sampleNode, SNode enclosingNode, @Nullable SModel model, IScope scope) {
    if (SNodeUtil.isInstanceOfInterfaceConceptDeclaration(nodeConcept)) {
      String conceptFqName = InternUtil.intern(NameUtil.nodeFQName(nodeConcept));
      return new jetbrains.mps.smodel.SNode(conceptFqName);
    }
    SNode newNode = SModelUtil_new.instantiateConceptDeclaration(nodeConcept, model, false);
    if (newNode == null) return null;
    BehaviorManager.getInstance().initNode(newNode);
    if (sampleNode != null) {
      sampleNode = CopyUtil.copy(sampleNode);
    }
    nodeConcept = ((jetbrains.mps.smodel.SNode) newNode).getConceptDeclarationNode(); // default concrete concept could change nodeConcept
    setupNode(nodeConcept, newNode, sampleNode, enclosingNode, model, scope);
    createNodeStructure(nodeConcept, newNode, sampleNode, enclosingNode, model, scope);
    return newNode;
  }

  private static void createNodeStructure(SNode nodeConcept,
                                         SNode newNode, SNode sampleNode, SNode enclosingNode,
                                         SModel model, IScope scope) {
    for (SNode linkDeclaration : SModelSearchUtil.getLinkDeclarations(nodeConcept)) {
      String role = SModelUtil.getGenuineLinkRole(linkDeclaration);

      SNode genuineLinkDeclaration = SModelUtil.getGenuineLinkDeclaration(linkDeclaration);
      if (!SNodeUtil.getLinkDeclaration_IsReference(genuineLinkDeclaration) &&
        SNodeUtil.getLinkDeclaration_IsAtLeastOneMultiplicity(genuineLinkDeclaration)) {

        SNode targetConcept = SModelUtil.getLinkDeclarationTarget(linkDeclaration);
        LOG.assertLog(targetConcept != null, "link target is null");
        if (!newNode.getChildren(role).iterator().hasNext()) {
          SNode childNode = createNode(targetConcept, sampleNode, enclosingNode, model, scope);
          newNode.addChild(role, childNode);
        }
      }
    }
  }

  public static void setupNode(SNode nodeConcept, SNode node, SNode sampleNode, SNode enclosingNode, SModel model, IScope scope) {
    boolean done = setupNode_internal(nodeConcept, node, sampleNode, enclosingNode, model, scope);
    if (!done) {
      // TODO: remove adapter here
      setupNode_deprecated(nodeConcept, node, sampleNode);
    }
  }

  private static boolean setupNode_internal(SNode nodeConcept, SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model, IScope scope) {
    List<SNode> nodeFactories = new ArrayList<SNode>();
    for (String ancestor : ConceptRegistry.getInstance().getConceptDescriptor(NameUtil.nodeFQName(nodeConcept)).getAncestorsNames()) {
      SNode acd = SModelUtil.findConceptDeclaration(ancestor, scope);
      Language language = SModelUtil.getDeclaringLanguage(acd);
      if (language == null) break;
      nodeFactories.addAll(NodeFactoryUtil.getApplicableNodeFactories(acd, language));
    }

    if (nodeFactories.isEmpty()) return false;

    // setup node
    for (SNode factory : nodeFactories) {
      NodeFactoryUtil.invokeNodeSetupFunction(factory, newNode, sampleNode, enclosingNode, model);
    }
    return true;
  }
}
