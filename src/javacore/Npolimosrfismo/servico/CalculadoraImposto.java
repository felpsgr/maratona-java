package javacore.Npolimosrfismo.servico;

import javacore.Npolimosrfismo.domain.Computador;
import javacore.Npolimosrfismo.domain.Produto;
import javacore.Npolimosrfismo.domain.Televisao;
import javacore.Npolimosrfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Produto: " + produto.getPreco());
        System.out.println("Imposto a ser pago: " + produto.calcularImposto());
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
//            ((Tomate) produto).getDataDeValidade();
//            System.out.println("Validade: " + ((Tomate)produto).getDataDeValidade());
            System.out.println("Validade: " + tomate.getDataDeValidade());
        }
        if (produto instanceof Televisao) {
            ((Televisao) produto).getGarantia();
            System.out.println("Garantia: " + ((Televisao) produto).getGarantia());
        }
    }
}
