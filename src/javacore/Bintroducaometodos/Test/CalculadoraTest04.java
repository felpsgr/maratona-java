package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main() {
        Calculadora calculadora = new Calculadora();

        int numero1 = 1;
        int numero2 = 2;

        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println("Dentro CalculadoraTeste4");
        System.out.println(numero1);
        System.out.println(numero2);


    }
}
