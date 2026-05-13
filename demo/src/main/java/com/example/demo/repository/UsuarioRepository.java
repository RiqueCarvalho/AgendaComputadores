package com.example.demo.repository;

import com.example.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    /**
     * Método para buscar um usuário pelo RG.
     * O Spring Data JPA cria a consulta SQL automaticamente
     * baseada no nome do método (find By Rg).
     */
    Optional<Usuario> findByRg(String rg);
}