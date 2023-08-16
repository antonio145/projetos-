package com.tonho.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDTO {

    @JsonProperty("altura")
    private Float altura;

    @JsonProperty("peso")
    private Float peso;

    public PessoaDTO(Float altura, Float peso) {
        this.altura = altura;
        this.peso = peso;
    }

}
