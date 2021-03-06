package com.example.xbrain.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "categoria_fk")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "pedido_fk")
    private Pedido pedido;

    public Produto() {
    }
}
