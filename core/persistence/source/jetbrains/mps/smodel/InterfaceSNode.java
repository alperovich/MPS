/*
 * Copyright 2003-2013 JetBrains s.r.o.
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
package jetbrains.mps.smodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

/**
 * evgeny, 5/2/13
 */
public class InterfaceSNode extends SNode {

  private Set<String> skippedRoles;

  public InterfaceSNode(@NotNull String conceptFqName) {
    super(conceptFqName);
  }

  @Override
  protected SNode firstChild() {
    if (skippedRoles != null) {
      enforceModelLoad();
    }
    return super.firstChild();
  }

  @Override
  protected SNode firstChildInRole(@NotNull String role) {
    if (skippedRoles != null && skippedRoles.contains(role)) {
      enforceModelLoad();
    }
    return super.firstChildInRole(role);
  }

  @Override
  public void insertChildBefore(String role, org.jetbrains.mps.openapi.model.SNode child, @Nullable final org.jetbrains.mps.openapi.model.SNode anchor) {
    if (skippedRoles != null) {
      enforceModelLoad();
    }
    super.insertChildBefore(role, child, anchor);
  }

  public void skipRole(String role) {
    if (myModel != null) {
      throw new IllegalStateException();
    }
    if (skippedRoles == null) {
      skippedRoles = new HashSet<String>();
    }
    skippedRoles.add(role);
  }

  public boolean hasSkippedChildren() {
    return skippedRoles != null;
  }

  public void cleanSkippedRoles() {
    if (myModel == null || !myModel.isUpdateMode()) {
      throw new IllegalStateException();
    }
    skippedRoles = null;
  }

  private void enforceModelLoad() {
    if (myModel == null) return;
    myModel.enforceFullLoad();
  }
}
