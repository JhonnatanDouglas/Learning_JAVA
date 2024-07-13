package com.br.leonhart.meu_app;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/{pacienteId}")
    public Optional<PacienteModel> retrieve(@PathVariable Long pacienteId) {
        return pacientes.stream()
                .filter(p -> p.getId().equals(pacienteId))
                .findFirst();
    }

    @PutMapping("/{pacienteId}")
    public Optional<PacienteModel> update(@PathVariable Long pacienteId, @RequestBody PacienteModel payload) {
        var novosPacientes = pacientes.stream().map(p -> {
            if (p.getId().equals(pacienteId)) {
                payload.setId(p.getId());
                return payload;
            }
            return p;
        });

        pacientes = new ArrayList<>(novosPacientes.toList());

        return pacientes.stream().filter(p -> p.getId().equals(pacienteId)).findFirst();
    }

    @DeleteMapping("/{pacienteId}")
    public void delete(@PathVariable Long pacienteId) {
        var novosPacientes = pacientes.stream().filter(p -> !p.getId().equals(pacienteId));
        pacientes = new ArrayList<>(novosPacientes.toList());
    }
}
