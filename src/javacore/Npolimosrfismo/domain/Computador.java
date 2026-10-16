package javacore.Npolimosrfismo.domain;

public class Computador extends Produto{
    public static final double IMPOSTO_PORCENTO = 0.20;
    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do Computador");
        return this.preco * IMPOSTO_PORCENTO;
    }
}
