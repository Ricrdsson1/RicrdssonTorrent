/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.equeim.libtremotesf;

public class ServerSettingsData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ServerSettingsData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ServerSettingsData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ServerSettingsData obj) {
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
        libtremotesfJNI.delete_ServerSettingsData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean canRenameFiles() {
    return libtremotesfJNI.ServerSettingsData_canRenameFiles(swigCPtr, this);
  }

  public boolean canShowFreeSpaceForPath() {
    return libtremotesfJNI.ServerSettingsData_canShowFreeSpaceForPath(swigCPtr, this);
  }

  public boolean hasSessionIdFile() {
    return libtremotesfJNI.ServerSettingsData_hasSessionIdFile(swigCPtr, this);
  }

  public int getRpcVersion() {
    return libtremotesfJNI.ServerSettingsData_rpcVersion_get(swigCPtr, this);
  }

  public int getMinimumRpcVersion() {
    return libtremotesfJNI.ServerSettingsData_minimumRpcVersion_get(swigCPtr, this);
  }

  public String getDownloadDirectory() {
    return libtremotesfJNI.ServerSettingsData_downloadDirectory_get(swigCPtr, this);
}

  public boolean getStartAddedTorrents() {
    return libtremotesfJNI.ServerSettingsData_startAddedTorrents_get(swigCPtr, this);
  }

  public boolean getTrashTorrentFiles() {
    return libtremotesfJNI.ServerSettingsData_trashTorrentFiles_get(swigCPtr, this);
  }

  public boolean getRenameIncompleteFiles() {
    return libtremotesfJNI.ServerSettingsData_renameIncompleteFiles_get(swigCPtr, this);
  }

  public boolean getIncompleteDirectoryEnabled() {
    return libtremotesfJNI.ServerSettingsData_incompleteDirectoryEnabled_get(swigCPtr, this);
  }

  public String getIncompleteDirectory() {
    return libtremotesfJNI.ServerSettingsData_incompleteDirectory_get(swigCPtr, this);
}

  public boolean getRatioLimited() {
    return libtremotesfJNI.ServerSettingsData_ratioLimited_get(swigCPtr, this);
  }

  public double getRatioLimit() {
    return libtremotesfJNI.ServerSettingsData_ratioLimit_get(swigCPtr, this);
  }

  public boolean getIdleSeedingLimited() {
    return libtremotesfJNI.ServerSettingsData_idleSeedingLimited_get(swigCPtr, this);
  }

  public int getIdleSeedingLimit() {
    return libtremotesfJNI.ServerSettingsData_idleSeedingLimit_get(swigCPtr, this);
  }

  public boolean getDownloadQueueEnabled() {
    return libtremotesfJNI.ServerSettingsData_downloadQueueEnabled_get(swigCPtr, this);
  }

  public int getDownloadQueueSize() {
    return libtremotesfJNI.ServerSettingsData_downloadQueueSize_get(swigCPtr, this);
  }

  public boolean getSeedQueueEnabled() {
    return libtremotesfJNI.ServerSettingsData_seedQueueEnabled_get(swigCPtr, this);
  }

  public int getSeedQueueSize() {
    return libtremotesfJNI.ServerSettingsData_seedQueueSize_get(swigCPtr, this);
  }

  public boolean getIdleQueueLimited() {
    return libtremotesfJNI.ServerSettingsData_idleQueueLimited_get(swigCPtr, this);
  }

  public int getIdleQueueLimit() {
    return libtremotesfJNI.ServerSettingsData_idleQueueLimit_get(swigCPtr, this);
  }

  public boolean getDownloadSpeedLimited() {
    return libtremotesfJNI.ServerSettingsData_downloadSpeedLimited_get(swigCPtr, this);
  }

  public int getDownloadSpeedLimit() {
    return libtremotesfJNI.ServerSettingsData_downloadSpeedLimit_get(swigCPtr, this);
  }

  public boolean getUploadSpeedLimited() {
    return libtremotesfJNI.ServerSettingsData_uploadSpeedLimited_get(swigCPtr, this);
  }

  public int getUploadSpeedLimit() {
    return libtremotesfJNI.ServerSettingsData_uploadSpeedLimit_get(swigCPtr, this);
  }

  public boolean getAlternativeSpeedLimitsEnabled() {
    return libtremotesfJNI.ServerSettingsData_alternativeSpeedLimitsEnabled_get(swigCPtr, this);
  }

  public int getAlternativeDownloadSpeedLimit() {
    return libtremotesfJNI.ServerSettingsData_alternativeDownloadSpeedLimit_get(swigCPtr, this);
  }

  public int getAlternativeUploadSpeedLimit() {
    return libtremotesfJNI.ServerSettingsData_alternativeUploadSpeedLimit_get(swigCPtr, this);
  }

  public boolean getAlternativeSpeedLimitsScheduled() {
    return libtremotesfJNI.ServerSettingsData_alternativeSpeedLimitsScheduled_get(swigCPtr, this);
  }

  public org.threeten.bp.LocalTime getAlternativeSpeedLimitsBeginTime() { return org.threeten.bp.LocalTime.ofNanoOfDay(libtremotesfJNI.ServerSettingsData_alternativeSpeedLimitsBeginTime_get(swigCPtr, this)); }

  public org.threeten.bp.LocalTime getAlternativeSpeedLimitsEndTime() { return org.threeten.bp.LocalTime.ofNanoOfDay(libtremotesfJNI.ServerSettingsData_alternativeSpeedLimitsEndTime_get(swigCPtr, this)); }

  public ServerSettingsData.AlternativeSpeedLimitsDays getAlternativeSpeedLimitsDays() {
    return ServerSettingsData.AlternativeSpeedLimitsDays.swigToEnum(libtremotesfJNI.ServerSettingsData_alternativeSpeedLimitsDays_get(swigCPtr, this));
  }

  public int getPeerPort() {
    return libtremotesfJNI.ServerSettingsData_peerPort_get(swigCPtr, this);
  }

  public boolean getRandomPortEnabled() {
    return libtremotesfJNI.ServerSettingsData_randomPortEnabled_get(swigCPtr, this);
  }

  public boolean getPortForwardingEnabled() {
    return libtremotesfJNI.ServerSettingsData_portForwardingEnabled_get(swigCPtr, this);
  }

  public ServerSettingsData.EncryptionMode getEncryptionMode() {
    return ServerSettingsData.EncryptionMode.swigToEnum(libtremotesfJNI.ServerSettingsData_encryptionMode_get(swigCPtr, this));
  }

  public boolean getUtpEnabled() {
    return libtremotesfJNI.ServerSettingsData_utpEnabled_get(swigCPtr, this);
  }

  public boolean getPexEnabled() {
    return libtremotesfJNI.ServerSettingsData_pexEnabled_get(swigCPtr, this);
  }

  public boolean getDhtEnabled() {
    return libtremotesfJNI.ServerSettingsData_dhtEnabled_get(swigCPtr, this);
  }

  public boolean getLpdEnabled() {
    return libtremotesfJNI.ServerSettingsData_lpdEnabled_get(swigCPtr, this);
  }

  public int getMaximumPeersPerTorrent() {
    return libtremotesfJNI.ServerSettingsData_maximumPeersPerTorrent_get(swigCPtr, this);
  }

  public int getMaximumPeersGlobally() {
    return libtremotesfJNI.ServerSettingsData_maximumPeersGlobally_get(swigCPtr, this);
  }

  public ServerSettingsData() {
    this(libtremotesfJNI.new_ServerSettingsData(), true);
  }

  public enum AlternativeSpeedLimitsDays {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Weekdays,
    Weekends,
    All;

    public final int swigValue() {
      return swigValue;
    }

    public static AlternativeSpeedLimitsDays swigToEnum(int swigValue) {
      AlternativeSpeedLimitsDays[] swigValues = AlternativeSpeedLimitsDays.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (AlternativeSpeedLimitsDays swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + AlternativeSpeedLimitsDays.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private AlternativeSpeedLimitsDays() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private AlternativeSpeedLimitsDays(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private AlternativeSpeedLimitsDays(AlternativeSpeedLimitsDays swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum EncryptionMode {
    Allowed,
    Preferred,
    Required;

    public final int swigValue() {
      return swigValue;
    }

    public static EncryptionMode swigToEnum(int swigValue) {
      EncryptionMode[] swigValues = EncryptionMode.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (EncryptionMode swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + EncryptionMode.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private EncryptionMode() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private EncryptionMode(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private EncryptionMode(EncryptionMode swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
