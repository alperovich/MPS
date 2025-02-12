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
package jetbrains.mps.smodel;

import jetbrains.mps.smodel.references.ImmatureReferences;
import jetbrains.mps.util.InternUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Igor Alshannikov
 * Sep 28, 2007
 */
public abstract class SReferenceBase extends SReference {

  protected volatile SNode myImmatureTargetNode;            // young
  private volatile SModelReference myTargetModelReference;  // mature

  protected SReferenceBase(String role, SNode sourceNode, @Nullable SModelReference targetModelReference,
      @Nullable SNode immatureTargetNode) {
    super(InternUtil.intern(role), sourceNode);

    // if ref is 'mature' then 'targetModelRefernce' is either NOT NULL, or it is broken external reference, or it is dynamic reference
    myTargetModelReference = targetModelReference;

    // 'young' reference
    if (immatureTargetNode != null) {
      ImmatureReferences.getInstance().add(this);
    }
    myImmatureTargetNode = immatureTargetNode;
  }

  @Override
  @Deprecated
  public boolean isExternal() {
    SModel m = getSourceNode().getModel();
    if (m == null) return true;

    return !(m.getReference().equals(getTargetSModelReference()));
  }

  @Override
  public SModelReference getTargetSModelReference() {
    SNode immatureNode = myImmatureTargetNode;
    if (immatureNode == null || makeIndirect()) return myTargetModelReference;
    SModel model = immatureNode.getModel();
    return model == null ? null : model.getReference();
  }

  @Override
  public synchronized void setTargetSModelReference(@NotNull SModelReference modelReference) {
    if (!makeIndirect()) makeMature(); // hack: make mature anyway: only can store ref to target model in 'mature' ref.
    myTargetModelReference = modelReference;
  }

  @Override
  public final boolean makeIndirect() {
    return makeIndirect(false);
  }

  @Override
  public void makeDirect() {
    myImmatureTargetNode = jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(this);
    if (myImmatureTargetNode != null) {
      ImmatureReferences.getInstance().add(this);
    }
  }

  public synchronized final boolean makeIndirect(boolean force) {
    if (myImmatureTargetNode != null) {
      SNode sourceNode = getSourceNode();
      if (
          !jetbrains.mps.util.SNodeOperations.isDisposed(sourceNode) &&
              !jetbrains.mps.util.SNodeOperations.isDisposed(myImmatureTargetNode) &&
              sourceNode.getModel() != null &&
              myImmatureTargetNode.getModel() != null) {
        // convert 'young' reference to 'mature'
        makeMature();
      }
      if (force && myImmatureTargetNode != null) {
        if (!jetbrains.mps.util.SNodeOperations.isDisposed(sourceNode) && sourceNode.getModel() != null) {
          error("Impossible to resolve immature reference",
              new ProblemDescription(myImmatureTargetNode.getReference(),
                  "ImmatureTargetNode(modelID: " +
                      (myImmatureTargetNode.getModel() == null ? "null" : myImmatureTargetNode.getModel().toString()) +
                      ", nodeID: " + myImmatureTargetNode.getNodeId().toString() +
                      "): isRegistered = " + (myImmatureTargetNode.getModel() != null) +
                      ", isDisposed = " + jetbrains.mps.util.SNodeOperations.isDisposed(myImmatureTargetNode) + dumpUnregisteredTrace()));
          myImmatureTargetNode = null;
        }
      }
    }
    return myImmatureTargetNode == null;
  }

  private String dumpUnregisteredTrace() {
    Throwable trace = Trace.getInstance().getUnregisteredFromModelTrace(myImmatureTargetNode);
    if (trace == null) {
      return "";
    }
    StringWriter traceWriter = new StringWriter();
    PrintWriter printTraceWriter = new PrintWriter(traceWriter);
    printTraceWriter.println();
    printTraceWriter.println("Unregistered in:");
    trace.printStackTrace(printTraceWriter);
    printTraceWriter.close();
    return traceWriter.toString();
  }

  protected synchronized void makeMature() {
    if (myImmatureTargetNode == null) return;
    ImmatureReferences.getInstance().remove(this);
    final SNode immatureNode = myImmatureTargetNode;
    myImmatureTargetNode = null;
    adjustMature(immatureNode);
    setTargetSModelReference(immatureNode.getModel().getReference());
    setResolveInfo(jetbrains.mps.util.SNodeOperations.getResolveInfo(immatureNode));
  }

  protected void adjustMature(SNode immatureTarget) {
  }
}
             
