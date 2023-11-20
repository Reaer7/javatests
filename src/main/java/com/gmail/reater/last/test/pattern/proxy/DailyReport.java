package com.gmail.reater.last.test.pattern.proxy;

import java.time.LocalDate;

public class DailyReport implements Report {

    @Override
    public String prepareReport(final LocalDate date) {
        // get data
        // prepare report
        return "Daily report from " + date;
    }
}
