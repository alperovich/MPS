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
package jetbrains.mps;

public class InternalFlag {

  private static InternalFlag myInstance;

  private boolean internalFlag;

  private InternalFlag() {
    internalFlag = isSystemInternal();
  }

  public static InternalFlag getInstance() {
    if (myInstance == null) {
      myInstance = new InternalFlag();
    }
    return myInstance;
  }

  public static boolean isSystemInternal() {
    return "true".equals(System.getProperty("mps.internal"));
  }

  public static boolean isInternalMode() {
    if (myInstance == null) {
      return isSystemInternal();
    } else {
      return myInstance.getInternalFlag();
    }
  }

  public boolean getInternalFlag() {
    return internalFlag;
  }

  public void setInternalFlag(boolean flag) {
    internalFlag = flag;
  }

}
