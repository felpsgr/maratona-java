package academy.devdojo.maratonajava.devdojointroducao;

public class ExercicioSalario {
    public static void main(String[] args) {
        double salario = 5000;
        double taxaSalario;

        if (salario <= 34712) {
            taxaSalario = salario * 9.70;
        }else if (salario <= 68508 && salario > 34712){
            taxaSalario = salario * 37.35;
        }else {
            taxaSalario = salario * 49.50;
        }
        System.out.println(taxaSalario/100);
    }

    }
