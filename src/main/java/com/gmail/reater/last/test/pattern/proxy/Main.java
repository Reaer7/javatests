package com.gmail.reater.last.test.pattern.proxy;

import java.time.LocalDate;

public class Main {

    /*
        Заместитель - позволяет подставлять вместо реальных объектов специальные объекты-заменители.
        Эти объекты перехватывают вызовы к оригинальному объекту,
        позволяя сделать что-то до или после передачи вызовы оригиналу.

        Примеры:
        - кэширование
        - отложенная (ленивая) инициализация
        - логирование запросов
        - промежуточные проверки данных и доступа
        - запуск параллельных потоков обработки
    */
    public static void main(String[] args) {
        prepare(new DailyReport(), LocalDate.now());
        prepare(new ProxyDailyReport(new DailyReport()), LocalDate.now());
    }

    private static void prepare(final Report report, final LocalDate date) {
        System.out.println(report.prepareReport(date));
    }
}
