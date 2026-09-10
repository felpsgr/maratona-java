package academy.devdojointroducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args) {
        int idade = 17;
        double cotonete = 54;
        boolean isFelizPorTerCotonete = cotonete >= 540;
// colocar ==false pega o resultado quando falso, ou entao começar com !

        if(isFelizPorTerCotonete) {
            System.out.println("Você está feliz porque você tem muitos cotonetes");
        }
        if(!isFelizPorTerCotonete) {
            System.out.println("Vocẽ está triste porque tem poucos cotonetes ;-;");
        }
        if(idade >= 18) {
            System.out.println("Permitido comprar bebida alcólica");
        } else{
            System.out.println("Não pode comprar bebida alcólica");
        }
    }
}
