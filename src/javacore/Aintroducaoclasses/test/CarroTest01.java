package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Hyundai";
        carro1.modelo = "HB20";
        carro1.ano = 2012;

        carro2.nome = "Jeep";
        carro2.modelo = "Renegade";
        carro2.ano = 2014;

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
