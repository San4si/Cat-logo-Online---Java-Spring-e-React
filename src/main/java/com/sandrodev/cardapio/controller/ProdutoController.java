package com.sandrodev.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandrodev.cardapio.dto.ProdutoRequestDTO;
import com.sandrodev.cardapio.dto.ProdutoResponseDTO;
import com.sandrodev.cardapio.entities.Produto;
import com.sandrodev.cardapio.repository.ProdutoRepository;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired

    private ProdutoRepository repository;

    @GetMapping
    public List<ProdutoResponseDTO> getAll() {
        List<ProdutoResponseDTO> produtoList = repository.findAll().stream().map(ProdutoResponseDTO::new).toList();
        return produtoList;
    }

    @PostMapping
    public void saveProduto(@RequestBody ProdutoRequestDTO data) {
        Produto produtoData = new Produto(data);
        repository.save(produtoData);
        return;
    }
}
