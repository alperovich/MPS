package jetbrains.mps.idea.java.psiStubs;

/*Generated by MPS */

import com.intellij.psi.PsiJavaFile;
import java.util.Set;
import jetbrains.mps.idea.java.psi.JavaPsiListener;

public abstract class PsiJavaStubEvent {


  public abstract Iterable<PsiJavaFile> removed();



  public abstract Set<PsiJavaFile> needReparse();



  public abstract Set<JavaPsiListener.FSRename> renamed();
}
