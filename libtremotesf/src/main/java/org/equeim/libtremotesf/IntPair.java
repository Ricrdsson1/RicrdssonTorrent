/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.equeim.libtremotesf;

public class IntPair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntPair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntPair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(IntPair obj) {
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

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtremotesfJNI.delete_IntPair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntPair() {
    this(libtremotesfJNI.new_IntPair__SWIG_0(), true);
  }

  public IntPair(int first, int second) {
    this(libtremotesfJNI.new_IntPair__SWIG_1(first, second), true);
  }

  public IntPair(IntPair other) {
    this(libtremotesfJNI.new_IntPair__SWIG_2(IntPair.getCPtr(other), other), true);
  }

  public int getFirst() {
    return libtremotesfJNI.IntPair_first_get(swigCPtr, this);
  }

  public int getSecond() {
    return libtremotesfJNI.IntPair_second_get(swigCPtr, this);
  }

}
