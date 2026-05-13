package com.example.demo.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public Map<String, String> autenticar(@RequestBody Usuario loginDados) {
        Optional<Usuario> usuarioOpt = repository.findByRg(loginDados.getRg());

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            // Em um sistema real, usaríamos BCrypt para senhas!
            if (usuario.getSenha().equals(loginDados.getSenha())) {
                return Map.of(
                    "status", "sucesso",
                    "cargo", usuario.getCargo(),
                    "redirect", usuario.getCargo().equals("ADMIN") ? "TelaPrincipalAdm.html" : "index.html"
                );
            }
        }
        
        return Map.of("status", "erro", "mensagem", "RG ou Senha incorretos");
    }
}