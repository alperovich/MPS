package jetbrains.mps.workbench.dialogs.project.components.parts.descriptors;

/*Generated by MPS */

import jetbrains.mps.ide.ui.dialogs.properties.descriptors.VoidColumnDescriptor;
import jetbrains.mps.workbench.dialogs.project.IBindedDialog;
import javax.swing.table.TableCellRenderer;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.ModuleRenderer;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.ListRendererAdapter;

public class DepDescriptor extends VoidColumnDescriptor {
  private final IBindedDialog myOwner;

  public DepDescriptor(IBindedDialog owner, String name, String header, int width) {
    super(name, header, width);
    myOwner = owner;
  }

  @Override
  public TableCellRenderer createRenderer() {
    ModuleRenderer renderer = new ModuleRenderer(myOwner.getModuleScope(), myOwner.getProjectScope());
    return new ListRendererAdapter(renderer);
  }
}
