package com.log.scanner.pojo;

public class LogEntry {
    private long scanStartTime;
    private long scanEndTime;
    private long saveStartTime;
    private long saveEndTime;
    private long showStartTime;
    private long showEndTime;

    public void setScanStartTime(long time) {
        this.scanStartTime = time;
    }

    public void setScanEndTime(long time) {
        this.scanEndTime = time;
    }

    public void setSaveStartTime(long time) {
        this.saveStartTime = time;
    }

    public void setSaveEndTime(long time) {
        this.saveEndTime = time;
    }

    public void setShowStartTime(long time) {
        this.showStartTime = time;
    }

    public void setShowEndTime(long time) {
        this.showEndTime = time;
    }

    public long getScanTime() {
        return scanEndTime - scanStartTime;
    }

    public long getSaveTime() {
        return saveEndTime - saveStartTime;
    }

    public long getShowTime() {
        return showEndTime - showStartTime;
    }
}

