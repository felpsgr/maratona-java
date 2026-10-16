package javacore.Npolimosrfismo.test;

import javacore.Npolimosrfismo.domain.Computador;
import javacore.Npolimosrfismo.domain.Produto;
import javacore.Npolimosrfismo.domain.Televisao;
import javacore.Npolimosrfismo.domain.Tomate;
import javacore.Npolimosrfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Computador("NUC10i7", 11000);
        Produto produto2 = new Tomate("Tomate siciliano", 10);
        Produto produto3 = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("===============");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("===============");
        CalculadoraImposto.calcularImposto(produto3);
    }
}
