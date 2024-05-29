package com.spring.boot.carrinhoCompra.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SENAI_ITEM")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "QTD_ITEM", nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "ID_CARRINHO", nullable = false)
    @JsonBackReference
    private Carrinho carrinho;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO", nullable = false)
    private Produto produto;
}
