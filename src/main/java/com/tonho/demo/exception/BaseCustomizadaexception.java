package com.tonho.demo.exception;

public abstract class BaseCustomizadaexception extends RuntimeException implements CustmizacaoException {

    public BaseCustomizadaexception(String message) {
        super(message);
    }

    public BaseCustomizadaexception(String message, Throwable cause) {
        super(message, cause);
    }
}
