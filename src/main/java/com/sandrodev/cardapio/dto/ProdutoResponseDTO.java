package com.sandrodev.cardapio.dto;

import java.util.UUID;

import com.sandrodev.cardapio.entities.Produto;

public record ProdutoResponseDTO(UUID id, String title, String description, String image, Double price) {
    public ProdutoResponseDTO(Produto produto) {
        this(produto.getId(), produto.getTitle(), produto.getDescription(), produto.getImage(), produto.getPrice());
    }
}