package com.tonho.demo.service;

import com.tonho.demo.dto.ImcDTO;
import com.tonho.demo.strategy.ICalculoImcStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CalculoImcServiceImpl implements ICalculoImc {

    @Autowired
    ICalculoImcStrategy calculoImcStrategy;



    public ImcDTO calcularImc(Float altura, Float peso) {
        log.info("Iniciando calculo de Imc");

        Float imc = peso / (altura * altura);
        String resultado = calculoImcStrategy.strategyImc(imc);


        log.info("terminando calculo de Imc");
        return  ImcDTO.builder()
                .imc(resultado)
                //pesoIdeal()
                .build();

    }



}
