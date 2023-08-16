package com.tonho.demo.controller;

import com.tonho.demo.dto.ImcDTO;
import com.tonho.demo.dto.PessoaDTO;
import com.tonho.demo.exception.ValidaUsuarioException;
import com.tonho.demo.service.ICalculoImc;
import com.tonho.demo.service.IValidacaoUsuario;
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

    @Autowired
    IValidacaoUsuario validacaoUsuarioService;


    @PostMapping("/calcular-imc")
    public ResponseEntity<ImcDTO> calculoImc(@RequestHeader(value = "user", required = true) String usuario,
                                             @RequestHeader(value = "senha", required = true) String senha,
                                             @RequestBody PessoaDTO pessoaDTO) throws ValidaUsuarioException {
        validacaoUsuarioService.validacaoUsuario(usuario, senha);
        ImcDTO imcDTO = calculoImcService.calcularImc(pessoaDTO.getAltura(), pessoaDTO.getPeso());
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(imcDTO);

    }

}
