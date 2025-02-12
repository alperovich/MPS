package jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import jetbrains.mps.generator.runtime.TemplateCreateRootRule;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateUtil;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.generator.runtime.TemplateWeavingRule;
import java.util.Collections;
import jetbrains.mps.generator.runtime.TemplateDropRootRule;
import jetbrains.mps.generator.runtime.TemplateMappingScript;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.impl.AbandonRuleInputException;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.GenerationTracerUtil;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.generator.impl.DefaultTemplateContext;

public class Mappingmain implements TemplateMappingConfiguration {
  private final Collection<TemplateReductionRule> rules;
  private final Collection<TemplateCreateRootRule> createRules;
  private final Collection<TemplateRootMappingRule> rootRules;
  private final TemplateModel myModel;

  public Mappingmain(TemplateModel model) {
    this.myModel = model;
    rules = TemplateUtil.<TemplateReductionRule>asCollection(new Mappingmain.ReductionRule0(), new Mappingmain.ReductionRule1(), new Mappingmain.ReductionRule2(), new Mappingmain.ReductionRule3(), new Mappingmain.ReductionRule4(), new Mappingmain.ReductionRule5());
    createRules = TemplateUtil.<TemplateCreateRootRule>asCollection(new Mappingmain.CreateRootRule0());
    rootRules = TemplateUtil.<TemplateRootMappingRule>asCollection(new Mappingmain.RootMappingRule0());
  }

  public String getName() {
    return "main";
  }

  public TemplateModel getModel() {
    return this.myModel;
  }

  public SNodeReference getMappingNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1197044812173");
  }

  public boolean isApplicable(ITemplateGenerator generator) {
    return true;
  }

  public Collection<TemplateReductionRule> getReductionRules() {
    return rules;
  }

  public Collection<TemplateCreateRootRule> getCreateRules() {
    return createRules;
  }

  public Collection<TemplateRootMappingRule> getRootRules() {
    return rootRules;
  }

  public Collection<TemplateWeavingRule> getWeavingRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateDropRootRule> getDropRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateMappingScript> getPostScripts() {
    return Collections.emptySet();
  }

  public Collection<TemplateMappingScript> getPreScripts() {
    return Collections.emptySet();
  }

  public boolean isTopPriority() {
    return false;
  }

  public class ReductionRule0 implements TemplateReductionRule {
    public ReductionRule0() {
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.lang.findUsages.structure.NodeStatement";
    }

    public SNodeReference getRuleNode() {
      return reductionRule_417xrn_a0a3r;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {

      environment.getTracer().pushRule(reductionRule_417xrn_a0a3r);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a3r);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a5r);
      Collection<SNode> tlist1 = new Templatereduce__NodeStatement().apply(environment, context);
      return tlist1;
    }
  }

  public class ReductionRule1 implements TemplateReductionRule {
    public ReductionRule1() {
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.lang.findUsages.structure.ResultStatement";
    }

    public SNodeReference getRuleNode() {
      return reductionRule_417xrn_a0a3s;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {

      environment.getTracer().pushRule(reductionRule_417xrn_a0a3s);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a3s);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a5s);
      Collection<SNode> tlist1 = new Templatereduce__ResultStatement().apply(environment, context);
      return tlist1;
    }
  }

  public class ReductionRule2 implements TemplateReductionRule {
    public ReductionRule2() {
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.lang.findUsages.structure.ExecuteFinderExpression";
    }

    public SNodeReference getRuleNode() {
      return reductionRule_417xrn_a0a3t;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {

      environment.getTracer().pushRule(reductionRule_417xrn_a0a3t);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a3t);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a5t);
      Collection<SNode> tlist1 = new Templatereduce__ExecuteFinderExpression().apply(environment, context);
      return tlist1;
    }
  }

  public class ReductionRule3 implements TemplateReductionRule {
    public ReductionRule3() {
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.lang.findUsages.structure.CheckCancelledStatusStatement";
    }

    public SNodeReference getRuleNode() {
      return reductionRule_417xrn_a0a3u;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {

      environment.getTracer().pushRule(reductionRule_417xrn_a0a3u);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a3u);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a5u);
      Collection<SNode> tlist1 = new Templatereduce__CheckCancelledStatusStatement().apply(environment, context);
      return tlist1;
    }
  }

  public class ReductionRule4 implements TemplateReductionRule {
    public ReductionRule4() {
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.lang.findUsages.structure.ExecuteFindersGetSearchResults";
    }

    public SNodeReference getRuleNode() {
      return reductionRule_417xrn_a0a3v;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {

      environment.getTracer().pushRule(reductionRule_417xrn_a0a3v);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a3v);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a5v);
      final SNode tnode1 = environment.createOutputNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall");
      try {
        environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a2a5v);
        environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c8959035c/4192433084863763885");
        tnode1.setReference("classConcept", SReference.create("classConcept", tnode1, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.ide.findusages.view(MPS.Core/jetbrains.mps.ide.findusages.view@java_stub)"), PersistenceFacade.getInstance().createNodeId("~FindUtils")));
        tnode1.setReference("baseMethodDeclaration", SReference.create("baseMethodDeclaration", tnode1, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.ide.findusages.view(MPS.Core/jetbrains.mps.ide.findusages.view@java_stub)"), PersistenceFacade.getInstance().createNodeId("~FindUtils.getSearchResults(org.jetbrains.mps.openapi.util.ProgressMonitor,org.jetbrains.mps.openapi.model.SNode,org.jetbrains.mps.openapi.module.SearchScope,java.lang.String...):jetbrains.mps.ide.findusages.model.SearchResults")));

        {
          Collection<SNode> tlist2 = null;
          try {
            environment.getTracer().pushMacro(ifMacroRef_417xrn_a0a0a1a5a2a5v);
            if (QueriesGenerated.ifMacro_Condition_4192433084863763888(environment.getOperationContext(), new IfMacroContext(context.getInput(), ifMacroRef_417xrn_a0a0a1a5a2a5v, context, environment.getGenerator()))) {
              Collection<SNode> tlist3 = null;
              try {
                environment.getTracer().pushMacro(copySrcMacro_417xrn_a0a0a1a1a1a5a2a5v);
                final SNode copySrcInput3 = QueriesGenerated.sourceNodeQuery_4192433084863763900(environment.getOperationContext(), new SourceSubstituteMacroNodeContext(context.getInput(), copySrcMacro_417xrn_a0a0a1a1a1a5a2a5v, context, environment.getGenerator()));
                tlist3 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput3), copySrcMacro_417xrn_a0a0a1a1a1a5a2a5v, "tpl/r:00000000-0000-4000-0000-011c8959035c/4192433084863763886", null, context);
              } finally {
                environment.getTracer().closeMacro(copySrcMacro_417xrn_a0a0a1a1a1a5a2a5v);
              }
              tlist2 = tlist3;
            } else {
              environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a0b0b0f0c0f12);
              final SNode tnode4 = environment.createOutputNode("jetbrains.mps.baseLanguage.structure.GenericNewExpression");
              try {
                environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a2a0b0b0f0c0f12);
                environment.nodeCopied(context, tnode4, "tpl/r:00000000-0000-4000-0000-011c8959035c/4192433084863763897");

                {
                  final SNode tnode5 = environment.createOutputNode("jetbrains.mps.baseLanguage.structure.ClassCreator");
                  try {
                    environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a1a3a2a0b0b0f0c0f12);
                    environment.nodeCopied(context, tnode5, "tpl/r:00000000-0000-4000-0000-011c8959035c/4192433084863763898");
                    tnode5.setReference("baseMethodDeclaration", SReference.create("baseMethodDeclaration", tnode5, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.progress(MPS.Core/jetbrains.mps.progress@java_stub)"), PersistenceFacade.getInstance().createNodeId("~EmptyProgressMonitor.<init>()")));

                  } finally {
                    environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode5));
                    environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a1a3a2a0b0b0f0c0f12);
                  }
                  if (tnode5 != null) {
                    tnode4.addChild("creator", tnode5);
                  }
                  // TODO validate child 
                }
              } finally {
                environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode4));
                environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a2a0b0b0f0c0f12);
              }
              tlist2 = TemplateUtil.singletonList(tnode4);
            }

          } finally {
            environment.getTracer().closeMacro(ifMacroRef_417xrn_a0a0a1a5a2a5v);
          }
          for (SNode child6 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild("actualArgument", child6);
          }
          // TODO validate child 
        }
        {
          Collection<SNode> tlist7 = null;
          try {
            environment.getTracer().pushMacro(copySrcMacro_417xrn_a0a0a1a6a2a5v);
            final SNode copySrcInput7 = QueriesGenerated.sourceNodeQuery_4192433084863763908(environment.getOperationContext(), new SourceSubstituteMacroNodeContext(context.getInput(), copySrcMacro_417xrn_a0a0a1a6a2a5v, context, environment.getGenerator()));
            tlist7 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput7), copySrcMacro_417xrn_a0a0a1a6a2a5v, "tpl/r:00000000-0000-4000-0000-011c8959035c/4192433084863763906", null, context);
          } finally {
            environment.getTracer().closeMacro(copySrcMacro_417xrn_a0a0a1a6a2a5v);
          }
          for (SNode child8 : TemplateUtil.asNotNull(tlist7)) {
            tnode1.addChild("actualArgument", child8);
          }
          // TODO validate child 
        }
        {
          Collection<SNode> tlist9 = null;
          try {
            environment.getTracer().pushMacro(ifMacroRef_417xrn_a0a0a1a7a2a5v);
            if (QueriesGenerated.ifMacro_Condition_4192433084863763916(environment.getOperationContext(), new IfMacroContext(context.getInput(), ifMacroRef_417xrn_a0a0a1a7a2a5v, context, environment.getGenerator()))) {
              Collection<SNode> tlist10 = null;
              try {
                environment.getTracer().pushMacro(copySrcMacro_417xrn_a0a0a1a1a1a7a2a5v);
                final SNode copySrcInput10 = QueriesGenerated.sourceNodeQuery_4192433084863763927(environment.getOperationContext(), new SourceSubstituteMacroNodeContext(context.getInput(), copySrcMacro_417xrn_a0a0a1a1a1a7a2a5v, context, environment.getGenerator()));
                tlist10 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput10), copySrcMacro_417xrn_a0a0a1a1a1a7a2a5v, "tpl/r:00000000-0000-4000-0000-011c8959035c/4192433084863763914", null, context);
              } finally {
                environment.getTracer().closeMacro(copySrcMacro_417xrn_a0a0a1a1a1a7a2a5v);
              }
              tlist9 = tlist10;
            } else {
              environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a0b0b0h0c0f12);
              final SNode tnode11 = environment.createOutputNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall");
              try {
                environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a2a0b0b0h0c0f12);
                environment.nodeCopied(context, tnode11, "tpl/r:00000000-0000-4000-0000-011c8959035c/4192433084863763925");
                tnode11.setReference("classConcept", SReference.create("classConcept", tnode11, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.project(MPS.Core/jetbrains.mps.project@java_stub)"), PersistenceFacade.getInstance().createNodeId("~GlobalScope")));
                tnode11.setReference("baseMethodDeclaration", SReference.create("baseMethodDeclaration", tnode11, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.project(MPS.Core/jetbrains.mps.project@java_stub)"), PersistenceFacade.getInstance().createNodeId("~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope")));

              } finally {
                environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode11));
                environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a2a0b0b0h0c0f12);
              }
              tlist9 = TemplateUtil.singletonList(tnode11);
            }

          } finally {
            environment.getTracer().closeMacro(ifMacroRef_417xrn_a0a0a1a7a2a5v);
          }
          for (SNode child12 : TemplateUtil.asNotNull(tlist9)) {
            tnode1.addChild("actualArgument", child12);
          }
          // TODO validate child 
        }
        {
          final List<SNode> tlist13 = new ArrayList();
          try {
            environment.getTracer().pushMacro(loopMacroRef_417xrn_a0a0a1a8a2a5v);
            final Iterable<SNode> loopList13 = QueriesGenerated.sourceNodesQuery_4192433084863763935(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context.getInput(), null, loopMacroRef_417xrn_a0a0a1a8a2a5v, context, environment.getGenerator()));
            for (SNode itnode13 : loopList13) {
              if (itnode13 == null) {
                continue;
              }
              boolean inputChanged13 = context.getInput() != itnode13;
              try {
                if (inputChanged13) {
                  environment.getTracer().pushInputNode(GenerationTracerUtil.getSNodePointer(itnode13));
                }
                TemplateContext context13 = context.subContext(null, itnode13);
                final SNode tnode14 = environment.createOutputNode("jetbrains.mps.baseLanguage.structure.StringLiteral");
                try {
                  environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a3a2a2a1a8a2a5v);
                  environment.nodeCopied(context13, tnode14, "tpl/r:00000000-0000-4000-0000-011c8959035c/4192433084863763933");
                  SNodeAccessUtil.setProperty(tnode14, "value", TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_4192433084863763942(environment.getOperationContext(), new PropertyMacroContext(context13.getInput(), "", propertyMacro_417xrn_c0b0c0c0d0c0c0b0i0c0f12, context13, environment.getGenerator()))));

                } finally {
                  environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode14));
                  environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a3a2a2a1a8a2a5v);
                }
                if (tnode14 != null) {
                  tlist13.add(tnode14);
                }
              } finally {
                if (inputChanged13) {
                  environment.getTracer().closeInputNode(GenerationTracerUtil.getSNodePointer(itnode13));
                }
              }
            }
          } finally {
            environment.getTracer().closeMacro(loopMacroRef_417xrn_a0a0a1a8a2a5v);
          }
          for (SNode child15 : TemplateUtil.asNotNull(tlist13)) {
            tnode1.addChild("actualArgument", child15);
          }
          // TODO validate child 
        }
      } finally {
        environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode1));
        environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a2a5v);
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }

  public class ReductionRule5 implements TemplateReductionRule {
    public ReductionRule5() {
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.lang.findUsages.structure.MakeResultProvider";
    }

    public SNodeReference getRuleNode() {
      return reductionRule_417xrn_a0a3w;
    }

    public Collection<SNode> tryToApply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {

      environment.getTracer().pushRule(reductionRule_417xrn_a0a3w);
      try {
        return apply(context, environment.getEnvironment(context.getInput(), this));
      } catch (AbandonRuleInputException e) {
        return Collections.emptyList();
      } finally {
        environment.getTracer().closeRule(reductionRule_417xrn_a0a3w);
      }

    }

    private Collection<SNode> apply(final TemplateContext context, final TemplateExecutionEnvironment environment) throws GenerationException {
      environment.getTracer().pushRuleConsequence(conseq_417xrn_a0a0a5w);
      final SNode tnode1 = environment.createOutputNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall");
      try {
        environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a2a5w);
        environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c8959035c/6366407517031517798");
        tnode1.setReference("baseMethodDeclaration", SReference.create("baseMethodDeclaration", tnode1, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.ide.findusages.view(MPS.Core/jetbrains.mps.ide.findusages.view@java_stub)"), PersistenceFacade.getInstance().createNodeId("~FindUtils.makeProvider(jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder...):jetbrains.mps.ide.findusages.model.IResultProvider")));
        tnode1.setReference("classConcept", SReference.create("classConcept", tnode1, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.ide.findusages.view(MPS.Core/jetbrains.mps.ide.findusages.view@java_stub)"), PersistenceFacade.getInstance().createNodeId("~FindUtils")));

        {
          final List<SNode> tlist2 = new ArrayList();
          try {
            environment.getTracer().pushMacro(loopMacroRef_417xrn_a0a0a1a5a2a5w);
            final Iterable<SNode> loopList2 = QueriesGenerated.sourceNodesQuery_6366407517031517860(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context.getInput(), null, loopMacroRef_417xrn_a0a0a1a5a2a5w, context, environment.getGenerator()));
            for (SNode itnode2 : loopList2) {
              if (itnode2 == null) {
                continue;
              }
              boolean inputChanged2 = context.getInput() != itnode2;
              try {
                if (inputChanged2) {
                  environment.getTracer().pushInputNode(GenerationTracerUtil.getSNodePointer(itnode2));
                }
                TemplateContext context2 = context.subContext(null, itnode2);
                final SNode tnode3 = environment.createOutputNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall");
                try {
                  environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a3a2a2a1a5a2a5w);
                  environment.nodeCopied(context2, tnode3, "tpl/r:00000000-0000-4000-0000-011c8959035c/6366407517031517848");
                  tnode3.setReference("baseMethodDeclaration", SReference.create("baseMethodDeclaration", tnode3, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.ide.findusages.view(MPS.Core/jetbrains.mps.ide.findusages.view@java_stub)"), PersistenceFacade.getInstance().createNodeId("~FindUtils.getFinderByClassName(java.lang.String):jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder")));
                  tnode3.setReference("classConcept", SReference.create("classConcept", tnode3, PersistenceFacade.getInstance().createModelReference("f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.ide.findusages.view(MPS.Core/jetbrains.mps.ide.findusages.view@java_stub)"), PersistenceFacade.getInstance().createNodeId("~FindUtils")));

                  {
                    final SNode tnode4 = environment.createOutputNode("jetbrains.mps.baseLanguage.structure.StringLiteral");
                    try {
                      environment.getTracer().pushTemplateNode(templateNode_417xrn_a0a0a1a5a3a2a2a1a5a2a5w);
                      environment.nodeCopied(context2, tnode4, "tpl/r:00000000-0000-4000-0000-011c8959035c/6366407517031517849");
                      SNodeAccessUtil.setProperty(tnode4, "value", TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_6366407517031517851(environment.getOperationContext(), new PropertyMacroContext(context2.getInput(), "", propertyMacro_417xrn_c0b0c0c0b0f0d0c0c0b0f0c0f22, context2, environment.getGenerator()))));

                    } finally {
                      environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode4));
                      environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a1a5a3a2a2a1a5a2a5w);
                    }
                    if (tnode4 != null) {
                      tnode3.addChild("actualArgument", tnode4);
                    }
                    // TODO validate child 
                  }
                } finally {
                  environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode3));
                  environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a3a2a2a1a5a2a5w);
                }
                if (tnode3 != null) {
                  tlist2.add(tnode3);
                }
              } finally {
                if (inputChanged2) {
                  environment.getTracer().closeInputNode(GenerationTracerUtil.getSNodePointer(itnode2));
                }
              }
            }
          } finally {
            environment.getTracer().closeMacro(loopMacroRef_417xrn_a0a0a1a5a2a5w);
          }
          for (SNode child5 : TemplateUtil.asNotNull(tlist2)) {
            tnode1.addChild("actualArgument", child5);
          }
          // TODO validate child 
        }
      } finally {
        environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode1));
        environment.getTracer().closeTemplateNode(templateNode_417xrn_a0a0a2a5w);
      }
      return TemplateUtil.singletonList(tnode1);
    }
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public SNodeReference getRuleNode() {
      return rootMappingRule_417xrn_a0a1x;
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.lang.findUsages.structure.FinderDeclaration";
    }

    public boolean keepSourceRoot() {
      return false;
    }

    public boolean isApplicable(TemplateExecutionEnvironment environment, TemplateContext context) throws GenerationException {
      return true;
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      Collection<SNode> result = new TemplateFinderClass().apply(environment, context);
      return result;
    }
  }

  public class CreateRootRule0 implements TemplateCreateRootRule {
    public CreateRootRule0() {
    }

    public SNodeReference getRuleNode() {
      return createRootRule_417xrn_a0a1y;
    }

    public boolean isApplicable(TemplateExecutionEnvironment environment, TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.createRootRule_Condition_7991477654791680147(environment.getOperationContext(), new CreateRootRuleContext(createRootRule_417xrn_a0a1y, environment.getGenerator())))) {
        return false;
      }
      return true;
    }

    public Collection<SNode> apply(TemplateExecutionEnvironment environment) throws GenerationException {
      Collection<SNode> result = new TemplateFindUsagesDescriptor().apply(environment, new DefaultTemplateContext(null));
      return result;
    }
  }

  private static SNodePointer reductionRule_417xrn_a0a3r = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1200267505993");
  private static SNodePointer conseq_417xrn_a0a0a5r = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1200267513574");
  private static SNodePointer reductionRule_417xrn_a0a3s = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1200268263755");
  private static SNodePointer conseq_417xrn_a0a0a5s = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1200268392650");
  private static SNodePointer reductionRule_417xrn_a0a3t = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1206448384817");
  private static SNodePointer conseq_417xrn_a0a0a5t = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1206448394459");
  private static SNodePointer reductionRule_417xrn_a0a3u = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1207142049043");
  private static SNodePointer conseq_417xrn_a0a0a5u = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1212168695672");
  private static SNodePointer reductionRule_417xrn_a0a3v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7222148688691894612");
  private static SNodePointer conseq_417xrn_a0a0a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7222148688691894613");
  private static SNodePointer templateNode_417xrn_a0a0a2a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763885");
  private static SNodePointer ifMacroRef_417xrn_a0a0a1a5a2a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763887");
  private static SNodePointer copySrcMacro_417xrn_a0a0a1a1a1a5a2a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763899");
  private static SNodePointer conseq_417xrn_a0a0a0b0b0f0c0f12 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763896");
  private static SNodePointer templateNode_417xrn_a0a0a2a0b0b0f0c0f12 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763897");
  private static SNodePointer templateNode_417xrn_a0a0a1a3a2a0b0b0f0c0f12 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763898");
  private static SNodePointer copySrcMacro_417xrn_a0a0a1a6a2a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763907");
  private static SNodePointer ifMacroRef_417xrn_a0a0a1a7a2a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763915");
  private static SNodePointer copySrcMacro_417xrn_a0a0a1a1a1a7a2a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763926");
  private static SNodePointer conseq_417xrn_a0a0a0b0b0h0c0f12 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763924");
  private static SNodePointer templateNode_417xrn_a0a0a2a0b0b0h0c0f12 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763925");
  private static SNodePointer loopMacroRef_417xrn_a0a0a1a8a2a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763934");
  private static SNodePointer templateNode_417xrn_a0a0a3a2a2a1a8a2a5v = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763933");
  private static SNodePointer propertyMacro_417xrn_c0b0c0c0d0c0c0b0i0c0f12 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "4192433084863763941");
  private static SNodePointer reductionRule_417xrn_a0a3w = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "6366407517031509480");
  private static SNodePointer conseq_417xrn_a0a0a5w = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "6366407517031509481");
  private static SNodePointer templateNode_417xrn_a0a0a2a5w = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "6366407517031517798");
  private static SNodePointer loopMacroRef_417xrn_a0a0a1a5a2a5w = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "6366407517031517859");
  private static SNodePointer templateNode_417xrn_a0a0a3a2a2a1a5a2a5w = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "6366407517031517848");
  private static SNodePointer templateNode_417xrn_a0a0a1a5a3a2a2a1a5a2a5w = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "6366407517031517849");
  private static SNodePointer propertyMacro_417xrn_c0b0c0c0b0f0d0c0c0b0f0c0f22 = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "6366407517031517850");
  private static SNodePointer rootMappingRule_417xrn_a0a1x = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "1197207445319");
  private static SNodePointer createRootRule_417xrn_a0a1y = new SNodePointer("r:00000000-0000-4000-0000-011c8959035c(jetbrains.mps.lang.findUsages.generator.baseLanguage.template.main@generator)", "7991477654791680146");
}
