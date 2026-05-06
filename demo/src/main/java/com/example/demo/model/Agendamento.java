package com.example.demo.model; 

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomeCompleto;
    private LocalDateTime dataHora;
    private Integer numeroAlunos;
    private String finalidadeUso;
    private String equipamentos;
    private String turma;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public Integer getNumeroAlunos() { return numeroAlunos; }
    public void setNumeroAlunos(Integer numeroAlunos) { this.numeroAlunos = numeroAlunos; }
    public String getFinalidadeUso() { return finalidadeUso; }
    public void setFinalidadeUso(String finalidadeUso) { this.finalidadeUso = finalidadeUso; }
    public String getEquipamentos() { return equipamentos; }
    public void setEquipamentos(String equipamentos) { this.equipamentos = equipamentos; }
    public String getTurma() { return turma; }
    public void setTurma(String turma) { this.turma = turma; }
}