package jetbrains.mps.lang.checkedName.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import java.util.List;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_NamingPolicy_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_NamingPolicy_NonTypesystemRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    String warningMessage = "Naming policies violated: " + "all words except prepositions, articles and particles should be capitalized";
    for (SNode s : BehaviorReflection.invokeVirtual((Class<List<SNode>>) ((Class) Object.class), node, "virtual_getDescendantsToCheck_4844813484172611413", new Object[]{})) {
      if (!(NameUtil.satisfiesPartNamingPolicy(SPropertyOperations.getString(s, "value")))) {
        String myWarning = warningMessage + ".";
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(s, myWarning, "r:f922da3a-135f-4fe9-9051-9f018bc5c1bf(jetbrains.mps.lang.checkedName.typesystem)", "4844813484172611502", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.checkedName.typesystem.FixNamingPolicy_QuickFix", false);
            intentionProvider.putArgument("nodeToFix", node);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(s, myWarning, "r:f922da3a-135f-4fe9-9051-9f018bc5c1bf(jetbrains.mps.lang.checkedName.typesystem)", "4844813484172611508", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.checkedName.typesystem.FixNamingPolicy_literal_once_QuickFix", false);
            intentionProvider.putArgument("caption", "Fix String");
            intentionProvider.putArgument("literal", s);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
      }
    }
    for (PropertyReference p : BehaviorReflection.invokeVirtual((Class<List<PropertyReference>>) ((Class) Object.class), node, "virtual_getPropertiesToCheck_4844813484172611445", new Object[]{})) {
      if (p.getValue() == null) {
        continue;
      }
      if (!(NameUtil.satisfiesNamingPolicy(p.getValue()))) {
        String myWarning = warningMessage + "; no leading and trailing whitespaces are allowed.";
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          errorTarget = new PropertyMessageTarget(p.getProperty());
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(p.getNode(), myWarning, "r:f922da3a-135f-4fe9-9051-9f018bc5c1bf(jetbrains.mps.lang.checkedName.typesystem)", "4844813484172611544", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.checkedName.typesystem.FixNamingPolicy_QuickFix", false);
            intentionProvider.putArgument("nodeToFix", node);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          errorTarget = new PropertyMessageTarget(p.getProperty());
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(p.getNode(), myWarning, "r:f922da3a-135f-4fe9-9051-9f018bc5c1bf(jetbrains.mps.lang.checkedName.typesystem)", "4844813484172611556", null, errorTarget);
          {
            BaseQuickFixProvider intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.checkedName.typesystem.FixNamingPolicy_property_once_QuickFix", false);
            intentionProvider.putArgument("caption", "Fix " + NameUtil.capitalize(p.getProperty()));
            intentionProvider.putArgument("property", p);
            _reporter_2309309498.addIntentionProvider(intentionProvider);
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.checkedName.structure.ICheckedNamePolicy";
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
}
