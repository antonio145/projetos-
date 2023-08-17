package com.tonho.demo.exception;

public abstract class BaseCustomizadaException extends RuntimeException implements CustmizacaoException {

    public BaseCustomizadaException(String message) {
        super(message);
    }

    public BaseCustomizadaException(String message, Throwable cause) {
        super(message, cause);
    }
}
