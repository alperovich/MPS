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
package jetbrains.mps.generator.impl.cache;

import jetbrains.mps.generator.TransientModelsProvider.TransientSwapOwner;
import jetbrains.mps.generator.TransientModelsProvider.TransientSwapSpace;
import jetbrains.mps.generator.TransientSModel;
import jetbrains.mps.persistence.binary.NodesReader;
import jetbrains.mps.persistence.binary.NodesWriter;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.util.Pair;
import jetbrains.mps.util.io.ModelInputStream;
import jetbrains.mps.util.io.ModelOutputStream;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * fyodor, 1/10/11
 */
public abstract class FileSwapOwner implements TransientSwapOwner {

  private static Logger LOG = LogManager.getLogger(FileSwapOwner.class);

  private Map<String, File> mySwapSpaces = new ConcurrentHashMap<String, File>();

  abstract protected File getSwapDir();

  @Override
  public TransientSwapSpace initSwapSpace(String spaceId) {
    return primSwapSpace(spaceId, true);
  }

  @Override
  public TransientSwapSpace accessSwapSpace(String spaceId) {
    return primSwapSpace(spaceId, false);
  }

  private TransientSwapSpace primSwapSpace(String spaceId, boolean init) {
    File swapDir = getSwapDir();
    if (swapDir == null) {
      LOG.error("No swap directory");
      return null;
    }

    File space = new File(swapDir, spaceId);
    if (space.exists()) {
      if (!space.isDirectory()) {
        LOG.error("Swap space is not a directory");
        return null;
      }

      if (init) {
        new FileSwapSpace(space).clear();
      }
    } else {
      if (!init) {
        return null;
      }

      if (!space.mkdirs()) {
        LOG.error("Couldn't create swap space directory");
        return null;
      }
    }

    return new FileSwapSpace(space);
  }

  public static class FileSwapSpace implements TransientSwapSpace {
    private File mySpaceDir;

    public FileSwapSpace(File dir) {
      mySpaceDir = dir;
    }

    @Override
    public boolean swapOut(TransientSModel model) {
      if (mySpaceDir == null || !mySpaceDir.exists()) throw new IllegalStateException("no swap dir");

      String modelId = model.getReference().getModelId().toString();
      if (modelId == null || modelId.isEmpty()) {
        LOG.error("Bad model id <" + modelId + ">");
        return false;
      }
      modelId = modelId.replaceAll(":", "-");

      File swapFile = new File(mySpaceDir, modelId);
      if (swapFile.exists() && !swapFile.delete()) {
        LOG.error("Couldn't delete swap file");
        return false;
      }

      ArrayList<SNode> roots = new ArrayList<SNode>();
      for (Iterator<SNode> it = model.getRootNodes().iterator(); it.hasNext(); ) {
        roots.add(it.next());
      }
      ModelOutputStream mos = null;
      IOException ioex = null;
      try {
        mos = new ModelOutputStream(new FileOutputStream(swapFile));
        saveModel(model.getReference(), roots, mos);
      } catch (IOException e) {
        ioex = e;
        LOG.error(null, e);
      } finally {
        if (mos != null) {
          try {
            mos.close();
          } catch (IOException ignore) {
          }
        }
      }

      return ioex == null;
    }

    @Override
    public TransientSModel restoreFromSwap(SModelReference mref) {
      if (mySpaceDir == null || !mySpaceDir.exists()) throw new IllegalStateException("no swap dir");

      String modelId = mref.getModelId().toString();
      if (modelId == null || modelId.isEmpty()) {
        throw new IllegalStateException("bad modelId");
      }
      modelId = modelId.replaceAll(":", "-");

      File swapFile = new File(mySpaceDir, modelId);
      if (!swapFile.exists()) {
        throw new IllegalStateException("no swap file");
      }

      ModelInputStream mis = null;
      try {
        mis = new ModelInputStream(new FileInputStream(swapFile));
        return loadModel(mref, mis, new TransientSModel(mref));
      } catch (IOException e) {
        LOG.error(null, e);
        throw new RuntimeException(e);
      } finally {
        if (mis != null) {
          try {
            mis.close();
          } catch (IOException ignore) {
          }
        }
        if (!swapFile.delete()) {
          LOG.error("Couldn't delete swap file");
        }
        ;
      }
    }

    @Override
    public void clear() {
      if (mySpaceDir == null || !mySpaceDir.exists()) throw new IllegalStateException("no swap dir");

      for (File f : mySpaceDir.listFiles()) {
        f.delete();
      }
      mySpaceDir.delete();
      mySpaceDir = null;
    }

    private static final int VERSION = 48;

    public TransientSModel loadModel(SModelReference modelReference, ModelInputStream is, TransientSModel model) throws IOException {
      int version = is.readInt();
      if (version != VERSION) {
        return null;
      }

      List<Pair<String, SNode>> roots = new NodesReader(modelReference, null, false).readNodes(model, is);
      for (Pair<String, SNode> r : roots) {
        model.addRootNode(r.o2);
      }

      // ensure imports are back
      SModelOperations.validateLanguagesAndImports(model.getModelDescriptor(), false, false);

      return model;
    }

    public void saveModel(SModelReference modelReference, List<SNode> roots, ModelOutputStream os) throws IOException {
      os.writeInt(VERSION);
      new NodesWriter(modelReference, null).writeNodes(roots, os);
    }

  }

  // method created for testing
  public static SNode writeAndReadNode(SNode node) throws IOException {
    NodesWriter writer = new NodesWriter(node.getModel().getReference(), null);
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    ModelOutputStream mos = new ModelOutputStream(os);
    writer.writeNode(node, mos);
    mos.close();

    NodesReader reader = new NodesReader(node.getModel().getReference(), null, false);
    ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());

    return reader.readNode(((jetbrains.mps.smodel.SNode) node).getPersistentModel(), new ModelInputStream(is)).o2;
  }

  // method created for testing
  public static SModel writeAndReadModel(SModel model) throws IOException {
    // write
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    ModelOutputStream mos = new ModelOutputStream(os);

    ArrayList<SNode> roots = new ArrayList<SNode>();
    for (Iterator<SNode> it = model.getRootNodes().iterator(); it.hasNext(); ) {
      roots.add(it.next());
    }
    mos.writeInt(44);
    new NodesWriter(model.getReference(), null).writeNodes(roots, mos);
    mos.close();

    jetbrains.mps.smodel.SModel resultModel = new jetbrains.mps.smodel.SModel(
        PersistenceFacade.getInstance().createModelReference("smodel.long.name.for.testing"));
    ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
    ModelInputStream mis = new ModelInputStream(is);

    // read
    int version = mis.readInt();
    if (version != 44) {
      return null;
    }
    List<Pair<String, SNode>> resultRoots = new NodesReader(resultModel.getReference(), null, false).readNodes(resultModel, mis);
    for (Pair<String, SNode> root : resultRoots) {
      resultModel.addRootNode(root.o2);
    }

    SModelOperations.validateLanguagesAndImports(resultModel.getModelDescriptor(), false, false);

    return resultModel.getModelDescriptor();
  }
}
