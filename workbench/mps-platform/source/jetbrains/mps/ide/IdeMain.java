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
package jetbrains.mps.ide;

import jetbrains.mps.MPSCore;

// TODO get rid of
public class IdeMain {
  private static TestMode ourTestMode = TestMode.NO_TEST;

  public static TestMode getTestMode() {
    return ourTestMode;
  }

  public static void setTestMode(TestMode testMode) {
    ourTestMode = testMode;
    if (testMode == TestMode.CORE_TEST || testMode == TestMode.UI_TEST) {
      MPSCore.getInstance().setTestMode();
    }
  }

  @Deprecated
  public static void setTestMode(boolean test) {
    if (test) {
      setTestMode(TestMode.CORE_TEST);
    } else {
      setTestMode(TestMode.NO_TEST);
    }
  }

  public enum TestMode {
    NO_TEST, CORE_TEST, UI_TEST
  }
}
