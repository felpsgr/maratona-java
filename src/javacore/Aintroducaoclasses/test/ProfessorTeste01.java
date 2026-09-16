package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTeste01 {
    static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Ceci Gostosinha";
        professor.idade = 69;
        professor.sexo = 'F';

        System.out.println("Nome: " + professor.nome + " idade:" + professor.idade + " Sexo:" + professor.sexo);
    }
}
