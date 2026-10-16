package javacore.LclassesAbstratas.test;

import javacore.LclassesAbstratas.domain.Desenvolvedor;
import javacore.LclassesAbstratas.domain.Funcionario;
import javacore.LclassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Cecilia", 1500);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Java", 20000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
