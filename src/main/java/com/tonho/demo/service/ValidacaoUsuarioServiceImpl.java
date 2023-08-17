package com.tonho.demo.service;


import com.tonho.demo.exception.UsuarioEsenhaInvalidaException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ValidacaoUsuarioServiceImpl implements IValidacaoUsuario {

    @Value("${USER_USUARIO}")
    String usuarioValidado;

    @Value("${PASSWORD_SENHA}")
    String senhaValidada;


    public void validacaoUsuario(String usuario, String senha) {

        log.info("Iniciando autenticação");
        if (usuario.equals(usuarioValidado) && senha.equals(senhaValidada)) {
            log.info("logado com sucesso");
        } else {
            throw new UsuarioEsenhaInvalidaException();
        }

    }
}












