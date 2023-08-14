package com.tonho.demo.service;

import com.tonho.demo.dto.UsuarioDTO;

public interface IValidacaoUsuario {

    UsuarioDTO validacaoUsuario(String usuario, String senha);


}
