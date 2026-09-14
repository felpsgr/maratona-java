package academy.devdojo.maratonajava.devdojointroducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);

        //resto %
        int resto = 20 % 15;
        System.out.println(resto);

        // > < >= <= != ==
        boolean isMaiorQue = 10 > 20;
        boolean isMenorQue = 10 < 20;
        boolean isMaiorIgual = 10 >= 10;
        boolean isMaiorIgual2 = 10 >= 15;
        boolean isMenorigual = 50 <= 20;
        boolean isDiferente = 30 != 2;
        boolean isIgual = 10 == 11;

        System.out.println(isMaiorQue);
        System.out.println(isMenorQue);

        //&& (AND) || (or) !
        int horasTrabalhadas = 8;
        float salario = 1700;
        boolean isDentroDaLei = horasTrabalhadas <= 8 && salario >= 1618;
        System.out.println(isDentroDaLei);

        double dinheiroNoDebito = 300;
        double dinheiroNoCredito = 0;
        double roupaLizLiza = 543;
        boolean isPodeComprarARoupa =  dinheiroNoCredito > roupaLizLiza || dinheiroNoDebito > roupaLizLiza;

        System.out.println ("isPodeComprarARoupa " + isPodeComprarARoupa);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus = bonus + 10;
        bonus += 67;
        bonus %= 2;

        System.out.println (bonus);

        // ++ --

        double contador = 0;
        contador += 1;
        contador++;

        System.out.println (contador); // se colocado antes ++ ou -- acrescenta ou subtrai antes da execução
    }
}
