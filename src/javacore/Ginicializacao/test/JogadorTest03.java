package javacore.Ginicializacao.test;

import javacore.Ginicializacao.domain.Jogador;
import javacore.Ginicializacao.domain.Time;

public class JogadorTest03 {
    static void main() {
        Jogador jogador = new Jogador("Felipe");
        Jogador jogador2 = new Jogador("Ceci");
        Time time = new Time("Seleção brasieleira");
        Jogador[] jogadores = {jogador, jogador2};

        jogador2.setTime(time);
        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- jogador ---");

        jogador.imprime();
        jogador2.imprime();

        System.out.println("--- time ---");

        time.imprime();
    }
}
