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
package jetbrains.mps.generator.impl.reference;

import jetbrains.mps.generator.IGeneratorLogger.ProblemDescription;
import jetbrains.mps.generator.impl.GeneratorUtil;
import jetbrains.mps.generator.impl.TemplateGenerator;
import jetbrains.mps.generator.runtime.TemplateContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SReference;
import org.jetbrains.annotations.NotNull;

/**
 * Created by: Sergey Dmitriev
 * Date: Jan 25, 2007
 */
public class ReferenceInfo_TemplateNode extends ReferenceInfo_TemplateBase {
  private SNode myTemplateSourceNode;
  private SNode myTemplateTargetNode;
  private TemplateContext myContext;


  public ReferenceInfo_TemplateNode(@NotNull SNode outputSourceNode, SReference templateReference, TemplateContext context) {
    super(outputSourceNode, templateReference.getRole(), context.getInput());
    myContext = context;
    myTemplateSourceNode = templateReference.getSourceNode();
    myTemplateTargetNode = templateReference.getTargetNode();
  }

  @Override
  public SNode getInputTargetNode() {
    return myTemplateTargetNode;
  }

  @Override
  public SNode doResolve_Straightforward(TemplateGenerator generator) {
    // try to find for the same inputNode
    SNode outputTargetNode = generator.findOutputNodeByInputAndTemplateNode(getInputNode(), myTemplateTargetNode);
    if (outputTargetNode != null) {
      checkCrossRootTemplateReference(outputTargetNode, generator);
      return outputTargetNode;
    }

    // if template has been applied exactly once, then we have unique output node for each template node
    outputTargetNode = generator.findOutputNodeByTemplateNodeUnique(myTemplateTargetNode);
    if (outputTargetNode != null) {
      checkCrossRootTemplateReference(outputTargetNode, generator);
      return outputTargetNode;
    }

    // try to resolve if referent node is parent of source node.
    // this solves situation when reference node inside 'template fragment' refers to 'context node' (ancestor outside 'template fragment')
    SNode templateParentNode = myTemplateSourceNode.getParent();
    SNode outputParentNode = getOutputSourceNode().getParent();
    while (templateParentNode != null && outputParentNode != null) {
      if (templateParentNode.equals(myTemplateTargetNode)) {
        return outputParentNode;
      }
      templateParentNode = templateParentNode.getParent();
      outputParentNode = outputParentNode.getParent();
    }

    // try to find for indirect input nodes
    for (SNode historyInputNode : myContext.getInputHistory()) {
      outputTargetNode = generator.findOutputNodeByInputAndTemplateNode(historyInputNode, myTemplateTargetNode);
      if (outputTargetNode != null) {
        checkCrossRootTemplateReference(outputTargetNode, generator);
        return outputTargetNode;
      }
    }

    return null;
  }

  @Override
  public SNode doResolve_Tricky(TemplateGenerator generator) {
    return null;
  }

  @Override
  public String getResolveInfoForDynamicResolve() {
    return jetbrains.mps.util.SNodeOperations.getResolveInfo(myTemplateTargetNode);
  }

  @Override
  public String getResolveInfoForNothing() {
    return jetbrains.mps.util.SNodeOperations.getResolveInfo(myTemplateTargetNode);
  }

  @Override
  public ProblemDescription[] getErrorDescriptions() {
    SNode inputNode = getInputNode();
    return new ProblemDescription[]{
      GeneratorUtil.describe(inputNode, "input node"),
      GeneratorUtil.describe(myTemplateSourceNode, "original reference")
    };
  }

  @Override
  protected SNode getTemplateNode() {
    return myTemplateSourceNode;
  }
}
