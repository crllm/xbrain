package com.example.xbrain.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "CIDADE")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "estado", fetch = FetchType.LAZY)
    private final Set<Cidade> cidades;

    public Estado() {
        this.cidades = new HashSet<>();
    }
}
