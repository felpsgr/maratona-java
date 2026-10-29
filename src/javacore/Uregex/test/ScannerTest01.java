package javacore.Uregex.test;

public class ScannerTest01 {
    static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }


    }
}
