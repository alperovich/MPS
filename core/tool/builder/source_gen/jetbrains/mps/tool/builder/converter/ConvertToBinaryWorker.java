package jetbrains.mps.tool.builder.converter;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.MPSCore;
import jetbrains.mps.persistence.MPSPersistence;
import jetbrains.mps.persistence.PersistenceRegistry;
import jetbrains.mps.persistence.LightModelEnvironmentInfoImpl;
import java.io.IOException;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.smodel.DefaultSModel;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.extapi.persistence.FileDataSource;
import jetbrains.mps.persistence.binary.BinaryPersistence;
import jetbrains.mps.smodel.persistence.def.ModelReadException;

public class ConvertToBinaryWorker {
  public ConvertToBinaryWorker() {
  }

  public void convert(Map<String, String> map, Boolean stripImplementation) {
    MPSCore.getInstance().init();
    MPSPersistence.getInstance().init();
    MPSCore.getInstance().setMergeDriverMode(true);
    PersistenceRegistry.getInstance().setModelEnvironmentInfo(new LightModelEnvironmentInfoImpl());
    System.setProperty("mps.playRefactorings", "false");
    try {
      for (Map.Entry<String, String> entry : map.entrySet()) {
        convertModelToBinary(entry.getKey(), entry.getValue(), stripImplementation);
      }
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    } finally {
      PersistenceRegistry.getInstance().setModelEnvironmentInfo(null);
      MPSPersistence.getInstance().dispose();
      MPSCore.getInstance().dispose();
    }
  }

  private void convertModelToBinary(String sourceFile, String destFile, boolean stripImplementation) throws IOException {
    IFile source = FileSystem.getInstance().getFileByPath(sourceFile);
    try {
      DefaultSModel model = (stripImplementation ?
        ModelPersistence.readModelWithoutImplementation(new FileDataSource(source)) :
        ModelPersistence.readModel(new FileDataSource(source), false)
      );
      if (model.getSModelHeader().getPersistenceVersion() < ModelPersistence.LAST_VERSION) {
        throw new IOException("cannot convert " + sourceFile + ": model persistence is too old, please upgrade");
      }
      BinaryPersistence.writeModel(model, new FileDataSource(FileSystem.getInstance().getFileByPath(destFile)));
    } catch (ModelReadException e) {
      throw new IOException("Couldn't parse " + sourceFile + ": " + e.getMessageEx(), e);
    }
  }
}
