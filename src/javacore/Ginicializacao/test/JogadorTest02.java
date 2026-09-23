package javacore.Ginicializacao.test;

import javacore.Ginicializacao.domain.Jogador;
import javacore.Ginicializacao.domain.Time;

public class JogadorTest02 {
    static void main() {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
