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
import jetbrains.mps.smodel.MPSModuleRepository;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.annotations.NotNull;

/**
 * Evgeny Gryaznov, 11/19/10
 */
public class ReferenceInfo_Template extends ReferenceInfo_TemplateBase {
  private SNodeReference myTemplateSourceNode;
  private String myTemplateTargetNode;
  private TemplateContext myContext;
  private String myResolveInfo;


  public ReferenceInfo_Template(@NotNull SNode outputSourceNode, String role, SNodeReference sourceNode, String targetNodeId, String resolveInfo, TemplateContext context) {
    super(outputSourceNode, role, context.getInput());
    myContext = context;
    myTemplateSourceNode = sourceNode;
    myTemplateTargetNode = targetNodeId;
    myResolveInfo = resolveInfo;
  }

  @Override
  public SNode getInputTargetNode() {
    throw new UnsupportedOperationException();
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
    return myResolveInfo;
  }

  @Override
  public String getResolveInfoForNothing() {
    return myResolveInfo;
  }

  @Override
  public ProblemDescription[] getErrorDescriptions() {
    SNode inputNode = getInputNode();
    return new ProblemDescription[]{
      GeneratorUtil.describe(inputNode, "input node"),
      GeneratorUtil.describe(myTemplateSourceNode.resolve(MPSModuleRepository.getInstance()), "original reference")
    };
  }


  @Override
  protected SNode getTemplateNode() {
    return myTemplateSourceNode != null ? myTemplateSourceNode.resolve(MPSModuleRepository.getInstance()) : null;
  }
}
