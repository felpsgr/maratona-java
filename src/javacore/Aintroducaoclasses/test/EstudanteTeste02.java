package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste02 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Felipe";
        estudante.idade = 18;
        estudante.sexo = 'M';

        estudante2.nome = "Cecilia";
        estudante2.idade = 18;
        estudante2.sexo = 'F';

        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("");

        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}
