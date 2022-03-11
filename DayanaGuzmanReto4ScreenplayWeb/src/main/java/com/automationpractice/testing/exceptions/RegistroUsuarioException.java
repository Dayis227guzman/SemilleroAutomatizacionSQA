package com.automationpractice.testing.exceptions;

public class RegistroUsuarioException extends AssertionError{
    private static final long serialVersionIUD = 2211951677221826292L;//serial del AssertionError

    //envia mensaje y causa por la cual fallo la exception
    public RegistroUsuarioException(String message, Throwable cause) {
        super(message, cause);
    }
}
