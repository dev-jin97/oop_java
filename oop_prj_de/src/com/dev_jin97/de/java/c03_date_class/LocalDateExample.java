package com.dev_jin97.de.java.c03_date_class;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(LocalDate.of(2022, 2, 20));
        System.out.println(LocalDate.parse("2022-02-20"));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        DayOfWeek friday = LocalDate.now().getDayOfWeek();
        System.out.println(friday);

        int twelve = LocalDate.parse("2022-06-15").getDayOfMonth();
        System.out.println(twelve);

        System.out.println(LocalDate.now().isLeapYear());

        System.out.println("2024년은 윤년인가요? " + LocalDate.parse("2024-01-01").isLeapYear());

        System.out.println(LocalDate.parse("2022-06-12").isBefore(LocalDate.parse("2022-06-14")));

        LocalDateTime begginingOfDay = LocalDate.parse("2022-06-12").atStartOfDay();
        System.out.println(begginingOfDay);

        LocalDate firstDayOfMonth = LocalDate.parse("2022-06-12").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);

    }
}
