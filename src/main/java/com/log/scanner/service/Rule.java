package com.log.scanner.service;

import com.log.scanner.pojo.LogHeader;

public interface Rule {
    boolean evaluate(LogHeader logHeader);
}
