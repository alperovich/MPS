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
package jetbrains.mps.generator.test;

import com.intellij.openapi.application.PathManager;
import jetbrains.mps.testbench.junit.runners.MpsTestsSupport;
import jetbrains.mps.tool.environment.ActiveEnvironment;
import jetbrains.mps.tool.environment.Environment;
import org.jetbrains.mps.openapi.model.EditableSModel;
import jetbrains.mps.extapi.model.GeneratableSModel;
import jetbrains.mps.extapi.model.SModelBase;
import jetbrains.mps.generator.GenerationCacheContainer;
import jetbrains.mps.generator.GenerationCacheContainer.FileBasedGenerationCacheContainer;
import jetbrains.mps.generator.GenerationFacade;
import jetbrains.mps.generator.GenerationOptions;
import jetbrains.mps.generator.IncrementalGenerationStrategy;
import jetbrains.mps.generator.ModelDigestUtil;
import jetbrains.mps.generator.impl.dependencies.GenerationDependencies;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.IdeMain.TestMode;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.generator.TransientModelsComponent;
import jetbrains.mps.persistence.DefaultModelPersistence;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.BaseMPSModuleOwner;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.MPSModuleOwner;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.testbench.PerformanceMessenger;
import jetbrains.mps.util.DifflibFacade;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.JDOMUtil;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.module.SModule;
import org.junit.Assert;
import org.junit.BeforeClass;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

/**
 * Evgeny Gryaznov, Oct 6, 2010
 */
public class GenerationTestBase {
  private static boolean DEBUG = false;
  private final MPSModuleOwner myOwner = new BaseMPSModuleOwner() {
  };

  private static Environment CREATED_ENV;

  @BeforeClass
  public static void init() throws Exception {
    CREATED_ENV = MpsTestsSupport.initEnv(false);
    MpsTestsSupport.makeAllInCreatedEnvironment();

    Logger.getRootLogger().setLevel(Level.INFO);
    IdeMain.setTestMode(TestMode.CORE_TEST);
  }

  protected void doMeasureParallelGeneration(final Project p, final SModel descr, int threads) throws IOException {

    // Stage 1. Regenerate

    GenerationOptions options = GenerationOptions.getDefaults()
        .generateInParallel(false, 1)
        .rebuildAll(true).strictMode(true).reporting(false, true, false, 2).incremental(new MyNonIncrementalGenerationStrategy()).create();
    IncrementalTestGenerationHandler generationHandler = new IncrementalTestGenerationHandler();
    GenerationFacade.generateModels(p,
        Collections.singletonList(descr), ModuleContext.create(descr, p),
        generationHandler,
        new EmptyProgressMonitor(), generationHandler.getMessageHandler(), options,
        p.getComponent(TransientModelsComponent.class));

    assertNoDiff(generationHandler.getExistingContent(), generationHandler.getGeneratedContent());

    // Stage 2. Regenerate. Measure time.

    options = GenerationOptions.getDefaults()
        .generateInParallel(false, 1)
        .rebuildAll(true).strictMode(true).reporting(false, true, false, 2).incremental(new MyNonIncrementalGenerationStrategy()).create();
    generationHandler = new IncrementalTestGenerationHandler();
    long start = System.nanoTime();
    GenerationFacade.generateModels(p,
        Collections.singletonList(descr), ModuleContext.create(descr, p),
        generationHandler,
        new EmptyProgressMonitor(), generationHandler.getMessageHandler(), options,
        p.getComponent(TransientModelsComponent.class));
    long singleThread = System.nanoTime() - start;

    // Stage 3. Regenerate in parallel

    options = GenerationOptions.getDefaults()
        .generateInParallel(true, threads)
        .rebuildAll(true).strictMode(true).reporting(false, true, false, 2).incremental(new MyNonIncrementalGenerationStrategy()).create();
    generationHandler = new IncrementalTestGenerationHandler();
    start = System.nanoTime();
    GenerationFacade.generateModels(p,
        Collections.singletonList(descr), ModuleContext.create(descr, p),
        generationHandler,
        new EmptyProgressMonitor(), generationHandler.getMessageHandler(), options,
        p.getComponent(TransientModelsComponent.class));
    long severalThreads = System.nanoTime() - start;

    assertNoDiff(generationHandler.getExistingContent(), generationHandler.getGeneratedContent());

    PerformanceMessenger.getInstance().reportPercent("parallelGeneration", severalThreads / 1000000, singleThread / 1000000);

    if (DEBUG) {
      System.out.println("Single thread: " + singleThread / 1000000 / 1000. + ", 4 threads: " + severalThreads / 1000000 / 1000.);
    }
  }

  protected void doTestIncrementalGeneration(final Project p, final SModel originalModel, final ModelChangeRunnable... changeModel) throws IOException {
    String randomName = "testxw" + Math.abs(UUID.randomUUID().getLeastSignificantBits()) + "." + originalModel.getModule().getModuleName();
    String randomId = UUID.randomUUID().toString();
    final TestModule tm = new TestModule(randomName, randomId, originalModel.getModule());
    ModelAccess.instance().runWriteAction(new Runnable() {
      @Override
      public void run() {
        MPSModuleRepository.getInstance().registerModule(tm, myOwner);
      }
    });

    final SModel[] descr1 = new SModel[]{null};
    try {
      ModelAccess.instance().runReadAction(new Runnable() {
        @Override
        public void run() {
          descr1[0] = tm.createModel(originalModel);
          tm.publish(descr1[0]);
        }
      });
      final SModel descr = descr1[0];

      File generatorCaches = new File(PathManager.getSystemPath(), "mps-generator-test");
      if (generatorCaches.exists()) {
        Assert.assertTrue(FileUtil.delete(generatorCaches));
      }
      Assert.assertTrue("cannot create caches folder", generatorCaches.mkdir());

      final MyIncrementalGenerationStrategy incrementalStrategy = new MyIncrementalGenerationStrategy(descr,
          new FileBasedGenerationCacheContainer(generatorCaches));
      ModelAccess.instance().runReadAction(new Runnable() {
        @Override
        public void run() {
          incrementalStrategy.buildHash();
        }
      });
      List<String> hashes = new ArrayList<String>();
      hashes.add(incrementalStrategy.getHash().get(GeneratableSModel.FILE));

      // Stage 1. Regenerate

      GenerationOptions options = GenerationOptions.getDefaults()
          .rebuildAll(true).strictMode(true).reporting(true, true, false, 2).incremental(incrementalStrategy).create();
      IncrementalTestGenerationHandler generationHandler = new IncrementalTestGenerationHandler();
      GenerationFacade.generateModels(p,
          Collections.singletonList(descr), ModuleContext.create(descr, p),
          generationHandler,
          new EmptyProgressMonitor(), generationHandler.getMessageHandler(), options,
          p.getComponent(TransientModelsComponent.class));

      Map<String, String> generated = replaceInContent(generationHandler.getGeneratedContent(),
          new String[]{randomName, originalModel.getModule().getModuleName()},
          new String[]{randomId, originalModel.getModule().getModuleReference().getModuleId().toString()});
      assertNoDiff(generationHandler.getExistingContent(), generated);

      // Stage 2. Modify model

      Map<String, String> incrementalGenerationResults = generationHandler.getGeneratedContent();
      List<Long> time = new ArrayList<Long>();
      Assert.assertTrue(changeModel.length > 0);
      for (final ModelChangeRunnable r : changeModel) {

        ThreadUtils.runInUIThreadAndWait(new Runnable() {
          @Override
          public void run() {
            ModelAccess.instance().runWriteActionInCommand(new Runnable() {
              @Override
              public void run() {
                r.run(descr);
              }
            }, p);
          }
        });

        ModelAccess.instance().runReadAction(new Runnable() {
          @Override
          public void run() {
            incrementalStrategy.buildHash();
          }
        });
        hashes.add(incrementalStrategy.getHash().get(GeneratableSModel.FILE));
        Assert.assertNotNull(generationHandler.getLastDependencies());
        incrementalStrategy.setDependencies(generationHandler.getLastDependencies());

        // Stage 3. Generate incrementally

        options = GenerationOptions.getDefaults()
            .rebuildAll(false).strictMode(true).reporting(true, true, false, 2).incremental(incrementalStrategy).create();
        generationHandler = new IncrementalTestGenerationHandler(incrementalGenerationResults);
        generationHandler.checkIncremental(options);
        long start = System.nanoTime();
        GenerationFacade.generateModels(p,
            Collections.singletonList(descr), ModuleContext.create(descr, p),
            generationHandler,
            new EmptyProgressMonitor(), generationHandler.getMessageHandler(), options,
            p.getComponent(TransientModelsComponent.class));
        time.add(System.nanoTime() - start);

        incrementalGenerationResults = generationHandler.getGeneratedContent();
        assertDiff(generationHandler.getExistingContent(), incrementalGenerationResults, 1);
      }

      // Stage 4. Regenerate. Check incremental results.

      incrementalStrategy.setDependencies(null);
      options = GenerationOptions.getDefaults()
          .rebuildAll(true).strictMode(true).reporting(true, true, false, 2).incremental(incrementalStrategy).create();
      generationHandler = new IncrementalTestGenerationHandler(incrementalGenerationResults);
      long start = System.nanoTime();
      GenerationFacade.generateModels(p,
          Collections.singletonList(descr), ModuleContext.create(descr, p),
          generationHandler,
          new EmptyProgressMonitor(), generationHandler.getMessageHandler(), options,
          p.getComponent(TransientModelsComponent.class));
      time.add(System.nanoTime() - start);

      assertNoDiff(incrementalGenerationResults, generationHandler.getGeneratedContent());

      PerformanceMessenger.getInstance().reportPercent("incrementalGeneration", (time.get(time.size() - 2)) / 1000000,
          (time.get(time.size() - 1)) / 1000000);

      if (DEBUG) {
        long regen = time.remove(time.size() - 1);
        System.out.print("Full cycle: " + regen / 1000000 / 1000.);
        for (long l : time) {
          System.out.print(", incremental: " + l / 1000000 / 1000.);
        }
        System.out.println();
      }
    } finally {
      ModelAccess.instance().runWriteAction(new Runnable() {
        @Override
        public void run() {
          MPSModuleRepository.getInstance().unregisterModule(tm, myOwner);
        }
      });
    }
  }

  private Map<String, String> replaceInContent(Map<String, String> content, String[]... pairs) {
    Map<String, String> result = new HashMap<String, String>(content.size());
    for (Entry<String, String> e : content.entrySet()) {
      String s = e.getValue();
      for (String[] p : pairs) {
        s = s.replaceAll(p[0], p[1]);
      }
      result.put(e.getKey(), s);
    }
    return result;
  }

  protected static SModel findModel(Project project, String fqName) {
    for (SModule m : project.getModules()) {
      for (SModel descr : m.getModels()) {
        if (!(descr instanceof EditableSModel)) {
          continue;
        }
        String longName = descr.getReference().getModelName();
        if (longName.equals(fqName)) {
          return descr;
        }
      }
    }
    Assert.fail(fqName + " not found in " + project.getName());
    return null;
  }

  protected static Project loadProject(File projectFile) {
    return ActiveEnvironment.get().openProject(projectFile);
  }

  protected static void cleanup(final Project p) {
    if (CREATED_ENV != null) {
      CREATED_ENV.disposeEnvironment();
    }
  }

  protected static void assertNoDiff(Map<String, String> expected, Map<String, String> actual) {
    String errors = buildDiff(expected, actual);
    if (errors.length() > 0) {
      Assert.fail("Diff:\n" + errors);
    }
  }

  private static Map<String, String> getHashes(SModel model) {
    Document m = ModelPersistence.saveModel(((SModelBase) model).getSModelInternal());
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      JDOMUtil.writeDocument(m, os);
    } catch (IOException e) {
      Assert.fail(e.getMessage());
    }
    return DefaultModelPersistence.getDigestMap(new InputStreamReader(new ByteArrayInputStream(os.toByteArray()), FileUtil.DEFAULT_CHARSET));
  }

  private static Map<String, String> getEmptyDigest() {
    Map<String, String> result = new HashMap<String, String>();
    result.put(GeneratableSModel.FILE, ModelDigestUtil.hashText(""));
    result.put(GeneratableSModel.HEADER, ModelDigestUtil.hashText(""));
    return result;

  }

  private static String buildDiff(Map<String, String> expected, Map<String, String> actual) {
    Set<String> keys = new HashSet<String>();
    keys.addAll(expected.keySet());
    keys.addAll(actual.keySet());

    StringBuilder errors = new StringBuilder();

    for (String name : keys) {
      String content = actual.get(name);
      if (content == null) {
        errors.append("File is not generated: " + name + "\n");
        continue;
      }
      String existing = expected.get(name);
      if (existing == null) {
        errors.append("Non-existing file generated: " + name + /* "\nContent: " + content + */ "\n");
        continue;
      }
      if (!existing.equals(content)) {
        for (String s : DifflibFacade.getSimpleDiff(existing, content)) {
          errors.append(s).append('\n');
        }
      }
    }
    return errors.toString();
  }

  protected void assertDiff(Map<String, String> expected, Map<String, String> actual, int numberOfChanges) {
    if (DEBUG) {
      System.out.println("Diff (debug):\n" + buildDiff(expected, actual));
    }

    Set<String> keys = new HashSet<String>();
    keys.addAll(expected.keySet());
    keys.addAll(actual.keySet());
    int changes = 0;

    for (String name : keys) {
      String content = actual.get(name);
      if (content == null) {
        changes++;
        continue;
      }
      String existing = expected.get(name);
      if (existing == null) {
        changes++;
        continue;
      }
      if (!existing.equals(content)) {
        changes++;
      }
    }
    Assert.assertTrue("At least " + numberOfChanges + " are required (have " + changes + ")", changes >= numberOfChanges);
  }

  private static class MyIncrementalGenerationStrategy implements IncrementalGenerationStrategy {
    private final SModel myModel;
    private final FileBasedGenerationCacheContainer myGenerationCacheContainer;
    private Map<String, String> myHash;
    private GenerationDependencies myDependencies;

    public MyIncrementalGenerationStrategy(SModel descr, FileBasedGenerationCacheContainer generationCacheContainer) {
      myModel = descr;
      myGenerationCacheContainer = generationCacheContainer;
    }

    void buildHash() {
      Map<String, String> hashes = getHashes(myModel);
      if (myHash != null) {
        Assert.assertEquals("header's SHA1 shouldn't change after model change", myHash.get(GeneratableSModel.HEADER),
            hashes.get(GeneratableSModel.HEADER));
        Assert.assertNotSame("file's SHA1 should change after model change", myHash.get(GeneratableSModel.FILE), hashes.get(GeneratableSModel.FILE));
      }
      myHash = hashes;
    }

    public Map<String, String> getHash() {
      return myHash;
    }

    @Override
    public Map<String, String> getModelHashes(SModel sm, IOperationContext operationContext) {
      if (sm == myModel) {
        return myHash;
      }
      return getEmptyDigest(); // ModelDigestHelper.getInstance().getGenerationHashes(sm, operationContext);
    }

    @Override
    public GenerationCacheContainer getContainer() {
      return myGenerationCacheContainer;
    }

    @Override
    public GenerationDependencies getDependencies(SModel sm) {
      if (myModel != sm) {
        return null;
      }
      return myDependencies;
    }

    @Override
    public boolean isIncrementalEnabled() {
      return true;
    }

    public void setDependencies(GenerationDependencies dependencies) {
      myDependencies = dependencies;
    }
  }

  private static class MyNonIncrementalGenerationStrategy implements IncrementalGenerationStrategy {

    @Override
    public Map<String, String> getModelHashes(SModel sm, IOperationContext operationContext) {
      return Collections.emptyMap();
    }

    @Override
    public GenerationCacheContainer getContainer() {
      return null;
    }

    @Override
    public GenerationDependencies getDependencies(SModel sm) {
      return null;
    }

    @Override
    public boolean isIncrementalEnabled() {
      return false;
    }
  }

  protected interface ModelChangeRunnable {
    void run(SModel model);
  }
}
