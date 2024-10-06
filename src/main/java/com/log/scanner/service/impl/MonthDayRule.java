package com.log.scanner.service.impl;

import com.log.scanner.pojo.LogHeader;
import com.log.scanner.service.Rule;

public class MonthDayRule implements Rule {
    private int monthDay;

    public MonthDayRule(int monthDay) {
        this.monthDay = monthDay;
    }

    @Override
    public boolean evaluate(LogHeader logHeader) {
        return logHeader.getMonthDay() == monthDay;
    }
}
