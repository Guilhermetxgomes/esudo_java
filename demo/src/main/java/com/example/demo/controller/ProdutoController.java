package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entities.Produto;
import com.example.demo.model.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

  @Autowired
  private ProdutoRepository produtoRepository;

  @PostMapping
  public Produto novoProduto(@Valid Produto produto) {
    produtoRepository.save(produto);
    return produto;
  }

  @GetMapping
  public Iterable<Produto> obterProdutos() {
    return produtoRepository.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Produto> obterProdutoPorId(@PathVariable int id){
    return produtoRepository.findById(id);
  }

}
