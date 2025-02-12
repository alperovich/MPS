package jetbrains.mps.tool.common.util;

/*Generated by MPS */

import java.io.File;
import java.net.URL;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import sun.misc.Resource;
import java.io.BufferedReader;
import java.io.FileReader;
import org.jetbrains.annotations.NonNls;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*package*/ class FileLoader extends Loader {
  private final File myRootDir;
  private final String myRootDirAbsolutePath;

  @SuppressWarnings(value = {"HardCodedStringLiteral"})
  /*package*/ FileLoader(URL url) throws IOException {
    super(url);
    if (!("file".equals(url.getProtocol()))) {
      throw new IllegalArgumentException("url");
    } else {
      final String s = FileUtil.unquote(url.getFile());
      myRootDir = new File(s);
      myRootDirAbsolutePath = myRootDir.getAbsolutePath();
    }
  }

  @Override
  /*package*/ void dispose() {
  }

  private void buildPackageCache(final File dir, ClasspathCache cache) {
    //  True -> class file 
    cache.addResourceEntry(getRelativeResourcePath(dir), this);
    final File[] files = dir.listFiles();
    if (files == null) {
      return;
    }
    boolean containsClasses = false;
    for (File file : files) {
      final boolean isClass = file.getPath().endsWith(UrlClassLoader.CLASS_EXTENSION);
      if (isClass) {
        if (!(containsClasses)) {
          cache.addResourceEntry(getRelativeResourcePath(file), this);
          containsClasses = true;
        }
      } else {
        buildPackageCache(file, cache);
      }
    }
  }

  private String getRelativeResourcePath(final File file) {
    String relativePath = file.getAbsolutePath().substring(myRootDirAbsolutePath.length());
    relativePath = relativePath.replace(File.separatorChar, '/');
    if (relativePath.startsWith("/")) {
      relativePath = relativePath.substring(1);
    }
    return relativePath;
  }

  @Nullable
  @Override
  /*package*/ Resource getResource(final String name, boolean flag) {
    try {
      final URL url = new URL(getBaseURL(), name);
      if (!(url.getFile().startsWith(getBaseURL().getFile()))) {
        return null;
      }
      final File file = new File(myRootDir, name.replace('/', File.separatorChar));
      if (file.exists()) {
        return new FileLoader.MyResource(name, url, file);
      }
    } catch (Exception exception) {
      return null;
    }
    return null;
  }

  @Override
  /*package*/ void buildCache(final ClasspathCache cache) throws IOException {
    File index = new File(myRootDir, "classpath.index");
    if (index.exists()) {
      BufferedReader reader = new BufferedReader(new FileReader(index));
      try {
        do {
          String line = reader.readLine();
          if (line == null) {
            break;
          }
          cache.addResourceEntry(line, this);
        } while (true);
      } finally {
        reader.close();
      }
    } else {
      cache.addResourceEntry("foo.class", this);
      cache.addResourceEntry("bar.properties", this);
      buildPackageCache(myRootDir, cache);
    }
  }

  @NonNls
  @Override
  public String toString() {
    return "FileLoader [" + myRootDir + "]";
  }

  private class MyResource extends Resource {
    private final String myName;
    private final URL myUrl;
    private final File myFile;

    public MyResource(String name, URL url, File file) {
      myName = name;
      myUrl = url;
      myFile = file;
    }

    @Override
    public String getName() {
      return myName;
    }

    @Override
    public URL getURL() {
      return myUrl;
    }

    @Override
    public URL getCodeSourceURL() {
      return getBaseURL();
    }

    @Override
    public InputStream getInputStream() throws IOException {
      return new BufferedInputStream(new FileInputStream(myFile));
    }

    @Override
    public int getContentLength() throws IOException {
      return -1;
    }

    @Override
    public String toString() {
      return myFile.getAbsolutePath();
    }
  }
}
