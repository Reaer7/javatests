package com.gmail.reater.last.test.pattern.proxy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProxyDailyReport implements Report {

    private final DailyReport dailyReport;
    private static final Map<LocalDate, String> cache = new HashMap<>();

    public ProxyDailyReport(final DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String prepareReport(final LocalDate date) {
        if (cache.get(date) == null) {
            final String report = dailyReport.prepareReport(date);
            cache.put(date, report);
            return report;
        }
        return cache.get(date);
    }
}
