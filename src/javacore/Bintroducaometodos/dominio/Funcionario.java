package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
