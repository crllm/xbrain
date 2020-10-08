package com.example.xbrain.domain.model;

import java.util.List;

public interface EnderecoRepository {

    Endereco save(Endereco endereco);

    Endereco findById(Long id);

    List<Endereco> findAll();

    List<Endereco> saveAll(List<Endereco> enderecos);
}
