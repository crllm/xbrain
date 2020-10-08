package com.example.xbrain.port.adapter.persistency.repository;

import com.example.xbrain.domain.model.Cliente;
import com.example.xbrain.domain.model.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    private ClienteRepositoryJpa repositoryJpa;

    @Override
    public Cliente save(Cliente cliente) {
        return repositoryJpa.save(cliente);
    }

    @Override
    public Cliente findById(Long id) {
        return null;
    }

    @Override
    public List<Cliente> findAll() {
        return null;
    }
}
