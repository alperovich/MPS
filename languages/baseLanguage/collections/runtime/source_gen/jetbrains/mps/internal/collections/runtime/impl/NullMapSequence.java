package jetbrains.mps.internal.collections.runtime.impl;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.IMapping;
import jetbrains.mps.internal.collections.runtime.IMapSequence;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ISetSequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;

public class NullMapSequence<U, V> extends NullSequence<IMapping<U, V>> implements IMapSequence<U, V>, Map<U, V> {
  public static final NullMapSequence<Object, Object> INSTANCE = new NullMapSequence<Object, Object>();

  protected NullMapSequence() {
  }

  @Override
  public void clear() {
  }

  @Override
  public boolean containsKey(Object key) {
    return false;
  }

  @Override
  public boolean containsValue(Object value) {
    return false;
  }

  @Override
  public Set<Map.Entry<U, V>> entrySet() {
    return Collections.emptySet();
  }

  @Override
  public V get(Object key) {
    return null;
  }

  @Override
  public Set<U> keySet() {
    return Collections.emptySet();
  }

  @Override
  public V put(U key, V value) {
    return null;
  }

  @Override
  public void putAll(Map<? extends U, ? extends V> m) {
  }

  @Override
  public V remove(Object key) {
    return null;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public Collection<V> values() {
    return Collections.emptySet();
  }

  @Override
  public IMapSequence<U, V> putAll(IMapSequence<? extends U, ? extends V> map) {
    return this;
  }

  @Override
  public V putValue(U key, V value) {
    return null;
  }

  @Override
  public V removeKey(U u) {
    return null;
  }

  @Override
  public Map<U, V> toMap() {
    return this;
  }

  @Override
  public Iterator<IMapping<U, V>> iterator() {
    return new NullSequence.EmptyIterator<IMapping<U, V>>();
  }

  @Override
  public ISetSequence<IMapping<U, V>> mappingsSet() {
    return SetSequence.fromSet(Collections.<IMapping<U, V>>emptySet());
  }

  @SuppressWarnings(value = "unchecked")
  public static <P, Q> NullMapSequence<P, Q> instance() {
    return (NullMapSequence<P, Q>) INSTANCE;
  }
}
