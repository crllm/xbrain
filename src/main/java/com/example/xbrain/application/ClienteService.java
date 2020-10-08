package com.example.xbrain.application;

import com.example.xbrain.domain.model.Cliente;
import com.example.xbrain.domain.model.ClienteRepository;
import com.example.xbrain.domain.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Cliente save(Cliente cliente) {
        enderecoRepository.saveAll(cliente.getEnderecos());
        return repository.save(cliente);
    }

}
