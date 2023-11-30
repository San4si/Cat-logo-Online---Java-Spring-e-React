package com.sandrodev.cardapio.entities;

import java.util.UUID;

import com.sandrodev.cardapio.dto.ProdutoRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "produtos")
@Entity(name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String description;
    private String image;
    private Double price;

    public Produto(ProdutoRequestDTO data) {
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
        this.description = data.description();
    }
}
