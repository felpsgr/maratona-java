package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main() {
        Funcionario funcionario = new Funcionario();


        funcionario.nome = "Cecilia";
        funcionario.idade = 19;
        funcionario.salario = new double[]{1000, 4000, 1000};

        funcionario.impressora();
    }
}
