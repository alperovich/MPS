package jetbrains.mps.execution.configurations.implementation.plugin.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.ConfigurationType;
import javax.swing.Icon;
import jetbrains.mps.icons.MPSIcons;
import java.util.List;
import com.intellij.execution.configurations.ConfigurationFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;

public class MPS_Kind implements ConfigurationType {
  private static final Icon ICON = MPSIcons.MPS16x16;
  private final List<ConfigurationFactory> myForeignFactories = ListSequence.fromList(new ArrayList<ConfigurationFactory>());

  public MPS_Kind() {
  }

  public ConfigurationFactory[] getConfigurationFactories() {
    List<ConfigurationFactory> result = ListSequence.fromList(new ArrayList<ConfigurationFactory>());
    ListSequence.fromList(result).addElement(new MPSInstance_Configuration_Factory(this));
    ListSequence.fromList(result).addElement(new DeployPlugins_Configuration_Factory(this));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(myForeignFactories));
    return ListSequence.fromList(result).toGenericArray(ConfigurationFactory.class);
  }

  @NonNls
  @NotNull
  public String getId() {
    return "MPS";
  }

  public Icon getIcon() {
    return ICON;
  }

  public String getConfigurationTypeDescription() {
    return null;
  }

  public String getDisplayName() {
    return "MPS";
  }

  public void addForeignFactory(ConfigurationFactory factory) {
    ListSequence.fromList(myForeignFactories).addElement(factory);
  }

  public static MPS_Kind getInstance() {
    return ContainerUtil.findInstance(Extensions.getExtensions(CONFIGURATION_TYPE_EP), MPS_Kind.class);
  }
}
