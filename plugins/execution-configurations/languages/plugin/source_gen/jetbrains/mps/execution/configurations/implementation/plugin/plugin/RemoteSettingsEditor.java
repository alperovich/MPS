package jetbrains.mps.execution.configurations.implementation.plugin.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.GridBagLayout;
import javax.swing.text.DefaultFormatter;
import javax.swing.JLabel;
import jetbrains.mps.ide.common.LayoutUtil;
import jetbrains.mps.debugger.java.api.settings.RemoteConnectionSettings;
import jetbrains.mps.debugger.java.api.settings.DebugConnectionSettings;
import java.awt.event.KeyAdapter;
import java.beans.PropertyChangeListener;
import java.awt.event.KeyEvent;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.text.ParseException;
import org.jetbrains.annotations.Nullable;

public class RemoteSettingsEditor extends JPanel {
  private final JTextField myHostTextField;
  private final JFormattedTextField myPortTextField;
  private final JTextField myCommandLineTextField;
  private int myPort;
  private String myHost;
  private String myCommandLine;

  public RemoteSettingsEditor() {
    super(new GridBagLayout());
    RemoteSettingsEditor.MyKeyAdapter listener = new RemoteSettingsEditor.MyKeyAdapter();
    myHostTextField = new JTextField();
    myHostTextField.addKeyListener(listener);
    DefaultFormatter formatter = new RemoteSettingsEditor.MyDefaultFormatter();
    formatter.setAllowsInvalid(true);
    formatter.setCommitsOnValidEdit(true);
    formatter.setOverwriteMode(false);
    myPortTextField = new JFormattedTextField(formatter);
    myPortTextField.addPropertyChangeListener("value", listener);
    myPortTextField.addKeyListener(listener);
    myCommandLineTextField = new JTextField();
    myCommandLineTextField.setEditable(false);
    add(new JLabel("Host:"), LayoutUtil.createLabelConstraints(0));
    add(myHostTextField, LayoutUtil.createFieldConstraints(1));
    add(new JLabel("Port:"), LayoutUtil.createLabelConstraints(2));
    add(myPortTextField, LayoutUtil.createFieldConstraints(3));
    add(new JLabel("Remote JVM command line arguments:"), LayoutUtil.createLabelConstraints(4));
    add(myCommandLineTextField, LayoutUtil.createFieldConstraints(5));
  }

  private void updateFieldsFromUi() {
    myHost = myHostTextField.getText();
    myPort = (Integer) myPortTextField.getValue();
    myCommandLine = formClientCommandLine();
    myCommandLineTextField.setText(myCommandLine);
  }

  private void updateUiFromFields() {
    myHostTextField.setText(myHost);
    myPortTextField.setValue(myPort);
    myCommandLineTextField.setText(myCommandLine);
  }

  private String formClientCommandLine() {
    return RemoteConnectionSettings.getClientCommandLine(true, myPort);
  }

  public void reset(DebugConnectionSettings settings) {
    myHost = settings.getHostName();
    myPort = settings.getPort();
    myCommandLine = formClientCommandLine();
    updateUiFromFields();
  }

  public void apply(DebugConnectionSettings settings) {
    settings.setHostName(myHost);
    settings.setPort(myPort);
  }

  private class MyKeyAdapter extends KeyAdapter implements PropertyChangeListener {
    private MyKeyAdapter() {
    }

    @Override
    public void keyReleased(KeyEvent e) {
      updateFieldsFromUi();
      myPortTextField.setForeground((myPortTextField.isEditValid() ?
        StyleRegistry.getInstance().getEditorForeground() :
        Color.RED
      ));
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
      updateFieldsFromUi();
    }
  }

  private class MyDefaultFormatter extends DefaultFormatter {
    private MyDefaultFormatter() {
    }

    @Override
    public Object stringToValue(String text) throws ParseException {
      try {
        return Integer.parseInt(text);
      } catch (NumberFormatException e) {
        throw new ParseException(text, 0);
      }
    }

    @Override
    public String valueToString(@Nullable Object value) throws ParseException {
      if (value == null) {
        return null;
      }
      return Integer.toString((Integer) value);
    }
  }
}
