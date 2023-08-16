package com.tonho.demo.service;

import com.tonho.demo.exception.ValidaUsuarioException;

public interface IValidacaoUsuario {

    void validacaoUsuario(String usuario, String senha) throws ValidaUsuarioException;


}
