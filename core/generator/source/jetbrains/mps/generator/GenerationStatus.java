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
package jetbrains.mps.generator;

import jetbrains.mps.make.java.ModelDependencies;
import jetbrains.mps.generator.impl.dependencies.GenerationDependencies;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.traceInfo.DebugInfo;
import jetbrains.mps.util.Status;
import org.jetbrains.annotations.Nullable;

/**
 * Igor Alshannikov
 * Oct 24, 2005
 */
public class GenerationStatus extends Status {
  private SModel myOutputModel;
  private SModel myInputModel;
  private boolean myCanceled;
  private boolean myWarnings;
  private DebugInfo myDebugInfo;
  private GenerationDependencies myDependencies;
  private ModelDependencies myBLDependencies;

  private SModel myOriginalInputModel;

  public GenerationStatus(SModel inputModel, SModel outputModel, GenerationDependencies dependencies, boolean errors, boolean warnings, boolean canceled) {
    super(errors ? Code.ERROR : Code.OK, null);
    myCanceled = canceled;
    myOutputModel = outputModel;
    myInputModel = inputModel;
    myWarnings = warnings;
    myDependencies = dependencies;
  }

  @Override
  public boolean isOk() {
    return !myCanceled && super.isOk();
  }

  public boolean isCanceled() {
    return myCanceled;
  }

  public boolean hasWarnings() {
    return myWarnings;
  }

  @Nullable
  public SModel getOutputModel() {
    return myOutputModel != null ? myOutputModel : null;
  }

  public SModel getInputModel() {
    return myInputModel != null ? myInputModel : null;
  }

  public SModel getOutputModelDescriptor () {
    return myOutputModel;
  }

  public SModel getInputModelDescriptor () {
    return myInputModel;
  }

  public DebugInfo getDebugInfo() {
    return myDebugInfo;
  }

  public void setDebugInfo(DebugInfo debugInfo) {
    myDebugInfo = debugInfo;
  }

  public ModelDependencies getBLDependencies() {
    return myBLDependencies;
  }

  public GenerationDependencies getDependencies() {
    return myDependencies;
  }

  public void setBLDependencies(ModelDependencies dependencies) {
    myBLDependencies = dependencies;
  }

  public SModel getOriginalInputModel() {
    return myOriginalInputModel;
  }

  public void setOriginalInputModel(org.jetbrains.mps.openapi.model.SModel originalInputModel) {
    myOriginalInputModel = originalInputModel;
  }

  public static class ERROR extends GenerationStatus {
    public ERROR(SModel inputModel) {
      super(inputModel, null, null, true, false, false);
    }
  }
}
