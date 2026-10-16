package javacore.Npolimosrfismo.domain;

public class Tomate extends Produto{
    private String dataDeValidade;
    public static final double IMPOSTO_PORCENTO = 0.06;
    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return this.preco * IMPOSTO_PORCENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
