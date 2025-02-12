package jetbrains.mps.baseLanguage.collections.trove.runtime;

/*Generated by MPS */

import java.util.AbstractList;
import java.util.List;
import java.io.Serializable;
import gnu.trove.TByteArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.NoSuchElementException;

public class TByteArrayListDecorator extends AbstractList<Byte> implements List<Byte>, Serializable {
  private static final long serialVersionUID = -2994287303793904190L;
  private TByteArrayList primList;

  public TByteArrayListDecorator() {
  }

  public TByteArrayListDecorator(TByteArrayList prim) {
    this.primList = prim;
  }

  @Override
  protected void removeRange(int fromIdx, int toIdx) {
    this.primList.remove(fromIdx, toIdx - fromIdx);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object that) {
    if (that instanceof TByteArrayListDecorator && this.primList == ((TByteArrayListDecorator) that).primList) {
      return true;
    }
    return super.equals(that);
  }

  @Override
  public List<Byte> subList(int fromIdx, int toIdx) {
    return new TByteArrayListDecorator(this.primList.subList(fromIdx, toIdx));
  }

  @Override
  public ListIterator<Byte> listIterator() {
    return new TByteArrayListDecorator.TByteListIterator(0);
  }

  @Override
  public void clear() {
    this.primList.clear();
  }

  @Override
  public int lastIndexOf(Object e) {
    return this.primList.lastIndexOf(this.unwrap(e));
  }

  @Override
  public int indexOf(Object e) {
    return this.primList.indexOf(this.unwrap(e));
  }

  @Override
  public boolean add(Byte e) {
    this.primList.add(this.unwrap(e));
    return true;
  }

  @Override
  public Iterator<Byte> iterator() {
    return this.listIterator();
  }

  @Override
  public boolean addAll(int idx, Collection<? extends Byte> that) {
    return super.addAll(idx, that);
  }

  @Override
  public Byte remove(int e) {
    return this.primList.remove(e);
  }

  @Override
  public void add(int index, Byte e) {
    this.primList.insert(index, this.unwrap(e));
  }

  @Override
  public Byte set(int p0, Byte p1) {
    return super.set(p0, p1);
  }

  @Override
  public Byte get(int index) {
    return this.wrap(this.primList.get(index));
  }

  @Override
  public String toString() {
    return this.primList.toString();
  }

  @Override
  public boolean retainAll(Collection<?> that) {
    return super.retainAll(that);
  }

  @Override
  public boolean removeAll(Collection<?> that) {
    return super.removeAll(that);
  }

  @Override
  public boolean addAll(Collection<? extends Byte> that) {
    return super.addAll(that);
  }

  @Override
  public boolean containsAll(Collection<?> that) {
    return super.containsAll(that);
  }

  @Override
  public boolean remove(Object e) {
    return (e instanceof Byte ?
      this.removePrim(this.unwrap(e)) :
      false
    );
  }

  @Override
  public <T extends Object> T[] toArray(T[] array) {
    return super.toArray(array);
  }

  @Override
  public Object[] toArray() {
    return super.toArray();
  }

  @Override
  public boolean contains(Object e) {
    return (e instanceof Byte ?
      this.primList.contains(this.unwrap(e)) :
      false
    );
  }

  @Override
  public boolean isEmpty() {
    return this.primList.isEmpty();
  }

  public int size() {
    return this.primList.size();
  }

  public ListIterator<Byte> listIterator(int index) {
    return new TByteArrayListDecorator.TByteListIterator(index);
  }

  protected boolean removePrim(byte primValue) {
    int idx = this.primList.indexOf(primValue);
    if (idx >= 0) {
      this.primList.remove(idx);
      return true;
    }
    return false;
  }

  protected Byte wrap(byte primValue) {
    return Byte.valueOf(primValue);
  }

  protected byte unwrap(Object value) {
    return ((Byte) value).byteValue();
  }

  public class TByteListIterator implements ListIterator<Byte> {
    private int nextIdx;

    public TByteListIterator(int startAt) {
      this.nextIdx = startAt;
    }

    public void add(Byte e) {
      throw new UnsupportedOperationException();
    }

    public void set(Byte e) {
      throw new UnsupportedOperationException();
    }

    public void remove() {
      TByteArrayListDecorator.this.primList.remove(this.nextIdx);
    }

    public int previousIndex() {
      return this.nextIdx - 1;
    }

    public int nextIndex() {
      return this.nextIdx;
    }

    public Byte previous() {
      if (this.nextIdx > 0 && this.nextIdx <= TByteArrayListDecorator.this.primList.size()) {
        return TByteArrayListDecorator.this.wrap(TByteArrayListDecorator.this.primList.get(--this.nextIdx));
      }
      throw new NoSuchElementException();
    }

    public boolean hasPrevious() {
      return this.nextIdx > 0 && this.nextIdx <= TByteArrayListDecorator.this.primList.size();
    }

    public Byte next() {
      if (this.nextIdx >= 0 && this.nextIdx < TByteArrayListDecorator.this.primList.size()) {
        return TByteArrayListDecorator.this.wrap(TByteArrayListDecorator.this.primList.get(this.nextIdx++));
      }
      throw new NoSuchElementException();
    }

    public boolean hasNext() {
      return this.nextIdx >= 0 && this.nextIdx < TByteArrayListDecorator.this.primList.size();
    }
  }
}
