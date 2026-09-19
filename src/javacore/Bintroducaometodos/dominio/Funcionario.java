package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void impressora() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salario == null) {
            return;
        }
        for (double s : this.salario) {
            System.out.print(s + " ");
        }
        mediaSalario();
    }

    public void mediaSalario() {
        double soma = 0;
        if (salario == null || salario.length == 0) {
            return;
        }
        for (double s : this.salario) {
            soma += s;
        }
        double media = soma / salario.length;
        System.out.println("\nMédia salário: " + media);
    }
}
