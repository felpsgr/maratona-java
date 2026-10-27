package javacore.Qstring.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRulesException;
import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Felipe"; // String constant pool
        String nome2 = "Felipe";
        nome1 = nome1.concat(" Suane");
        System.out.println(nome1);
        System.out.println(nome1.equals(nome2));
        String nome3 = new String("Felipe"); // 1 uma variavel de referência, 2 objeto do tipo String, 3 uma String no pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());


    }
}
