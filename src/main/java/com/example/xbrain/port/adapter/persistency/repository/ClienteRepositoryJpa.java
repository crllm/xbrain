package com.example.xbrain.port.adapter.persistency.repository;

import com.example.xbrain.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositoryJpa extends JpaRepository<Cliente, Long> {
}
