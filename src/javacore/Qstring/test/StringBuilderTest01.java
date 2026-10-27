package javacore.Qstring.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "Felipe Yopie";
        nome.concat("DevDojo");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Felipe Yopie");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
