package jetbrains.mps.lang.editor.table.runtime;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;

public class HierarchycalTableModel extends AbstractTableModel {
  private SNode myTableNode;
  private SNode myRowsLinkDeclaration;
  private SNode myColumnsLinkDeclaration;
  private int myColumnCount;
  private int myRowCount;

  public HierarchycalTableModel(@NotNull SNode tableNode, @NotNull SNode rowsLinkDeclaration, @NotNull SNode cellsLinkDeclaration) {
    myTableNode = tableNode;
    myRowsLinkDeclaration = rowsLinkDeclaration;
    assert ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(SNodeOperations.getConceptDeclaration(myTableNode))).contains(myRowsLinkDeclaration);
    myColumnsLinkDeclaration = cellsLinkDeclaration;
    assert ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(SLinkOperations.getTarget(myRowsLinkDeclaration, "target", false))).contains(myColumnsLinkDeclaration);
    myRowCount = ListSequence.fromList(getRows()).count();
    myColumnCount = ListSequence.fromList(getColumns(ListSequence.fromList(getRows()).first())).count();
    for (SNode row : ListSequence.fromList(getRows())) {
      assert myColumnCount == (int) ListSequence.fromList(getColumns(row)).count();
    }
  }

  @Override
  public SNode getValueAt(int row, int column) {
    assert row >= 0;
    assert column >= 0;
    return ListSequence.fromList(getColumns(ListSequence.fromList(getRows()).getElement(row))).getElement(column);
  }

  @Override
  public int getRowCount() {
    return myRowCount;
  }

  @Override
  public int getColumnCount() {
    return myColumnCount;
  }

  @Override
  public void deleteRow(int rowNumber) {
    deleteElementAt(getRows(), rowNumber);
  }

  @Override
  public void insertRow(int rowNumber) {
    SNode newRow = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(SLinkOperations.getTarget(myRowsLinkDeclaration, "target", false)), null);
    for (int i = 0; i < getColumnCount(); i++) {
      newRow.addChild(SPropertyOperations.getString(myColumnsLinkDeclaration, "role"), SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(SLinkOperations.getTarget(myColumnsLinkDeclaration, "target", false)), null));
    }
    Utils.insertElementAt(getRows(), newRow, rowNumber);
  }

  @Override
  public void deleteColumn(int columnNumber) {
    for (SNode row : ListSequence.fromList(getRows())) {
      deleteElementAt(getColumns(row), columnNumber);
    }
  }

  @Override
  public void insertColumn(int columnNumber) {
    for (SNode row : ListSequence.fromList(getRows())) {
      SNode newColumn = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(SLinkOperations.getTarget(myColumnsLinkDeclaration, "target", false)), null);
      Utils.insertElementAt(getColumns(row), newColumn, columnNumber);
    }
  }

  protected SNode getTableNode() {
    return myTableNode;
  }

  protected void deleteElementAt(List<SNode> list, int index) {
    assert index >= 0 && index < ListSequence.fromList(list).count();
    ListSequence.fromList(list).removeElementAt(index);
  }

  private List<SNode> getRows() {
    return SNodeOperations.getChildren(myTableNode, myRowsLinkDeclaration);
  }

  private List<SNode> getColumns(SNode row) {
    return SNodeOperations.getChildren(row, myColumnsLinkDeclaration);
  }
}
