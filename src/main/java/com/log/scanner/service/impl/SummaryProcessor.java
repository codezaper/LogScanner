package com.log.scanner.service.impl;

import com.log.scanner.service.StatisticProcessor;

public class SummaryProcessor implements StatisticProcessor {
    @Override
    public long getAverageTimeToScan() {
        return 0;
    }

    @Override
    public long getAverageTimeToSaveImage() {
        return 0;
    }

    @Override
    public long getAverageTimeToShowImage() {
        return 0;
    }

    @Override
    public long getTotalNumberOfScannedDocument() {
        return 0;
    }
}
