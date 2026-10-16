package javacore.JmodificadorFinal.domain.test;

import javacore.JmodificadorFinal.domain.domain.Carro;
import javacore.JmodificadorFinal.domain.domain.Comprador;
import javacore.JmodificadorFinal.domain.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.comprador);
        carro.comprador.setNome("Fodae");
        System.out.println(carro.comprador);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrarizona");
        ferrari.imprime();
    }
}
