package com.br.leonhart.meu_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraRotaGet {
    @GetMapping("/primeira_rota")
    public String read() {
        return "Minha primeira rota get";
    }
}