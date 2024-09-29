package com.example.demo.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.entities.Produto;


public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto,Integer> {

  public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}