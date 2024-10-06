package com.log.scanner.service;

public interface StatisticProcessor {
    long getAverageTimeToScan();
    long getAverageTimeToSaveImage();
    long getAverageTimeToShowImage();
    long getTotalNumberOfScannedDocument();
}
