package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não for digito(numero)
        // \s = espaço em branco /t /n /f /r
        // \S = todos os caracteres brancos
        // \S = todos os que não forem em brancos
        // \w = a-z,A-Z, digitos, _
        // \W = tudo que nao for a-z,A-Z, digitos, _
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ()
        // |
        // $

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0x212 0x 2FFFABC 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("Idince: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }
        int numeroHex = 0xDCEFA;
        System.out.println(numeroHex);
    }
}
