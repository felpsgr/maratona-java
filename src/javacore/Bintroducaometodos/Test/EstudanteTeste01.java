package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    static void main() {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
