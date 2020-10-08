package com.example.xbrain.port.adapter.service.controller;

import com.example.xbrain.application.ClienteService;
import com.example.xbrain.domain.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/services")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping(value = "/cliente")
    public Cliente insert(@Valid @RequestBody Cliente cliente) {
        return service.save(cliente);
    }
}
