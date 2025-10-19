package org.example.model;

public class Lance {
    private Usuario usuario;
    private double valor;

    public Lance(Usuario usuario, double valor) {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuário não pode ser nulo");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do lance deve ser positivo");
        }
        this.usuario = usuario;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getValor() {
        return valor;
    }
}

