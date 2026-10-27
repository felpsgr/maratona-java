package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    static void main(String[] args) {
        LocalDateTime localDAteTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2008-06-06");
        LocalTime localTime = LocalTime.parse("20:10:00");
        System.out.println(localDAteTime);
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime ltd1 = localDate.atTime(localTime);
        LocalDateTime ltd2 = localDate.atTime(12, 2, 4);
        System.out.println(ltd1);
        System.out.println(ltd2);

    }
}
