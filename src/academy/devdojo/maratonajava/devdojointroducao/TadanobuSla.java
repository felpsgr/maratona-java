package academy.devdojo.maratonajava.devdojointroducao;

public class TadanobuSla {
    public static void main(String[] args) {
    int numero = 2;
        for (int i = 0; i <= 10; i++) {
            int multiplicação = i * numero;
            System.out.println(i + " x " + numero + " = " + multiplicação);
        }
        for (int j = 0; j <= 20; j += 2) {
            System.out.println("Tabuada do 2 " + j);
        }
        for (int p = 0; p <= 30; p += 3) {
        System.out.println("Tábuada do 3 " + p);
        }
        for (int c=0;c <=270;c = c + 27){
            System.out.println("Tábuada do 27 " + c);
        }
    }
}