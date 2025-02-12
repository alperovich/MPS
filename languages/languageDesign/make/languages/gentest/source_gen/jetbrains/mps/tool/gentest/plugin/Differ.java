package jetbrains.mps.tool.gentest.plugin;

/*Generated by MPS */

import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.io.File;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import difflib.Patch;
import difflib.DiffUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import jetbrains.mps.util.FileUtil;
import java.io.IOException;
import java.util.Arrays;

public class Differ {
  private static final char SLASH_CHAR = '/';
  private static final String SLASH = "/";
  private Set<String> ignoredFiles = SetSequence.fromSetAndArray(new HashSet<String>(), "generated", "trace.info", "dependencies", ".dependencies", ".generated", ".debug");
  private String[] retainedPaths;
  private Set<File> excludedFiles;

  public Differ(Set<String> retainedFilePaths, Set<File> excludedFiles) {
    this.retainedPaths = SetSequence.fromSet(retainedFilePaths).select(new ISelector<String, String>() {
      public String select(String it) {
        return straighten(it);
      }
    }).sort(new ISelector<String, String>() {
      public String select(String p) {
        return p;
      }
    }, true).toListSequence().toGenericArray(String.class);
    this.excludedFiles = excludedFiles;
  }

  public List<String> diff(String origPath, String revdPath) {
    List<String> diffs = ListSequence.fromList(new ArrayList<String>());
    if (origPath != null && revdPath != null) {
      File orig = new File(origPath);
      File revd = new File(revdPath);
      if (orig.exists() && revd.exists() && orig.isDirectory() && revd.isDirectory()) {
        diffDirs(orig, revd, diffs);
      } else if (!(orig.exists()) && !(revd.exists())) {
        ListSequence.fromList(diffs).addElement("None exists: " + orig + " or " + revd);
      } else if (!(orig.exists())) {
        ListSequence.fromList(diffs).addElement("Created: " + revd);
      } else if (!(revd.exists())) {
        if (!(isRetained(orig.getAbsolutePath()))) {
          ListSequence.fromList(diffs).addElement("Removed: " + orig);
        }
      } else {
        ListSequence.fromList(diffs).addElement("Something weird here: " + orig + " or here " + revd);
      }
    } else if (origPath != null) {
      ListSequence.fromList(diffs).addElement("Removed: " + origPath);
    } else if (revdPath != null) {
      ListSequence.fromList(diffs).addElement("Created: " + revdPath);
    } else {
      ListSequence.fromList(diffs).addElement("Invalid input");
    }
    return diffs;
  }

  private void diffDirs(final File orig, File revd, final List<String> diffs) {
    Iterable<String> onames = Sequence.fromArray(orig.list());
    Iterable<String> rnames = Sequence.fromArray(revd.list());
    if (Sequence.fromIterable(onames).disjunction(Sequence.fromIterable(rnames)).isNotEmpty()) {
      Sequence.fromIterable(onames).subtract(Sequence.fromIterable(rnames)).visitAll(new IVisitor<String>() {
        public void visit(String it) {
          if (!(ignoredFile(it))) {
            File itfile = new File(orig, it);
            if (!(itfile.isDirectory()) || !(isRetained(itfile.getAbsolutePath()))) {
              ListSequence.fromList(diffs).addElement("Removed: " + itfile);
            }
          }
        }
      });
      Sequence.fromIterable(rnames).subtract(Sequence.fromIterable(onames)).visitAll(new IVisitor<String>() {
        public void visit(String it) {
          if (!(ignoredFile(it))) {
            ListSequence.fromList(diffs).addElement("Created: " + new File(orig, it));
          }
        }
      });
    }
    for (String name : Sequence.fromIterable(onames).intersect(Sequence.fromIterable(rnames))) {
      if (ignoredFile(name)) {
        continue;
      }
      File onext = new File(orig, name);
      if (excluded(onext)) {
        continue;
      }
      File rnext = new File(revd, name);
      if (onext.isDirectory() == rnext.isDirectory()) {
        if (!(onext.isDirectory())) {
          List<String> olines = fileToStrings(onext);
          List<String> rlines = fileToStrings(rnext);
          if (ListSequence.fromList(olines).isNotEmpty() && ListSequence.fromList(rlines).isNotEmpty()) {
            Patch patch = DiffUtils.diff(olines, rlines);
            if (!(patch.getDeltas().isEmpty())) {
              ListSequence.fromList(diffs).addSequence(ListSequence.fromList(DiffUtils.generateUnifiedDiff(onext.getPath(), rnext.getPath(), olines, patch, 5)));
            }
          }
        } else {
          diffDirs(onext, rnext, diffs);
        }
      } else {
        ListSequence.fromList(diffs).addElement("Something weird here: " + onext + " or here " + rnext);
      }
    }
  }

  private boolean ignoredFile(String fileName) {
    return SetSequence.fromSet(ignoredFiles).contains(fileName) || (fileName != null && fileName.startsWith(".hash"));
  }

  private boolean excluded(File file) {
    return SetSequence.fromSet(excludedFiles).contains(file);
  }

  private List<String> fileToStrings(File f) {
    List<String> result = ListSequence.fromList(new ArrayList<String>());
    BufferedReader in = null;
    try {
      in = new BufferedReader(new InputStreamReader(new FileInputStream(f), FileUtil.DEFAULT_CHARSET));
      String line;
      while ((line = in.readLine()) != null) {
        ListSequence.fromList(result).addElement(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException ignore) {
        }
      }
    }
    return result;
  }

  private boolean isRetained(String dir) {
    String path = asDir(straighten(dir));
    int idx = Arrays.binarySearch(retainedPaths, path);
    idx = (idx < 0 ?
      -1 - idx :
      idx
    );
    return idx < retainedPaths.length && startsWith(retainedPaths[idx], path);
  }

  private String straighten(String path) {
    return path.replace(File.separatorChar, SLASH_CHAR);
  }

  private String asDir(String path) {
    return (path.endsWith(SLASH) ?
      path :
      path + SLASH
    );
  }

  private boolean startsWith(String path, String prefix) {
    return path.startsWith(prefix) && (path.length() == prefix.length() || prefix.endsWith(SLASH) || path.charAt(prefix.length()) == SLASH_CHAR);
  }
}
