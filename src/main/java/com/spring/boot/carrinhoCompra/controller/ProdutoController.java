package com.spring.boot.carrinhoCompra.controller;

import com.spring.boot.carrinhoCompra.model.Produto;
import com.spring.boot.carrinhoCompra.service.ProdutoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Produto", description = "Controle de criação e manutenção de produto")
@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;


    @GetMapping
    public List<Produto> findAll(){
        return this.produtoService.findAll();
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable("id") Long id){
        return this.produtoService.findById(id);
    }


    @PostMapping
    public Produto save(@RequestBody Produto produto){
        return this.produtoService.save(produto);
    }

    @PutMapping
    public Produto update(@RequestBody Produto produto){
        return this.produtoService.save(produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        this.produtoService.delete(id);
    }
}
