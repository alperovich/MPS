package jetbrains.mps.baseLanguage.doubleDispatch.typesystem;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IMapping;

public class DispatchGroup {
  private DispatchGroupDescriptor myDescriptor;
  private List<DispatchGroup.ClassMethodGroup> myGroupsByClass = ListSequence.fromList(new ArrayList<DispatchGroup.ClassMethodGroup>());

  public DispatchGroup(DispatchGroupDescriptor descriptor, SNode cls) {
    myDescriptor = descriptor;
    startNewClass(cls);
  }

  public void startNewClass(SNode cls) {
    ListSequence.fromList(myGroupsByClass).addElement(new DispatchGroup.ClassMethodGroup(cls));
  }

  public void addMethod(SNode method) {
    ListSequence.fromList(myGroupsByClass).last().addMethod(method);
  }

  @Override
  public void finalize() {
    List<DispatchGroup.ClassMethodGroup> filtered = ListSequence.fromList(myGroupsByClass).where(new IWhereFilter<DispatchGroup.ClassMethodGroup>() {
      public boolean accept(DispatchGroup.ClassMethodGroup it) {
        return MapSequence.fromMap(it.methods).isNotEmpty();
      }
    }).toListSequence();
    myGroupsByClass = filtered;
  }

  public DispatchGroup.Error check() {

    DispatchGroup.ClassMethodGroup thisClassGroup = ListSequence.fromList(myGroupsByClass).first();
    Iterable<DispatchGroup.ClassMethodGroup> superClassesGroups = ListSequence.fromList(myGroupsByClass).skip(1);
    Set<SNode> roots = thisClassGroup.getRoots();

    if ((int) ListSequence.fromList(myGroupsByClass).count() == 1) {
      // this group is local to our class, doesn't span to superclasses 

      if ((int) SetSequence.fromSet(roots).count() == 1) {
        return null;
      }

      // more than one root 
      Iterable<SNode> methodsForRoots = thisClassGroup.methodsByDispatchTypes(roots);
      return new DispatchGroup.Error("Dispatch parameter type hierarchy must have a single root", methodsForRoots);
    }

    // The group spans to super-classes. 

    // dispatch param classes that are not handled in superclasses 
    Set<SNode> badRoots = SetSequence.fromSet(new HashSet<SNode>());
    for (final SNode root : SetSequence.fromSet(roots)) {
      if (!(Sequence.fromIterable(superClassesGroups).any(new IWhereFilter<DispatchGroup.ClassMethodGroup>() {
        public boolean accept(DispatchGroup.ClassMethodGroup it) {
          return MapSequence.fromMap(it.methods).containsKey(root);
        }
      }))) {
        SetSequence.fromSet(badRoots).addElement(root);
      }
    }

    if (SetSequence.fromSet(badRoots).isEmpty()) {
      return null;
    }

    Iterable<SNode> methodsForBadRoots = thisClassGroup.methodsByDispatchTypes(badRoots);

    if ((int) SetSequence.fromSet(badRoots).count() == 1) {
      // check if the class is the superclass for any other dispatch param classes in group 

      final SNode cls = SetSequence.fromSet(badRoots).first();
      boolean isGlobalRoot = Sequence.fromIterable(superClassesGroups).all(new IWhereFilter<DispatchGroup.ClassMethodGroup>() {
        public boolean accept(DispatchGroup.ClassMethodGroup it) {
          return SetSequence.fromSet(MapSequence.fromMap(it.methods).keySet()).all(new IWhereFilter<SNode>() {
            public boolean accept(SNode it) {
              return DispatchUtil.isParent(cls, it);
            }
          });
        }
      });

      if (!(isGlobalRoot)) {
        return new DispatchGroup.Error("Dispatch type not present in super classes and is not a supertype for other param types", methodsForBadRoots);
      }

    } else {
      // there are bad roots 
      return new DispatchGroup.Error("Dispatch type not present in super classes", methodsForBadRoots);
    }

    // no errors 
    return null;
  }

  public class ClassMethodGroup {
    private SNode classifier;
    private Map<SNode, SNode> methods;

    public ClassMethodGroup(SNode cls) {
      classifier = cls;
      methods = MapSequence.fromMap(new HashMap<SNode, SNode>());
    }

    public void addMethod(SNode method) {
      SNode paramClass = DispatchUtil.getParamClass(method);
      MapSequence.fromMap(methods).put(paramClass, method);
    }

    public Set<SNode> getRoots() {
      Set<SNode> roots = SetSequence.fromSet(new HashSet<SNode>());

      Iterable<Iterator<SNode>> paths = MapSequence.fromMap(methods).select(new ISelector<IMapping<SNode, SNode>, Iterator<SNode>>() {
        public Iterator<SNode> select(IMapping<SNode, SNode> it) {
          return Sequence.fromIterable(DispatchUtil.ancestors(it.key(), false)).iterator();
        }
      });

      while (Sequence.fromIterable(paths).isNotEmpty()) {
        List<Iterator<SNode>> unendedPaths = ListSequence.fromList(new ArrayList<Iterator<SNode>>());

        for (Iterator<SNode> p : Sequence.fromIterable(paths)) {
          SNode c = p.next();
          if (MapSequence.fromMap(methods).containsKey(c)) {
            SetSequence.fromSet(roots).addElement(c);
          } else {
            ListSequence.fromList(unendedPaths).addElement(p);
          }
        }
        paths = unendedPaths;
      }

      return roots;
    }

    public Iterable<SNode> methodsByDispatchTypes(final Set<SNode> classes) {
      return MapSequence.fromMap(methods).where(new IWhereFilter<IMapping<SNode, SNode>>() {
        public boolean accept(IMapping<SNode, SNode> it) {
          return SetSequence.fromSet(classes).contains(it.key());
        }
      }).select(new ISelector<IMapping<SNode, SNode>, SNode>() {
        public SNode select(IMapping<SNode, SNode> it) {
          return it.value();
        }
      });
    }
  }

  public class Error {
    private String msg;
    private Iterable<SNode> errMethods;

    public Error(String msg, Iterable<SNode> ms) {
      this.msg = msg;
      errMethods = ms;
    }

    public String getMessage() {
      return msg;
    }

    public Iterable<SNode> getMethods() {
      return errMethods;
    }
  }
}
