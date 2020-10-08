package com.example.xbrain.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "cliente_fk")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cidade_fk")
    private Cidade cidade;

    public Endereco() {
    }

    public static interface EnderecoRepository {

        Endereco save(Endereco endereco);

        List<Endereco> saveAll(List<Endereco> enderecos);

        Endereco findById(Long id);

        List<Endereco> findAll();
    }
}
