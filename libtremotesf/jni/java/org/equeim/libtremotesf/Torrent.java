/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.equeim.libtremotesf;

public class Torrent {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Torrent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Torrent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtremotesfJNI.delete_Torrent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int id() {
    return libtremotesfJNI.Torrent_id(swigCPtr, this);
  }

  public String hashString() {
    return libtremotesfJNI.Torrent_hashString(swigCPtr, this);
}

  public String name() {
    return libtremotesfJNI.Torrent_name(swigCPtr, this);
}

  public int status() {
    return libtremotesfJNI.Torrent_status(swigCPtr, this);
  }

  public String errorString() {
    return libtremotesfJNI.Torrent_errorString(swigCPtr, this);
}

  public int queuePosition() {
    return libtremotesfJNI.Torrent_queuePosition(swigCPtr, this);
  }

  public long totalSize() {
    return libtremotesfJNI.Torrent_totalSize(swigCPtr, this);
  }

  public long completedSize() {
    return libtremotesfJNI.Torrent_completedSize(swigCPtr, this);
  }

  public long leftUntilDone() {
    return libtremotesfJNI.Torrent_leftUntilDone(swigCPtr, this);
  }

  public long sizeWhenDone() {
    return libtremotesfJNI.Torrent_sizeWhenDone(swigCPtr, this);
  }

  public double percentDone() {
    return libtremotesfJNI.Torrent_percentDone(swigCPtr, this);
  }

  public boolean isFinished() {
    return libtremotesfJNI.Torrent_isFinished(swigCPtr, this);
  }

  public double recheckProgress() {
    return libtremotesfJNI.Torrent_recheckProgress(swigCPtr, this);
  }

  public int eta() {
    return libtremotesfJNI.Torrent_eta(swigCPtr, this);
  }

  public long downloadSpeed() {
    return libtremotesfJNI.Torrent_downloadSpeed(swigCPtr, this);
  }

  public long uploadSpeed() {
    return libtremotesfJNI.Torrent_uploadSpeed(swigCPtr, this);
  }

  public boolean isDownloadSpeedLimited() {
    return libtremotesfJNI.Torrent_isDownloadSpeedLimited(swigCPtr, this);
  }

  public int downloadSpeedLimit() {
    return libtremotesfJNI.Torrent_downloadSpeedLimit(swigCPtr, this);
  }

  public boolean isUploadSpeedLimited() {
    return libtremotesfJNI.Torrent_isUploadSpeedLimited(swigCPtr, this);
  }

  public int uploadSpeedLimit() {
    return libtremotesfJNI.Torrent_uploadSpeedLimit(swigCPtr, this);
  }

  public long totalDownloaded() {
    return libtremotesfJNI.Torrent_totalDownloaded(swigCPtr, this);
  }

  public long totalUploaded() {
    return libtremotesfJNI.Torrent_totalUploaded(swigCPtr, this);
  }

  public double ratio() {
    return libtremotesfJNI.Torrent_ratio(swigCPtr, this);
  }

  public int ratioLimitMode() {
    return libtremotesfJNI.Torrent_ratioLimitMode(swigCPtr, this);
  }

  public double ratioLimit() {
    return libtremotesfJNI.Torrent_ratioLimit(swigCPtr, this);
  }

  public int seeders() {
    return libtremotesfJNI.Torrent_seeders(swigCPtr, this);
  }

  public int leechers() {
    return libtremotesfJNI.Torrent_leechers(swigCPtr, this);
  }

  public int peersLimit() {
    return libtremotesfJNI.Torrent_peersLimit(swigCPtr, this);
  }

  public java.util.Date addedDate() {
    return libtremotesfJNI.Torrent_addedDate(swigCPtr, this);
}

  public java.util.Date activityDate() {
    return libtremotesfJNI.Torrent_activityDate(swigCPtr, this);
}

  public java.util.Date doneDate() {
    return libtremotesfJNI.Torrent_doneDate(swigCPtr, this);
}

  public boolean honorSessionLimits() {
    return libtremotesfJNI.Torrent_honorSessionLimits(swigCPtr, this);
  }

  public int bandwidthPriority() {
    return libtremotesfJNI.Torrent_bandwidthPriority(swigCPtr, this);
  }

  public int idleSeedingLimitMode() {
    return libtremotesfJNI.Torrent_idleSeedingLimitMode(swigCPtr, this);
  }

  public int idleSeedingLimit() {
    return libtremotesfJNI.Torrent_idleSeedingLimit(swigCPtr, this);
  }

  public String downloadDirectory() {
    return libtremotesfJNI.Torrent_downloadDirectory(swigCPtr, this);
}

  public boolean isSingleFile() {
    return libtremotesfJNI.Torrent_isSingleFile(swigCPtr, this);
  }

  public String creator() {
    return libtremotesfJNI.Torrent_creator(swigCPtr, this);
}

  public java.util.Date creationDate() {
    return libtremotesfJNI.Torrent_creationDate(swigCPtr, this);
}

  public String comment() {
    return libtremotesfJNI.Torrent_comment(swigCPtr, this);
}

  public boolean isFilesEnabled() {
    return libtremotesfJNI.Torrent_isFilesEnabled(swigCPtr, this);
  }

  public boolean isFilesLoaded() {
    return libtremotesfJNI.Torrent_isFilesLoaded(swigCPtr, this);
  }

  public TorrentFilesVector files() {
    return new TorrentFilesVector(libtremotesfJNI.Torrent_files(swigCPtr, this), false);
  }

  public boolean isFilesChanged() {
    return libtremotesfJNI.Torrent_isFilesChanged(swigCPtr, this);
  }

  public TrackersVector trackers() {
    return new TrackersVector(libtremotesfJNI.Torrent_trackers(swigCPtr, this), false);
  }

  public boolean isTrackersAddedOrRemoved() {
    return libtremotesfJNI.Torrent_isTrackersAddedOrRemoved(swigCPtr, this);
  }

  public boolean isPeersEnabled() {
    return libtremotesfJNI.Torrent_isPeersEnabled(swigCPtr, this);
  }

  public boolean isPeersLoaded() {
    return libtremotesfJNI.Torrent_isPeersLoaded(swigCPtr, this);
  }

  public TorrentPeersVector peers() {
    return new TorrentPeersVector(libtremotesfJNI.Torrent_peers(swigCPtr, this), false);
  }

  public boolean isChanged() {
    return libtremotesfJNI.Torrent_isChanged(swigCPtr, this);
  }

  public final static class Status {
    public final static int Paused = 0;
    public final static int Downloading = Paused + 1;
    public final static int Seeding = Downloading + 1;
    public final static int StalledDownloading = Seeding + 1;
    public final static int StalledSeeding = StalledDownloading + 1;
    public final static int QueuedForDownloading = StalledSeeding + 1;
    public final static int QueuedForSeeding = QueuedForDownloading + 1;
    public final static int Checking = QueuedForSeeding + 1;
    public final static int QueuedForChecking = Checking + 1;
    public final static int Errored = QueuedForChecking + 1;
  }

  public final static class RatioLimitMode {
    public final static int GlobalRatioLimit = 0;
    public final static int SingleRatioLimit = GlobalRatioLimit + 1;
    public final static int UnlimitedRatio = SingleRatioLimit + 1;
  }

  public final static class Priority {
    public final static int LowPriority = -1;
    public final static int NormalPriority = LowPriority + 1;
    public final static int HighPriority = NormalPriority + 1;
  }

  public final static class IdleSeedingLimitMode {
    public final static int GlobalIdleSeedingLimit = 0;
    public final static int SingleIdleSeedingLimit = GlobalIdleSeedingLimit + 1;
    public final static int UnlimitedIdleSeeding = SingleIdleSeedingLimit + 1;
  }

}
