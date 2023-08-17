package com.tonho.demo.strategy;

import com.tonho.demo.dto.ImcDTO;

public interface ICalculoImcStrategy {

    String strategyImc(Float imc);
   ImcDTO strategyCalcularPesoIdeal(ImcDTO imcDTO, Float altura);

}
