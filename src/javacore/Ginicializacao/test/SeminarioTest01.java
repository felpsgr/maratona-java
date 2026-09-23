package javacore.Ginicializacao.test;

import javacore.Ginicializacao.domain.Aluno;
import javacore.Ginicializacao.domain.Local;
import javacore.Ginicializacao.domain.Professor;
import javacore.Ginicializacao.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args){
        Local local1 = new Local("Rua da ceci bbzinha");
        Professor professor1 = new Professor("Junino", "Java");
        Aluno aluno1 = new Aluno("Felipe", 18);

        Aluno[] alunos1 = {aluno1};

        Seminario seminario1 = new Seminario("POO", alunos1, local1);

        Seminario[] seminariosDisponiveis1 = {seminario1};

        professor1.setSeminarios(seminariosDisponiveis1);

        seminario1.impressora();

    }
}
