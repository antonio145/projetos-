package com.tonho.demo.controller;

import com.tonho.demo.dto.ImcDTO;
import com.tonho.demo.dto.PessoaDTO;
import com.tonho.demo.service.ICalculoImc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

;

@RestController
public class CalculoImcController {

    @Autowired
    ICalculoImc calculoImcService;

    @PostMapping("/calcular-imc")
    public ResponseEntity<ImcDTO> calculoImc(
            @RequestHeader(value = "usuario",required = true) String usuario,
            @RequestHeader(value = "senha",required = true) String senha,
            @RequestBody PessoaDTO pessoaDTO) {
        ImcDTO imcDTO = calculoImcService.calcularImc(pessoaDTO.getAltura(), pessoaDTO.getPeso());
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(imcDTO);

    }


}
