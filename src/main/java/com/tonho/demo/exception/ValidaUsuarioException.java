package com.tonho.demo.exception;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class ValidaUsuarioException extends BaseCustomizadaexception implements Serializable {

    public ValidaUsuarioException() {

        super("codigo incorreto");
    }

    @Override
    public Integer getStatus() {
        return HttpStatus.UNAUTHORIZED.value();
    }

    @Override
    public String getCodigo() {
        return "usuario e senha invalidos";
    }
}
