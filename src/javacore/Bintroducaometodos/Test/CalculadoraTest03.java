package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println("--------------");
        calculadora.imprimeDivisaoPorDoisnNumeros(86, 0);
    }
}
