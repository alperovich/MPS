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
package jetbrains.mps.smodel.persistence.def.v4;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.DynamicReference;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelOperations;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.smodel.SModelVersionsInfo;
import jetbrains.mps.smodel.StaticReference;
import jetbrains.mps.smodel.persistence.def.IReferencePersister;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.smodel.persistence.def.VisibleModelElements;
import org.jdom.Element;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeUtil;
import org.jetbrains.mps.openapi.model.SReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

public class ReferencePersister4 implements IReferencePersister {

  private static final Logger LOG = Logger.wrap(LogManager.getLogger(ReferencePersister4.class));

  protected SNode mySourceNode;
  protected String myRole;
  protected String myTargetId;
  protected String myResolveInfo;
  protected String myImportedModelInfo = "-1";
  protected boolean myUseUIDs;
  private boolean myNotImported;


  @Override
  public void fillFields(Element linkElement, SNode sourceNode, boolean useUIDs) {
    fillFields(linkElement, sourceNode, useUIDs, new SModelVersionsInfo());
  }

  public void fillFields(Element linkElement, SNode sourceNode, boolean useUIDs, SModelVersionsInfo versionsInfo) {
    fillFields(linkElement.getAttributeValue(ModelPersistence.ROLE), linkElement.getAttributeValue(ModelPersistence.RESOLVE_INFO),
        linkElement.getAttributeValue(ModelPersistence.TARGET_NODE_ID), sourceNode, useUIDs, versionsInfo);
  }

  public void fillFields(String role_, String resolveInfo, String targetNodeId_, SNode sourceNode, boolean useUIDs, SModelVersionsInfo versionsInfo) {
    String role = VersionUtil.getLinkRole(role_, sourceNode, versionsInfo);
    String attTargetNodeId = VersionUtil.getTargetNodeId(targetNodeId_, role, sourceNode, versionsInfo);

    this.myUseUIDs = useUIDs;
    this.mySourceNode = sourceNode;
    this.myRole = role;
    if (attTargetNodeId != null) {
      ReferenceTargetDescriptor targetDescriptor = parseAttTargetNodeId(attTargetNodeId, useUIDs);
      this.myTargetId = targetDescriptor.targetInfo;
      this.myImportedModelInfo = targetDescriptor.importedModelInfo;
      this.myNotImported = targetDescriptor.notImported;
    }
    this.myResolveInfo = resolveInfo;
  }

  private ReferenceTargetDescriptor parseAttTargetNodeId(String attTargetNodeId, boolean useUIDs) {
    ReferenceTargetDescriptor referenceTargetDescriptor = new ReferenceTargetDescriptor();
    int i;
    if (useUIDs) {
      i = attTargetNodeId.indexOf('#');
    } else {
      i = attTargetNodeId.indexOf('.');
    }
    if (i > 0) {
      referenceTargetDescriptor.importedModelInfo = attTargetNodeId.substring(0, i);
      String info = referenceTargetDescriptor.importedModelInfo;
      if (info.endsWith("v")) {
        referenceTargetDescriptor.notImported = true;
        referenceTargetDescriptor.importedModelInfo = info.substring(0, info.length() - 1);
      }
      referenceTargetDescriptor.targetInfo = attTargetNodeId.substring(i + 1);
    } else {
      referenceTargetDescriptor.importedModelInfo = "-1";
      referenceTargetDescriptor.targetInfo = attTargetNodeId;
    }
    return referenceTargetDescriptor;
  }

  @Override
  public SNode getSourceNode() {
    return mySourceNode;
  }


  @Override
  public String getRole() {
    return myRole;
  }

  @Override
  public String getTargetId() {
    return myTargetId;
  }

  @Override
  public String getResolveInfo() {
    return myResolveInfo;
  }

  @Override
  public String getExtResolveInfo() {
    return null;
  }

  // -- create reference
  private SReference createReferenceInModelDoNotAddToSourceNode(SModel model, VisibleModelElements visibleModelElements) {
    SModelReference importedModelReference = model.getReference();
    if (myUseUIDs) {
      if (!myImportedModelInfo.equals("-1")) {
        importedModelReference = PersistenceFacade.getInstance().createModelReference(myImportedModelInfo);
      }
    } else if (getImportIndex() > -1) {
      if (myNotImported) {
        importedModelReference = visibleModelElements.getModelUID(getImportIndex());
      } else {
        importedModelReference = SModelOperations.getImportedModelUID(model.getModelDescriptor(), getImportIndex());
      }
      if (importedModelReference == null) {
        LOG.error("couldn't create reference '" + this.getRole() + "' from " + SNodeUtil.getDebugText(
            this.getSourceNode()) + " : import for index [" + getImportIndex() + "] not found");
        return null;
      }
    }

    if (this.getTargetId() == null) {
      LOG.error("couldn't create reference '" + this.getRole() + "' from " + SNodeUtil.getDebugText(this.getSourceNode()) + " : target node id is null");
      return null;
    }

    if (this.getTargetId().equals("^")) {
      return new DynamicReference(
          this.getRole(),
          this.getSourceNode(),
          importedModelReference,
          this.getResolveInfo());
    }
    return new StaticReference(
        this.getRole(),
        this.getSourceNode(),
        importedModelReference,
        jetbrains.mps.smodel.SNodeId.fromString(this.getTargetId()),
        this.getResolveInfo());
  }

  @Override
  public void createReferenceInModel(SModel model, VisibleModelElements visibleModelElements) {
    SReference reference = createReferenceInModelDoNotAddToSourceNode(model, visibleModelElements);
    if (reference != null) this.getSourceNode().setReference(reference.getRole(), reference);
  }

  //-- save reference

  @Override
  public void saveReference(Element parentElement, SReference reference, boolean useUIDs, VisibleModelElements visibleModelElements) {
    assert useUIDs || visibleModelElements != null;
    SNode node = reference.getSourceNode();
    Element linkElement = new Element(ModelPersistence.LINK);
    parentElement.addContent(linkElement);
    linkElement.setAttribute(ModelPersistence.ROLE, VersionUtil.formVersionedString(reference.getRole(), VersionUtil.getNodeLanguageVersion(node)));

    String targetModelInfo = "";
    if (!(reference instanceof StaticReference && node.getModel().getReference().equals(reference.getTargetSModelReference()))) {
      if (useUIDs) {
        targetModelInfo = reference.getTargetSModelReference().toString() + "#";
      } else {
        SModelReference targetModelReference = reference.getTargetSModelReference();
        if (targetModelReference != null) {
          jetbrains.mps.smodel.SModel.ImportElement importElement = SModelOperations.getImportElement(node.getModel(), targetModelReference);
          if (importElement != null) {
            int importIndex = importElement.getReferenceID();
            targetModelInfo = importIndex + ".";
          } else {
            int visibleIndex = visibleModelElements.getVisibleModelIndex(targetModelReference);
            targetModelInfo = visibleIndex + "v.";
          }
        } else {
          LOG.error("external reference '" + reference.getRole() + "' has no target model info", reference.getSourceNode());
          LOG.error("-- was reference " + reference + " in " + SNodeUtil.getDebugText(reference.getSourceNode()));
        }
      }
    }

    String targetNodeId;
    if (reference instanceof StaticReference) {
      StaticReference staticReference = (StaticReference) reference;
      targetNodeId = String.valueOf(staticReference.getTargetNodeId());
    } else {
      targetNodeId = "^";
    }

    //stack overflow was here!!
    targetNodeId = VersionUtil.formVersionedString(targetModelInfo + targetNodeId,
        VersionUtil.getReferenceToNodeVersion(node, reference.getTargetSModelReference()));
    linkElement.setAttribute(ModelPersistence.TARGET_NODE_ID, targetNodeId);
    String resolveInfo = ((jetbrains.mps.smodel.SReference) reference).getResolveInfo();
    if (resolveInfo != null) linkElement.setAttribute(ModelPersistence.RESOLVE_INFO, resolveInfo);
  }

  @Override
  public int getImportIndex() {
    try {
      return Integer.parseInt(myImportedModelInfo);
    } catch (NumberFormatException e) {
      return -1;
    }
  }
  // --


  @SuppressWarnings({"InstanceVariableNamingConvention"})
  public static class ReferenceTargetDescriptor {
    public boolean notImported = false;
    public String targetInfo;
    public String importedModelInfo;
  }

  @SuppressWarnings({"InstanceVariableNamingConvention"})
  protected static class ReferenceDescriptor {
    public SNode sourceNode;
    public String role;
    public String resolveInfo;
    public String targetNodeId;
  }
}
