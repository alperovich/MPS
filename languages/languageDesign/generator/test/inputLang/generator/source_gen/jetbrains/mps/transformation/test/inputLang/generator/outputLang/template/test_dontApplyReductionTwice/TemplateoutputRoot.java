package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_dontApplyReductionTwice;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import org.jetbrains.mps.openapi.model.SNodeReference;
import java.util.Collection;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.generator.GenerationTracerUtil;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.SNodePointer;

public class TemplateoutputRoot implements TemplateDeclaration {
  public TemplateoutputRoot() {
  }

  public SNodeReference getTemplateNode() {
    return template_9pkn2m_a0a1;
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = environment.createOutputNode("jetbrains.mps.transformation.test.outputLang.structure.OutputRoot");
    try {
      environment.getTracer().pushTemplateNode(templateNode_9pkn2m_a0a0a1a2);
      environment.nodeCopied(context, tnode1, "tpl/r:00000000-0000-4000-0000-011c895905f5/1209605205934");
      SNodeAccessUtil.setProperty(tnode1, "name", "outputRoot");
      SNodeAccessUtil.setProperty(tnode1, "text", "output for 'don't apply reduction rule twice' test");

      {
        final SNode tnode2 = environment.createOutputNode("jetbrains.mps.transformation.test.outputLang.structure.OutputNode_forDontApplyReductionTwice_test");
        try {
          environment.getTracer().pushTemplateNode(templateNode_9pkn2m_a0a0a1a5a1a2);
          environment.nodeCopied(context, tnode2, "tpl/r:00000000-0000-4000-0000-011c895905f5/1209605724998");
          SNodeAccessUtil.setProperty(tnode2, "text", "this is OutputNode_forDontApplyReductionTwice_test actually");

        } finally {
          environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode2));
          environment.getTracer().closeTemplateNode(templateNode_9pkn2m_a0a0a1a5a1a2);
        }
        if (tnode2 != null) {
          tnode1.addChild("outputChild", tnode2);
        }
        // TODO validate child 
      }
    } finally {
      environment.getTracer().pushOutputNode(GenerationTracerUtil.getSNodePointer(environment.getOutputModel(), tnode1));
      environment.getTracer().closeTemplateNode(templateNode_9pkn2m_a0a0a1a2);
    }
    return TemplateUtil.singletonList(tnode1);
  }

  private static SNodePointer template_9pkn2m_a0a1 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f5(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_dontApplyReductionTwice@generator)", "1209605205934");
  private static SNodePointer templateNode_9pkn2m_a0a0a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f5(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_dontApplyReductionTwice@generator)", "1209605205934");
  private static SNodePointer templateNode_9pkn2m_a0a0a1a5a1a2 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f5(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_dontApplyReductionTwice@generator)", "1209605724998");
}
