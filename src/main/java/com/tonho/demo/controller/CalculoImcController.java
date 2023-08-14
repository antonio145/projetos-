package com.tonho.demo.controller;

import com.tonho.demo.dto.ImcDTO;
import com.tonho.demo.dto.PessoaDTO;
import com.tonho.demo.dto.UsuarioDTO;
import com.tonho.demo.service.ICalculoImc;
import com.tonho.demo.service.IValidacaoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

;

@RestController
public class CalculoImcController {

    @Autowired
    ICalculoImc calculoImcService;

    @Autowired
    IValidacaoUsuario validacaoUsuarioService;


    @PostMapping("/validacao")
    public ResponseEntity<UsuarioDTO> validacaoUsuario(@RequestHeader(value = "User") String usuario,
                                                       @RequestHeader(value = "senha") String senha) {
        UsuarioDTO usuarioDTO = validacaoUsuarioService.validacaoUsuario(usuario, senha);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(usuarioDTO);
    }


    @PostMapping("/calcular-imc")
    public ResponseEntity<ImcDTO> calculoImc(@RequestBody PessoaDTO pessoaDTO) {
        ImcDTO imcDTO = calculoImcService.calcularImc(pessoaDTO.getAltura(), pessoaDTO.getPeso());
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(imcDTO);

    }


}
