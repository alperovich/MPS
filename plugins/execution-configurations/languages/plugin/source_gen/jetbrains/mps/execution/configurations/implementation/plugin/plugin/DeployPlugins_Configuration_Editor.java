package jetbrains.mps.execution.configurations.implementation.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.api.settings.SettingsEditorEx;
import com.intellij.ui.components.JBCheckBox;
import com.intellij.openapi.util.Disposer;
import org.jetbrains.annotations.NotNull;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import jetbrains.mps.ide.common.LayoutUtil;
import com.intellij.openapi.options.ConfigurationException;

public class DeployPlugins_Configuration_Editor extends SettingsEditorEx<DeployPlugins_Configuration> {
  private JBCheckBox mySkipModulesLoading;
  private JBCheckBox myRestartCurrentInstanceCheckbox;
  private DeployPluginsSettings_Configuration_Editor myPluginsSettings;

  public void disposeEditor() {
    Disposer.dispose(myPluginsSettings);
  }

  @NotNull
  public JPanel createEditor() {
    JPanel plugins = myPluginsSettings.createEditor();
    mySkipModulesLoading = new JBCheckBox("Do not load modules from deployed plugins");
    myRestartCurrentInstanceCheckbox = new JBCheckBox("Restart current MPS instance");

    JPanel panel = new JPanel(new GridBagLayout());
    panel.add(plugins, LayoutUtil.createPanelConstraints(0));
    panel.add(mySkipModulesLoading, LayoutUtil.createLabelConstraints(1));
    panel.add(myRestartCurrentInstanceCheckbox, LayoutUtil.createLabelConstraints(2));

    return panel;
  }

  public void applyEditorTo(final DeployPlugins_Configuration configuration) throws ConfigurationException {
    myPluginsSettings.applyEditorTo(configuration.getPluginsSettings());
    configuration.setSkipModulesLoading(mySkipModulesLoading.isSelected());
    configuration.setRestartCurrentInstance(myRestartCurrentInstanceCheckbox.isSelected());
  }

  public void resetEditorFrom(final DeployPlugins_Configuration configuration) {
    myPluginsSettings.resetEditorFrom(configuration.getPluginsSettings());
    mySkipModulesLoading.setSelected(configuration.getSkipModulesLoading());
    myRestartCurrentInstanceCheckbox.setSelected(configuration.getRestartCurrentInstance());
  }

  public DeployPlugins_Configuration_Editor(DeployPluginsSettings_Configuration_Editor pluginsSettings) {
    myPluginsSettings = pluginsSettings;
  }
}
