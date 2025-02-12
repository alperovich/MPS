package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.dataFlow.framework.Program;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;

public class RuleWhileNotNull extends DataFlowConstructor {
  public RuleWhileNotNull() {
  }

  public boolean isApplicable(SNode node) {
    return SModelUtil_new.isAssignableConcept(BehaviorReflection.invokeVirtual(String.class, SNodeOperations.getConceptDeclaration(node), "virtual_getFqName_1213877404258", new Object[]{}), getApplicableConceptFqName());
  }

  public String getApplicableConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.WhileStatement";
  }

  public void performActions(Program o, SNode node) {
    List<SNode> result = new ArrayList<SNode>();
    NullableUtil.getAndExpressions(SLinkOperations.getTarget(node, "condition", true), result);
    for (SNode condition : result) {
      if (SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression")) {
        SNode notNullNode = NullableUtil.getOtherThanNull(SNodeOperations.cast(condition, "jetbrains.mps.baseLanguage.structure.BinaryOperation"));
        if (notNullNode != null) {
          {
            Object object = condition;
            if (((Program) o).contains(object)) {
              boolean before = false;
              int position = ((Program) (o)).getEnd(object);
              Instruction instruction = new notNullInstruction(notNullNode);
              instruction.setRuleReference("r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/7718715537694335485");
              instruction.setSource(node);
              ((Program) (o)).insert(instruction, position, true, before);
            }
          }
          {
            Object object = node;
            if (((Program) o).contains(object)) {
              boolean before = false;
              int position = ((Program) (o)).getEnd(object);
              Instruction instruction = new nullableInstruction(notNullNode);
              instruction.setRuleReference("r:00000000-0000-4000-0000-011c895902c2(jetbrains.mps.baseLanguage.dataFlow)/7718715537694335490");
              instruction.setSource(node);
              ((Program) (o)).insert(instruction, position, true, before);
            }
          }
        }
      }
    }

  }
}
