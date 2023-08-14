package com.tonho.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsuarioDTO {

    @JsonProperty("usuario")
    private String usuario;

    @JsonProperty("senha")
    private String senha;

    public UsuarioDTO(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
}
