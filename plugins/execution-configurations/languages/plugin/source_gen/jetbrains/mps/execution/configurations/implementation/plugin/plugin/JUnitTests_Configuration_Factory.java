package jetbrains.mps.execution.configurations.implementation.plugin.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;

public class JUnitTests_Configuration_Factory extends ConfigurationFactory {
  public JUnitTests_Configuration_Factory(JUnitTests_Kind type) {
    super(type);
  }

  public RunConfiguration createTemplateConfiguration(Project project) {
    return new JUnitTests_Configuration(project, this, "Template Configuration");
  }

  @Override
  public String getName() {
    return "JUnit Tests";
  }

  @Override
  public Icon getIcon() {
    Icon icon = super.getIcon();
    if (icon == null) {
      return AllIcons.RunConfigurations.Application;
    }
    return icon;
  }
}
