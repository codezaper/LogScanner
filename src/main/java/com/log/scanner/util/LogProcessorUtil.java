package com.log.scanner.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LogProcessorUtil {
    public static long convertToMilliseconds(String timeString) {
        LocalTime localTime = LocalTime.parse(timeString);
        return localTime.toSecondOfDay() * 1000L + localTime.getNano() / 1_000_000;
    }

    public static int getHour(String timeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        LocalTime localTime = LocalTime.parse(timeString,formatter);
        return localTime.getHour();
    }
}
