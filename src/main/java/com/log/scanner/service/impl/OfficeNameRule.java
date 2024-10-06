package com.log.scanner.service.impl;

import com.log.scanner.pojo.LogHeader;
import com.log.scanner.service.Rule;

public class OfficeNameRule implements Rule {
    private String officeName;

    public OfficeNameRule(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public boolean evaluate(LogHeader logHeader) {
        return logHeader.getOfficeName().equals(officeName);
    }
}
