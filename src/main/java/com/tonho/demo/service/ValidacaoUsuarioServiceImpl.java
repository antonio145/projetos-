package com.tonho.demo.service;


import com.tonho.demo.dto.UsuarioDTO;
import org.springframework.stereotype.Service;

@Service
public class ValidacaoUsuarioServiceImpl implements IValidacaoUsuario {

    public UsuarioDTO validacaoUsuario(String usuario, String senha) {


        String userName = "USER";
        String userPassword = "PASSWORD";

        if (userName != null && userPassword != null &&
                userName.equals(usuario) && userPassword.equals(senha)) {
        }
        UsuarioDTO build = UsuarioDTO.builder()
                .usuario(usuario)
                .senha(senha)
                .build();
        return build;

    }


}












