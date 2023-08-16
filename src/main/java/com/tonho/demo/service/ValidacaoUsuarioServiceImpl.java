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


    public void validacaoUsuario(String usuario, String senha) throws ValidaUsuarioException {

        log.info("Iniciando autenticação");
        if (usuario != null && senha != null &&
                usuario.equals(usuarioValidado) && senha.equals(senhaValidada)) {
            log.info("finalizando autenticação");
            log.info("logado com sucesso");

        } else {
            throw new ValidaUsuarioException("validação incorreta");
        }
    }
}












