package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    static void main(String[] args) {
        String regex = "aba";
//        String txt = "abaaba";
        String txt2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt2);

        System.out.println("texto:  " + txt2);
        System.out.println("Idince: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " \n");
        }

    }
}
