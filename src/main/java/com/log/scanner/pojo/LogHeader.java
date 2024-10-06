package com.log.scanner.pojo;
import java.util.Objects;

public class LogHeader {
    private String logfileName;
    private String OfficeName;
    private String userName;
    private int monthDay;

    public LogHeader(String logFileName,String officeName, String userName, int monthDay) {
        this.logfileName = logFileName;
        this.OfficeName = officeName;
        this.userName = userName;
        this.monthDay = monthDay;
    }

    public String getLogfileName() {
        return logfileName;
    }

    public String getOfficeName() {
        return OfficeName;
    }

    public String getUserName() {
        return userName;
    }

    public int getMonthDay() {
        return monthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogHeader logHeader = (LogHeader) o;
        return monthDay == logHeader.monthDay && Objects.equals(logfileName, logHeader.logfileName) && Objects.equals(OfficeName, logHeader.OfficeName) && Objects.equals(userName, logHeader.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logfileName, OfficeName, userName, monthDay);
    }
}
