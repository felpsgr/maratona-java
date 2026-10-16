package javacore.Npolimosrfismo.domain;

public class Televisao extends Produto{
    private String garantia;
    public static final double IMPOSTO_PORCENTO = 0.20;
    public Televisao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.preco * IMPOSTO_PORCENTO;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }
}
