package com.spring.boot.carrinhoCompra.controller;

import com.spring.boot.carrinhoCompra.model.Carrinho;
import com.spring.boot.carrinhoCompra.service.CarrinhoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Carrinho", description = "Carrinho de compras")
@RestController
@RequestMapping("/api/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @GetMapping("/")
    public List<Carrinho> findAll(){
        return this.carrinhoService.findAll();
    }

    @GetMapping("/{id}")
    public Carrinho findById(Long id){
        return this.carrinhoService.findById(id);
    }

    @PostMapping("/")
    public Carrinho save(Carrinho carrinho){
        return this.carrinhoService.save(carrinho);
    }

    @PutMapping("/")
    public Carrinho update(Carrinho carrinho){
        return this.carrinhoService.save(carrinho);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        this.carrinhoService.delete(id);
    }
}
