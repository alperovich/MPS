package jetbrains.mps.workbench.dialogs.project.newproject;


import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.awt.BorderLayout;
import jetbrains.mps.ide.ui.filechoosers.treefilechooser.TreeFileChooser;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;

public class PathField extends JPanel {
  public PathField myThis;
  private JTextField myPathField_d96i1m_b0;
  private JButton myButton_d96i1m_c0;
  private String myPath;
  private int myMode;
  public List<AutoBinding> myBindings = ListSequence.fromList(new ArrayList<AutoBinding>());

  public PathField() {
    this.myThis = this;
    PathField component = this;
    component.setLayout(new BorderLayout());
    component.add(this.createComponent_d96i1m_b0(), BorderLayout.CENTER);
    component.add(this.createComponent_d96i1m_c0(), BorderLayout.EAST);
    myThis.setMode(TreeFileChooser.MODE_DIRECTORIES);
  }

  public void addNotify() {
    super.addNotify();
    this.bind();
  }

  public void removeNotify() {
    this.unbind();
    super.removeNotify();
  }

  private void bind() {
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("path");
      Object targetObject = this.myPathField_d96i1m_b0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
  }

  private void unbind() {
    for (AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JTextField createComponent_d96i1m_b0() {
    JTextField component = new JTextField();
    this.myPathField_d96i1m_b0 = component;
    component.setColumns(40);
    return component;
  }

  private JButton createComponent_d96i1m_c0() {
    JButton component = new JButton();
    this.myButton_d96i1m_c0 = component;
    component.setText("...");
    component.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myThis.choosePathClicked();
      }
    });
    return component;
  }

  public String getPath() {
    return this.myPath;
  }

  public int getMode() {
    return this.myMode;
  }

  public void setPath(String newValue) {
    String oldValue = this.myPath;
    this.myPath = newValue;
    this.firePropertyChange("path", oldValue, newValue);
  }

  public void setMode(int newValue) {
    int oldValue = this.myMode;
    this.myMode = newValue;
    this.firePropertyChange("mode", oldValue, newValue);
  }

  /*package*/ void choosePathClicked() {
    String oldPath = myThis.myPathField_d96i1m_b0.getText();
    TreeFileChooser chooser = new TreeFileChooser();
    chooser.setMode(myThis.getMode());
    if (oldPath != null) {
      chooser.setInitialFile(FileSystem.getInstance().getFileByPath(oldPath));
    }
    IFile result = chooser.showDialog();
    if (result != null) {
      myThis.setPath(result.getPath());
    }
  }

  public void setEnabled(boolean enabled) {
    myThis.myPathField_d96i1m_b0.setEnabled(enabled);
    myThis.myButton_d96i1m_c0.setEnabled(enabled);
  }
}
