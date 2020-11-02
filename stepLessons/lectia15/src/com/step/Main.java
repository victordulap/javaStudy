package com.step;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Main {

    public static void main(String[] args) {
        //local date
        //1. crearea
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.isLeapYear());

        date = date.minusDays(200);

        System.out.println(date);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);

        date = LocalDate.parse("2007-12-03");

        // exemplu cu toEpochDate (01-01-1970)
        long birthDateInDB = LocalDate.now().toEpochDay();
        LocalDate localDate = LocalDate.ofEpochDay(birthDateInDB);
        System.out.println(localDate);
        System.out.println(LocalDate.ofEpochDay(birthDateInDB));

        //LocalTime
        LocalTime time = LocalTime.now();
        for (int i = 0; i < 3; i++) {
            time = LocalTime.now();
            System.out.println(time);
        }

        LocalTime time2 = LocalTime.of(12, 0, 1);

        if (time2.isAfter(LocalTime.NOON)) {
            System.out.println(time2 + " is after noon");
        } else {
            System.out.println(time2 + " is before noon");
        }

        time2 = time2.minus(300, ChronoUnit.SECONDS);
//        time2 = time2.minus(300, ChronoUnit.HALF_DAYS);

        time2 = LocalTime.parse("10:15:30");

        System.out.println(time2);

        //LocalDateTime

        LocalDateTime dateTime = LocalDateTime.parse("2007-12-03T10:15:03");

        System.out.println(dateTime);

        //DateTimeFormatter https://goo.gl/hOSX2H

        //ofPattern e cel mai des utilizat
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-M-yy");

        LocalDate d = LocalDate.parse("2-10-99", dtf);

        System.out.println(d);

        System.out.println(LocalDate.now().format(dtf));
        System.out.println(LocalDate.of(1897,12,20).format(dtf));

        //Period

        Period period = Period.of(4,3,5);

        LocalDate date1 = LocalDate.now().minus(period);

        System.out.println(date1);
    }
}
