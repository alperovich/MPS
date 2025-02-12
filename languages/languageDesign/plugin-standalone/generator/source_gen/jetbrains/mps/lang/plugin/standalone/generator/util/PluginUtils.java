package jetbrains.mps.lang.plugin.standalone.generator.util;

/*Generated by MPS */

import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.util.SNodeOperations;

public class PluginUtils {
  public PluginUtils() {
  }

  public static boolean needAppPlugin(TemplateQueryContext genContext) {
    return (ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.standalone.structure.StandalonePluginDescriptor")).isNotEmpty() || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.IdeaInitializerDescriptor")).isNotEmpty()) && (ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration")).isNotEmpty() || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.ActionDeclaration")).isNotEmpty() || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.InterfaceGroup")).isNotEmpty() || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.KeymapChangesDeclaration")).isNotEmpty()) || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.standalone.structure.ApplicationPluginDeclaration")).isNotEmpty();
  }

  public static boolean needProjectPlugin(TemplateQueryContext genContext) {
    return (ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.standalone.structure.StandalonePluginDescriptor")).isNotEmpty() || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.IdeaInitializerDescriptor")).isNotEmpty()) && (ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.EditorTab")).isNotEmpty() || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.BaseToolDeclaration")).isNotEmpty() || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.PreferencesComponentDeclaration")).isNotEmpty()) || ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.standalone.structure.ProjectPluginDeclaration")).isNotEmpty();
  }

  public static void checkPluginModelName(TemplateQueryContext genContext, SNode node) {
    if (ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.structure.IdeaInitializerDescriptor")).isNotEmpty()) {
      return;
    }
    if (ListSequence.fromList(SModelOperations.getRoots(genContext.getInputModel(), "jetbrains.mps.lang.plugin.standalone.structure.StandalonePluginDescriptor")).isEmpty()) {
      return;
    }

    SModel model = genContext.getOriginalInputModel();
    String correctName = model.getModule().getModuleName() + ".plugin";
    if (eq_l4wyvj_a0f0d(SNodeOperations.getModelLongName(model), correctName)) {
      return;
    }

    genContext.showErrorMessage(node, "To be able to use plugin, you should name plugin model as '<ModuleName>.plugin'. For this model, the name should be " + correctName);
  }

  private static boolean eq_l4wyvj_a0f0d(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
