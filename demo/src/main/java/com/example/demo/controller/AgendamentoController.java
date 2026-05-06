package com.example.demo.controller;

import com.example.demo.model.Agendamento;
import com.example.demo.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository repository;

    @PostMapping
    public Agendamento criarAgendamento(@RequestBody Agendamento agendamento) {
        return repository.save(agendamento);
    }

    @GetMapping
    public List<Agendamento> listarTodos() {
        return repository.findAll();
    }
}