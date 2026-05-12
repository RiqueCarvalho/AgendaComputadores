package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty; // Importe isso

@Entity
@Data
public class Aviso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("titulo") // Garante que o JSON terá esse nome
    private String titulo;

    @JsonProperty("conteudo") // Garante que o JSON terá esse nome
    private String conteudo; 

    @JsonProperty("imagemUrl") // Garante que o JSON terá esse nome exato
    private String imagemUrl; 
}