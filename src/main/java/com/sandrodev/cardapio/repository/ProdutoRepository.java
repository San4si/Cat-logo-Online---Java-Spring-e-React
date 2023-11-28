package com.sandrodev.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandrodev.cardapio.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
