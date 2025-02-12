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
package jetbrains.mps.project.dependency;

import jetbrains.mps.project.DevKit;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModuleRepositoryFacade;
import jetbrains.mps.smodel.SModelAdapter;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.smodel.event.SModelDevKitEvent;
import jetbrains.mps.smodel.event.SModelLanguageEvent;
import jetbrains.mps.util.containers.ConcurrentHashSet;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.mps.openapi.module.SRepositoryContentAdapter;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class ModelDependenciesManager {

  private static final Logger LOG = LogManager.getLogger(ModelDependenciesManager.class);

  private final SRepository myRepository;
  private SModel myModel;
  private MySModelWatcher mySModelWatcher;
  private MyModuleWatcher myModuleWatcher;

  private AtomicBoolean myInvalidatedFlag = new AtomicBoolean(true);
  private volatile Set<SModuleReference> myCachedDeps;
  // a one-time synchronization helper for the cache
  private CountDownLatch myCacheInitGuard = new CountDownLatch(1);

  public ModelDependenciesManager(SModel model) {
    myRepository = MPSModuleRepository.getInstance();
    myModel = model;
    myModuleWatcher = new MyModuleWatcher();
  }

  public Collection<SModuleReference> getAllImportedLanguages() {
    if (myModel == null) throw new IllegalStateException("access after disposal");

    if (myInvalidatedFlag.compareAndSet(true, false)) {
      // lazy initialization
      if (mySModelWatcher == null) {
        mySModelWatcher = new MySModelWatcher(myModel);
      }

      myModuleWatcher.clear();

      Set<SModuleReference> result = new LinkedHashSet<SModuleReference>();

      for (SModuleReference lang : ((jetbrains.mps.smodel.SModelInternal) myModel).importedLanguages()) {
        result.add(lang);
        Language module = ModuleRepositoryFacade.getInstance().getModule(lang, Language.class);
        if (module != null) {
          myModuleWatcher.watchLanguage(module);
        } else {
          LOG.error("cannot find used language in repository " + lang.toString());
        }
      }

      for (SModuleReference dk : ((jetbrains.mps.smodel.SModelInternal) myModel).importedDevkits()) {
        DevKit devkit = ModuleRepositoryFacade.getInstance().getModule(dk, DevKit.class);
        if (devkit == null) continue;
        myModuleWatcher.watchDevKit(devkit);

        for (Language dkLang : devkit.getAllExportedLanguages()) {
          result.add(dkLang.getModuleReference());
          myModuleWatcher.watchLanguage(dkLang);
        }

        for (DevKit exDevKit : devkit.getAllExtendedDevkits()) {
          myModuleWatcher.watchDevKit(exDevKit);
        }
      }
      this.myCachedDeps = Collections.unmodifiableSet(result);
      myCacheInitGuard.countDown();
    }
    while (true) {
      try {
        myCacheInitGuard.await();
        break;
      } catch (InterruptedException e) {
      }
    }
    return myCachedDeps;
  }

  public void dispose() {
    if (mySModelWatcher != null) {
      mySModelWatcher.dispose();
      this.mySModelWatcher = null;
    }
    if (myModuleWatcher != null) {
      myModuleWatcher.dispose();
      this.myModuleWatcher = null;
    }
    this.myModel = null;
  }

  private void invalidate() {
    myInvalidatedFlag.set(true);
  }

  private class MySModelWatcher extends SModelAdapter {

    private SModel mySModelDescriptor;

    private MySModelWatcher(SModel sModelDescriptor) {
      mySModelDescriptor = sModelDescriptor;
      registerSelf();
    }

    @Override
    public void devkitAdded(SModelDevKitEvent event) {
      invalidate();
    }

    @Override
    public void devkitRemoved(SModelDevKitEvent event) {
      invalidate();
    }

    @Override
    public void languageAdded(SModelLanguageEvent event) {
      invalidate();
    }

    @Override
    public void languageRemoved(SModelLanguageEvent event) {
      invalidate();
    }

    private void dispose() {
      unregisterSelf();
      this.mySModelDescriptor = null;
    }

    private void registerSelf() {
      ((SModelInternal) mySModelDescriptor).addModelListener(this);
    }

    private void unregisterSelf() {
      ((SModelInternal) mySModelDescriptor).removeModelListener(this);
    }
  }

  private class MyModuleWatcher extends SRepositoryContentAdapter {

    private ConcurrentHashSet<SModule> myWatchedModules = new ConcurrentHashSet<SModule>(4);

    private MyModuleWatcher() {
      subscribeTo(myRepository);
    }

    @Override
    public void beforeModuleRemoved(SModule module) {
      invalidateIfWatching(module);
    }

    @Override
    public void moduleChanged(SModule module) {
      invalidateIfWatching(module);
    }

    @Override
    public void repositoryChanged() {
      invalidate();
      unsubscribeFrom(myRepository);
    }

    private void watchDevKit(@NotNull DevKit devKit) {
      myWatchedModules.add(devKit);
    }

    private void watchLanguage(@NotNull Language language) {
      myWatchedModules.add(language);
    }

    private void invalidateIfWatching(SModule module) {
      if (myWatchedModules.contains(module)) {
        invalidate();
        unsubscribeFrom(myRepository);
      }
    }

    private void clear() {
      myWatchedModules.clear();
    }

    private void dispose() {
      clear();
      unsubscribeFrom(myRepository);
    }
  }
}
