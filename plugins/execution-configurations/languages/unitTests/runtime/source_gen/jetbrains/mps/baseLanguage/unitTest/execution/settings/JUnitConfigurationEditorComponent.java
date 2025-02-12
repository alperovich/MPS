package jetbrains.mps.baseLanguage.unitTest.execution.settings;

/*Generated by MPS */

import com.intellij.ui.components.JBPanel;
import javax.swing.JComponent;
import com.intellij.ui.components.JBRadioButton;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;
import com.intellij.openapi.project.Project;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import com.intellij.ui.components.JBLabel;
import javax.swing.ButtonGroup;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.ide.common.LayoutUtil;
import com.intellij.ui.components.JBTextField;
import jetbrains.mps.smodel.ModelAccess;
import java.util.List;
import jetbrains.mps.baseLanguage.unitTest.execution.client.ITestNodeWrapper;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.execution.lib.ClonableList;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.execution.lib.PointerUtils;

public class JUnitConfigurationEditorComponent extends JBPanel {
  private final ModuleChooser myModuleChooser;
  private final ModelChooser myModelChooser;
  private final TestListPanel myClassesList;
  private final TestListPanel myMethodsList;
  private final JComponent[] myPanels = new JComponent[JUnitRunTypes2.values().length];
  private final JBRadioButton[] myButtons = new JBRadioButton[JUnitRunTypes2.values().length];

  private JUnitRunTypes2 myRunKind = JUnitRunTypes2.PROJECT;
  private SModule myModule;
  private SModel myModel;


  public JUnitConfigurationEditorComponent(Project project) {
    super(new GridBagLayout());

    final JBPanel kindPanel = new JBPanel(new FlowLayout(FlowLayout.LEFT));
    kindPanel.add(new JBLabel("Test kind:"));
    final JBRadioButton projectKind = new JBRadioButton("All in project", true);
    final JBRadioButton moduleKind = new JBRadioButton("All in module");
    final JBRadioButton modelKind = new JBRadioButton("All in model");
    final JBRadioButton classKind = new JBRadioButton("Class");
    final JBRadioButton methodKind = new JBRadioButton("Method");
    myButtons[JUnitRunTypes2.PROJECT.ordinal()] = projectKind;
    myButtons[JUnitRunTypes2.MODULE.ordinal()] = moduleKind;
    myButtons[JUnitRunTypes2.MODEL.ordinal()] = modelKind;
    myButtons[JUnitRunTypes2.NODE.ordinal()] = classKind;
    myButtons[JUnitRunTypes2.METHOD.ordinal()] = methodKind;
    final ButtonGroup kindaRadioGroup = new ButtonGroup();
    Sequence.fromIterable(Sequence.fromArray(myButtons)).visitAll(new IVisitor<JBRadioButton>() {
      public void visit(JBRadioButton it) {
        kindaRadioGroup.add(it);
        kindPanel.add(it);
      }
    });
    projectKind.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (projectKind.isSelected()) {
          myRunKind = JUnitRunTypes2.PROJECT;
        }
        updatePanels();
      }
    });
    moduleKind.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (moduleKind.isSelected()) {
          myRunKind = JUnitRunTypes2.MODULE;
        }
        updatePanels();
      }
    });
    modelKind.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (modelKind.isSelected()) {
          myRunKind = JUnitRunTypes2.MODEL;
        }
        updatePanels();
      }
    });
    classKind.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (classKind.isSelected()) {
          myRunKind = JUnitRunTypes2.NODE;
        }
        updatePanels();
      }
    });
    methodKind.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (methodKind.isSelected()) {
          myRunKind = JUnitRunTypes2.METHOD;
        }
        updatePanels();
      }
    });

    JBPanel projectPanel = new JBPanel(new GridBagLayout());
    projectPanel.add(new JBLabel("Project:"), LayoutUtil.createLabelConstraints(0));
    JBTextField projectNameField = new JBTextField(project.getName());
    projectNameField.setEditable(false);
    projectPanel.add(projectNameField, LayoutUtil.createPanelConstraints(1));

    JBPanel modulePanel = new JBPanel(new GridBagLayout());
    modulePanel.add(new JBLabel("Module:"), LayoutUtil.createLabelConstraints(0));
    myModuleChooser = new ModuleChooser();
    myModuleChooser.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setModuleValue(myModuleChooser.getText());
      }
    });
    modulePanel.add(myModuleChooser, LayoutUtil.createPanelConstraints(1));

    JBPanel modelPanel = new JBPanel(new GridBagLayout());
    modelPanel.add(new JBLabel("Model:"), LayoutUtil.createLabelConstraints(0));
    myModelChooser = new ModelChooser();
    myModelChooser.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setModelValue(myModelChooser.getText());
      }
    });
    modelPanel.add(myModelChooser, LayoutUtil.createPanelConstraints(1));

    myClassesList = new TestListPanel(project, false);
    myMethodsList = new TestListPanel(project, true);
    myPanels[JUnitRunTypes2.PROJECT.ordinal()] = projectPanel;
    myPanels[JUnitRunTypes2.MODULE.ordinal()] = modulePanel;
    myPanels[JUnitRunTypes2.MODEL.ordinal()] = modelPanel;
    myPanels[JUnitRunTypes2.NODE.ordinal()] = myClassesList;
    myPanels[JUnitRunTypes2.METHOD.ordinal()] = myMethodsList;

    add(kindPanel, LayoutUtil.createFieldConstraints(0));
    add(projectPanel, LayoutUtil.createPanelConstraints(1));
    add(modulePanel, LayoutUtil.createPanelConstraints(1));
    add(modelPanel, LayoutUtil.createPanelConstraints(1));
    add(myClassesList, LayoutUtil.createPanelConstraints(1));
    add(myMethodsList, LayoutUtil.createPanelConstraints(1));
  }



  private void setModuleValue(final String moduleName) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myModule = TestUtils.getModule(moduleName);
      }
    });
  }

  private void setModelValue(final String modelName) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myModel = TestUtils.getModel(modelName);
      }
    });
  }



  private void updatePanels() {
    Sequence.fromIterable(Sequence.fromArray(myPanels)).visitAll(new IVisitor<JComponent>() {
      public void visit(JComponent it) {
        it.setVisible(false);
      }
    });
    myPanels[myRunKind.ordinal()].setVisible(true);
  }



  public void apply(final JUnitSettings_Configuration configuration) {
    final List<ITestNodeWrapper> classes = ListSequence.fromList(new ArrayList<ITestNodeWrapper>());
    ListSequence.fromList(classes).addSequence(ListSequence.fromList(myClassesList.getItems()));
    final List<ITestNodeWrapper> methods = ListSequence.fromList(new ArrayList<ITestNodeWrapper>());
    ListSequence.fromList(methods).addSequence(ListSequence.fromList(myMethodsList.getItems()));
    final ClonableList<String> testMethods = new ClonableList<String>();
    final ClonableList<String> testCases = new ClonableList<String>();
    final Wrappers._T<String> model = new Wrappers._T<String>();
    final Wrappers._T<String> module = new Wrappers._T<String>();

    // we have to do all processing in read action 
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (ITestNodeWrapper testMethod : methods) {
          testMethods.add(PointerUtils.pointerToString(testMethod.getNodePointer()));
        }

        for (ITestNodeWrapper testCase : classes) {
          testCases.add(PointerUtils.pointerToString(testCase.getNodePointer()));
        }

        if (myModel != null) {
          model.value = myModel.getModelName();
        }
        if (myModule != null) {
          module.value = myModule.getModuleName();
        }
      }
    });

    configuration.setRunType(myRunKind);

    configuration.setTestMethods(testMethods);
    configuration.setTestCases(testCases);
    configuration.setModel(model.value);
    configuration.setModule(module.value);
  }

  public void reset(final JUnitSettings_Configuration configuration) {
    if (configuration.getRunType() != null) {
      myRunKind = configuration.getRunType();
    } else {
      myRunKind = JUnitRunTypes2.PROJECT;
    }
    myButtons[myRunKind.ordinal()].setSelected(true);

    // nodes 
    final List<ITestNodeWrapper> classes = ListSequence.fromList(new ArrayList<ITestNodeWrapper>());
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        Sequence.fromIterable(TestUtils.wrapPointerStrings(configuration.getTestCases())).visitAll(new IVisitor<ITestNodeWrapper>() {
          public void visit(ITestNodeWrapper it) {
            ListSequence.fromList(classes).addElement(it);
          }
        });
      }
    });
    myClassesList.setData(classes);

    // methods 
    final List<ITestNodeWrapper> methods = ListSequence.fromList(new ArrayList<ITestNodeWrapper>());
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        Sequence.fromIterable(TestUtils.wrapPointerStrings(configuration.getTestMethods())).visitAll(new IVisitor<ITestNodeWrapper>() {
          public void visit(ITestNodeWrapper it) {
            ListSequence.fromList(methods).addElement(it);
          }
        });
      }
    });
    myMethodsList.setData(methods);

    // models 
    if (configuration.getModel() != null) {
      resetEditorModelWith(configuration.getModel());
    } else {
      // if model is null, it is convenient to take model from the first node 
      final Wrappers._T<ITestNodeWrapper> wrapperToTakeModelFrom = new Wrappers._T<ITestNodeWrapper>(null);
      if (ListSequence.fromList(myClassesList.getItems()).isNotEmpty()) {
        wrapperToTakeModelFrom.value = ListSequence.fromList(myClassesList.getItems()).first();
      } else if (ListSequence.fromList(myMethodsList.getItems()).isNotEmpty()) {
        wrapperToTakeModelFrom.value = ListSequence.fromList(myMethodsList.getItems()).first();
      }
      if (wrapperToTakeModelFrom.value != null) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            resetEditorModelWith(wrapperToTakeModelFrom.value.getNodePointer().getModelReference().getModelName());
          }
        });
      }
    }

    // modules 
    if (configuration.getModule() != null) {
      setModuleValue(configuration.getModule());
      myModuleChooser.setText(configuration.getModule());
    }

    updatePanels();
  }

  public void resetEditorModelWith(final String modelName) {
    setModelValue(modelName);
    if (myModel != null && myModel.getModule() != null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          myModelChooser.setText(modelName);
          String moduleName = myModel.getModule().getModuleName();
          setModuleValue(moduleName);
          myModuleChooser.setText(moduleName);
        }
      });
    }
  }

  public void dispose() {
    myModuleChooser.dispose();
    myModelChooser.dispose();
  }
}
