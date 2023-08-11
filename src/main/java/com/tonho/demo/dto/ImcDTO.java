package com.tonho.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ImcDTO {

    @JsonProperty("IMC")
    private String imc;

    public ImcDTO(String imc) {
        this.imc = imc;
    }
}
