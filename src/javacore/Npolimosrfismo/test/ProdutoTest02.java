package javacore.Npolimosrfismo.test;

import javacore.Npolimosrfismo.domain.Computador;
import javacore.Npolimosrfismo.domain.Produto;
import javacore.Npolimosrfismo.domain.Televisao;
import javacore.Npolimosrfismo.domain.Tomate;
import javacore.Npolimosrfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 2000);

        Tomate tomate = new Tomate("Tomate ciciliano", 20);
        tomate.setDataDeValidade("06/06/2008");

        Televisao televisao = new Televisao("TV smart 60 \" ", 3000);
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("=================");
        CalculadoraImposto.calcularImposto(produto);
        System.out.println("=================");
        televisao.setGarantia("15/10/2028");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
