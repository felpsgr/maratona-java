package javacore.Ginicializacao.test;

import javacore.Ginicializacao.domain.Jogador;

public class JogadorTest {
    static void main() {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("CR7");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador j : jogadores) {
            j.imprime();
        }
    }
}
