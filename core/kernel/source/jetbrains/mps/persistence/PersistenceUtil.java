/*
 * Copyright 2003-2013 JetBrains s.r.o.
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
package jetbrains.mps.persistence;

import jetbrains.mps.extapi.persistence.FileDataSource;
import jetbrains.mps.extapi.persistence.FolderDataSource;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.misc.hash.LinkedHashMap;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.persistence.DataSourceListener;
import org.jetbrains.mps.openapi.persistence.ModelFactory;
import org.jetbrains.mps.openapi.persistence.ModelSaveException;
import org.jetbrains.mps.openapi.persistence.MultiStreamDataSource;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.persistence.StreamDataSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/**
 * evgeny, 3/6/13
 */
public class PersistenceUtil {
  private final static String PER_ROOT_PERSISTENCE_FACTORY = "file-per-root";

  private PersistenceUtil() {
  }

  public static SModel loadModel(final String content, String extension) {
    ModelFactory factory = PersistenceFacade.getInstance().getModelFactory(extension);
    if (factory == null || factory.isBinary()) {
      return null;
    }
    try {
      SModel model = factory.load(new StreamDataSourceBase() {
        @Override
        public InputStream openInputStream() throws IOException {
          byte[] bytes = content.getBytes(FileUtil.DEFAULT_CHARSET);
          return new ByteArrayInputStream(bytes);
        }
      }, Collections.<String, String>singletonMap(ModelFactory.OPTION_CONTENT_ONLY, Boolean.TRUE.toString()));
      model.load();
      return model;
    } catch (IOException ex) {
      return null;
    }
  }

  public static SModel loadModel(final byte[] content, String extension) {
    ModelFactory factory = PersistenceFacade.getInstance().getModelFactory(extension);
    if (factory == null || !factory.isBinary()) {
      return null;
    }
    try {
      SModel model = factory.load(new StreamDataSourceBase() {
        @Override
        public InputStream openInputStream() throws IOException {
          return new ByteArrayInputStream(content);
        }
      }, Collections.<String, String>singletonMap(ModelFactory.OPTION_CONTENT_ONLY, Boolean.TRUE.toString()));
      model.load();
      return model;
    } catch (IOException ex) {
      return null;
    }
  }

  public static SModel loadModel(IFile file) {
    return loadModel(file, FileUtil.getExtension(file.getName()));
  }

  public static SModel loadModel(IFile file, String extension) {
    ModelFactory factory = PersistenceFacade.getInstance().getModelFactory(extension);
    if (factory == null) {
      return null;
    }
    try {
      SModel model = null;
      if(factory instanceof FolderModelFactory) {
        model = factory.load(new FolderDataSource(file.getParent(), null), Collections.<String, String>singletonMap(ModelFactory.OPTION_CONTENT_ONLY,
          Boolean.TRUE.toString()));
      } else {
        model = factory.load(new FileDataSource(file), Collections.<String, String>singletonMap(ModelFactory.OPTION_CONTENT_ONLY,
          Boolean.TRUE.toString()));
      }
      model.load();
      return model;
    } catch (IOException ex) {
      return null;
    }
  }

  public static String saveModel(final SModel model, String extension) {
    ModelFactory factory = PersistenceRegistry.getInstance().getModelFactory(extension);
    if (factory == null || factory.isBinary()) {
      return null;
    }
    try {
      InMemoryStreamDataSource source = new InMemoryStreamDataSource();
      factory.save(model, source);
      return source.getContent(FileUtil.DEFAULT_CHARSET_NAME);
    } catch (ModelSaveException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static SModel loadPerRootModel(final Map<String, Object> content) {
    FolderModelFactory factory = PersistenceRegistry.getInstance().getFolderModelFactory(PER_ROOT_PERSISTENCE_FACTORY);
    if (factory == null || factory.isBinary()) {
      return null;
    }
    try {
      SModel model = factory.load(new MultiStreamDataSourceBase() {
        @Override
        public Iterable<String> getAvailableStreams() {
          return content.keySet();
        }
        @Override
        public InputStream openInputStream(String name) throws IOException {
          Object data = content.get(name);
          if (data instanceof String) {
            return new ByteArrayInputStream(((String)data).getBytes(FileUtil.DEFAULT_CHARSET));
          } else if (data instanceof byte[]) {
            return new ByteArrayInputStream((byte[])data);
          }
          throw new UnsupportedOperationException();
        }
      }, Collections.<String, String>emptyMap());
      model.load();
      return model;
    } catch (IOException ex) {
      return null;
    }
  }

  public static String savePerRootModel(final SModel model, String name) {
    FolderModelFactory factory = PersistenceRegistry.getInstance().getFolderModelFactory(PER_ROOT_PERSISTENCE_FACTORY);
    if (factory == null || factory.isBinary()) {
      return null;
    }
    try {
      InMemoryMultiStreamDataSource source = new InMemoryMultiStreamDataSource();
      factory.save(model, source);
      return source.getContent(name, FileUtil.DEFAULT_CHARSET_NAME);
    } catch (ModelSaveException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static String savePerRootModel(final SModel model, boolean isHeader) {
    FolderModelFactory factory = PersistenceRegistry.getInstance().getFolderModelFactory(PER_ROOT_PERSISTENCE_FACTORY);
    if (factory == null || factory.isBinary()) {
      return null;
    }
    try {
      InMemoryMultiStreamDataSource source = new InMemoryMultiStreamDataSource();
      factory.save(model, source);
      if (isHeader) {
        return source.getContent(MPSExtentions.DOT_MODEL_HEADER, FileUtil.DEFAULT_CHARSET_NAME);
      } else {
        for (String name : source.getAvailableStreams()) {
          if (name.equals(MPSExtentions.DOT_MODEL_HEADER)) continue;
          return source.getContent(name, FileUtil.DEFAULT_CHARSET_NAME);
        }
      }
    } catch (ModelSaveException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  private static class StreamDataSourceBase implements StreamDataSource {

    @NotNull
    @Override
    public String getLocation() {
      return "in-memory";
    }

    @Override
    public boolean isReadOnly() {
      return true;
    }

    @Override
    public InputStream openInputStream() throws IOException {
      throw new UnsupportedOperationException();
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
      throw new UnsupportedOperationException();
    }

    @Override
    public void addListener(DataSourceListener listener) {

    }

    @Override
    public void removeListener(DataSourceListener listener) {

    }

    @Override
    public long getTimestamp() {
      return 0;
    }
  }

  private static class InMemoryStreamDataSource extends StreamDataSourceBase {
    private ByteArrayOutputStream myStream;

    @Override
    public OutputStream openOutputStream() throws IOException {
      myStream = new ByteArrayOutputStream();
      return myStream;
    }
    @Override
    public boolean isReadOnly() {
      return false;
    }

    public String getContent(String charsetName) {
      try {
        return myStream.toString(charsetName);
      } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
        return null;
      }
    }
  }

  private abstract static class MultiStreamDataSourceBase implements MultiStreamDataSource {

    @Override
    public InputStream openInputStream(String name) throws IOException {
      throw new UnsupportedOperationException();
    }

    @Override
    public OutputStream openOutputStream(String name) throws IOException {
      throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(String name) {
      throw new UnsupportedOperationException();
    }

    @NotNull
    @Override
    public String getLocation() {
      return "in-memory";
    }

    @Override
    public void addListener(DataSourceListener listener) {
      throw new UnsupportedOperationException();
    }

    @Override
    public void removeListener(DataSourceListener listener) {
      throw new UnsupportedOperationException();
    }

    @Override
    public long getTimestamp() {
      return 0;
    }

    @Override
    public boolean isReadOnly() {
      return true;
    }
  }

  private static class InMemoryMultiStreamDataSource extends MultiStreamDataSourceBase {
    private Map<String, ByteArrayOutputStream> myStreams = new LinkedHashMap<String, ByteArrayOutputStream>();

    @Override
    public Iterable<String> getAvailableStreams() {
      return myStreams.keySet();
    }
    @Override
    public OutputStream openOutputStream(String name) throws IOException {
      ByteArrayOutputStream stream = new ByteArrayOutputStream();
      myStreams.put(name, stream);
      return stream;
    }
    @Override
    public boolean isReadOnly() {
      return false;
    }

    public String getContent(String name, String charsetName) {
      try {
        ByteArrayOutputStream stream = myStreams.get(name);
        if (stream == null) {
          return null;
        }
        return stream.toString(charsetName);
      } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
        return null;
      }
    }
  }
}
