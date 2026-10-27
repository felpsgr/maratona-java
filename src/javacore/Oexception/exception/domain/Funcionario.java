package javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginException, FileNotFoundException{
        System.out.println("Salvando funcionario");
    }
}
