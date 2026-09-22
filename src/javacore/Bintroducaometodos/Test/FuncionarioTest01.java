package javacore.Bintroducaometodos.Test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main() {
        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Cecilia");
        funcionario.setIdade(18);
        funcionario.setSalario(new double[] {1000, 2000, 1000});
        funcionario.impressora();
    }
}
