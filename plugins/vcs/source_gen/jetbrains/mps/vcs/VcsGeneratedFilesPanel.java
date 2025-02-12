package jetbrains.mps.vcs;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.workbench.dialogs.project.properties.project.ProjectPrefsExtraPanel;
import javax.swing.JCheckBox;
import com.intellij.openapi.project.Project;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JComponent;

public class VcsGeneratedFilesPanel extends JPanel implements ProjectPrefsExtraPanel {
  private JCheckBox myIgnoreGeneratedFilesCheckBox = new JCheckBox("Do not store generated files in repository");
  private Project myProject;

  public VcsGeneratedFilesPanel(Project project) {
    myProject = project;
    setLayout(new BorderLayout());
    JPanel generatedFilesPanel = new JPanel(new BorderLayout());
    generatedFilesPanel.setBorder(new TitledBorder("Generated Files"));
    myIgnoreGeneratedFilesCheckBox.setToolTipText("Do not store generated files and model caches (source_gen/*, source_gen.caches/*) in repository");
    generatedFilesPanel.add(myIgnoreGeneratedFilesCheckBox);
    add(generatedFilesPanel, BorderLayout.NORTH);
  }

  @Override
  public boolean isModified() {
    return myIgnoreGeneratedFilesCheckBox.isSelected() != getConfiguration().isIgnoreGeneratedFiles();
  }

  @Override
  public void apply() {
    getConfiguration().setIgnoreGeneratedFiles(myIgnoreGeneratedFilesCheckBox.isSelected());
  }

  @Override
  public void reset() {
    myIgnoreGeneratedFilesCheckBox.setSelected(getConfiguration().isIgnoreGeneratedFiles());
  }

  private MPSVcsProjectConfiguration getConfiguration() {
    return myProject.getComponent(MPSVcsProjectConfiguration.class);
  }

  @Override
  public JComponent getComponent() {
    return this;
  }
}
