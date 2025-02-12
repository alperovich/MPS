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
package jetbrains.mps.persistence.binary;

import jetbrains.mps.extapi.model.PersistenceProblem;
import jetbrains.mps.smodel.InvalidSModel;
import jetbrains.mps.smodel.LazySModel;
import jetbrains.mps.smodel.SModel;
import org.jetbrains.mps.openapi.model.SModel.Problem.Kind;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.smodel.persistence.def.ModelReadException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SModel.Problem;

import java.util.Collections;

/**
 * evgeny, 11/21/12
 */
public class BinarySModel extends LazySModel {
  private final BinaryModelHeader header;
  private boolean fullLoadUpdateMode;

  public BinarySModel(@NotNull BinaryModelHeader header) {
    super(header.getReference());
    this.header = header;
  }

  public BinaryModelHeader getHeader() {
    return header;
  }

  @Override
  public int getVersion() {
    return header.getVersion();
  }

  @Override
  public void setVersion(int version) {
    header.setVersion(version);
  }

  @Override
  public SModel createEmptyCopy() {
    return new BinarySModel(new BinaryModelHeader(getReference()));
  }

  public void setUpdateMode(boolean value) {
    // update mode means we are attaching newly loaded children
    this.fullLoadUpdateMode = value;
  }

  @Override
  public boolean isUpdateMode() {
    return fullLoadUpdateMode;
  }

  public static class InvalidBinarySModel extends BinarySModel implements InvalidSModel {

    @Nullable
    private final ModelReadException myCause;

    @Override
    public SModel createEmptyCopy() {
      throw new UnsupportedOperationException("not supported");
    }

    public InvalidBinarySModel(@NotNull SModelReference modelReference, @Nullable ModelReadException cause) {
      super(new BinaryModelHeader(modelReference));
      myCause = cause;
    }

    @NotNull
    @Override
    public Iterable<Problem> getProblems() {
      return Collections.<Problem>singleton(
        new PersistenceProblem(Kind.Load, myCause == null ? "Couldn't read model." : myCause.getMessageEx(), null, true));
    }
  }
}
