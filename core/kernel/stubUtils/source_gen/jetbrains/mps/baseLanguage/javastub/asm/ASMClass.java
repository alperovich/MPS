package jetbrains.mps.baseLanguage.javastub.asm;

/*Generated by MPS */

import org.jetbrains.asm4.tree.ClassNode;
import java.util.List;
import java.util.ArrayList;
import org.jetbrains.asm4.ClassReader;
import org.jetbrains.asm4.signature.SignatureReader;
import org.jetbrains.asm4.signature.SignatureVisitor;
import org.jetbrains.asm4.tree.FieldNode;
import org.jetbrains.asm4.tree.MethodNode;
import org.jetbrains.asm4.tree.AnnotationNode;
import org.jetbrains.asm4.Opcodes;
import org.jetbrains.asm4.tree.InnerClassNode;
import java.util.Collections;

public class ASMClass {
  private ClassNode myNode;
  private List<ASMTypeVariable> myTypeVariables = new ArrayList<ASMTypeVariable>();
  private List<ASMType> myGenericInterfaces = new ArrayList<ASMType>();
  private List<ASMField> myFields = new ArrayList<ASMField>();
  private List<ASMMethod> myMethods = new ArrayList<ASMMethod>();
  private List<ASMMethod> myConstructors = new ArrayList<ASMMethod>();
  private List<ASMAnnotation> myAnnotations;
  private ASMType myGenericSuperclass;

  public ASMClass(ClassReader reader) {
    myNode = new ClassNode();
    try {
      reader.accept(myNode, ClassReader.SKIP_CODE & ClassReader.SKIP_DEBUG & ClassReader.SKIP_FRAMES);
    } catch (RuntimeException e) {
      // see MPS-17590 
      return;
    }
    if (myNode.signature != null) {
      SignatureReader signReader = new SignatureReader(myNode.signature);
      signReader.accept(new SignatureVisitorAdapter() {
        @Override
        public SignatureVisitor visitSuperclass() {
          return new ASMClass.ClassifierSignatureVisitor() {
            @Override
            public void visitEnd() {
              ASMClassType cls = new ASMClassType(myName);
              myGenericSuperclass = new ASMParameterizedType(cls, myParameters);
            }
          };
        }

        @Override
        public SignatureVisitor visitInterface() {
          return new ASMClass.ClassifierSignatureVisitor() {
            @Override
            public void visitEnd() {
              ASMClassType cls = new ASMClassType(myName);
              myGenericInterfaces.add(new ASMParameterizedType(cls, myParameters));
            }
          };
        }
      });
    } else {
      if (myNode.superName != null) {
        myGenericSuperclass = new ASMClassType(myNode.superName.replace('/', '.'));
      }
      for (String intfc : (List<String>) myNode.interfaces) {
        myGenericInterfaces.add(new ASMClassType(intfc.replace('/', '.')));
      }
    }
    if (myNode.signature != null) {
      myTypeVariables.addAll(TypeUtil.getFormalTypeParameters(myNode.signature));
    }
    for (FieldNode fn : (List<FieldNode>) myNode.fields) {
      myFields.add(new ASMField(fn));
    }
    for (MethodNode mn : (List<MethodNode>) myNode.methods) {
      ASMMethod am = new ASMMethod(mn);
      if (am.isConstructor()) {
        myConstructors.add(am);
      } else {
        myMethods.add(am);
      }
    }
    if (myNode.visibleAnnotations != null || myNode.invisibleAnnotations != null) {
      int size = ((myNode.visibleAnnotations != null ?
        myNode.visibleAnnotations.size() :
        0
      )) + ((myNode.invisibleAnnotations != null ?
        myNode.invisibleAnnotations.size() :
        0
      ));
      myAnnotations = new ArrayList<ASMAnnotation>(size);
      if (myNode.visibleAnnotations != null) {
        for (AnnotationNode an : (List<AnnotationNode>) myNode.visibleAnnotations) {
          ASMAnnotation aa = new ASMAnnotation(an);
          myAnnotations.add(aa);
        }
      }
      if (myNode.invisibleAnnotations != null) {
        for (AnnotationNode an : (List<AnnotationNode>) myNode.invisibleAnnotations) {
          ASMAnnotation aa = new ASMAnnotation(an);
          myAnnotations.add(aa);
        }
      }
    }
  }

  public boolean isAbstract() {
    return (myNode.access & Opcodes.ACC_ABSTRACT) != 0;
  }

  public boolean isStatic() {
    return (myNode.access & Opcodes.ACC_STATIC) != 0;
  }

  public boolean isPublic() {
    return (myNode.access & Opcodes.ACC_PUBLIC) != 0;
  }

  public boolean isFinal() {
    return (myNode.access & Opcodes.ACC_FINAL) != 0;
  }

  public boolean isDeprecated() {
    return (Opcodes.ACC_DEPRECATED & myNode.access) != 0;
  }

  public String getName() {
    return (myNode.name == null ?
      "" :
      myNode.name
    );
  }

  public String getFqName() {
    if (myNode.name == null) {
      return "";
    }
    return myNode.name.replace("/", ".");
  }

  public List<InnerClassNode> getInnerClasses() {
    return myNode.innerClasses;
  }

  public List<ASMTypeVariable> getTypeParameters() {
    return Collections.unmodifiableList(myTypeVariables);
  }

  public List<ASMType> getGenericInterfaces() {
    return Collections.unmodifiableList(myGenericInterfaces);
  }

  public List<ASMAnnotation> getAnnotations() {
    return ((List<ASMAnnotation>) (myAnnotations == null ?
      Collections.emptyList() :
      Collections.unmodifiableList(myAnnotations)
    ));
  }

  public ASMType getGenericSuperclass() {
    return myGenericSuperclass;
  }

  public List<ASMField> getDeclaredFields() {
    return Collections.unmodifiableList(myFields);
  }

  public List<ASMMethod> getDeclaredMethods() {
    return Collections.unmodifiableList(myMethods);
  }

  public List<ASMMethod> getDeclaredConstructors() {
    return Collections.unmodifiableList(myConstructors);
  }

  private class ClassifierSignatureVisitor extends SignatureVisitorAdapter {
    /*package*/ String myName;
    /*package*/ List<ASMType> myParameters;
    /*package*/ ASMClass.ClassifierSignatureVisitor myParentVisitor = null;

    public ClassifierSignatureVisitor() {
    }

    public ClassifierSignatureVisitor(ASMClass.ClassifierSignatureVisitor parentVisitor) {
      myParentVisitor = parentVisitor;
    }

    @Override
    public SignatureVisitor visitTypeArgument(char wildcard) {
      return new ASMClass.ClassifierSignatureVisitor(this) {
        @Override
        public void visitTypeVariable(String name) {
          if (myParentVisitor != null) {
            if (myParentVisitor.myParameters == null) {
              myParentVisitor.myParameters = new ArrayList<ASMType>();
            }
            myParentVisitor.myParameters.add(new ASMTypeVariable(name));
          }
        }

        @Override
        public void visitEnd() {
          if (myParentVisitor != null) {
            ASMClassType cls = new ASMClassType(myName);
            if (myParentVisitor.myParameters == null) {
              myParentVisitor.myParameters = new ArrayList<ASMType>();
            }
            myParentVisitor.myParameters.add(new ASMParameterizedType(cls, myParameters));
          }
        }
      };
    }

    @Override
    public void visitClassType(String name) {
      myName = name.replace('/', '.');
    }
  }
}
