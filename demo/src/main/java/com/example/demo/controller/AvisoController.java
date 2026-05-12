package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aviso;
import com.example.demo.repository.AvisoRepository;

@RestController
@RequestMapping("/api/avisos")
@CrossOrigin(origins = "*")
public class AvisoController {

    @Autowired
    private AvisoRepository repository;

    @GetMapping
    public List<Aviso> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Aviso criar(@RequestBody Aviso aviso) {
        return repository.save(aviso);
    }
}