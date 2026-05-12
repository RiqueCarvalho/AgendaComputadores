package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Aviso;

public interface AvisoRepository extends JpaRepository<Aviso, Long> {
}