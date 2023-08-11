package com.tonho.demo.enums;

import lombok.Getter;

@Getter
public enum ResultadoEnum {

    MAGREZA("Magreza"),
    PESO_NORMAL("Peso normal"),
    ACIMA_DO_PESO("Acima do peso"),
    OBESIDADE("Obesidade");



    public final String resultado;

    ResultadoEnum(String resultado) {
        this.resultado = resultado;
    }
}
