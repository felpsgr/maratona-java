package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    static void main() {
            Estudante estudante01 = new Estudante();
            Estudante estudante02 = new Estudante();

            estudante01.nome = "Midoriya";
            estudante01.idade = 18;
            estudante01.sexo = 'M';

            estudante02.nome = "Sakura";
            estudante02.idade = 17;
            estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
