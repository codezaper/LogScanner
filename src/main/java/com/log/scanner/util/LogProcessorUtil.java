package com.log.scanner.util;

import java.time.LocalTime;

public class LogProcessorUtil {
    public static long convertToMilliseconds(String timeString) {
        LocalTime time = LocalTime.parse(timeString);
        return time.toSecondOfDay() * 1000 + time.getNano() / 1_000_000;
    }
}
