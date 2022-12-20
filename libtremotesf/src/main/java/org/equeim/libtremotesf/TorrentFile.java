/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.equeim.libtremotesf;

public class TorrentFile {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TorrentFile(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TorrentFile obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TorrentFile obj) {
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
        libtremotesfJNI.delete_TorrentFile(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getId() {
    return libtremotesfJNI.TorrentFile_id_get(swigCPtr, this);
  }

  public StringsVector getPath() {
    long cPtr = libtremotesfJNI.TorrentFile_path_get(swigCPtr, this);
    return (cPtr == 0) ? null : new StringsVector(cPtr, false);
  }

  public long getSize() {
    return libtremotesfJNI.TorrentFile_size_get(swigCPtr, this);
  }

  public long getCompletedSize() {
    return libtremotesfJNI.TorrentFile_completedSize_get(swigCPtr, this);
  }

  public TorrentFile.Priority getPriority() {
    return TorrentFile.Priority.swigToEnum(libtremotesfJNI.TorrentFile_priority_get(swigCPtr, this));
  }

  public boolean getWanted() {
    return libtremotesfJNI.TorrentFile_wanted_get(swigCPtr, this);
  }

  public enum Priority {
    Low(-1),
    Normal,
    High;

    public final int swigValue() {
      return swigValue;
    }

    public static Priority swigToEnum(int swigValue) {
      Priority[] swigValues = Priority.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Priority swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Priority.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Priority() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Priority(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Priority(Priority swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
