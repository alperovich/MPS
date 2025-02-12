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
package jetbrains.mps.generator.generationTypes.java;

import jetbrains.mps.generator.ModelGenerationStatusManager;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.JDOMUtil;
import jetbrains.mps.vfs.IFile;
import org.jdom.Document;
import org.jdom.Element;
import org.jetbrains.mps.openapi.model.SModel;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class FileProcessor {
  private static final Logger LOG = LogManager.getLogger(FileProcessor.class);

  private final List<SModel> myModels = new ArrayList<SModel>();
  private final List<FileAndContent> myFilesAndContents = new ArrayList<FileAndContent>();
  private final List<IFile> myFilesToDelete = new ArrayList<IFile>();

  private final Object LOCK = new Object();

  public void invalidateModel(SModel modelDescriptor) {
    synchronized (LOCK) {
      myModels.add(modelDescriptor);
    }
  }

  public void saveContent(IFile file, String content) {
    saveContent(new FileAndContent(file, new StringFileContent(content)));
  }

  public void saveContent(IFile file, Element content) {
    saveContent(new FileAndContent(file, new XMLFileContent(content)));
  }

  public void saveContent(IFile file, byte[] content) {
    saveContent(new FileAndContent(file, new BinaryFileContent(content)));
  }

  private void saveContent(FileAndContent fileAndContent) {
    myFilesAndContents.add(fileAndContent);
  }

  public void filesToDelete(Collection<IFile> files) {
    myFilesToDelete.addAll(files);
  }

  public void saveGeneratedFiles() {
    for (FileAndContent fileAndContent : myFilesAndContents) {
      fileAndContent.save();
    }

    for (IFile file : myFilesToDelete) {
      file.delete();
    }

    ModelGenerationStatusManager.getInstance().invalidateData(myModels);
  }

  private static class FileAndContent {
    private IFile myFile;
    private FileContent myContent;

    private FileAndContent(IFile file, FileContent content) {
      myFile = file;
      myContent = content;
    }

    private void save() {
      myContent.saveToFile(myFile);
    }

    @Override
    public String toString() {
      return myFile.toString();
    }
  }

  private interface FileContent {
    void saveToFile(IFile file);
  }

  private static class StringFileContent implements FileContent {
    private String myContent;

    private StringFileContent(String content) {
      myContent = content;
    }

    @Override
    public void saveToFile(IFile file) {
      if (file.exists() && isUnchanged(file)) {
        return;
      }

      OutputStreamWriter writer = null;
      try {
        writer = new OutputStreamWriter(new BufferedOutputStream(file.openOutputStream()), FileUtil.DEFAULT_CHARSET);
        writer.write(myContent);
      } catch (IOException e) {
        LOG.error(null, e);
      } finally {
        if (writer != null) {
          try {
            writer.close();
          } catch (IOException ignored) {
          }
        }
      }
    }

    private boolean isUnchanged(IFile file) {
      BufferedReader reader = null;
      StringBuilder res = new StringBuilder();
      try {
        reader = new BufferedReader(new InputStreamReader(file.openInputStream(), FileUtil.DEFAULT_CHARSET));
        String line;
        while ((line = reader.readLine()) != null) {
          res.append(line).append('\n');
        }
        return res.toString().equals(myContent);
      } catch (IOException ex) {
        return false;
      } finally {
        try {
          if (reader != null) {
            reader.close();
          }
        } catch (IOException ex) {
          return false;
        }
      }
    }
  }

  private static class BinaryFileContent implements FileContent {
    private byte[] myContent;

    private BinaryFileContent(byte[] content) {
      myContent = content;
    }

    @Override
    public void saveToFile(IFile file) {
      if (file.exists() && isUnchanged(file)) {
        return;
      }

      OutputStream stream = null;
      try {
        stream = file.openOutputStream();
        stream.write(myContent);
      } catch (IOException e) {
        LOG.error(null, e);
      } finally {
        if (stream != null) {
          try {
            stream.close();
          } catch (IOException ignored) {
          }
        }
      }
    }

    private boolean isUnchanged(IFile file) {
      long len = file.length();
      if (len != myContent.length) {
        return false;
      }

      byte[] res = new byte[myContent.length];
      InputStream stream = null;
      try {
        stream = file.openInputStream();
        if (stream.read(res) != len) {
          return false;
        }
        return Arrays.equals(res, myContent);
      } catch (IOException ex) {
        return false;
      } finally {
        if (stream != null) {
          try {
            stream.close();
          } catch (IOException ex) {
            return false;
          }
        }
      }
    }
  }

  private static class XMLFileContent implements FileContent {
    private Element myElement;

    private XMLFileContent(Element element) {
      myElement = element;
    }

    @Override
    public void saveToFile(IFile file) {
      try {
        JDOMUtil.writeDocument(new Document(myElement), file);
      } catch (IOException e) {
        LOG.error(null, e);
      }
    }
  }
}
