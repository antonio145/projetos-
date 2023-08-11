package com.tonho.demo.service;

import com.tonho.demo.dto.ImcDTO;
import com.tonho.demo.strategy.ICalculoImcStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculoImcServiceImpl implements ICalculoImc {

    @Autowired
    ICalculoImcStrategy calculoImcStrategy;

    public ImcDTO calcularImc(Float altura, Float peso) {
        Float imc = peso / (altura * altura);
        String resultado = calculoImcStrategy.strategyImc(imc);

        return ImcDTO.builder()
                .imc(resultado)
                .build();

    }


}
