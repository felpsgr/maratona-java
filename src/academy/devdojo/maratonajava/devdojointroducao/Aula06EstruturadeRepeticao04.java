package academy.devdojo.maratonajava.devdojointroducao;

public class Aula06EstruturadeRepeticao04 {
    // dado o valor de um carro, descubra em quantas x ele pode ser parcelado
// parcela tem que ser >= 1000
    public static void main() {
        double valorDoCarro = 50000;
        double minimoDeParcela = 1000;

        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela <= 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }
    }
}
