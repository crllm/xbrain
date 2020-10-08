package com.example.xbrain.port.adapter.persistency.repository;

import com.example.xbrain.domain.model.Endereco;
import com.example.xbrain.domain.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnderecoRepositoryImpl implements EnderecoRepository {

    @Autowired
    private EnderecoRepositoryJpa repositoryJpa;

    @Override
    public Endereco save(Endereco endereco) {
        return repositoryJpa.save(endereco);
    }

    @Override
    public Endereco findById(Long id) {
        return null;
    }

    @Override
    public List<Endereco> findAll() {
        return null;
    }

    @Override
    public List<Endereco> saveAll(List<Endereco> enderecos) {
        return repositoryJpa.saveAll(enderecos);
    }
}
