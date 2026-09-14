package academy.devdojo.maratonajava.devdojointroducao;

public class Aula06EstruturadeRepeticao01 {
    static void main(String[] args) {
        // while, do white, for
        int count = 0;

        while (count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            // pelo menos uma vez ele aparece
            System.out.println("dentro do-while" + ++count);
        } while (count < 10);

        for (int i=0; i < 10; i++){
            // primeiro valor; boleano; com que operação chega a tal
            // declarando(precisa associar); boolean;
            System.out.println("For" + i);
        }
    }
}
