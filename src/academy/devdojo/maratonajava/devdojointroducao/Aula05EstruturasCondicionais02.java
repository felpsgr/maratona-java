package academy.devdojo.maratonajava.devdojointroducao;

public class Aula05EstruturasCondicionais02 {
    public static void main (String[] args) {
        // idade < 15 categoria infantil
        // idade > 15 && < 18 categoria juvenil
        // idade >= a8 categoria adulto
        int idade = 6;
        String categoria;

        if(idade < 15){
            categoria = "Categora Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
            // não precisa explicar, porque é todo outro numero que voce por ali
        }
        System.out.println(categoria);
    }
}
