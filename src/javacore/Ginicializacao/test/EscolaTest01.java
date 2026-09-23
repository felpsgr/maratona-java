package javacore.Ginicializacao.test;

import javacore.Ginicializacao.domain.Escola;
import javacore.Ginicializacao.domain.Professor;

public class EscolaTest01 {
    static void main() {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor professor3 = new Professor("Sherek");

        Professor[] professores = {professor1, professor2, professor3};
    }
}
