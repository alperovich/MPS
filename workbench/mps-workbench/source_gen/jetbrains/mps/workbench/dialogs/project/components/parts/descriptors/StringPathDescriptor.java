package jetbrains.mps.workbench.dialogs.project.components.parts.descriptors;

/*Generated by MPS */

import jetbrains.mps.ide.ui.dialogs.properties.descriptors.VoidColumnDescriptor;
import javax.swing.table.TableCellRenderer;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.ListRendererAdapter;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.StringPathRenderer;

public class StringPathDescriptor extends VoidColumnDescriptor {
  public StringPathDescriptor(String name, String header, int width) {
    super(name, header, width);
  }

  @Override
  public TableCellRenderer createRenderer() {
    return new ListRendererAdapter(new StringPathRenderer());
  }
}
