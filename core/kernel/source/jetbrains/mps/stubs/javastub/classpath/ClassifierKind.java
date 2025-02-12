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
package jetbrains.mps.stubs.javastub.classpath;

import org.jetbrains.asm4.ClassReader;
import org.jetbrains.asm4.Opcodes;

import java.io.IOException;
import java.io.InputStream;

public enum ClassifierKind {
  CLASS(),
  INTERFACE(),
  ANNOTATIONS(),
  ENUM(),
  UNKNOWN();

  ClassifierKind() {
  }

  public static ClassifierKind getClassifierKind(ClassReader reader) {
    int flag = reader.readUnsignedShort(reader.header);
    return getClassifierKind(flag);
  }

  @Deprecated //slow
  public static ClassifierKind getClassifierKind(InputStream inp) throws IOException {
    ClassReader reader = new ClassReader(inp);
    return ClassifierKind.getClassifierKind(reader);
  }

  public static ClassifierKind getClassifierKind(int flag) {
    if ((flag & Opcodes.ACC_ANNOTATION) != 0) {
      return ANNOTATIONS;
    }
    if ((flag & Opcodes.ACC_ENUM) != 0) {
      return ENUM;
    }
    if ((flag & Opcodes.ACC_INTERFACE) != 0) {
      return INTERFACE;
    }
    return CLASS;
  }
}
