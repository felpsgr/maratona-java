package javacore.Hheranca.Test;

import javacore.Hheranca.Dominio.Endereco;
import javacore.Hheranca.Dominio.Funcionario;
import javacore.Hheranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 3");
        endereco.setCep("123-3433");

        Pessoa pessoa = new Pessoa("Cecilia");
        pessoa.setCpf("102.213.313.33");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Tomando");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        System.out.println("-------------");
        funcionario.imprime();
        funcionario.relatorioDePagamento();
    }
}
