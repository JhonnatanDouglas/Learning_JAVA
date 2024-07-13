package com.br.leonhart.meu_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/users")
public class ControllerExemploParam {

    @GetMapping("/{userId}")
    public void getUserById(@PathVariable long userId) {
        // Logica para buscar o ID
    }

    @GetMapping("/{userId}")
    public long getUserId(@PathVariable long userId) {
        return userId;
    }

    @GetMapping("/{userId}/posts/{postId}")
    public String getUserId(@PathVariable long userId, @PathVariable long postId) {
        return "O Id do Usuario é: " + userId + " e o Id do Post é: " + postId;
    }
}
