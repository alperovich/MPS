package jetbrains.mps.baseLanguage.execution.api;

/*Generated by MPS */

import com.intellij.ui.components.JBPanel;
import jetbrains.mps.execution.lib.ui.RawLineEditorComponent;
import jetbrains.mps.execution.lib.ui.FieldWithPathChooseDialog;
import com.intellij.ui.components.JBCheckBox;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.intellij.ui.components.JBLabel;
import jetbrains.mps.ide.common.LayoutUtil;
import org.jetbrains.annotations.Nullable;

public class JavaConfigurationOptions extends JBPanel {
  private final RawLineEditorComponent myVmParameters;
  private final RawLineEditorComponent myProgramParameters;
  private final FieldWithPathChooseDialog myWorkingDirectory;
  private final JBCheckBox myUseAlternativeJre;
  private final FieldWithPathChooseDialog myJreHome;

  public JavaConfigurationOptions() {
    super(new GridBagLayout());

    myVmParameters = new RawLineEditorComponent();
    myVmParameters.setDialogCaption("VM parameters");
    myProgramParameters = new RawLineEditorComponent();
    myProgramParameters.setDialogCaption("Program parameters");
    myWorkingDirectory = new FieldWithPathChooseDialog();
    myWorkingDirectory.setTitle("Select working directory");
    myUseAlternativeJre = new JBCheckBox("Use alternative JRE");
    myJreHome = new FieldWithPathChooseDialog();
    myUseAlternativeJre.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        myJreHome.setEditable(myUseAlternativeJre.isSelected());
      }
    });
    myJreHome.setTitle("Select alternative JRE home");

    add(new JBLabel("VM parameters:"), LayoutUtil.createLabelConstraints(0));
    add(myVmParameters, LayoutUtil.createPanelConstraints(1));
    add(new JBLabel("Program parameters:"), LayoutUtil.createLabelConstraints(2));
    add(myProgramParameters, LayoutUtil.createPanelConstraints(3));
    add(new JBLabel("Working directory:"), LayoutUtil.createLabelConstraints(4));
    add(myWorkingDirectory, LayoutUtil.createPanelConstraints(5));
    add(myUseAlternativeJre, LayoutUtil.createLabelConstraints(9));
    add(myJreHome, LayoutUtil.createPanelConstraints(10));
  }



  public void reset(@Nullable JavaRunParameters javaOptions) {
    if (javaOptions == null) {
      return;
    }
    myProgramParameters.setText(javaOptions.programParameters());
    myVmParameters.setText(javaOptions.vmOptions());
    myJreHome.setText(javaOptions.jrePath());
    myWorkingDirectory.setText(javaOptions.workingDirectory());
    myUseAlternativeJre.setSelected((boolean) javaOptions.useAlternativeJre());
    myJreHome.setEditable((boolean) javaOptions.useAlternativeJre());
  }

  public void apply(@Nullable JavaRunParameters javaOptions) {
    if (javaOptions == null) {
      return;
    }
    javaOptions.programParameters(myProgramParameters.getText());
    javaOptions.vmOptions(myVmParameters.getText());
    javaOptions.jrePath(myJreHome.getText());
    javaOptions.workingDirectory(myWorkingDirectory.getText());
    javaOptions.useAlternativeJre(myUseAlternativeJre.isSelected());
  }

  public void dispose() {
    myJreHome.dispose();
    myProgramParameters.dispose();
    myVmParameters.dispose();
    myWorkingDirectory.dispose();
  }
}
