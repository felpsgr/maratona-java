package javacore.Rdatas.test;

import javacore.Ginicializacao.domain.Local;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusDays(2).plusYears(1);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofWeeks(58);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(Period.between(now, now.now().plusDays(p2.getDays())).getMonths());

        System.out.println(now.until(now.plusDays(p2.getDays()), ChronoUnit.MONTHS));

    }
}
