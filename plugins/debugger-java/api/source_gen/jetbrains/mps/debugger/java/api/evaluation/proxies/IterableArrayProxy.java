package jetbrains.mps.debugger.java.api.evaluation.proxies;

/*Generated by MPS */

import java.util.Iterator;

public class IterableArrayProxy<T extends IValueProxy> implements Iterable<T> {
  private final IArrayValueProxy myValueProxy;

  public IterableArrayProxy(IArrayValueProxy valueProxy) {
    myValueProxy = valueProxy;
  }

  @Override
  public Iterator<T> iterator() {
    return new IterableArrayProxy.MyIterator();
  }

  private class MyIterator implements Iterator<T> {
    private int myIndex = 0;

    private MyIterator() {
    }

    @Override
    public boolean hasNext() {
      return myIndex < myValueProxy.getLength();
    }

    @Override
    public T next() {
      return (T) myValueProxy.getElementAt(myIndex++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("Cannot remove an element from an array.");
    }
  }
}
