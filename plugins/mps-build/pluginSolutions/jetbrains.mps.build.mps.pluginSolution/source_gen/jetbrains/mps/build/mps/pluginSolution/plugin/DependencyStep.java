package jetbrains.mps.build.mps.pluginSolution.plugin;

/*Generated by MPS */

import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import jetbrains.mps.ide.common.LayoutUtil;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.intellij.ide.wizard.CommitStepException;
import org.jetbrains.annotations.NotNull;

public class DependencyStep extends AbstractStep {
  private final AbstractBuildGenerator myGenerator;
  private final IErrorHandler myHandler;
  private int mySelectedIndex = DependencyStep.DependencyKind.DEFAULT;

  public DependencyStep(AbstractBuildGenerator buildGenerator, IErrorHandler handler) {
    myGenerator = buildGenerator;
    myHandler = handler;
  }

  @Override
  public JComponent createMainComponent() {
    JPanel panel = new JPanel(new GridBagLayout());

    ButtonGroup group = new ButtonGroup();

    for (DependencyStep.DependencyKind kind : DependencyStep.DependencyKind.values()) {
      final int index = kind.ordinal();
      final JRadioButton button = new JRadioButton(kind.getText(), index == mySelectedIndex);
      panel.add(button, LayoutUtil.createLabelConstraints(index));
      group.add(button);
      button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (button.isSelected()) {
            mySelectedIndex = index;
          }
        }
      });
    }

    return panel;
  }

  @Override
  public String getDescription() {
    return "Select distribution kind.";
  }

  @Override
  public void _init() {
    super._init();
    String errorText = null;
    if (!(myGenerator.isValid())) {
      errorText = "Invalid input in previous steps.";
    }
    myHandler.setErrorText(errorText);
  }

  @Override
  public void _commit(boolean finished) throws CommitStepException {
    super._commit(finished);
    myGenerator.setDependencyKind(DependencyStep.DependencyKind.values()[mySelectedIndex]);
  }

  @NotNull
  @Override
  public String getImageText() {
    return "Distribution Kind";
  }

  public static   enum DependencyKind {
    MPS("Plug-in for MPS"),
    IDEA("Plug-in for IntelliJ IDEA"),
    STANDALONE("Standalone IDE");

    public static final int DEFAULT = 0;
    private final String myText;

    DependencyKind(String text) {
      myText = text;
    }

    public String getText() {
      return myText;
    }
  }
}
