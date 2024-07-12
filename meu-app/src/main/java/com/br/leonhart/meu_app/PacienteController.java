package com.br.leonhart.meu_app;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
    private ArrayList<PacienteModel> pacientes = new ArrayList<>();

    @GetMapping
    public ArrayList<PacienteModel> read() {
        return pacientes;
    }

    @PostMapping
    public PacienteModel create(@RequestBody PacienteModel payload) {
        // Incrementar sempre +1
        long proximoId = pacientes.size() + 1; 
        // coloca o novo id dentro do payload
        payload.setId(proximoId); 

        // adiciona o objeto do payload dentro da lista de pacientes
        pacientes.add(payload); 

        // retorna o que foi adicionado
        return payload;
    }
}
