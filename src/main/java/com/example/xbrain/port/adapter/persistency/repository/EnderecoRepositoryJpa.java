package com.example.xbrain.port.adapter.persistency.repository;

import com.example.xbrain.domain.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepositoryJpa extends JpaRepository<Endereco, Long> {
}
