package javacore.Oexception.exception.domain;

public class LoginException extends Exception{
    public LoginException() {
        super("Login inválido");
    }

    public LoginException(String message) {
        super(message);
    }
}
