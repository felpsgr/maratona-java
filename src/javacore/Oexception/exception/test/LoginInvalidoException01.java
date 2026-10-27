package javacore.Oexception.exception.test;

import javacore.Oexception.exception.domain.LoginException;

import java.util.Scanner;

public class LoginInvalidoException01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginException e) {
            throw new RuntimeException(e);
        }

    }
    private static void logar() throws LoginException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Felipe";
        String senhaDB = "seila";
        System.out.println("Usuário: ");
        String usuaarioDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();
        if(!usernameDB.equals(usuaarioDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginException("Usuário ou senha inválidos");
        }
        System.out.println("Login feito com sucesso");
    }
}
