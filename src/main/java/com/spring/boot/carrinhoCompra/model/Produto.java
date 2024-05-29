package com.spring.boot.carrinhoCompra.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SENAI_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESC_NOME")
    private String nome;

    @Column(name = "INFO_PRODUTO")
    private String info;

    @Column(name = "QTD_PRODUTO")
    private Integer quantidade;

    @Column(name = "valor")
    private Double valor;
}
