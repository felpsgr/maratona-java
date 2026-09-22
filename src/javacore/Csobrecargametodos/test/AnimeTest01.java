package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main() {
        Anime anime = new Anime();
        anime.init("Punpun", "Mangá", 24, "Terror");

        anime.imprime();
    }
}
