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
package jetbrains.mps.generator.runtime;

import jetbrains.mps.generator.GenerationCanceledException;
import jetbrains.mps.generator.IGenerationTracer;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.generator.impl.ReductionContext;
import jetbrains.mps.generator.impl.TemplateGenerator;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

/**
 * Evgeny Gryaznov, 10/22/10
 */
public interface TemplateExecutionEnvironment {

  IOperationContext getOperationContext();

  SModel getOutputModel();

  SNode createOutputNode(String conceptName);

  @NotNull
  TemplateGenerator getGenerator();

  IGenerationTracer getTracer();

  @NotNull
  ReductionContext getReductionContext();

  TemplateExecutionEnvironment getEnvironment(SNode inputNode, TemplateReductionRule rule);

  Collection<SNode> copyNodes(Iterable<SNode> inputNodes, SNodeReference templateNode, String templateNodeId, String mappingName, TemplateContext templateContext) throws GenerationCanceledException, GenerationFailureException;

  SNode insertNode(SNode node, SNodeReference templateNode, TemplateContext templateContext) throws GenerationCanceledException, GenerationFailureException;

  Collection<SNode> trySwitch(SNodeReference _switch, String mappingName, TemplateContext context) throws GenerationException;

  Collection<SNode> applyTemplate(@NotNull SNodeReference templateDeclaration, @NotNull SNodeReference templateNode, @NotNull TemplateContext context, Object... arguments) throws GenerationException;

  Collection<SNode> weaveTemplate(@NotNull SNodeReference templateDeclaration, @NotNull SNodeReference templateNode, @NotNull TemplateContext context, @NotNull SNode outputContextNode, Object... arguments) throws GenerationException;

  void nodeCopied(TemplateContext context, SNode outputNode, String templateNodeId);

  void registerLabel(SNode inputNode, SNode outputNode, String mappingLabel);

  void registerLabel(SNode inputNode, Iterable<SNode> outputNodes, String mappingLabel);

  void resolveInTemplateLater(@NotNull SNode outputNode, String role, SNodeReference sourceNode, int parentIndex, String resolveInfo, TemplateContext context);

  void resolveInTemplateLater(@NotNull SNode outputNode, String role, SNodeReference sourceNode, String templateNodeId, String resolveInfo, TemplateContext context);

  void resolve(ReferenceResolver resolver, SNode outputNode, String role, TemplateContext context);

  /*
   *  returns temporary node
   */
  SNode insertLater(@NotNull NodeMapper mapper, PostProcessor postProcessor, TemplateContext context);

  void postProcess(@NotNull PostProcessor processor, SNode outputNode, TemplateContext context);

  void weaveNode(SNode contextParentNode, String childRole, SNode outputNodeToWeave, SNodeReference templateNode, SNode inputNode);
}
