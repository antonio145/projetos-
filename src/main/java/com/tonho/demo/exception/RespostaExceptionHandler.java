package com.tonho.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RespostaExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {BaseCustomizadaException.class})
    public ResponseEntity<ErroResponse> handlerException(BaseCustomizadaException e) {
        ErroResponse erro = new ErroResponse(e.getMessage());
        return new ResponseEntity(erro, HttpStatus.UNAUTHORIZED);
    }




}
