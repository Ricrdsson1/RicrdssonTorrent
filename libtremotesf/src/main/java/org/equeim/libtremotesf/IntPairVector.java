/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.equeim.libtremotesf;

public class IntPairVector extends java.util.AbstractList<IntPair> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntPairVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntPairVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(IntPairVector obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtremotesfJNI.delete_IntPairVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntPairVector(IntPair[] initialElements) {
    this();
    reserve(initialElements.length);

    for (IntPair element : initialElements) {
      add(element);
    }
  }

  public IntPairVector(Iterable<IntPair> initialElements) {
    this();
    for (IntPair element : initialElements) {
      add(element);
    }
  }

  public IntPair get(int index) {
    return doGet(index);
  }

  public IntPair set(int index, IntPair e) {
    return doSet(index, e);
  }

  public boolean add(IntPair e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, IntPair e) {
    modCount++;
    doAdd(index, e);
  }

  public IntPair remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public IntPairVector() {
    this(libtremotesfJNI.new_IntPairVector__SWIG_0(), true);
  }

  public IntPairVector(IntPairVector other) {
    this(libtremotesfJNI.new_IntPairVector__SWIG_1(IntPairVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return libtremotesfJNI.IntPairVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtremotesfJNI.IntPairVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtremotesfJNI.IntPairVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtremotesfJNI.IntPairVector_clear(swigCPtr, this);
  }

  public IntPairVector(int count, IntPair value) {
    this(libtremotesfJNI.new_IntPairVector__SWIG_2(count, IntPair.getCPtr(value), value), true);
  }

  private int doSize() {
    return libtremotesfJNI.IntPairVector_doSize(swigCPtr, this);
  }

  private void doAdd(IntPair x) {
    libtremotesfJNI.IntPairVector_doAdd__SWIG_0(swigCPtr, this, IntPair.getCPtr(x), x);
  }

  private void doAdd(int index, IntPair x) {
    libtremotesfJNI.IntPairVector_doAdd__SWIG_1(swigCPtr, this, index, IntPair.getCPtr(x), x);
  }

  private IntPair doRemove(int index) {
    return new IntPair(libtremotesfJNI.IntPairVector_doRemove(swigCPtr, this, index), true);
  }

  private IntPair doGet(int index) {
    return new IntPair(libtremotesfJNI.IntPairVector_doGet(swigCPtr, this, index), false);
  }

  private IntPair doSet(int index, IntPair val) {
    return new IntPair(libtremotesfJNI.IntPairVector_doSet(swigCPtr, this, index, IntPair.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    libtremotesfJNI.IntPairVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
