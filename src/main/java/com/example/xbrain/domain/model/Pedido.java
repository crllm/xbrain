package com.example.xbrain.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataCompra;

    private LocalTime horaCompra;

    @JsonIgnore
    @OneToMany(mappedBy="pedido")
    private List<Produto> produtos;

    @ManyToOne
    @JoinColumn(name = "cliente_fk")
    private Cliente cliente;

}
