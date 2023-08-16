package com.tonho.demo.service;


import com.tonho.demo.exception.ValidaUsuarioException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ValidacaoUsuarioServiceImpl implements IValidacaoUsuario {

    @Value("validation.user")
    String usuarioValidado;

    @Value("validation.password")
    String senhaValidada;


    public void validacaoUsuario(String usuario, String senha)  {

        log.info("Iniciando autenticação");
        if (usuario != null) {
            log.info("finalizando autenticação");
            log.info("logado com sucesso");
        } else {
            log.info("usuario e senha invalidos");
            throw new ValidaUsuarioException();
        }
    }
}












