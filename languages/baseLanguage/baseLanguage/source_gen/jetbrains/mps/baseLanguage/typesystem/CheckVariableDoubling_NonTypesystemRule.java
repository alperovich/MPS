package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.Collections;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class CheckVariableDoubling_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public CheckVariableDoubling_NonTypesystemRule() {
  }

  public void applyRule(final SNode localVariableDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    Scope variablesScope = Scope.getScope(Scope.parent(localVariableDeclaration), localVariableDeclaration, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.VariableDeclaration"));
    Iterable<SNode> variablesInScope;
    if (variablesScope != null) {
      variablesInScope = Sequence.fromIterable(variablesScope.getAvailableElements(SPropertyOperations.getString(localVariableDeclaration, "name"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.VariableDeclaration");
        }
      }).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return SNodeOperations.cast(it, "jetbrains.mps.baseLanguage.structure.VariableDeclaration");
        }
      }).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return eq_6gv83m_a0a0a0a0a0a0a2a1(SPropertyOperations.getString(it, "name"), SPropertyOperations.getString(localVariableDeclaration, "name"));
        }
      });
    } else {
      variablesInScope = Collections.emptyList();
    }
    final SNode nearestMethod = SNodeOperations.getAncestor(localVariableDeclaration, "jetbrains.mps.baseLanguage.structure.IMethodLike", false, false);
    Iterable<SNode> variablesFromCurrentMethod = Sequence.fromIterable(variablesInScope).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.getAncestor(it, "jetbrains.mps.baseLanguage.structure.IMethodLike", false, false) == nearestMethod;
      }
    });

    if (Sequence.fromIterable(variablesFromCurrentMethod).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration") || SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
      }
    })) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        errorTarget = new PropertyMessageTarget("name");
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(localVariableDeclaration, "Variable " + SPropertyOperations.getString(localVariableDeclaration, "name") + " is already defined in the scope", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "4164094338984214928", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  private static boolean eq_6gv83m_a0a0a0a0a0a0a2a1(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
