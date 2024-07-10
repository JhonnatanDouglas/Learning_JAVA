package com.br.leonhart.meu_app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraRotaPost {
    @PostMapping("/rota_post")
    public String create(@RequestBody String payload) {
        return payload;
    }
}