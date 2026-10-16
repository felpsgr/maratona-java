package javacore.Npolimosrfismo.servico;

import javacore.Npolimosrfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}
