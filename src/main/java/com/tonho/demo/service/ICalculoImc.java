package com.tonho.demo.service;

import com.tonho.demo.dto.ImcDTO;

public interface ICalculoImc {

    ImcDTO calcularImc(Float altura, Float peso);
}
