package javacore.Oexception.exception.test;

import javacore.Oexception.exception.domain.Funcionario;
import javacore.Oexception.exception.domain.LoginException;
import javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
