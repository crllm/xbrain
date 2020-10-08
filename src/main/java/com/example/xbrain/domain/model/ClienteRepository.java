package com.example.xbrain.domain.model;
import java.util.List;

public interface ClienteRepository {

    Cliente save(Cliente cliente);

    Cliente findById(Long id);

    List<Cliente> findAll();
}
