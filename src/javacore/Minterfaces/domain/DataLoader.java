package javacore.Minterfaces.domain;

public interface DataLoader {
    void load();

    static final int MAX_DATA_SIZE = 10;

    default void checkPermission() {
        System.out.println("Checando permissão");
    }

    public static void retrieveMaxDataSide() {
        System.out.println("dentro do retriveMaxDataSide");
    }
}
