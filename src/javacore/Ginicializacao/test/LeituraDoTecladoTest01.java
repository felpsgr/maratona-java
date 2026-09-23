package javacore.Ginicializacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main() {
        System.out.println("Digite seu nome abaixo: ");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.println("Digite sua idade abaixo: ");
        int idade = input.nextInt();
        System.out.println("Digite F ou M para o seu sexo:");
        char sexo = input.next(). charAt(0);

        System.out.println("-------------");

        System.out.println("Nome: " + nome + " idade: " + idade + " Sexo: " + sexo);
    }
}
