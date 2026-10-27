package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    static void main(String[] args) {
        // \d = todos os dígitos

        String regex = "\\d";
//        String txt = "abaaba";
        String txt2 = "tedfdsf31df11f3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt2);

        System.out.println("texto:  " + txt2);
        System.out.println("Idince: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

    }
}
