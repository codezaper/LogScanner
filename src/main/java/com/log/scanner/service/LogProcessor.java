package com.log.scanner.service;

import com.log.scanner.pojo.LogHeader;
import com.log.scanner.pojo.LogEntry;
import com.log.scanner.service.impl.MonthDayRule;
import com.log.scanner.service.impl.OfficeNameRule;
import com.log.scanner.service.impl.UserNameRule;
import com.log.scanner.util.LogProcessorUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class LogProcessor {
    private Stack<LogEntry> currentLogScan = new Stack<>();
    Map<LogHeader,List<LogEntry>> storeMap = new HashMap<>();

    public void processLogLine(String officeName, String userName, Integer monthDay, String timeString, String logString) {
        long timeInMillis = LogProcessorUtil.convertToMilliseconds(timeString);
        String logFileName = new StringBuilder(officeName).append("_").append(userName).append("_").append(monthDay).toString();
        LogHeader currentLogHeader = new LogHeader(logFileName,officeName,userName,monthDay);
        storeMap.putIfAbsent(currentLogHeader,new ArrayList<>());

        switch (logString) {
            case "*********Starting scan********":
                LogEntry logEntry = new LogEntry();
                logEntry.setScanStartTime(timeInMillis);
                currentLogScan.push(logEntry);
                break;

            case "Scan done. Image loaded in memory":
                if (!currentLogScan.isEmpty()) {
                    currentLogScan.peek().setScanEndTime(timeInMillis);
                }
                break;

            case "Saving sample TIF image in share disc ...":
                if (!currentLogScan.isEmpty()) {
                    currentLogScan.peek().setSaveStartTime(timeInMillis);
                }
                break;

            case "Image TIF saved in shared disc":
                if (!currentLogScan.isEmpty()) {
                    currentLogScan.peek().setSaveEndTime(timeInMillis);
                }
                break;

            case "Loading image…":
                if (!currentLogScan.isEmpty()) {
                    currentLogScan.peek().setShowStartTime(timeInMillis);
                }
                break;

            case "Image showed in applet":
                if (!currentLogScan.isEmpty()) {
                    LogEntry completedEntry = currentLogScan.pop();
                    completedEntry.setShowEndTime(timeInMillis);
                    storeMap.get(currentLogHeader).add(completedEntry);
                }
                break;
        }
    }

    public void printStats(String officeName,String userName,Integer monthDay) {

        // Create a rule engine and add rules
        RuleEngine ruleEngine = new RuleEngine();

        if(StringUtils.isNotEmpty(officeName)) {
            ruleEngine.addRule(new OfficeNameRule(officeName));
        }

        if(StringUtils.isNotEmpty(userName)) {
            ruleEngine.addRule(new UserNameRule(userName));
        }

        if(ObjectUtils.isNotEmpty(monthDay)) {
            ruleEngine.addRule(new MonthDayRule(monthDay));
        }

        // Apply rules and get filtered log entries
        Map<LogHeader,List<LogEntry>> filteredEntries = ruleEngine.applyRules(storeMap);

        // Variables for top-level summary
        AtomicLong totalScanTime = new AtomicLong(0);
        AtomicLong totalSaveTime = new AtomicLong(0);
        AtomicLong totalShowTime = new AtomicLong(0);
        AtomicLong totalDocumentsAnalyzed = new AtomicLong(0);

        System.out.printf("\n------------------------- Details -------------------------\n\n");

        // Print the data in the required format
        filteredEntries.entrySet().stream()
                .collect(Collectors.groupingBy(entry -> entry.getKey().getOfficeName()))
                .forEach((office, officeEntries) -> {
                    int totalEntries = officeEntries.stream().mapToInt(entry -> entry.getValue().size()).sum();
                    System.out.println("Office : " + office + " | " + totalEntries + "  documents scanned");
                    officeEntries.stream()
                            .collect(Collectors.groupingBy(entry -> entry.getKey().getUserName()))
                            .forEach((user, userEntries) -> {
                                int userTotalEntries = userEntries.stream().mapToInt(entry -> entry.getValue().size()).sum();
                                System.out.println("\tUser : " + user + " | " + userTotalEntries + "  documents scanned");
                                userEntries.stream()
                                        .collect(Collectors.groupingBy(entry -> entry.getKey().getMonthDay()))
                                        .forEach((day, dayEntries) -> {
                                            int dayTotalEntries = dayEntries.stream().mapToInt(entry -> entry.getValue().size()).sum();
                                            System.out.println("\t\tDay : " + day + " | " + dayTotalEntries + "  documents scanned");

                                            // Variables to hold cumulative totals for averages
                                            long cumulativeScanTime = 0;
                                            long cumulativeSaveTime = 0;
                                            long cumulativeShowTime = 0;

                                            // Process log entries
                                            for (LogEntry logEntry : dayEntries.stream()
                                                    .flatMap(entry -> entry.getValue().stream())
                                                    .collect(Collectors.toList())) {
                                                totalScanTime.addAndGet(logEntry.getScanTime());
                                                totalSaveTime.addAndGet(logEntry.getSaveTime());
                                                totalShowTime.addAndGet(logEntry.getShowTime());

                                                cumulativeScanTime += logEntry.getScanTime();
                                                cumulativeSaveTime += logEntry.getSaveTime();
                                                cumulativeShowTime += logEntry.getShowTime();
                                            }

                                            totalDocumentsAnalyzed.addAndGet(dayTotalEntries);

                                            // Calculate averages for the day
                                            double averageScanTime = (double) cumulativeScanTime / dayTotalEntries;
                                            double averageSaveTime = (double) cumulativeSaveTime / dayTotalEntries;
                                            double averageShowTime = (double) cumulativeShowTime / dayTotalEntries;

                                            System.out.printf("\t\t\tAverage time to scan : %.2f ms\n", averageScanTime);
                                            System.out.printf("\t\t\tAverage time to save image : %.2f ms\n", averageSaveTime);
                                            System.out.printf("\t\t\tAverage time to show image : %.2f ms\n", averageShowTime);
                                        });
                            });
                });

        // Print overall summary averages
        System.out.printf("\n------------------------- Summary -------------------------\n");
        System.out.printf("Average time to scan : %.2f ms\n", (double) totalScanTime.get() / totalDocumentsAnalyzed.get());
        System.out.printf("Average time to save image : %.2f ms\n", (double) totalSaveTime.get() / totalDocumentsAnalyzed.get());
        System.out.printf("Average time to show image : %.2f ms\n", (double) totalShowTime.get() / totalDocumentsAnalyzed.get());
        System.out.printf("Total Documents analyzed : %d\n", totalDocumentsAnalyzed.get());
        System.out.printf("----------------------------------------------------------\n");

    }
}
