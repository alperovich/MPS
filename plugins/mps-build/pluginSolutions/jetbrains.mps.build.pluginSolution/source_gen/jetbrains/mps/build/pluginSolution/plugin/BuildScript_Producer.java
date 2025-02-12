package jetbrains.mps.build.pluginSolution.plugin;

/*Generated by MPS */

import java.util.List;
import com.intellij.execution.junit.RuntimeConfigurationProducer;
import com.intellij.execution.configurations.ConfigurationType;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.execution.api.configurations.BaseMpsProducer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.plugins.runconfigs.MPSPsiElement;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import com.intellij.execution.impl.RunManagerImpl;

public class BuildScript_Producer {
  private static String CONFIGURATION_FACTORY_CLASS_NAME = "jetbrains.mps.build.pluginSolution.plugin.BuildScript_Configuration_Factory";

  public BuildScript_Producer() {
  }

  public static List<RuntimeConfigurationProducer> getProducers(ConfigurationType configurationType) {
    List<RuntimeConfigurationProducer> creators = ListSequence.fromList(new ArrayList<RuntimeConfigurationProducer>());
    ListSequence.fromList(creators).addElement(new BuildScript_Producer.ProducerPart_Node_3e34ca_a(configurationType, CONFIGURATION_FACTORY_CLASS_NAME));
    return creators;
  }

  public static class ProducerPart_Node_3e34ca_a extends BaseMpsProducer<SNode> {
    public ProducerPart_Node_3e34ca_a(ConfigurationType configurationType, String factoryName) {
      super(configurationType, factoryName);
    }

    protected boolean isApplicable(Object source) {
      return source instanceof SNode && SNodeOperations.isInstanceOf(((SNode) source), "jetbrains.mps.lang.core.structure.BaseConcept");
    }

    protected BuildScript_Configuration doCreateConfiguration(final SNode source) {
      setSourceElement(new MPSPsiElement(source));
      SNode containingRoot = SNodeOperations.getContainingRoot(source);
      if (SNodeOperations.isInstanceOf(containingRoot, "jetbrains.mps.build.structure.BuildProject") && !(SNodeOperations.getModel(containingRoot).getModule().isPackaged())) {
        String name = SPropertyOperations.getString(SNodeOperations.cast(containingRoot, "jetbrains.mps.lang.core.structure.INamedConcept"), "name");
        if (name == null) {
          return null;
        }
        BuildScript_Configuration configuration = ((BuildScript_Configuration) getConfigurationFactory().createConfiguration("" + name, (BuildScript_Configuration) RunManagerImpl.getInstanceImpl(getContext().getProject()).getConfigurationTemplate(getConfigurationFactory()).getConfiguration()));
        configuration.getNode().setNode(containingRoot);
        return configuration;
      }
      return null;
    }

    @Override
    public BuildScript_Producer.ProducerPart_Node_3e34ca_a clone() {
      return (BuildScript_Producer.ProducerPart_Node_3e34ca_a) super.clone();
    }
  }
}
