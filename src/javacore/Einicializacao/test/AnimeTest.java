package javacore.Einicializacao.test;

import javacore.Einicializacao.domain.Anime;

public class AnimeTest {
    static void main() {
        Anime anime = new Anime("Naruto");

        for (int episodios : anime.getEpisodios()){
            System.out.print(episodios + " ");
        }
    }
}
