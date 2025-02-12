package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import junit.framework.TestCase;
import java.util.Queue;
import jetbrains.mps.internal.collections.runtime.QueueSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import junit.framework.Assert;
import java.util.PriorityQueue;
import jetbrains.mps.internal.collections.runtime.backports.Deque;
import jetbrains.mps.internal.collections.runtime.DequeSequence;

public class QueueDequeStack_Test extends TestCase {
  public void test_queue() throws Exception {
    Queue<Integer> q = QueueSequence.fromQueue(new LinkedList<Integer>());
    QueueSequence.fromQueue(q).addLastElement(1);
    QueueSequence.fromQueue(q).addLastElement(2);
    QueueSequence.fromQueue(q).addLastElement(3);
    Queue<Integer> q2 = QueueSequence.fromQueueAndArray(new LinkedList<Integer>(), 1, 2, 3);
    Assert.assertTrue(eq_5js43w_a0a5a0(q, q2));
    Assert.assertSame(1, QueueSequence.fromQueue(q).first());
    Assert.assertSame(1, QueueSequence.fromQueue(q).removeFirstElement());
    Assert.assertSame(2, QueueSequence.fromQueue(q).first());
    Assert.assertSame(3, QueueSequence.fromQueue(q).last());
    Assert.assertSame(2, QueueSequence.fromQueue(q).removeFirstElement());
    Assert.assertSame(3, QueueSequence.fromQueue(q).removeFirstElement());
    Assert.assertTrue(QueueSequence.fromQueue(q).isEmpty());
  }

  public void test_priorityQueue() throws Exception {
    Queue<Integer> q = QueueSequence.fromQueue(new PriorityQueue<Integer>());
    QueueSequence.fromQueue(q).addLastElement(3);
    QueueSequence.fromQueue(q).addLastElement(2);
    QueueSequence.fromQueue(q).addLastElement(1);
    Assert.assertSame(1, QueueSequence.fromQueue(q).first());
    Assert.assertSame(1, QueueSequence.fromQueue(q).removeFirstElement());
    Assert.assertSame(2, QueueSequence.fromQueue(q).first());
    Assert.assertSame(3, QueueSequence.fromQueue(q).last());
    Assert.assertSame(2, QueueSequence.fromQueue(q).removeFirstElement());
    Assert.assertSame(3, QueueSequence.fromQueue(q).removeFirstElement());
    Assert.assertTrue(QueueSequence.fromQueue(q).isEmpty());
  }

  public void test_stack() throws Exception {
    Deque<Integer> s = DequeSequence.fromDeque(new LinkedList<Integer>());
    DequeSequence.fromDeque(s).addFirstElement(1);
    DequeSequence.fromDeque(s).addFirstElement(2);
    DequeSequence.fromDeque(s).addFirstElement(3);
    Assert.assertSame(3, DequeSequence.fromDeque(s).first());
    Assert.assertSame(3, DequeSequence.fromDeque(s).removeFirstElement());
    Assert.assertSame(2, DequeSequence.fromDeque(s).first());
    Assert.assertSame(1, DequeSequence.fromDeque(s).last());
    Assert.assertSame(2, DequeSequence.fromDeque(s).removeFirstElement());
    Assert.assertSame(1, DequeSequence.fromDeque(s).removeFirstElement());
    Assert.assertTrue(DequeSequence.fromDeque(s).isEmpty());
  }

  public void test_stackClassic() throws Exception {
    Deque<Integer> s = DequeSequence.fromDeque(new LinkedList<Integer>());
    DequeSequence.fromDeque(s).pushElement(1);
    DequeSequence.fromDeque(s).pushElement(2);
    DequeSequence.fromDeque(s).pushElement(3);
    Assert.assertSame(3, DequeSequence.fromDeque(s).first());
    Assert.assertSame(3, DequeSequence.fromDeque(s).peekElement());
    Assert.assertSame(3, DequeSequence.fromDeque(s).popElement());
    Assert.assertSame(2, DequeSequence.fromDeque(s).first());
    Assert.assertSame(2, DequeSequence.fromDeque(s).peekElement());
    Assert.assertSame(1, DequeSequence.fromDeque(s).last());
    Assert.assertSame(2, DequeSequence.fromDeque(s).popElement());
    Assert.assertSame(1, DequeSequence.fromDeque(s).popElement());
    Assert.assertTrue(DequeSequence.fromDeque(s).isEmpty());
  }

  public void test_deque() throws Exception {
    Deque<Integer> d = DequeSequence.fromDeque(new LinkedList<Integer>());
    DequeSequence.fromDeque(d).addFirstElement(1);
    DequeSequence.fromDeque(d).addFirstElement(2);
    DequeSequence.fromDeque(d).addFirstElement(3);
    Assert.assertSame(3, DequeSequence.fromDeque(d).first());
    Assert.assertSame(3, DequeSequence.fromDeque(d).removeFirstElement());
    DequeSequence.fromDeque(d).addLastElement(4);
    DequeSequence.fromDeque(d).addLastElement(5);
    DequeSequence.fromDeque(d).addLastElement(6);
    Assert.assertSame(2, DequeSequence.fromDeque(d).first());
    Assert.assertSame(2, DequeSequence.fromDeque(d).peekElement());
    Assert.assertSame(6, DequeSequence.fromDeque(d).last());
    Assert.assertSame(6, DequeSequence.fromDeque(d).removeLastElement());
    Assert.assertSame(2, DequeSequence.fromDeque(d).removeFirstElement());
    Assert.assertSame(1, DequeSequence.fromDeque(d).first());
    Assert.assertSame(1, DequeSequence.fromDeque(d).peekElement());
    Assert.assertSame(1, DequeSequence.fromDeque(d).removeFirstElement());
    Assert.assertSame(4, DequeSequence.fromDeque(d).first());
    Assert.assertSame(4, DequeSequence.fromDeque(d).peekElement());
    Assert.assertSame(4, DequeSequence.fromDeque(d).removeFirstElement());
    Assert.assertSame(5, DequeSequence.fromDeque(d).last());
    Assert.assertSame(5, DequeSequence.fromDeque(d).removeLastElement());
    Assert.assertTrue(DequeSequence.fromDeque(d).isEmpty());
  }

  public QueueDequeStack_Test() {
  }

  private static boolean eq_5js43w_a0a5a0(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
