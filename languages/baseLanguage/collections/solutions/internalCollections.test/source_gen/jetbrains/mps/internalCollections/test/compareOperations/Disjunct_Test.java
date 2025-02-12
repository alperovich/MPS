package jetbrains.mps.internalCollections.test.compareOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Arrays;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;
import java.util.NoSuchElementException;

public class Disjunct_Test extends Util_Test {
  public void test_disjunctionMethod() throws Exception {
    ISequence<Integer> input = Sequence.fromArray(1, 2, 3, 3, 3);
    ISequence<Integer> test = input.disjunction(Sequence.fromArray(1, 2, 2, 3, 3, 4));
    this.assertIterableEqualsIgnoreOrder(Arrays.asList(2, 3, 4), test);
  }

  public void test_discjunctOperation() throws Exception {
    Iterable<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4);
    Iterable<Integer> test = Sequence.fromIterable(input).disjunction(ListSequence.fromList(Arrays.asList(1, 2, 4, 4, 5)));
    this.assertIterableEqualsIgnoreOrder(Arrays.asList(2, 3, 5), test);
  }

  public void test_disjunctOpCovariant() throws Exception {
    Foo foo1 = new Foo();
    Foo foo2 = new Foo();
    Bar bar1 = new Bar();
    Bar bar2 = new Bar();
    Foo foo3 = bar1;
    Iterable<Foo> first = ListSequence.fromListAndArray(new ArrayList<Foo>(), foo1, foo3, foo2);
    Iterable<Bar> second = Sequence.fromArray(new Bar[]{bar1, bar2});
    Iterable<Foo> res = Sequence.fromIterable(first).disjunction(Sequence.fromIterable(second));
    assertIterableEquals(Sequence.fromArray(new Foo[]{foo1, foo2, bar2}), res);
  }

  public void test_disjunctionEquivalence() throws Exception {
    Iterable<String> a = Arrays.asList("X", "W", "Z", "Y", "X", "Z", "X", "Y", "W");
    Iterable<String> b = Arrays.asList("V", "X", "V", "Z", "Z", "Z", "Y");
    this.assertIterableEqualsIgnoreOrder(Sequence.fromIterable(a).disjunction(Sequence.fromIterable(b)), Sequence.fromIterable(a).union(Sequence.fromIterable(b)).subtract(Sequence.fromIterable(a).intersect(Sequence.fromIterable(b))));
    this.assertIterableEqualsIgnoreOrder(Sequence.fromIterable(a).disjunction(Sequence.fromIterable(b)), Sequence.fromIterable(a).subtract(Sequence.fromIterable(b)).union(Sequence.fromIterable(b).subtract(Sequence.fromIterable(a))));
  }

  public void test_nextWithoutHasNext() throws Exception {
    Iterator<Integer> it = ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4)).disjunction(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<Integer>(), 3, 4, 5, 6))).iterator();
    Assert.assertSame(1, it.next());
    Assert.assertSame(2, it.next());
    Assert.assertSame(5, it.next());
    Assert.assertSame(6, it.next());
    Assert.assertFalse(it.hasNext());
    try {
      it.next();
      Assert.fail();
    } catch (NoSuchElementException e) {
      // expected exception 
    }
  }
}
