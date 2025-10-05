package com.example.animal.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especie;

    public Long getId() {
        return id;
    }

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
