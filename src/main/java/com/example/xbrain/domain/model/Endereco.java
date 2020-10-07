package com.example.xbrain.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logadouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cep;

    @OneToMany(mappedBy = "enderecos", fetch = FetchType.LAZY)
    private Cliente cliente;

    @OneToMany(mappedBy = "enderecos", fetch = FetchType.LAZY)
    private Cidade cidade;

    public Endereco() {
    }
}
