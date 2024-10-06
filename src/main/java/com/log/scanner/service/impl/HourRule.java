package com.log.scanner.service.impl;

import com.log.scanner.pojo.LogHeader;
import com.log.scanner.service.Rule;

public class HourRule implements Rule {
    private int hour;

    public HourRule(int hour) {
        this.hour = hour;
    }
    @Override
    public boolean evaluate(LogHeader logHeader) {
        return logHeader.getHour() == hour;
    }
}
