package jetbrains.mps.ide.dataFlow.presentation;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import java.util.Set;
import java.util.HashSet;

public class InstructionWrapper implements IInstruction<InstructionWrapper> {
  private Instruction myInstruction;

  public InstructionWrapper(Instruction instruction) {
    this.myInstruction = instruction;
  }

  @Override
  public Set<InstructionWrapper> succ() {
    Set<InstructionWrapper> result = new HashSet<InstructionWrapper>();
    for (Instruction instruction : this.myInstruction.succ()) {
      result.add(new InstructionWrapper(instruction));
    }
    return result;
  }

  @Override
  public Set<InstructionWrapper> pred() {
    Set<InstructionWrapper> result = new HashSet<InstructionWrapper>();
    for (Instruction instruction : this.myInstruction.pred()) {
      result.add(new InstructionWrapper(instruction));
    }
    return result;
  }

  public Instruction getInstruction() {
    return this.myInstruction;
  }

  @Override
  public String toString() {
    return this.myInstruction.toString();
  }

  @Override
  public int hashCode() {
    return this.myInstruction.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof InstructionWrapper) {
      return (this.myInstruction.equals(((InstructionWrapper) obj).myInstruction));
    }
    return false;
  }
}
