package javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parsesla = LocalDateTime.parse("2026-10-23T20:45:28.304771313");
        System.out.println(parsesla);
        // dd/MM/yyyy
        //MM/dd/yyyy
        // yyyy/MM/dd
        DateTimeFormatter brazilFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(brazilFormat);
        System.out.println(formatBR);

        LocalDate parseBRR = LocalDate.parse("23/10/2026", brazilFormat);
        System.out.println(parseBRR);

        DateTimeFormatter localleGermane = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGerman = LocalDate.now().format(localleGermane);
        System.out.println(formatGerman);
        LocalDate parseGR = LocalDate.parse("23.Oktober.2026", localleGermane);
        System.out.println(parseGR);


    }
}
