package academy.devdojo.maratonajava.devdojointroducao;

public class AtividadeRepetiçãoBreak {
    public static void main() {
        int valorMaximo = 50;
        for (int i=0; i <= valorMaximo; i++) {
            if (i>25) {
                break;
            }
            System.out.println(i);
        }
    }
}
