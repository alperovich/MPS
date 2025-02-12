package jetbrains.mps.ide.actions;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;
import jetbrains.mps.ide.findusages.view.UsagesView;
import jetbrains.mps.project.Project;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import jetbrains.mps.plugins.tool.BaseGeneratedTool;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.ViewOptions;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResults;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.INodeRepresentator;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.ide.findusages.view.treeholder.tree.TextOptions;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.ide.icons.IdeIcons;
import java.util.List;
import jetbrains.mps.ide.findusages.model.CategoryKind;
import java.util.Arrays;
import org.jdom.Element;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;

public class TodoViewer extends JPanel {
  public static final Icon TODO_ICON = AllIcons.Toolwindows.ToolWindowTodo;
  private UsagesView myUsagesView;
  private Project myProject;
  private TodoViewer_Tool myTool;

  public TodoViewer(final Project project, TodoViewer_Tool tool) {
    this.myTool = tool;
    myProject = project;
    setLayout(new BorderLayout());
    final JLabel label = new JLabel("Click to find TODOs", SwingConstants.CENTER);
    add(label, BorderLayout.CENTER);
    addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        removeMouseListener(this);
        remove(label);
        refresh();
      }
    });
  }

  public void dispose() {
    if (myUsagesView != null) {
      myUsagesView.dispose();
    }
  }

  private BaseGeneratedTool getTool() {
    return this.myTool;
  }

  private Project getProject() {
    return myProject;
  }

  private void refresh() {
    assert ThreadUtils.isEventDispatchThread() : "must be called from EDT only";
    removeAll();
    ViewOptions viewOptions = new ViewOptions(true, false, false, false, false);
    com.intellij.openapi.project.Project project = ProjectHelper.toIdeaProject(getProject());
    myUsagesView = new UsagesView(project, viewOptions) {
      @Override
      public void close() {
        getTool().makeUnavailableLater();
      }
    };
    add(myUsagesView.getComponent(), BorderLayout.CENTER);
    myUsagesView.setRunOptions(FindUtils.makeProvider(new TodoFinder()), new SearchQuery(myProject.getScope()), new UsagesView.ButtonConfiguration(true), new SearchResults());
    myUsagesView.setCustomNodeRepresentator(new TodoViewer.MyNodeRepresentator());
    ProgressManager.getInstance().run(new Task.Modal(project, "Searching", true) {
      @Override
      public void run(@NotNull final ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        myUsagesView.run(indicator);
        getTool().openToolLater(true);
      }
    });
  }

  public static class MyNodeRepresentator implements INodeRepresentator<SNode> {
    public MyNodeRepresentator() {
    }

    @NotNull
    @Override
    public String getPresentation(SNode node) {
      return "<font color=blue>" + SNodeAccessUtil.getProperty(node, "text") + "</font>";
    }

    @Override
    public String getResultsText(TextOptions options) {
      return "<strong>" + NameUtil.formatNumericalString(options.mySubresultsCount, "TODO item") + " found</strong>";
    }

    @Override
    public Icon getResultsIcon() {
      return TodoViewer.TODO_ICON;
    }

    @Override
    public String getCategoryText(TextOptions options, String category, boolean isResultsSection) {
      String counter = "";
      if (options.myCounters && isResultsSection) {
        int size = options.mySubresultsCount;
        counter = " (" + size + ")";
      }
      return "<strong>TODO items" + counter + "</strong>";
    }

    @Override
    public Icon getCategoryIcon(String category) {
      return IdeIcons.CLOSED_FOLDER;
    }

    @Override
    public List<CategoryKind> getCategoryKinds() {
      return Arrays.asList(CategoryKind.DEFAULT_CATEGORY_KIND);
    }

    @Override
    public void read(Element element, Project project) throws CantLoadSomethingException {
    }

    @Override
    public void write(Element element, Project project) throws CantSaveSomethingException {
    }
  }
}
