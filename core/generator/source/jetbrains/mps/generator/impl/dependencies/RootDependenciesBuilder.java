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
package jetbrains.mps.generator.impl.dependencies;

import jetbrains.mps.generator.TransientModelsModule;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Evgeny Gryaznov, May 11, 2010
 */
public class RootDependenciesBuilder implements DependenciesReadListener {

  private final SNode myOriginalRoot;
  private final IncrementalDependenciesBuilder myBuilder;
  private final String myHash;
  private boolean isUnchanged;

  private boolean dependsOnModelNodes = false;
  private boolean dependsOnConditionals = false;
  private Set<SNode> dependsOn = new HashSet<SNode>();
  private Set<SModel> dependsOnModels = new HashSet<SModel>();
  private GenerationRootDependencies mySavedDependencies;

  public RootDependenciesBuilder(@Nullable SNode originalRoot, @NotNull IncrementalDependenciesBuilder builder, @Nullable String hash) {
    myOriginalRoot = originalRoot;
    myBuilder = builder;
    myHash = hash;
    isUnchanged = false;
  }

  private void addNodeAccess(SNode node) {
    SNode root = myBuilder.currentToOriginalMap.get(node);
    if (root == null) {
      dependsOnConditionals = true;
      return;
    }
    if (root == myOriginalRoot) {
      return;
    }
    dependsOn.add(root);
  }

  private void addOriginalNodeAccess(SNode root) {
    if (root == myOriginalRoot || root.getModel() != myBuilder.originalInputModel || !(root.getModel() != null && root.getParent() == null)) {
      return;
    }
    dependsOn.add(root);
  }


  private void addOutputNodeAccess(SNode node) {
    if (myBuilder.nextStepToOriginalMap == null || myBuilder.currentOutputModel == null) {
      return;
    }
    SNode root = myBuilder.nextStepToOriginalMap.get(node);
    if (root == null) {
      dependsOnConditionals = true;
      return;
    }
    if (root == myOriginalRoot) {
      return;
    }
    dependsOn.add(root);
  }

  private void addModelAccess(SModel model) {
    if (model == null || model .getModule() instanceof TransientModelsModule || model == myBuilder.currentInputModel || model == myBuilder.originalInputModel) {
      return;
    }
    final SModel modelDescriptor = model;
    if (modelDescriptor != null) {
      dependsOnModels.add(modelDescriptor);
      myBuilder.reportModelAccess(modelDescriptor, myOriginalRoot);
    }
  }

  @Override
  public void readNode(SNode node) {
    if (node.getModel() != null) {
      if (node.getModel() == myBuilder.currentInputModel) {
        addNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.currentOutputModel) {
        addOutputNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.originalInputModel) {
        addOriginalNodeAccess(node.getContainingRoot());
      } else {
        addModelAccess(node.getModel());
      }
    }
  }

  @Override
  public void nodeChildReadAccess(SNode node, String childRole, SNode child) {
    if (node.getModel() != null) {
      if (node.getModel() == myBuilder.currentInputModel) {
        addNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.currentOutputModel) {
        addOutputNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.originalInputModel) {
        addOriginalNodeAccess(node.getContainingRoot());
      } else {
        addModelAccess(node.getModel());
      }
    }
  }

  @Override
  public void nodePropertyReadAccess(SNode node, String propertyName, String value) {
    if (node.getModel() != null) {
      if (node.getModel() == myBuilder.currentInputModel) {
        addNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.currentOutputModel) {
        addOutputNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.originalInputModel) {
        addOriginalNodeAccess(node.getContainingRoot());
      } else {
        addModelAccess(node.getModel());
      }
    }
  }

  @Override
  public void propertyExistenceAccess(SNode node, String propertyName) {
    if (node.getModel() != null) {
      if (node.getModel() == myBuilder.currentInputModel) {
        addNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.currentOutputModel) {
        addOutputNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.originalInputModel) {
        addOriginalNodeAccess(node.getContainingRoot());
      } else {
        addModelAccess(node.getModel());
      }
    }
  }

  @Override
  public void propertyDirtyReadAccess(SNode node, String propertyName) {
    if (node.getModel() != null) {
      if (node.getModel() == myBuilder.currentInputModel) {
        addNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.currentOutputModel) {
        addOutputNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.originalInputModel) {
        addOriginalNodeAccess(node.getContainingRoot());
      } else {
        addModelAccess(node.getModel());
      }
    }
  }

  @Override
  public void propertyCleanReadAccess(SNode node, String propertyName) {
    if (node.getModel() != null) {
      if (node.getModel() == myBuilder.currentInputModel) {
        addNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.currentOutputModel) {
        addOutputNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.originalInputModel) {
        addOriginalNodeAccess(node.getContainingRoot());
      } else {
        addModelAccess(node.getModel());
      }
    }
  }

  @Override
  public void nodeReferentReadAccess(SNode node, String referentRole, SNode referent) {
    if (node.getModel() != null) {
      if (node.getModel() == myBuilder.currentInputModel) {
        addNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.currentOutputModel) {
        addOutputNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.originalInputModel) {
        addOriginalNodeAccess(node.getContainingRoot());
      } else {
        addModelAccess(node.getModel());
      }
    }

    // FIXME read referent?
  }

  @Override
  public void nodeUnclassifiedReadAccess(SNode node) {
    if (node.getModel() != null) {
      if (node.getModel() == myBuilder.currentInputModel) {
        addNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.currentOutputModel) {
        addOutputNodeAccess(node.getContainingRoot());
      } else if (node.getModel() == myBuilder.originalInputModel) {
        addOriginalNodeAccess(node.getContainingRoot());
      } else {
        addModelAccess(node.getModel());
      }
    }
  }

  @Override
  public void modelNodesReadAccess(SModel model) {
    if (model == myBuilder.currentInputModel || model == myBuilder.currentOutputModel || model == myBuilder.originalInputModel) {
      dependsOnModelNodes = true;
    } else if (model == myBuilder.currentOutputModel) {
      dependsOnModelNodes = true;
    } else {
      addModelAccess(model);
    }
  }

  @Nullable
  public SNode getOriginalRoot() {
    return myOriginalRoot;
  }

  public String getHash() {
    return myHash;
  }

  public Collection<SNode> getDependsOn() {
    return Collections.unmodifiableSet(dependsOn);
  }

  public Collection<SModel> getDependsOnModels() {
    return Collections.unmodifiableSet(dependsOnModels);
  }

  public boolean isDependsOnConditionals() {
    return dependsOnConditionals && myOriginalRoot != null;
  }

  public boolean isDependsOnModelNodes() {
    return dependsOnModelNodes;
  }

  public boolean isUnchanged() {
    return isUnchanged;
  }

  public void loadDependencies(GenerationRootDependencies previous) {
    mySavedDependencies = previous;
    isUnchanged = true;
  }

  public GenerationRootDependencies getSavedDependencies() {
    return mySavedDependencies;
  }
}
