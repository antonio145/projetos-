package com.tonho.demo.strategy;

import com.tonho.demo.enums.ResultadoEnum;
import org.springframework.stereotype.Service;

@Service
public class CalculoImcStrategyImpl implements ICalculoImcStrategy {


    @Override
    public String strategyImc(Float imc) {
        String resultado = "";
        if (imc < 18.5) {
            resultado = ResultadoEnum.MAGREZA.getResultado();
        } else if (imc >= 18.5 && imc <= 24.9) {
            resultado = ResultadoEnum.PESO_NORMAL.getResultado();
        } else if (imc >= 25 && imc <= 29.9) {
            resultado = ResultadoEnum.ACIMA_DO_PESO.getResultado();
        } else if (imc >= 30) {
            resultado = ResultadoEnum.OBESIDADE.getResultado();
        }


        return resultado;
    }
}




