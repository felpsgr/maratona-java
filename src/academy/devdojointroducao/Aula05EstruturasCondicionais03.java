package academy.devdojointroducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        // doar Salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado;
        if(salario > 5000) {
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        int dinheiro = 42;
        String resultadoGuardaChuva = (dinheiro > 35) ? "Pode comprar o guarda chuva" : "Não pode comprar o guarda-chuva";
        System.out.println(resultadoGuardaChuva);
    }

}
