package academy.devdojointroducao;

public class Aula06EstruturadeRepeticao05 {
    // dado o valor de um carro, descubra em quantas x ele pode ser parcelado
// parcela tem que ser >= 1000
    public static void main() {
        double valorDoCarro = 30000;

        for (int parcela = (int) valorDoCarro; parcela >= 1; parcela--) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
