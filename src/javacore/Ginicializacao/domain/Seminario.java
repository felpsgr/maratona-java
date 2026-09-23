package javacore.Ginicializacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;


    public void impressora() {
        System.out.println("----------");
        if (local != null) {
            System.out.println("Seminário: " + this.titulo);
        } else {
            System.out.println("Sem endereço");
        }
        System.out.println("Local: " + local.getEndereco());

        if (alunos == null || alunos.length == 0 ) {
            System.out.println("Sem alunos");
        } else {
            for (Aluno a : alunos) {
                System.out.println("Alunos: " + a.getNome());
            }
        }

    }
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
