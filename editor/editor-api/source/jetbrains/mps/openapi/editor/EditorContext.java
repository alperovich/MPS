/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.openapi.editor;

import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.cells.EditorCellFactory;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.util.Computable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.module.SRepository;

import java.util.List;

/**
 * evgeny, 11/17/11
 */
public interface EditorContext {

  @NotNull
  SRepository getRepository();

  SNode getSelectedNode();

  List<SNode> getSelectedNodes();

  /**
   * same as selectWRTFocusPolicy(node, true);
   */
  void selectWRTFocusPolicy(SNode node);

  /**
   * Select one of available EditorCells representing passes SNode in the associated editor.
   * If multiple EditorCells are representing same SNode in this editor then most applicable
   * will be selected based on FocusPolicies specified on EditorCells.
   *
   * @param node  one of EditorCells representing this SNode should be selected
   * @param force change selection even if getSelectedNode() == node
   */
  void selectWRTFocusPolicy(SNode node, boolean force);

  void selectWRTFocusPolicy(EditorCell editorCell);

  void select(SNode node);

  void selectRange(SNode first, SNode last);

  /**
   * This method will be removed after MPS 3.0
   *
   * @deprecated Use SelectionManager methods or .select operation from EditorLanguage instead
   */
  @Deprecated
  void select(SNode node, String cellId);

  /**
   * This method will be removed after MPS 3.0
   *
   * @deprecated Use SelectionManager methods or .select operation from EditorLanguage instead
   */
  @Deprecated
  void selectBefore(SNode node);

  /**
   * This method will be removed after MPS 3.0
   *
   * @deprecated Use SelectionManager methods or .select operation from EditorLanguage instead
   */
  @Deprecated
  void selectAfter(SNode node);

  /**
   * This method will be removed after MPS 3.0
   *
   * @deprecated Use SelectionManager methods or .select operation from EditorLanguage instead
   */
  @Deprecated
  void selectAndSetCaret(SNode node, int position);

  EditorCell getSelectedCell();

  EditorCell getContextCell();

  EditorInspector getInspector();

  boolean isInspector();

  void openInspector();

  EditorComponent getEditorComponent();

  IOperationContext getOperationContext();

  void executeCommand(Runnable r);

  <T> T executeCommand(Computable<T> c);

  boolean isInsideCommand();

  void flushEvents();

  IScope getScope();

  SModel getModel();

  boolean isEditable();

  Object createMemento(boolean full);

  Object createMemento();

  boolean setMemento(Object o);

  EditorCell createNodeCell(SNode node);

  EditorCell createReferentCell(SNode sourceNode, SNode targetNode, String role);

  EditorCell createRoleAttributeCell(Class attributeKind, EditorCell cellWithRole, SNode roleAttribute);

  void runWithContextCell(EditorCell contextCell, Runnable r);

  <T> T runWithContextCell(EditorCell contextCell, Computable<T> r);

  EditorCellFactory getCellFactory();

  SelectionManager getSelectionManager();
}
