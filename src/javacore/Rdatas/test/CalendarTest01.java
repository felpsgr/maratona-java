package javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
         if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão primeiro dia da semana");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 0);
        calendar.roll(Calendar.HOUR, 100);

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
