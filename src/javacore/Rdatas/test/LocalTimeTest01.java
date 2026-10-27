package javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 59, 59);
        System.out.println(localTime);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        localTime = localTime.plusSeconds(1);
        System.out.println(localTime);

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
