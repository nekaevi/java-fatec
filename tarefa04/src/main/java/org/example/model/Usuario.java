package org.example.model;

public class Usuario {
    private String nome;

    public Usuario(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do usuário não pode ser vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

