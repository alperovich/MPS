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
package jetbrains.mps.logging;

import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SNode;

public class MessageObject {
  private final String myMessage;
  private final Object myHintObject;

  public MessageObject(String message, Object hintObject) {
    myMessage = message;
    myHintObject = hintObject;
  }

  public String getMessage() {
    return myMessage;
  }

  public Object getHintObject() {
    return myHintObject;
  }

  public String toString() {
    if (myHintObject == null) {
      return myMessage;
    }
    String hint = "";
    if (myHintObject instanceof SNode) {
      String nodePresentation = ModelAccess.instance().runReadAction(new Computable<String>() {
        @Override
        public String compute() {
          return ((SNode) myHintObject).getPresentation();
        }
      });
      hint = "[node " + nodePresentation + "]";
    } else if (myHintObject instanceof SModel) {
      hint = "[model " + ((SModel) myHintObject).getReference() + "]";
    } else if (myHintObject instanceof SModule) {
      hint = "[module " + ((SModule) myHintObject).getModuleReference() + "]";
    } else {
      hint = "[hint object " + myHintObject + "]";
    }
    return myMessage + " " + hint;
  }
}
