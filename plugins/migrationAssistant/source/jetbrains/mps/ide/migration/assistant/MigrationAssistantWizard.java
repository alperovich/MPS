/*
 * Copyright 2003-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.migration.assistant;

import com.intellij.icons.AllIcons.Actions;
import com.intellij.ide.BrowserUtil;
import com.intellij.ide.wizard.AbstractWizardEx;
import com.intellij.ide.wizard.AbstractWizardStepEx;
import com.intellij.ide.wizard.AbstractWizardStepEx.Listener;
import com.intellij.ide.wizard.CommitStepException;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.Task.Modal;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.impl.status.InlineProgressIndicator;
import com.intellij.ui.components.JBCheckBox;
import com.intellij.ui.components.JBList;
import com.intellij.ui.components.JBScrollPane;
import jetbrains.mps.extapi.persistence.FileDataSource;
import jetbrains.mps.icons.MPSIcons.General;
import jetbrains.mps.icons.MPSIcons.Small;
import jetbrains.mps.ide.migration.assistant.MigrationProcessor.Callback;
import jetbrains.mps.persistence.DefaultModelRoot;
import jetbrains.mps.persistence.PersistenceRegistry;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.MPSProjectMigrationComponent;
import jetbrains.mps.project.MPSProjectMigrationComponentImpl;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.FileUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.mps.openapi.model.EditableSModel;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.persistence.DataSource;
import org.jetbrains.mps.openapi.persistence.FindUsagesParticipant;
import org.jetbrains.mps.openapi.persistence.ModelFactory;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MigrationAssistantWizard extends AbstractWizardEx {

  private static Logger LOG = LogManager.getLogger(MigrationAssistantWizard.class);

  private static final List<String> STEP_IDS = new ArrayList<String>();

  private static Icon WIZARD_ICON = General.NewProject;
  private static Icon EXCLUDE_ICON = Actions.Cross;
  private static Icon CHECK_ICON = Actions.Checked;
  private static Icon ERROR_ICON = Small.Error;
  private static Icon EMPTY_ICON = new Icon() {
    @Override
    public void paintIcon(Component component, Graphics graphics, int i, int i1) {
    }

    @Override
    public int getIconWidth() {
      return 12;
    }

    @Override
    public int getIconHeight() {
      return 12;
    }
  };

  public MigrationAssistantWizard(Project project) {
    super("Migration Assistant Wizard", project, Arrays.asList(
        new InitialStep(project),
        new OldPersistenceDetectedStep(project),
        new MigrationsActionsStep(project),
        new MigrationsProgressStep(project),
        new MigrationsFinishedStep(project),
        new MigrationsFinishedWithErrorsStep(project)));
  }

  @Override
  public void addStep(AbstractWizardStepEx step) {
    super.addStep(step);
    step.addStepListener(new Listener() {
      @Override
      public void doNextAction() {
      }

      @Override
      public void stateChanged() {
        updateStep();
      }
    });
  }

  @Override
  public void doCancelAction() {
    super.doCancelAction();
    if (!canCancel()) {
      Messages.showErrorDialog(getContentPane(), "Migration can't be cancelled at this point. Please select Finish.", "Migration Assistant");
    }
  }

  @Override
  protected void updateStep() {
    super.updateStep();
    getCancelAction().setEnabled(canCancel());
    MyStep step = (MyStep) getCurrentStepObject();
    step.onAfterUpdate();
  }

  protected boolean canCancel() {
    for (AbstractWizardStepEx step : mySteps) {
      if (((MyStep) step).isPostComplete()) {
        return false;
      }
    }
    return true;
  }

  private static abstract class MyStep extends AbstractWizardStepEx {

    protected Project myProject;
    protected JComponent myComponent;
    private String myId;

    public MyStep(Project project, String title, String id) {
      super(title);
      myProject = project;
      myId = id;
      STEP_IDS.add(myId);
    }

    @Override
    public Object getStepId() {
      return myId;
    }

    @Override
    public Object getNextStepId() {
      int idx = STEP_IDS.indexOf(myId) + 1;
      return idx < STEP_IDS.size() ? STEP_IDS.get(idx) : null;
    }

    protected Object getSkipNextStepId() {
      int idx = STEP_IDS.indexOf(myId) + 2;
      return idx < STEP_IDS.size() ? STEP_IDS.get(idx) : null;
    }

    protected Object getSkipNextStepId(int skip) {
      int idx = STEP_IDS.indexOf(myId) + skip + 1;
      return idx < STEP_IDS.size() ? STEP_IDS.get(idx) : null;
    }

    @Override
    public Object getPreviousStepId() {
      int idx = STEP_IDS.indexOf(myId) - 1;
      return idx >= 0 ? STEP_IDS.get(idx) : null;
    }

    public Object getSkipPreviousStepId() {
      int idx = STEP_IDS.indexOf(myId) - 2;
      return idx >= 0 ? STEP_IDS.get(idx) : null;
    }

    @Override
    public Icon getIcon() {
      return WIZARD_ICON;
    }

    @Override
    public JComponent getComponent() {
      return myComponent;
    }

    @Override
    public JComponent getPreferredFocusedComponent() {
      return null;
    }

    @Override
    public void commit(CommitType commitType) throws CommitStepException {

    }

    @Override
    public boolean isComplete() {
      return false;
    }

    public boolean isPostComplete() {
      return false;
    }

    public void onAfterUpdate() {
    }

    protected void createComponent() {
      this.myComponent = new JPanel(new BorderLayout(5, 5));
      myComponent.setBorder(BorderFactory.createCompoundBorder(
          BorderFactory.createEtchedBorder(), BorderFactory.createEmptyBorder(2, 2, 2, 2)));
    }
  }

  private static class InitialStep extends MyStep {

    private JBCheckBox mySelectActions;

    public InitialStep(Project project) {
      super(project, "Migration Required", "initial");
      createComponent();
    }

    @Override
    protected final void createComponent() {
      super.createComponent();

      GridBagLayout layout = new GridBagLayout();
      JPanel pagePanel = new JPanel(layout);
      Insets insets = new Insets(0, 0, 0, 0);
      GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1., 1., GridBagConstraints.FIRST_LINE_START, GridBagConstraints.BOTH, insets, 0, 0);

      JPanel infoHolder = new JPanel(new BorderLayout());
      infoHolder.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

      JTextPane info = new JTextPane();
      info.setContentType("text/html");
      info.setText("Welcome to Migration Assistant!" +
          "<br><br>" +
          "MPS has detected that your project requires migration before it can be used with this version of the product." +
          "<br><br>" +
          "This wizard will guide you through the migration process. It's going to take a while." +
          "<br><br>" +
          "Select Next to proceed with migration or Cancel if you wish to postpone it.");
      info.setEditable(false);
      info.setFocusable(false);
      info.setBorder(BorderFactory.createLoweredBevelBorder());
      info.setPreferredSize(new Dimension(300, 220));

      infoHolder.add(info, BorderLayout.CENTER);

      pagePanel.add(infoHolder);
      layout.setConstraints(infoHolder, gbc);

      gbc.gridy++;
      gbc.anchor = GridBagConstraints.LAST_LINE_START;
      gbc.weightx = 0.;
      gbc.weighty = 0.;

      mySelectActions = new JBCheckBox("Select Migration Actions");
      mySelectActions.setSelected(false);

      pagePanel.add(mySelectActions);
      layout.setConstraints(mySelectActions, gbc);

      myComponent.add(pagePanel, BorderLayout.CENTER);
    }

    @Override
    public boolean isComplete() {
      return true;
    }

    @Override
    public Object getNextStepId() {
      if (hasModelsInOldPersistence()) return super.getNextStepId();
      return mySelectActions.isSelected() ? super.getSkipNextStepId(1) : super.getSkipNextStepId(2);
    }

    private boolean hasModelsInOldPersistence() {
      return false;
//      return new ModelPersistenceDetector(myProject).hasModelsInOldPersistence();
    }
  }

  private static class OldPersistenceDetectedStep extends MyStep {

    private JBList myList;

    public OldPersistenceDetectedStep(Project project) {
      super(project, "Models In Old Persistence Detected", "oldPersistence");
      createComponent();
    }

    @Override
    protected final void createComponent() {
      super.createComponent();

      GridBagLayout layout = new GridBagLayout();
      JPanel pagePanel = new JPanel(layout);
      Insets insets = new Insets(0, 0, 0, 0);
      GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1., 1., GridBagConstraints.FIRST_LINE_START, GridBagConstraints.BOTH, insets, 0, 0);

      final JPanel infoHolder = new JPanel(new BorderLayout());
      infoHolder.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

      JTextPane info = new JTextPane();
      info.setContentType("text/html");
      info.setText("Some models in this project are stored in the persistence version that is no longer supported." +
          "<br><br>" +
          "You have to manually upgrade persistence of these models using a previous version of MPS." +
          "<br><br>" +
          "The migration cannot proceed.");
      info.setEditable(false);
      info.setFocusable(false);
      info.setBorder(BorderFactory.createLoweredBevelBorder());
      info.setPreferredSize(new Dimension(300, 220));

      infoHolder.add(info, BorderLayout.CENTER);

      pagePanel.add(infoHolder);
      layout.setConstraints(infoHolder, gbc);

      gbc.gridy++;
      gbc.anchor = GridBagConstraints.LAST_LINE_START;
      gbc.weightx = 0.;

      myList = new JBList(getModelPaths());

      JPanel listPanel = new JPanel(new BorderLayout(5, 5)) {
        @Override
        public Dimension getPreferredSize() {
          Dimension preferredSize = super.getPreferredSize();
          return new Dimension(infoHolder.getPreferredSize().width, preferredSize.height);
        }
      };
      listPanel.setBorder(BorderFactory.createCompoundBorder(
          BorderFactory.createEmptyBorder(2, 2, 2, 2),
          BorderFactory.createEtchedBorder()));
      listPanel.add(new JBScrollPane(myList), BorderLayout.CENTER);

      pagePanel.add(listPanel);
      layout.setConstraints(listPanel, gbc);

      myComponent.add(pagePanel, BorderLayout.CENTER);
    }

    @Override
    public Object getNextStepId() {
      // cannot proceed
      return null;
    }

    @Override
    public boolean isComplete() {
      return true;
    }

    private List<String> getModelPaths() {
      return new ModelPersistenceDetector(myProject).getModelsWhichNeedUpgrade();
    }
  }

  private static class MigrationsActionsStep extends MyStep {

    private JBList myList;
    private JButton myIncludeBtn;
    private JButton myExcludeBtn;
    private JButton mySelectAllBtn;
    private JButton myInvertBtn;
    private final Set<Object> myExcludedActions = Collections.synchronizedSet(new HashSet<Object>());
    private final Set<Object> myAllActions = Collections.synchronizedSet(new HashSet<Object>());

    public MigrationsActionsStep(Project project) {
      super(project, "Select Migration Actions", "actionsList");
      createComponent();

    }

    protected final void createComponent() {
      super.createComponent();
      MigrationProcessor processor = myProject.getComponent(MigrationProcessor.class);
      myAllActions.addAll(processor.getActions());
      myExcludedActions.addAll(processor.getActions());
      myExcludedActions.removeAll(processor.getSelectedActions());

      JLabel label = new JLabel("Select actions to be included in the migration process:");
      myComponent.add(label, BorderLayout.NORTH);

      myList = new JBList(processor.getActions());
      myList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
          updateButtons();
        }
      });
      myList.setCellRenderer(new MyListCellRenderer(myExcludedActions, Collections.emptySet(), Collections.emptySet()));

      JPanel listPanel = new JPanel(new BorderLayout(5, 5));
      listPanel.setBorder(BorderFactory.createCompoundBorder(
          BorderFactory.createEmptyBorder(2, 0, 0, 0),
          BorderFactory.createEtchedBorder()));
      listPanel.add(new JBScrollPane(myList), BorderLayout.CENTER);

      JPanel buttonsPanel = createButtonsPanel();
      listPanel.add(buttonsPanel, BorderLayout.EAST);

      myComponent.add(listPanel, BorderLayout.CENTER);
    }

    private JPanel createButtonsPanel() {
      GridBagLayout layout = new GridBagLayout();
      JPanel buttonsPanel = new JPanel(layout);

      Insets insets = new Insets(2, 2, 2, 2);
      GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1., 0., GridBagConstraints.FIRST_LINE_START, GridBagConstraints.HORIZONTAL, insets, 0,
          0);

      myIncludeBtn = new JButton("Include");
      myIncludeBtn.setMnemonic('I');
      myIncludeBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          handleInclude();
        }
      });
      buttonsPanel.add(myIncludeBtn);
      layout.setConstraints(myIncludeBtn, gbc);

      gbc.gridy++;
      gbc.anchor = GridBagConstraints.LINE_START;
      myExcludeBtn = new JButton("Exclude");
      myExcludeBtn.setMnemonic('x');
      myExcludeBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          handleExclude();
        }
      });
      buttonsPanel.add(myExcludeBtn);
      layout.setConstraints(myExcludeBtn, gbc);

      gbc.gridy++;
      gbc.weighty = 1.;
      gbc.fill = GridBagConstraints.BOTH;
      JLabel emptyLabel = new JLabel("");
      buttonsPanel.add(emptyLabel);
      layout.setConstraints(emptyLabel, gbc);

      mySelectAllBtn = new JButton("Select All");
      mySelectAllBtn.setMnemonic('A');
      mySelectAllBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          handleSelectAll();
        }
      });
      gbc.gridy++;
      gbc.weighty = 0.;
      gbc.fill = GridBagConstraints.HORIZONTAL;
      buttonsPanel.add(mySelectAllBtn);
      layout.setConstraints(mySelectAllBtn, gbc);

      myInvertBtn = new JButton("Invert Selection");
      myInvertBtn.setMnemonic('v');
      myInvertBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          handleInvertSelection();
        }
      });
      gbc.gridy++;
      buttonsPanel.add(myInvertBtn);
      gbc.anchor = GridBagConstraints.LAST_LINE_START;
      layout.setConstraints(myInvertBtn, gbc);
      return buttonsPanel;
    }

    private void handleInvertSelection() {
      int[] selectedIndices = myList.getSelectedIndices();
      int[] newSelectedIndices = new int[myList.getModel().getSize() - selectedIndices.length];
      for (int i = 0, j = 0; i < myList.getModel().getSize(); i++) {
        if (Arrays.binarySearch(selectedIndices, i) < 0) {
          newSelectedIndices[j++] = i;
        }
      }
      myList.setSelectedIndices(newSelectedIndices);
      updateButtons();
    }

    private void handleSelectAll() {
      if (myList.getModel().getSize() > 0) {
        myList.getSelectionModel().setSelectionInterval(0, myList.getModel().getSize() - 1);
        updateButtons();
      }
    }

    private void handleExclude() {
      List<Object> selectedValues = Arrays.asList(myList.getSelectedValues());
      myExcludedActions.addAll(selectedValues);
      updateList();
      updateButtons();
      fireStateChanged();
    }

    private void handleInclude() {
      List<Object> selectedValues = Arrays.asList(myList.getSelectedValues());
      myExcludedActions.removeAll(selectedValues);
      updateList();
      updateButtons();
      fireStateChanged();
    }

    private void updateButtons() {
      List<Object> selectedValues = Arrays.asList(myList.getSelectedValues());
      if (selectedValues.isEmpty()) {
        myIncludeBtn.setEnabled(false);
        myExcludeBtn.setEnabled(false);
      }
      boolean anyExcluded = false;
      for (Object selectedValue : selectedValues) {
        anyExcluded |= myExcludedActions.contains(selectedValue);
      }
      if (!anyExcluded) {
        myIncludeBtn.setEnabled(false);
        myExcludeBtn.setEnabled(true);
      } else if (myExcludedActions.containsAll(selectedValues)) {
        myIncludeBtn.setEnabled(true);
        myExcludeBtn.setEnabled(false);
      } else {
        myIncludeBtn.setEnabled(true);
        myExcludeBtn.setEnabled(true);
      }
    }

    private void updateList() {
      myList.repaint();
    }

    @Override
    public boolean isComplete() {
      return !myAllActions.isEmpty() && !myExcludedActions.containsAll(myAllActions);
    }

    @Override
    public void _init() {
      super._init();
      updateButtons();
    }

    @Override
    public Object getPreviousStepId() {
      return super.getSkipPreviousStepId();
    }

    @Override
    public void commit(CommitType commitType) throws CommitStepException {
      if (CommitType.Next == commitType) {
        if (myAllActions.isEmpty()) throw new CommitStepException("No actions available");
        if (myExcludedActions.containsAll(myAllActions)) throw new CommitStepException("No actions selected");
        MigrationProcessor processor = myProject.getComponent(MigrationProcessor.class);
        List<?> actions = new ArrayList<Object>(processor.getActions());
        actions.removeAll(myExcludedActions);
        processor.setSelectedActions(actions);
      }
    }
  }

  private static class MigrationsProgressStep extends MyStep {

    private boolean myStarted;
    private boolean myFinished;
    private boolean myDoneAny;
    private final Task myTask;
    private InlineProgressIndicator myProgressIndicator;
    private final Set<Object> myMarked = Collections.synchronizedSet(new HashSet<Object>());
    ;
    private final Set<Object> myExcluded = Collections.synchronizedSet(new HashSet<Object>());
    private final Set<Object> myFailed = Collections.synchronizedSet(new HashSet<Object>());
    private JBList myList;

    public MigrationsProgressStep(Project project) {
      super(project, "Migration In Progress", "progress");
      myTask = createTask();
      myProgressIndicator = new InlineProgressIndicator(true, myTask) {
        @Override
        protected boolean isFinished() {
          return myFinished;
        }
      };
      createComponent();
    }

    @Override
    protected final void createComponent() {
      super.createComponent();
      MigrationProcessor processor = myProject.getComponent(MigrationProcessor.class);

      myComponent.add(new JLabel("Applying migration actions:"), BorderLayout.NORTH);

      myList = new JBList(processor.getActions());
      myList.setCellRenderer(new MyListCellRenderer(myExcluded, myMarked, myFailed));

      JPanel listPanel = new JPanel(new BorderLayout(5, 5));
      listPanel.setBorder(BorderFactory.createCompoundBorder(
          BorderFactory.createEmptyBorder(0, 0, 2, 0),
          BorderFactory.createEtchedBorder()));
      listPanel.add(new JBScrollPane(myList), BorderLayout.CENTER);

      myComponent.add(listPanel, BorderLayout.CENTER);

      myComponent.add(myProgressIndicator.getComponent(), BorderLayout.SOUTH);
    }

    private Task createTask() {
      return new Modal(myProject, "Executing", false) {
        @Override
        public void run(final ProgressIndicator indicator) {
          final MigrationProcessor processor = myProject.getComponent(MigrationProcessor.class);
          final List<?> actions = processor.getActions();
          myExcluded.addAll(actions);
          myExcluded.removeAll(processor.getSelectedActions());

          //disable fast find usages
          final Set<FindUsagesParticipant> participants = new HashSet<FindUsagesParticipant>();
          participants.addAll(PersistenceRegistry.getInstance().getFindUsagesParticipants());
          for (FindUsagesParticipant p:participants){
            PersistenceRegistry.getInstance().removeFindUsagesParticipant(p);
          }

          processor.addCallback(new Callback() {
            @Override
            public void startingAction(Object action) {
              myDoneAny = true;
              indicator.setIndeterminate(false);
              indicator.setFraction(0.0);
              myList.ensureIndexIsVisible(actions.indexOf(action));
              myList.repaint();
            }

            @Override
            public void finishedAction(Object action) {
              myMarked.add(action);
              advance(action);
            }

            @Override
            public void failedAction(Object action) {
              myFailed.add(action);
              advance(action);
            }

            @Override
            public void finishedAll() {
              myFinished = true;
              processor.removeCallback(this);
              indicator.setFraction(1.0);
              indicator.setText("Done");

              //enable fast find usages
              for (FindUsagesParticipant p:participants){
                PersistenceRegistry.getInstance().addFindUsagesParticipant(p);
              }
              fireStateChanged();
            }

            private void advance(Object action) {
              indicator.setFraction((double) (actions.indexOf(action) + 1) / actions.size());
              myList.ensureIndexIsVisible(actions.indexOf(action));
              myList.repaint();
            }
          });
          processor.startProcessing(SwingUtilities.getRootPane(getComponent()));
        }
      };
    }

    @Override
    public void onAfterUpdate() {
      SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
          if (!myStarted) {
            // launch migration
            MPSProjectMigrationComponentImpl migrationState = (MPSProjectMigrationComponentImpl) myProject.getComponent(MPSProjectMigrationComponent.class);
            migrationState.migrationStarted();
            myStarted = true;
            runProcessWithProgressSynchronously(myTask, myProgressIndicator);
          }
        }
      });
    }

    private void runProcessWithProgressSynchronously(final Task task, final ProgressIndicator progressIndicator) {
      ApplicationManager.getApplication().executeOnPooledThread(new Runnable() {
        public void run() {
          ProgressManager.getInstance().runProcess(new Runnable() {
            @Override
            public void run() {
              task.run(progressIndicator);

            }
          }, progressIndicator);
        }
      });
    }

    @Override
    public Object getPreviousStepId() {
      // can't go back now
      return null;
    }

    @Override
    public Object getNextStepId() {
      return myFailed.isEmpty() ? super.getNextStepId() : super.getSkipNextStepId();
    }

    @Override
    public boolean isComplete() {
      return myStarted && myFinished && myDoneAny;
    }

    @Override
    public boolean isPostComplete() {
      return myStarted && myFinished && myDoneAny;
    }

    @Override
    public void commit(CommitType commitType) throws CommitStepException {
      if (CommitType.Next == commitType || CommitType.Finish == commitType) {
        if (!myDoneAny) throw new CommitStepException("Nothing done");
      }
    }
  }

  private static class MigrationsFinishedStep extends MyStep {

    public MigrationsFinishedStep(Project project) {
      super(project, "Migration Finished", "finished");
      createComponent();
    }

    @Override
    protected final void createComponent() {
      super.createComponent();

      JPanel infoHolder = new JPanel(new BorderLayout());
      infoHolder.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

      JTextPane info = new JTextPane();
      info.setContentType("text/html");
      info.setText("Congratulations! Migration has completed successfully." +
          "<br><br>" +
          "Your project files have been upgraded to be used with the latest version of MPS." +
          "<br><br>" +
          "The wizard can now be closed and your project will be loaded."
      );
      info.setEditable(false);
      info.addHyperlinkListener(new HyperlinkListener() {
        public void hyperlinkUpdate(HyperlinkEvent e) {
          if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            BrowserUtil.launchBrowser(e.getURL().toString());
          }
        }
      });
      info.setFocusable(false);
      info.setBorder(BorderFactory.createLoweredBevelBorder());
      info.setPreferredSize(new Dimension(300, 220));

      infoHolder.add(info, BorderLayout.CENTER);

      myComponent.add(infoHolder, BorderLayout.CENTER);
    }

    @Override
    public Object getPreviousStepId() {
      // too late for that
      return null;
    }

    @Override
    public Object getNextStepId() {
      // next step is the error report
      return null;
    }

    @Override
    public boolean isComplete() {
      return true;
    }

  }

  private static class MigrationsFinishedWithErrorsStep extends MyStep {

    public MigrationsFinishedWithErrorsStep(Project project) {
      super(project, "Migration Finished With Errors", "finishedWithErrors");
      createComponent();
    }

    @Override
    protected final void createComponent() {
      super.createComponent();

      JPanel infoHolder = new JPanel(new BorderLayout());
      infoHolder.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

      JTextPane info = new JTextPane();
      info.setContentType("text/html");
      info.setText("Warning! Although migration has completed, there were some errors during the process. Please review the errors log." +
          "<br><br>" +
          "Your project files have been upgraded to be used with the latest version of MPS." +
          "<br><br>" +
          "The wizard can now be closed and your project will be loaded."
      );
      info.setEditable(false);
      info.addHyperlinkListener(new HyperlinkListener() {
        public void hyperlinkUpdate(HyperlinkEvent e) {
          if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            BrowserUtil.launchBrowser(e.getURL().toString());
          }
        }
      });
      info.setFocusable(false);
      info.setBorder(BorderFactory.createLoweredBevelBorder());
      info.setPreferredSize(new Dimension(300, 220));

      infoHolder.add(info, BorderLayout.CENTER);

      myComponent.add(infoHolder, BorderLayout.CENTER);
    }

    @Override
    public Object getPreviousStepId() {
      // too late for that
      return null;
    }

    @Override
    public boolean isComplete() {
      return true;
    }

  }

  private static class MyListCellRenderer extends DefaultListCellRenderer {

    private Font myErrorFont;
    private Font myStrikeFont;
    private Font myOriginalFont;
    private final Set<?> myExcluded;
    private final Set<?> myMarked;
    private final Set<?> myFailed;
    private static final Pattern ACTION_PRESENTATION = Pattern.compile("(.*).*\\(.*\\)");

    public MyListCellRenderer(Set<?> excluded, Set<?> marked, Set<?> failed) {
      myExcluded = excluded;
      myMarked = marked;
      myFailed = failed;
    }

    @Override
    public void setText(String text) {
      Matcher matcher = ACTION_PRESENTATION.matcher(text);
      if (matcher.matches()) {
        text = matcher.group(1);
      }
      super.setText(text);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean iss, boolean chf) {
      super.getListCellRendererComponent(list, value, index, iss, chf);
      if (myExcluded.contains(value)) {
        setIcon(EXCLUDE_ICON);
        setEnabled(false);
        setFont(getStrikeFont());
      } else if (myMarked.contains(value)) {
        setIcon(CHECK_ICON);
        setEnabled(true);
        setFont(getOriginalFont());
      } else if (myFailed.contains(value)) {
        setIcon(ERROR_ICON);
        setEnabled(true);
        setFont(getErrorFont());
      } else {
        setIcon(EMPTY_ICON);
        setEnabled(true);
        setFont(getOriginalFont());
      }
      return this;
    }

    private Font getStrikeFont() {
      if (myStrikeFont == null) {
        Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>(getFont().getAttributes());
        attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
        myStrikeFont = getOriginalFont().deriveFont(attributes);
      }
      return myStrikeFont;
    }

    private Font getErrorFont() {
      if (myErrorFont == null) {
        Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>(getFont().getAttributes());
        attributes.put(TextAttribute.FOREGROUND, Color.RED);
        myErrorFont = getOriginalFont().deriveFont(attributes);
      }
      return myErrorFont;
    }

    private Font getOriginalFont() {
      if (myOriginalFont == null) {
        this.myOriginalFont = getFont();
      }
      return myOriginalFont;
    }
  }

  private static class ModelPersistenceDetector {

    private final Project myProject;

    public ModelPersistenceDetector(Project project) {
      myProject = project;
    }

    public boolean hasModelsInOldPersistence() {
      return getModelsWhichNeedUpgrade().size() > 0;
    }

    public List<String> getModelsWhichNeedUpgrade() {
      final List<String> result = new ArrayList<String>();
      final MPSProject mpsProject = myProject.getComponent(MPSProject.class);
      ModelAccess.instance().runReadAction(new Runnable() {
        @Override
        public void run() {
          for (SModule module : mpsProject.getModulesWithGenerators()) {
            for (SModel model : module.getModels()) {
              if (!(model instanceof EditableSModel)) {
                continue;
              }
              DataSource source = model.getSource();
              if (!(source instanceof FileDataSource)) {
                continue;
              }
              FileDataSource fileSource = (FileDataSource) source;
              if (!(model.getModelRoot() instanceof DefaultModelRoot) || fileSource.isReadOnly()) {
                continue;
              }

              String ext = FileUtil.getExtension(fileSource.getFile().getName());
              ModelFactory factory = PersistenceFacade.getInstance().getModelFactory(ext);
              try {
                if (factory != null && factory.needsUpgrade(fileSource)) {
                  result.add(fileSource.getFile().getPath());
                }
              } catch (IOException ex) {
                LOG.error(ex);
              }
            }
          }
        }
      });
      return result;
    }

  }
}
