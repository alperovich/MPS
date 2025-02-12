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
package jetbrains.mps.generator.impl;

import jetbrains.mps.generator.GenerationCanceledException;
import jetbrains.mps.generator.GenerationTracerUtil;
import jetbrains.mps.generator.IGenerationTracer;
import jetbrains.mps.generator.impl.TemplateProcessor.TemplateProcessingFailureException;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateWeavingRule;
import jetbrains.mps.generator.template.QueryExecutionContext;
import jetbrains.mps.smodel.FastNodeFinder;
import jetbrains.mps.smodel.MPSModuleRepository;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;

/**
 * Evgeny Gryaznov, Feb 15, 2010
 */
public class WeavingProcessor {

  private IGenerationTracer myGenerationTracer;
  private TemplateGenerator myGenerator;
  private FastNodeFinder myFastNodeFinder;

  public WeavingProcessor(TemplateGenerator generator) {
    myGenerator = generator;
    myGenerationTracer = myGenerator.getGenerationTracer();
    myFastNodeFinder = ((jetbrains.mps.smodel.SModelInternal) myGenerator.getInputModel()).getFastNodeFinder();
  }

  public void apply(TemplateWeavingRule rule)
    throws GenerationFailureException, GenerationCanceledException {

    String applicableConcept = rule.getApplicableConcept();
    if (applicableConcept == null) {
      myGenerator.showErrorMessage(null, null, rule.getRuleNode().resolve(MPSModuleRepository.getInstance()), "rule has no applicable concept defined");
      return;
    }

    boolean includeInheritors = rule.applyToInheritors();
    Iterable<SNode> nodes = myFastNodeFinder.getNodes(applicableConcept, includeInheritors);
    for (SNode applicableNode : nodes) {
      QueryExecutionContext executionContext = myGenerator.getExecutionContext(applicableNode);
      if (executionContext == null) {
        continue;
      }
      ReductionContext reductionContext = new ReductionContext(executionContext);
      TemplateExecutionEnvironment environment = new TemplateExecutionEnvironmentImpl(myGenerator, reductionContext, myGenerator.getOperationContext(), myGenerationTracer);

      try {
        DefaultTemplateContext context = new DefaultTemplateContext(applicableNode);
        if (executionContext.isApplicable(rule, environment, context)) {
          SNode outputContextNode = executionContext.getContextNode(rule, environment, context);
          if (!checkContext(rule, applicableNode, outputContextNode)) {
            continue;
          }
          myGenerator.setChanged();

          boolean someOutputGenerated = true;
          myGenerationTracer.pushInputNode(GenerationTracerUtil.getSNodePointer(applicableNode));
          myGenerationTracer.pushRule(rule.getRuleNode());
          try {
            someOutputGenerated = rule.apply(environment, context, outputContextNode);

          } catch (DismissTopMappingRuleException e) {
            environment.getGenerator().showErrorMessage(context.getInput(), null, rule.getRuleNode().resolve(MPSModuleRepository.getInstance()), "wrong template: dismission of weaving rule is not supported");
          } catch (TemplateProcessingFailureException e) {
            environment.getGenerator().showErrorMessage(context.getInput(), null, rule.getRuleNode().resolve(MPSModuleRepository.getInstance()), "weaving rule: error processing template fragment");
          } finally {
            if (someOutputGenerated) {
              myGenerationTracer.closeInputNode(GenerationTracerUtil.getSNodePointer(applicableNode));
            } else {
              myGenerationTracer.popInputNode(GenerationTracerUtil.getSNodePointer(applicableNode));
            }
          }
        }
      } catch (GenerationException e) {
        if (e instanceof GenerationCanceledException) throw (GenerationCanceledException) e;
        if (e instanceof GenerationFailureException) throw (GenerationFailureException) e;
        myGenerator.showErrorMessage(null, rule.getRuleNode().resolve(MPSModuleRepository.getInstance()), "internal error: " + e.toString());
      }
    }
  }

  private boolean checkContext(TemplateWeavingRule rule, SNode applicableNode, SNode contextNode) {
    if (contextNode == null) {
      myGenerator.showErrorMessage(applicableNode, rule.getRuleNode().resolve(MPSModuleRepository.getInstance()), "weaving rule: cannot find context node");
      return false;
    }

    // Additional check - context should be generated from the same root
    SNode contextRoot = contextNode.getContainingRoot();
    SModel model = contextRoot.getModel();
    if (model == null) {
      myGenerator.showErrorIfStrict(rule.getRuleNode().resolve(MPSModuleRepository.getInstance()), "bad context for weaving rule: no root for context " + contextNode);
      return !myGenerator.isStrict();
    }

    SNode originalContextRoot = myGenerator.getOriginalRootByGenerated(contextRoot);
    if (originalContextRoot == null) {
      myGenerator.showErrorIfStrict(rule.getRuleNode().resolve(MPSModuleRepository.getInstance()), "bad context for weaving rule: " + contextRoot + " is generated by 'create root' rule");
      return !myGenerator.isStrict();
    }

    if (applicableNode.getModel() == null) return true;

    SNode inputRoot = applicableNode.getContainingRoot();
    if (originalContextRoot != inputRoot) {
      myGenerator.showErrorIfStrict(rule.getRuleNode().resolve(MPSModuleRepository.getInstance()),
        "bad context for weaving rule: " + contextRoot.toString() + " is generated from " + originalContextRoot.toString()
          + ", while input node is from " + inputRoot.toString());
      return !myGenerator.isStrict();
    }

    return true;
  }
}
