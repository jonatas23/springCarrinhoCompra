package com.spring.boot.carrinhoCompra.repository;

import com.spring.boot.carrinhoCompra.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
