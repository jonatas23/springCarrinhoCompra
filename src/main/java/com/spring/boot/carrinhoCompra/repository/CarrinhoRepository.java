package com.spring.boot.carrinhoCompra.repository;

import com.spring.boot.carrinhoCompra.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
}
