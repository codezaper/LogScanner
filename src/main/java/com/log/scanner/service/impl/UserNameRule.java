package com.log.scanner.service.impl;

import com.log.scanner.pojo.LogHeader;
import com.log.scanner.service.Rule;

public class UserNameRule implements Rule {
    private String userName;

    public UserNameRule(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean evaluate(LogHeader logHeader) {
        return logHeader.getUserName().equals(userName);
    }
}
