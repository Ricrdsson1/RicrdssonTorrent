/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.equeim.libtremotesf;

public class Tracker {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Tracker(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Tracker obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(Tracker obj) {
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
        libtremotesfJNI.delete_Tracker(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int id() {
    return libtremotesfJNI.Tracker_id(swigCPtr, this);
  }

  public String announce() {
    return libtremotesfJNI.Tracker_announce(swigCPtr, this);
}

  public String site() {
    return libtremotesfJNI.Tracker_site(swigCPtr, this);
}

  public Tracker.Status status() {
    return Tracker.Status.swigToEnum(libtremotesfJNI.Tracker_status(swigCPtr, this));
  }

  public String errorMessage() {
    return libtremotesfJNI.Tracker_errorMessage(swigCPtr, this);
}

  public int peers() {
    return libtremotesfJNI.Tracker_peers(swigCPtr, this);
  }

  public int seeders() {
    return libtremotesfJNI.Tracker_seeders(swigCPtr, this);
  }

  public int leechers() {
    return libtremotesfJNI.Tracker_leechers(swigCPtr, this);
  }

  public @androidx.annotation.Nullable org.threeten.bp.Instant nextUpdateTime() { return org.equeim.libtremotesf.libtremotesfJNI.millisToInstant(libtremotesfJNI.Tracker_nextUpdateTime(swigCPtr, this)); }

  public enum Status {
    Inactive,
    WaitingForUpdate,
    QueuedForUpdate,
    Updating;

    public final int swigValue() {
      return swigValue;
    }

    public static Status swigToEnum(int swigValue) {
      Status[] swigValues = Status.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Status swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Status.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Status() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Status(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Status(Status swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
