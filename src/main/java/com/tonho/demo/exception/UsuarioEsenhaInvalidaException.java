package com.tonho.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class UsuarioEsenhaInvalidaException extends BaseCustomizadaException {


    @Override
    public Integer getStatus() {
        return HttpStatus.UNAUTHORIZED.value();
    }

    public UsuarioEsenhaInvalidaException() {
        super("Usuario e senha invalidos");
    }
}
