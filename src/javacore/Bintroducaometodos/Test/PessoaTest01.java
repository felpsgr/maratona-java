package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cecília");
        pessoa.setIdade(18);
//        pessoa.imprime();

        System.out.println(pessoa.getnome());
        System.out.println(pessoa.getIdade());

    }

}
