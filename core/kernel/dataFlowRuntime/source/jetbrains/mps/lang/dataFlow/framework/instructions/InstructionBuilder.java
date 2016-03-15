/*
 * Copyright 2003-2016 JetBrains s.r.o.
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
package jetbrains.mps.lang.dataFlow.framework.instructions;

public class InstructionBuilder {

  public EndInstruction createEndInstruction(String ruleNodeReference) {
    return new EndInstruction(ruleNodeReference);
  }

  public EndTryInstruction createEndTryInstruction(String ruleNodeReference) {
    return new EndTryInstruction(ruleNodeReference);
  }

  public FinallyInstruction createFinallyInstruction(String ruleNodeReference) {
    return new FinallyInstruction(ruleNodeReference);
  }

  public IfJumpInstruction createIfJumpInstruction(String ruleNodeReference) {
    return new IfJumpInstruction(ruleNodeReference);
  }

  public JumpInstruction createJumpInstruction(String ruleNodeReference) {
    return new JumpInstruction(ruleNodeReference);
  }

  public TryInstruction createTryInstruction(String ruleNodeReference) {
    return new TryInstruction(ruleNodeReference);
  }

  public ReadInstruction createReadInstruction(String ruleNodeReference, Object var) {
    return new ReadInstruction(ruleNodeReference, var);
  }

  public WriteInstruction createWriteInstruction(String ruleNodeReference, Object var, Object value) {
    return new WriteInstruction(ruleNodeReference, var, value);
  }

  public NopInstruction createNopInstruction(String ruleNodeReference) {
    return new NopInstruction(ruleNodeReference);
  }

  public RetInstruction createRetInstruction(String ruleNodeReference) {
    return new RetInstruction(ruleNodeReference);
  }
}
