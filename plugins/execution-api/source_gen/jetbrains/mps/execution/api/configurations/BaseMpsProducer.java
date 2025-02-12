package jetbrains.mps.execution.api.configurations;

/*Generated by MPS */

import com.intellij.execution.junit.RuntimeConfigurationProducer;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.Location;
import jetbrains.mps.plugins.runconfigs.MPSLocation;
import jetbrains.mps.plugins.runconfigs.MPSPsiElement;
import com.intellij.execution.configurations.RunConfiguration;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import com.intellij.execution.impl.RunnerAndConfigurationSettingsImpl;
import com.intellij.execution.impl.RunManagerImpl;
import jetbrains.mps.util.EqualUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.apache.log4j.Priority;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public abstract class BaseMpsProducer<T> extends RuntimeConfigurationProducer {
  private PsiElement mySourceElement;
  @Nullable
  private ConfigurationContext myContext;

  public BaseMpsProducer(ConfigurationType configurationType, String factoryClassName) {
    super(BaseMpsProducer.findFactory(configurationType, factoryClassName));
  }

  public BaseMpsProducer(ConfigurationFactory configurationFactory) {
    super(configurationFactory);
  }

  public void setSourceElement(PsiElement sourceElement) {
    mySourceElement = sourceElement;
  }

  @Override
  public PsiElement getSourceElement() {
    return mySourceElement;
  }

  @Nullable
  protected ConfigurationContext getContext() {
    return myContext;
  }

  @Override
  protected RunnerAndConfigurationSettings createConfigurationByElement(Location location, ConfigurationContext context) {
    myContext = context;
    if (!((location instanceof MPSLocation))) {
      return null;
    }
    MPSLocation mpsLocation = (MPSLocation) location;
    final MPSPsiElement psiElement = mpsLocation.getPsiElement();
    RunConfiguration config = ModelAccess.instance().runReadAction(new Computable<RunConfiguration>() {
      @Override
      public RunConfiguration compute() {
        Object mpsItem = psiElement.getMPSItem();
        if (mpsItem == null) {
          return null;
        }
        if (!(isApplicable(mpsItem))) {
          return null;
        }
        return doCreateConfiguration((T) psiElement.getMPSItem());
      }
    });
    if (config == null) {
      return null;
    }
    return new RunnerAndConfigurationSettingsImpl(RunManagerImpl.getInstanceImpl(location.getProject()), config, false);
  }

  protected abstract RunConfiguration doCreateConfiguration(T node);

  protected abstract boolean isApplicable(Object element);

  @Override
  public int compareTo(Object o) {
    return RuntimeConfigurationProducer.PREFERED;
  }

  @Override
  public int hashCode() {
    return ((myContext == null ?
      0 :
      myContext.hashCode()
    )) + 10 * ((mySourceElement == null ?
      0 :
      mySourceElement.hashCode()
    )) + 20 * getClass().getName().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || !((obj instanceof BaseMpsProducer))) {
      return false;
    }
    BaseMpsProducer configCreator = (BaseMpsProducer) obj;
    return EqualUtil.equals(configCreator.myContext, myContext) && EqualUtil.equals(configCreator.mySourceElement, mySourceElement) && EqualUtil.equals(configCreator.getClass().getName(), getClass().getName());
  }

  @NotNull
  protected static ConfigurationFactory findFactory(ConfigurationType configurationType, @NonNls String configurationFactoryClassName) {
    for (ConfigurationFactory factory : Sequence.fromIterable(Sequence.fromArray(configurationType.getConfigurationFactories()))) {
      if (factory.getClass().getName().equals(configurationFactoryClassName)) {
        return factory;
      }
    }
    if (LOG.isEnabledFor(Priority.WARN)) {
      LOG.warn("Cound not find configuration factory for " + configurationFactoryClassName + " in type " + configurationType.getDisplayName() + ".");
    }
    return configurationType.getConfigurationFactories()[0];
  }

  protected static Logger LOG = LogManager.getLogger(BaseMpsProducer.class);
}
