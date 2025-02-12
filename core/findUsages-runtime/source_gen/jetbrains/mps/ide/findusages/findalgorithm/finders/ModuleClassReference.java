package jetbrains.mps.ide.findusages.findalgorithm.finders;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.classloading.ClassLoaderManager;

public class ModuleClassReference<T> {
  private SModuleReference myModuleRef;
  private String myClassName;

  public ModuleClassReference(SModuleReference moduleRef, String className) {
    myModuleRef = moduleRef;
    myClassName = className;
  }

  public SModuleReference getModuleRef() {
    return myModuleRef;
  }

  public String getClassName() {
    return myClassName;
  }

  public Class<T> loadClass() {
    SModule module = MPSModuleRepository.getInstance().getModule(myModuleRef);
    if (module == null) {
      return null;
    }
    Class loadedClass = ClassLoaderManager.getInstance().getClass(module, myClassName);
    if (loadedClass == null) {
      return null;
    }
    return (Class<T>) loadedClass;
  }
}
