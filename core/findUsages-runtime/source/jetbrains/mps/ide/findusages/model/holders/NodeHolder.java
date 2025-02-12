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
package jetbrains.mps.ide.findusages.model.holders;

import jetbrains.mps.ide.components.ComponentsUtil;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.MPSModuleRepository;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

public class NodeHolder implements IHolder<SNode> {
  private static final String NODE = "node";

  private SNodeReference myNodePointer;

  public NodeHolder(Element element, Project project) throws CantLoadSomethingException {
    read(element, project);
  }

  public NodeHolder(@NotNull SNode node) {
    myNodePointer = node.getReference();
  }

  @Override
  public SNode getObject() {
    return myNodePointer.resolve(MPSModuleRepository.getInstance());
  }

  @Override
  @NotNull
  public String getCaption() {
    SNode node = getObject();
    if (node == null) return "<null>";
    return node.toString();
  }

  @Override
  public void read(Element element, Project project) throws CantLoadSomethingException {
    Element nodeXML = element.getChild(NODE);
    if (nodeXML == null) {
      throw new CantLoadSomethingException("node is null");
    }
    SNode node = ComponentsUtil.nodeFromElement((Element) nodeXML.getChildren().get(0));
    if (node == null) {
      throw new CantLoadSomethingException("node is null");
    }
    myNodePointer = node.getReference();
  }

  @Override
  public void write(Element element, Project project) throws CantSaveSomethingException {
    if (myNodePointer.resolve(MPSModuleRepository.getInstance()) == null) {
      throw new CantSaveSomethingException("node is null");
    }

    Element nodeXML = new Element(NODE);
    nodeXML.addContent(ComponentsUtil.nodeToElement(myNodePointer.resolve(MPSModuleRepository.getInstance())));
    element.addContent(nodeXML);
  }
}
