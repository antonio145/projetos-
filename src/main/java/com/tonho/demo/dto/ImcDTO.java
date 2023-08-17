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

    @JsonProperty("pesoIdeal")
    private Float pesoIdeal;

    public ImcDTO(String imc, float pesoIdeal) {
        this.imc = imc;
        this.pesoIdeal = pesoIdeal;
    }
}
