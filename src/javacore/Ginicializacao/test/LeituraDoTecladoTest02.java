package javacore.Ginicializacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuruto");
        System.out.println("Digite sua perguntae e eu responderei sim ou não");
        String pergunta = input.nextLine();
        if (pergunta. charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÂO");
        }
    }
}
