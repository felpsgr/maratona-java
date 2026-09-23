    package javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(){

        for (int ep : Anime.episodios){
            System.out.print(ep + " ");
        }
        System.out.println();
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public int[] getEpisodios(){
        return episodios;
    }
}
