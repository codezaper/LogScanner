package com.log.scanner.service;

import com.log.scanner.pojo.LogEntry;
import com.log.scanner.pojo.LogHeader;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RuleEngine {
    private List<Rule> rules;

    public RuleEngine() {
        this.rules = new ArrayList<>();
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public Map<LogHeader,List<LogEntry>> applyRules(Map<LogHeader,List<LogEntry>> storeMap) {
        return storeMap.entrySet().stream()
                .filter(logHeaderListEntry -> rules.stream().allMatch(rule -> rule.evaluate(logHeaderListEntry.getKey())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }
}
