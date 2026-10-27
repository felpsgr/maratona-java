package javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    static void main(String[] args) {
        Map<String, String> shortsId = ZoneId.SHORT_IDS;
        System.out.println(shortsId);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");
        OffsetDateTime manaus = now.atOffset(zoneOffset);
        System.out.println(manaus);

        System.out.println(ZonedDateTime.now());

        OffsetDateTime offsetDateTime = OffsetDateTime.of(now, ZoneOffset.from(manaus));
        System.out.println(offsetDateTime);

        JapaneseDate japan = JapaneseDate.from(LocalDate.now());
        System.out.println(japan);
        LocalDate meijiEraLocalEra = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalEra);
        System.out.println(meijiEra);


    }
}
