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
package jetbrains.mps.smodel;

import jetbrains.mps.smodel.SModelRepositoryListener.SModelRepositoryListenerPriority;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;

import jetbrains.mps.MPSCore;
import jetbrains.mps.components.CoreComponent;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.smodel.event.SModelCommandListener;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.smodel.event.SModelListener.SModelListenerPriority;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GlobalSModelEventsManager implements CoreComponent {
  private static final Logger LOG = LogManager.getLogger(GlobalSModelEventsManager.class);

  public static GlobalSModelEventsManager getInstance() {
    return MPSCore.getInstance().getGlobalSModelEventsManager();
  }

  private SModelRepository mySModelRepository;

  private List<List<SModelListener>> myGlobalListenersList;
  private List<SModelCommandListener> myGlobalCommandListeners = new ArrayList<SModelCommandListener>();

  private SModelListener[] myRelayListeners;
  private MyEventsCollector myEventsCollector = new MyEventsCollector();

  public GlobalSModelEventsManager(SModelRepository SModelRepository) {
    mySModelRepository = SModelRepository;
    myRelayListeners = new SModelListener[SModelListenerPriority.values().length];
    myGlobalListenersList = new ArrayList<List<SModelListener>>(SModelListenerPriority.values().length);
    for (SModelListenerPriority priority : SModelListenerPriority.values()) {
      myGlobalListenersList.add(new ArrayList<SModelListener>());
      myRelayListeners[priority.ordinal()] = createRelayListener(priority);
    }
  }

  @Override
  public void init() {
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        mySModelRepository.addModelRepositoryListener(new SModelRepositoryAdapter(SModelRepositoryListenerPriority.PLATFORM) {
          @Override
          public void modelAdded(SModel modelDescriptor) {
            addListeners(modelDescriptor);
          }

          @Override
          public void modelRemoved(SModel modelDescriptor) {
            removeListeners(modelDescriptor);
          }
        });

        for (SModel sm : mySModelRepository.getModelDescriptors()) {
          addListeners(sm);
        }
      }
    });
  }

  @Override
  public void dispose() {
  }

  private void addListeners(SModel sm) {
    for (SModelListener listener : myRelayListeners) {
      ((SModelInternal) sm).addModelListener(listener);
    }
    myEventsCollector.add(sm);
  }

  private void removeListeners(SModel sm) {
    for (SModelListener listener : myRelayListeners) {
      ((SModelInternal) sm).removeModelListener(listener);
    }
    myEventsCollector.remove(sm);
  }

  public void addGlobalModelListener(SModelListener l) {
    myGlobalListenersList.get(l.getPriority().ordinal()).add(l);
  }

  public void removeGlobalModelListener(SModelListener l) {
    myGlobalListenersList.get(l.getPriority().ordinal()).remove(l);
  }

  public void addGlobalCommandListener(@NotNull SModelCommandListener l) {
    myGlobalCommandListeners.add(l);
  }

  public void removeGlobalCommandListener(SModelCommandListener l) {
    myGlobalCommandListeners.remove(l);
  }

  private List<SModelListener> globalListeners(SModelListenerPriority priority) {
    return new ArrayList<SModelListener>(myGlobalListenersList.get(priority.ordinal()));
  }

  private SModelListener createRelayListener(final SModelListenerPriority priority) {
    return (SModelListener) Proxy.newProxyInstance(
      getClass().getClassLoader(),
      new Class[]{SModelListener.class},
      new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
          if (method.getName().equals("equals") && args.length == 1) {
            return proxy == args[0];
          }

          if (method.getName().equals("hashCode") && args == null) {
            return this.hashCode();
          }

          if (method.getName().equals("getPriority") && args == null) {
            return priority;
          }

          method.setAccessible(true);
          for (SModelListener l : globalListeners(priority)) {
            try {
              method.invoke(l, args);
            } catch (Throwable t) {
              LOG.error(null, t);
            }
          }

          return null;
        }
      }
    );
  }

  private class MyEventsCollector extends EventsCollector {
    @Override
    protected void eventsHappened(List<SModelEvent> events) {
      if (events.isEmpty()) return;

      for (SModelCommandListener l : myGlobalCommandListeners) {
        try {
          l.eventsHappenedInCommand(Collections.unmodifiableList(events));
        } catch (Throwable t) {
          LOG.error(null, t);
        }
      }
    }
  }
}
