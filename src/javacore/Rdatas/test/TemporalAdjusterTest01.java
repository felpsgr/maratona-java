package javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

///
class obterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;

        switch (dayOfWeek) {
            case FRIDAY -> {
                addDays = 3;
            }

            case SATURDAY -> {
                addDays = 2;
            }
                default -> {
                addDays = 1;
                }

        }
            return temporal.plus(addDays, ChronoUnit.DAYS);

}}

public class TemporalAdjusterTest01 {
    static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate now2 = LocalDate.now().with(new obterProximoDiaUtil());
        System.out.println(now2);
        System.out.println(now2.getDayOfWeek());
        now2 = LocalDate.now().withDayOfMonth(26).with(new obterProximoDiaUtil());
        System.out.println(now2);
        System.out.println(now.getDayOfWeek());
    }
}

