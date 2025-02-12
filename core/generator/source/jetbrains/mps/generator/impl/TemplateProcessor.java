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
import jetbrains.mps.generator.IGeneratorLogger;
import jetbrains.mps.generator.IGeneratorLogger.ProblemDescription;
import jetbrains.mps.generator.impl.AbstractTemplateGenerator.RoleValidationStatus;
import jetbrains.mps.generator.impl.interpreted.TemplateWeavingRuleInterpreted;
import jetbrains.mps.generator.impl.reference.PostponedReference;
import jetbrains.mps.generator.impl.reference.ReferenceInfo_CopiedInputNode;
import jetbrains.mps.generator.impl.reference.ReferenceInfo_Macro;
import jetbrains.mps.generator.impl.reference.ReferenceInfo_MacroNode;
import jetbrains.mps.generator.impl.reference.ReferenceInfo_TemplateNode;
import jetbrains.mps.generator.impl.template.InputQueryUtil;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import jetbrains.mps.generator.template.TracingUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.NodeReadEventsCaster;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.StaticReference;
import jetbrains.mps.util.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.model.SReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Applies template to input node.
 */
public class TemplateProcessor {
  private final TemplateGenerator myGenerator;
  private final ReductionContext myReductionContext;
  private final SModel myOutputModel;
  private final IGenerationTracer myTracer;

  public TemplateProcessor(@NotNull TemplateGenerator generator, @NotNull ReductionContext reductionContext) {
    myGenerator = generator;
    myReductionContext = reductionContext;
    myOutputModel = myGenerator.getOutputModel();
    myTracer = myGenerator.getGenerationTracer();
  }

  @NotNull
  public List<SNode> apply(String mappingName, SNode templateNode, @NotNull TemplateContext context)
      throws DismissTopMappingRuleException, TemplateProcessingFailureException, GenerationFailureException, GenerationCanceledException {
    IGeneratorLogger logger = myGenerator.getLogger();
    if (myGenerator.isIncremental()) {
      // turn off tracing
      NodeReadEventsCaster.setNodesReadListener(null);
    }
    try {
      if (myGenerator.getProgressMonitor().isCanceled()) {
        if (myTracer.isTracing() && logger.needsInfo()) {
          logger.info("generation canceled when processing branch:");
          GeneratorUtil.logCurrentGenerationBranch(logger, myTracer, false);
        }
        throw new GenerationCanceledException();
      }

      try {
        List<SNode> outputNodes = applyTemplate(mappingName, templateNode, context.subContext(mappingName), null);
        if (outputNodes == null) {
          throw new TemplateProcessingFailureException();
        }
        return outputNodes;
      } catch (StackOverflowError e) {
        // this is critical
        logger.error("generation thread run out of stack space :(");
        if (myTracer.isTracing()) {
          logger.error("failed branch was:");
          GeneratorUtil.logCurrentGenerationBranch(logger, myTracer, true);
        } else {
          logger.error("try to increase JVM stack size (-Xss option)");
          logger.error("to get more diagnostic generate model with the 'save transient models' option");
        }
        myGenerator.showErrorMessage(context.getInput(), templateNode, "couldn't process template");
        throw new GenerationFailureException(e);
      }
    } finally {
      if (myGenerator.isIncremental()) {
        // restore tracing
        NodeReadEventsCaster.removeNodesReadListener();
      }
    }
  }

  private SNode nextMacro(SNode templateNode, SNode prevMacro) {
    if (prevMacro == null) {
      for (SNode attrNode : templateNode.getChildren(GeneratorUtilEx.link_BaseConcept_attrs)) {
        if (attrNode.getConcept().isSubConceptOf(SConceptRepository.getInstance().getConcept(RuleUtil.concept_NodeMacro))) {
          return attrNode;
        }
      }
    } else {
      SNode attrNode = prevMacro;
      assert prevMacro.getParent() == templateNode;
      while ((attrNode = attrNode.getNextSibling()) != null) {
        if (attrNode.getConcept().isSubConceptOf(SConceptRepository.getInstance().getConcept(RuleUtil.concept_NodeMacro))) {
          return attrNode;
        }
      }
    }
    return null;
  }

  @Nullable
  private List<SNode> applyTemplate(String mappingName,
      SNode templateNode,
      @NotNull TemplateContext context,
      SNode prevMacro)
      throws DismissTopMappingRuleException, GenerationFailureException, GenerationCanceledException {

    assert mappingName == null || mappingName.equals(context.getInputName());

    // templateNode has unprocessed node-macros?
    SNode nextMacro = nextMacro(templateNode, prevMacro);
    if (nextMacro != null) {
      myTracer.pushMacro(new jetbrains.mps.smodel.SNodePointer(nextMacro));
      try {
        return applyMacro(nextMacro, templateNode, context, mappingName);
      } finally {
        myTracer.closeMacro(new jetbrains.mps.smodel.SNodePointer(nextMacro));
      }
    }

    // templateNode has no unprocessed node-macros - create output instance for the tempate node
    myTracer.pushTemplateNode(new jetbrains.mps.smodel.SNodePointer(templateNode));
    jetbrains.mps.smodel.SNode outputNode = new jetbrains.mps.smodel.SNode(templateNode.getConcept().getQualifiedName());
    GeneratorMappings mappings = myGenerator.getMappings();
    mappings.addOutputNodeByInputAndTemplateNode(context.getInput(), templateNode, outputNode);
    for (SNode historyInputNode : context.getInputHistory()) {
      mappings.addOutputNodeByIndirectInputAndTemplateNode(historyInputNode, templateNode, outputNode);
    }
    mappings.addOutputNodeByInputNodeAndMappingName(context.getInput(), mappingName, outputNode);
    mappings.addOutputNodeByTemplateNode(templateNode, outputNode);
    jetbrains.mps.util.SNodeOperations.copyProperties(templateNode, outputNode);

    SModel templateModel = templateNode.getModel();
    for (SReference reference : templateNode.getReferences()) {
      if (GeneratorUtilEx.getReferenceMacro(templateNode, reference.getRole()) != null) {
        continue;
      }

      if (reference instanceof StaticReference) {
        SModelReference targetModelReference = reference.getTargetSModelReference();
        if (targetModelReference != null && !(templateModel.getReference().equals(targetModelReference))) {
          // optimization for external static references (do not resolve them)
          SReference newReference = new StaticReference(
              reference.getRole(),
              outputNode,
              targetModelReference,
              reference.getTargetNodeId(),
              ((StaticReference) reference).getResolveInfo());
          outputNode.setReference(reference.getRole(), newReference);
          continue;
        }
      }

      SNode templateReferentNode = reference.getTargetNode();
      if (templateReferentNode == null) {
        myGenerator.getLogger().error(templateNode,
            "cannot resolve reference in template model; role: " + reference.getRole() + " in " + org.jetbrains.mps.openapi.model.SNodeUtil.getDebugText(
                templateNode));
        continue;
      }
      if (templateReferentNode.getModel() == templateModel) { // internal reference
        ReferenceInfo_TemplateNode refInfo = new ReferenceInfo_TemplateNode(
            outputNode,
            reference,
            context);
        PostponedReference postponedReference = new PostponedReference(
            refInfo,
            myGenerator
        );
        outputNode.setReference(postponedReference.getRole(), postponedReference);
      } else {
        outputNode.setReferenceTarget(reference.getRole(), templateReferentNode);
      }
    }

    // process property and reference macros
    List<SNode> templateChildNodes = new ArrayList<SNode>();
    for (SNode templateChildNode : templateNode.getChildren()) {
      String templateChildNodeConcept = templateChildNode.getConcept().getQualifiedName();

      if (templateChildNodeConcept.equals(RuleUtil.concept_PropertyMacro)) {
        myReductionContext.getQueryExecutor().expandPropertyMacro(templateChildNode, context.getInput(), templateNode, outputNode, context);
      } else if (templateChildNodeConcept.equals(RuleUtil.concept_ReferenceMacro)) {
        ReferenceInfo_Macro refInfo = new ReferenceInfo_MacroNode(
            outputNode, templateChildNode,
            templateNode,
            context, myReductionContext
        );
        PostponedReference postponedReference = new PostponedReference(
            refInfo,
            myGenerator
        );
        outputNode.setReference(postponedReference.getRole(), postponedReference);
      } else if (!GeneratorUtilEx.isTemplateLanguageElement(templateChildNode)) {
        templateChildNodes.add(templateChildNode);
      }
    }

    // process children
    try {
      for (SNode templateChildNode : templateChildNodes) {
        List<SNode> outputChildNodes = applyTemplate(null, templateChildNode, context, null);
        if (outputChildNodes != null) {
          SConcept originalConcept = templateChildNode.getConcept();
          String role = templateChildNode.getRoleInParent();
          for (SNode outputChildNode : outputChildNodes) {
            // returned node is subconcept of template node => fine
            if (!(outputChildNode.getConcept().isSubConceptOf(originalConcept))) {
              // check child
              RoleValidationStatus status = myGenerator.validateChild(outputNode, role, outputChildNode);
              if (status != null) {
                status.reportProblem(false, "",
                    GeneratorUtil.describe(context.getInput(), "input"),
                    GeneratorUtil.describe(templateNode, "parent in template"),
                    GeneratorUtil.describe(templateChildNode, "child in template"));
              }
            }
            outputNode.addChild(role, outputChildNode);
          }
        }
      }
    } finally {
      myTracer.pushOutputNode(GenerationTracerUtil.getSNodePointer(myOutputModel, outputNode));
      myTracer.closeTemplateNode(new jetbrains.mps.smodel.SNodePointer(templateNode));
    }
    return Collections.singletonList(((SNode) outputNode));
  }

  @Nullable
  private List<SNode> applyMacro(SNode macro, SNode templateNode, @NotNull TemplateContext templateContext, String outerMappingName) throws
      DismissTopMappingRuleException, GenerationFailureException, GenerationCanceledException {
    String macroConceptFQName = macro.getConcept().getQualifiedName();
    List<SNode> outputNodes = new ArrayList<SNode>();
    String mappingName = GeneratorUtilEx.getMappingName_NodeMacro(macro, outerMappingName);

    if (macroConceptFQName.equals(RuleUtil.concept_LoopMacro)) {
      // $LOOP$
      List<SNode> newInputNodes = getNewInputNodes(macro, templateContext);
      for (SNode newInputNode : newInputNodes) {
        boolean inputChanged = (newInputNode != templateContext.getInput());
        if (inputChanged) {
          myTracer.pushInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
        }
        try {
          List<SNode> _outputNodes = applyTemplate(mappingName, templateNode, templateContext.subContext(mappingName, newInputNode), macro);
          if (_outputNodes != null) outputNodes.addAll(_outputNodes);
        } finally {
          if (inputChanged) {
            myTracer.closeInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
          }
        }
      }
      return outputNodes;

    } else if (macroConceptFQName.equals(RuleUtil.concept_CopySrcNodeMacro) || macroConceptFQName.equals(RuleUtil.concept_CopySrcListMacro)) {
      // $COPY-SRC$ / $COPY-SRCL$
      List<SNode> newInputNodes = getNewInputNodes(macro, templateContext);
      SNodeReference templateNodeRef = templateNode == null ? null : new jetbrains.mps.smodel.SNodePointer(templateNode);
      for (SNode newInputNode : newInputNodes) {
        Collection<SNode> _outputNodes = myGenerator.copySrc(mappingName, templateNodeRef, null, newInputNode, myReductionContext);
        if (_outputNodes != null) {
          // check node languages : prevent 'input node' query from returning node, which language was not counted when
          // planning the generation steps.
          for (SNode outputNode : _outputNodes) {
            Language outputNodeLang = jetbrains.mps.util.SNodeOperations.getLanguage(outputNode);
            if (!myGenerator.getGeneratorSessionContext().getGenerationPlan().isCountedLanguage(outputNodeLang)) {
              if (!outputNodeLang.getGenerators().isEmpty()) {
                myGenerator.getLogger().error(outputNode,
                    "language of output node is '" + outputNodeLang.getModuleName() + "' - this language did not show up when computing generation steps!",
                    GeneratorUtil.describe(macro, "template"),
                    GeneratorUtil.describe(templateContext.getInput(), "input"),
                    new ProblemDescription(null,
                        "workaround: add the language '" + outputNodeLang.getModuleName() + "' to list of 'Languages Engaged On Generation' in model '" + myGenerator.getGeneratorSessionContext().getOriginalInputModel().getReference().getModelName() + "'"));
              }
            }
          }
          outputNodes.addAll(_outputNodes);
        }
      }
      return outputNodes;
    } else if (macroConceptFQName.equals(RuleUtil.concept_InsertMacro)) {
      // $INSERT$
      SNode child = InputQueryUtil.getNodeToInsert(macro, templateContext.subContext(mappingName), myReductionContext, myGenerator);
      if (child != null) {
        // check node languages : prevent 'insert' query from returnning node, which language was not counted when
        // planning the generation steps.
        Language childLang = jetbrains.mps.util.SNodeOperations.getLanguage(child);
        if (!myGenerator.getGeneratorSessionContext().getGenerationPlan().isCountedLanguage(childLang)) {
          if (!childLang.getGenerators().isEmpty()) {
            myGenerator.getLogger().error(child,
                "language of output node is '" + childLang.getModuleName() + "' - this language did not show up when computing generation steps!",
                GeneratorUtil.describe(macro, "template"),
                GeneratorUtil.describe(templateContext.getInput(), "input"),
                new ProblemDescription(null,
                    "workaround: add the language '" + childLang.getModuleName() + "' to list of 'Languages Engaged On Generation' in model '" + myGenerator.getGeneratorSessionContext().getOriginalInputModel().getReference().getModelName() + "'"));
          }
        }

        if (child.getModel() != null) {
          // must be "in air"
          child = CopyUtil.copy(child);
        }
        // replace references back to input model
        validateReferences(child, templateContext.getInput());

        // label
        myGenerator.getMappings().addOutputNodeByInputNodeAndMappingName(templateContext.getInput(), mappingName, child);
        outputNodes.add(child);
      }
      return outputNodes;

    } else if (macroConceptFQName.equals(RuleUtil.concept_WeaveMacro)) {
      // $WEAVE$
      List<SNode> _outputNodes = applyTemplate(mappingName, templateNode, templateContext.subContext(mappingName), macro);
      if (_outputNodes != null && _outputNodes.size() > 0) {

        if (_outputNodes.size() == 1) {
          SNode contextNode = _outputNodes.get(0);

          List<SNode> nodesToWeave = getNewInputNodes(macro, templateContext);
          for (SNode node : nodesToWeave) {
            try {
              myTracer.pushInputNode(GenerationTracerUtil.getSNodePointer(node));
              myTracer.pushRuleConsequence(new jetbrains.mps.smodel.SNodePointer(macro));
              SNode consequence = RuleUtil.getWeaveMacro_Consequence(macro);
              if (consequence == null) {
                myGenerator.showErrorMessage(templateContext.getInput(), macro, "couldn't evaluate weave macro: no consequence");
                break;
              }

              SNode template = RuleUtil.getTemplateDeclarationReference_Template(consequence);
              weaveMacro(template, contextNode, templateContext.subContext(null, node), macro);
            } finally {
              myTracer.closeInputNode(GenerationTracerUtil.getSNodePointer(node));
            }
          }
        } else {
          myGenerator.getLogger().error(templateContext.getInput(), "cannot apply $WEAVE$ to a list of nodes",
              GeneratorUtil.describe(macro, "template"),
              GeneratorUtil.describe(templateContext.getInput(), "input"));
        }


        outputNodes.addAll(_outputNodes);
      }
      return outputNodes;

    } else if (macroConceptFQName.equals(RuleUtil.concept_LabelMacro)) {
      // $LABEL$
      List<SNode> _outputNodes = applyTemplate(mappingName, templateNode, templateContext.subContext(mappingName), macro);
      if (_outputNodes != null) outputNodes.addAll(_outputNodes);
      return outputNodes;

    } else if (macroConceptFQName.equals(RuleUtil.concept_VarMacro)) {
      // $VAR$
      String varName = RuleUtil.getVarMacro_Name(macro);
      Object varValue = myReductionContext.getQueryExecutor().evaluateVariableQuery(templateContext.getInput(), RuleUtil.getVarMacro_Query(macro),
          templateContext);
      TemplateContext newContext = templateContext.subContext(Collections.singletonMap(varName, varValue));

      List<SNode> _outputNodes = applyTemplate(mappingName, templateNode, newContext.subContext(mappingName), macro);
      if (_outputNodes != null) outputNodes.addAll(_outputNodes);
      return outputNodes;

    } else if (macroConceptFQName.equals(RuleUtil.concept_IfMacro)) {
      // $IF$
      List<SNode> _outputNodes = null;
      if (myReductionContext.getQueryExecutor().checkConditionForIfMacro(templateContext.getInput(), macro, templateContext)) {
        _outputNodes = applyTemplate(mappingName, templateNode, templateContext.subContext(mappingName), macro);
      } else {
        // alternative consequence
        SNode altConsequence = RuleUtil.getIfMacro_AlternativeConsequence(macro);
        if (altConsequence != null) {
          try {
            List<Pair<SNode, String>> nodeAndMappingNamePairs = GeneratorUtilEx.getTemplateNodesFromRuleConsequence(altConsequence,
                templateContext.getInput(), macro, myReductionContext, myGenerator);
            if (nodeAndMappingNamePairs == null) {
              myGenerator.showErrorMessage(templateContext.getInput(), null, macro, "error processing $IF$/alternative");
              return null;
            }

            for (Pair<SNode, String> nodeAndMappingNamePair : nodeAndMappingNamePairs) {
              SNode altTemplateNode = nodeAndMappingNamePair.o1;
              String innerMappingName = nodeAndMappingNamePair.o2 != null ? nodeAndMappingNamePair.o2 : mappingName;
              List<SNode> __outputNodes = applyExternalTemplate(innerMappingName, altTemplateNode, templateContext.subContext(innerMappingName));
              if (__outputNodes != null) {
                if (_outputNodes == null) _outputNodes = new ArrayList<SNode>();
                _outputNodes.addAll(__outputNodes);
              }
            }
          } catch (AbandonRuleInputException e) {
            // it's ok. just ignore
          }
        }
      }
      if (_outputNodes != null) outputNodes.addAll(_outputNodes);
      return outputNodes;

    } else if (macroConceptFQName.equals(RuleUtil.concept_MapSrcNodeMacro) || macroConceptFQName.equals(RuleUtil.concept_MapSrcListMacro)) {
      // $MAP-SRC$ or $MAP-SRCL$
      SNode macro_mapperFunction = RuleUtil.getMapSrc_MapperFunction(macro);
      List<SNode> newInputNodes = getNewInputNodes(macro, templateContext);
      for (SNode newInputNode : newInputNodes) {
        boolean inputChanged = (newInputNode != templateContext.getInput());
        if (inputChanged) {
          myTracer.pushInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
        }
        try {
          TemplateContext newcontext = templateContext.subContext(mappingName, newInputNode);
          if (macro_mapperFunction != null) {
            SNode childToReplaceLater = SModelUtil_new.instantiateConceptDeclaration(templateNode.getConcept().getQualifiedName(), myOutputModel,
                myGenerator.getScope(), false);
            myTracer.pushOutputNodeToReplaceLater(childToReplaceLater);
            outputNodes.add(childToReplaceLater);
            // execute the 'mapper' function later
            myGenerator.getDelayedChanges().addExecuteMapSrcNodeMacroChange(
                macro, childToReplaceLater, newcontext, myReductionContext);
          } else {
            List<SNode> _outputNodes = applyTemplate(mappingName, templateNode, newcontext, macro);
            if (_outputNodes != null) {
              outputNodes.addAll(_outputNodes);
              // do post-processing here (it's not really a post-processing because model is not completed yet - output nodes are not added to parent node).
              for (SNode outputNode : _outputNodes) {
                myGenerator.getDelayedChanges().addExecuteMapSrcNodeMacroPostProcChange(
                    macro, outputNode, newcontext, myReductionContext);
              }
            }
          }
        } finally {
          if (inputChanged) {
            myTracer.closeInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
          }
        }
      }
      return outputNodes;

    } else if (macroConceptFQName.equals(RuleUtil.concept_SwitchMacro)) {
      // $SWITCH$
      SNode templateSwitch = RuleUtil.getSwitchMacro_TemplateSwitch(macro);
      if (templateSwitch == null) {
        myGenerator.showErrorMessage(templateContext.getInput(), macro, "error processing $SWITCH$ - bad TemplateSwitch reference");
        return null;
      }

      final SNodeReference switchPtr = new jetbrains.mps.smodel.SNodePointer(templateSwitch);
      SNode newInputNode = getNewInputNode(macro, templateContext);
      if (newInputNode == null) {
        TemplateSwitchMapping tswitch = myGenerator.getSwitch(switchPtr);
        if (tswitch != null) {
          tswitch.processNull(new TemplateExecutionEnvironmentImpl(myGenerator, myReductionContext, myGenerator.getOperationContext(), myTracer),
              switchPtr, templateContext);
        }
        return Collections.emptyList(); // skip template
      }

      boolean inputChanged = (newInputNode != templateContext.getInput());
      if (inputChanged) {
        myTracer.pushInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
      }
      myTracer.pushSwitch(new jetbrains.mps.smodel.SNodePointer(templateSwitch));
      try {
        final TemplateContext switchContext = templateContext.subContext(mappingName, newInputNode);

        Collection<SNode> collection = myGenerator.tryToReduce(switchContext, switchPtr, mappingName, myReductionContext);
        if (collection == null) {
          // try the default case
          TemplateSwitchMapping tswitch = myGenerator.getSwitch(switchPtr);
          if (tswitch != null) {
            TemplateExecutionEnvironment environment = new TemplateExecutionEnvironmentImpl(myGenerator, myReductionContext,
                myGenerator.getOperationContext(), myTracer);
            try {
              collection = tswitch.applyDefault(environment, switchPtr, mappingName, switchContext);
            } catch (GenerationException e) {
              if (e instanceof GenerationCanceledException) throw (GenerationCanceledException) e;
              if (e instanceof GenerationFailureException) throw (GenerationFailureException) e;
              if (e instanceof DismissTopMappingRuleException) throw (DismissTopMappingRuleException) e;
              myGenerator.showErrorMessage(null, tswitch.getSwitchNode().resolve(MPSModuleRepository.getInstance()),
                  "internal error in switch.applyDefault: " + e.toString());
            }
          }

          // no switch-case found for the inputNode - continue with templateNode under the $switch$
          if (collection == null) {
            collection = applyTemplate(mappingName, templateNode, templateContext.subContext(mappingName, newInputNode), macro);
          }
        }

        if (collection != null) {
          outputNodes.addAll(collection);
        }

      } finally {
        if (inputChanged) {
          myTracer.closeInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
        }
      }
      return outputNodes;

    } else if (macroConceptFQName.equals(RuleUtil.concept_IncludeMacro)) {
      // $INCLUDE$
      SNode newInputNode = getNewInputNode(macro, templateContext);
      if (newInputNode == null) {
        return outputNodes; // skip template
      }

      SNode includeTemplate = RuleUtil.getIncludeMacro_Template(macro);
      if (includeTemplate == null) {
        myGenerator.showErrorMessage(newInputNode, null, macro, "error processing $INCLUDE$ : no 'include template'");
        return null;
      }

      final String[] parameterNames = RuleUtil.getTemplateDeclarationParameterNames(includeTemplate);
      if (parameterNames == null) {
        myGenerator.showErrorMessage(newInputNode, null, macro, "error processing $INCLUDE$: target template is broken");
        return null;
      }

      for (String name : parameterNames) {
        if (!templateContext.hasVariable(name)) {
          myGenerator.showErrorMessage(newInputNode, null, macro, "error processing $INCLUDE$: parameter `" + name + "' is missing");
        }
      }
/*
      TemplateFragment fragment = GeneratorUtil.getFragmentFromTemplate(includeTemplate, newInputNode, macro, myGenerator);
      if (fragment == null) {
        myGenerator.showErrorMessage(newInputNode, null, macro, "error processing $INCLUDE$");
        return null;
      }
*/
      List<SNode> fragments = GeneratorUtilEx.getTemplateFragments(includeTemplate);
      if (!GeneratorUtilEx.checkIfOneOrMaryAdjacentFragments(fragments, includeTemplate, newInputNode, macro, myGenerator)) {
        myGenerator.showErrorMessage(newInputNode, null, macro, "error processing $INCLUDE$");
        return null;
      }

      boolean inputChanged = (newInputNode != templateContext.getInput());
      if (inputChanged) {
        myTracer.pushInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
      }
      myTracer.pushTemplateNode(new jetbrains.mps.smodel.SNodePointer(includeTemplate));

      try {
        for (SNode fragment : fragments) {
          SNode templateForInclude = fragment.getParent();
          mappingName = GeneratorUtilEx.getMappingName(fragment, mappingName);
          List<SNode> _outputNodes = applyExternalTemplate(mappingName, templateForInclude, templateContext.subContext(mappingName, newInputNode));
          if (_outputNodes != null) outputNodes.addAll(_outputNodes);
        }
      } finally {
        if (inputChanged) {
          myTracer.closeInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
        }
      }

      return outputNodes;
    } else if (macroConceptFQName.equals(RuleUtil.concept_TemplateCallMacro)) {
      // $CALL$
      SNode newInputNode = getNewInputNode(macro, templateContext);
      if (newInputNode == null) {
        return outputNodes; // skip template
      }

      SNode template = RuleUtil.getCallMacro_Template(macro);
      if (template == null) {
        myGenerator.showErrorMessage(newInputNode, null, macro, "error processing $CALL$ : no 'include template'");
        return null;
      }

      TemplateContext newcontext = GeneratorUtil.createTemplateCallContext(templateContext.getInput(), templateContext, myReductionContext, macro,
          newInputNode, myGenerator);

/*
      TemplateFragment fragment = GeneratorUtil.getFragmentFromTemplate(template, newInputNode, macro, myGenerator);
      if (fragment == null) {
        myGenerator.showErrorMessage(newInputNode, null, macro, "error processing $CALL$");
        return null;
      }
*/
      List<SNode> fragments = GeneratorUtilEx.getTemplateFragments(template);
      if (!GeneratorUtilEx.checkIfOneOrMaryAdjacentFragments(fragments, template, newInputNode, macro, myGenerator)) {
        myGenerator.showErrorMessage(newInputNode, null, macro, "error processing $CALL$");
        return null;
      }

      boolean inputChanged = (newInputNode != templateContext.getInput());
      if (inputChanged) {
        myTracer.pushInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
      }
      myTracer.pushTemplateNode(new jetbrains.mps.smodel.SNodePointer(template));

      try {
        for (SNode fragment : fragments) {
          SNode templateForInclude = fragment.getParent();
          mappingName = GeneratorUtilEx.getMappingName(fragment, mappingName);
          List<SNode> _outputNodes = applyExternalTemplate(mappingName, templateForInclude, newcontext.subContext(mappingName));
          if (_outputNodes != null) outputNodes.addAll(_outputNodes);
        }
      } finally {
        if (inputChanged) {
          myTracer.closeInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
        }
      }

      return outputNodes;
    } else if (macroConceptFQName.equals(RuleUtil.concept_TraceMacro)) {
      // $TRACE$
      SNode inputNode = getNewInputNode(macro, templateContext);

      List<SNode> _outputNodes = applyTemplate(mappingName, templateNode, templateContext.subContext(mappingName), macro);
      if (_outputNodes != null) {
        outputNodes.addAll(_outputNodes);
        if (inputNode != null) {
          for (SNode outputNode : _outputNodes) {
            TracingUtil.fillOriginalNode(inputNode, outputNode,
                myGenerator.getGeneratorSessionContext().getOriginalInputModel() == inputNode.getModel());
          }
        }
      }
      return outputNodes;
    } else {

      // $$
      List<SNode> newInputNodes = getNewInputNodes(macro, templateContext);
      for (SNode newInputNode : newInputNodes) {
        boolean inputChanged = (newInputNode != templateContext.getInput());
        if (inputChanged) {
          myTracer.pushInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
        }
        try {
          List<SNode> _outputNodes = applyTemplate(mappingName, templateNode, templateContext.subContext(mappingName, newInputNode), macro);
          if (_outputNodes != null) outputNodes.addAll(_outputNodes);
        } finally {
          if (inputChanged) {
            myTracer.closeInputNode(GenerationTracerUtil.getSNodePointer(newInputNode));
          }
        }
      }
      return outputNodes;
    }
  }

  private void validateReferences(SNode node, final SNode inputNode) {
    for (SReference ref : node.getReferences()) {
      // reference to input model - illegal
      if (myGenerator.getInputModel().getReference().equals(ref.getTargetSModelReference())) {
        // replace
        ReferenceInfo_CopiedInputNode refInfo = new ReferenceInfo_CopiedInputNode(
            ref.getRole(),
            ref.getSourceNode(),
            inputNode,
            ref.getTargetNode());
        PostponedReference postponedReference = new PostponedReference(
            refInfo,
            myGenerator);
        ref.getSourceNode().setReference(ref.getRole(), postponedReference);
      }
    }

    for (org.jetbrains.mps.openapi.model.SNode child : jetbrains.mps.util.SNodeOperations.getChildren(node)) {
      validateReferences(child, inputNode);
    }
  }

  private SNode getNewInputNode(SNode nodeMacro, @NotNull TemplateContext context) throws GenerationFailureException {
    return InputQueryUtil.getNewInputNode(nodeMacro, context.getInput(), context, myReductionContext, myGenerator);
  }

  private List<SNode> getNewInputNodes(SNode nodeMacro, @NotNull TemplateContext context) throws GenerationFailureException {
    return InputQueryUtil.getNewInputNodes(nodeMacro, context.getInput(), context, myReductionContext, myGenerator);
  }

  @Nullable
  private List<SNode> applyExternalTemplate(String mappingName,
      SNode templateNode,
      TemplateContext context)
      throws
      DismissTopMappingRuleException,
      GenerationFailureException, GenerationCanceledException {
    TemplateProcessor templateProcessor = new TemplateProcessor(myGenerator, myReductionContext);
    return templateProcessor.applyTemplate(mappingName, templateNode, context, null);
  }

  private void weaveMacro(SNode template, SNode outputContextNode, @NotNull TemplateContext context, SNode macro)
      throws GenerationFailureException, GenerationCanceledException {

    if (template == null) {
      myGenerator.showErrorMessage(context.getInput(), macro, "couldn't evaluate weave macro: no template");
      return;
    }

    List<SNode> templateFragments = GeneratorUtilEx.getTemplateFragments(template);
    if (templateFragments.isEmpty()) {
      myGenerator.showErrorMessage(context.getInput(), template, macro, "nothing to weave: no template fragments found in template");
      return;
    }

    // check fragments: all fragments with <default context> should have the same parent
    TemplateWeavingRuleInterpreted.checkTemplateFragmentsForWeaving(template, templateFragments, myGenerator);

    // for each template fragment create output nodes
    TemplateProcessor templateProcessor = new TemplateProcessor(myGenerator, myReductionContext);
    for (SNode templateFragment : templateFragments) {
      SNode templateFragmentNode = templateFragment.getParent();
      SNode contextParentNode = null;
      try {
        contextParentNode = myReductionContext.getQueryExecutor().getContextNodeForTemplateFragment(templateFragmentNode, outputContextNode, context);
      } catch (Exception e) {
        myGenerator.getLogger().handleException(e);
      }
      if (contextParentNode != null) {
        try {
          List<SNode> outputNodesToWeave = templateProcessor.apply(
              GeneratorUtilEx.getMappingName(templateFragment, null),
              templateFragmentNode, context);
          String childRole = templateFragmentNode.getRoleInParent();

          TemplateExecutionEnvironment env = new TemplateExecutionEnvironmentImpl(myGenerator, myReductionContext, null, myTracer);
          for (SNode outputNodeToWeave : outputNodesToWeave) {
            env.weaveNode(contextParentNode, childRole, outputNodeToWeave, new jetbrains.mps.smodel.SNodePointer(templateFragment),
                context.getInput());
          }
        } catch (DismissTopMappingRuleException e) {
          myGenerator.showErrorMessage(context.getInput(), templateFragment, macro, "wrong template: dismission in weave macro is not supported");
        } catch (TemplateProcessingFailureException e) {
          // FIXME
          myGenerator.showErrorMessage(context.getInput(), templateFragment, macro, "error processing template fragment");
          myGenerator.getLogger().info(contextParentNode, " -- was output context node:");
        }
      } else {
        myGenerator.showErrorMessage(context.getInput(), templateFragment, macro, "couldn't define 'context' for template fragment");
      }
    }
  }

  public static class TemplateProcessingFailureException extends GenerationException {
  }
}
