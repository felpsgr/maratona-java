package javacore.Npolimosrfismo.test;

import javacore.Npolimosrfismo.repositorio.Repositorio;
import javacore.Npolimosrfismo.servico.RepositorioArquivo;
import javacore.Npolimosrfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
