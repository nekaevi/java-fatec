package org.example.model;
import java.util.ArrayList;
import java.util.List;

public class Leilao {
    private String descricao;
    private List<Lance> lances = new ArrayList<>();

    public Leilao(String descricao) {
        this.descricao = descricao;
    }

    public void propoe(Lance lance) {
        if (lance == null) {
            throw new IllegalArgumentException("Lance não pode ser nulo");
        }

        // Impede lances decrescentes
        if (!lances.isEmpty() && lance.getValor() <= lances.get(lances.size() - 1).getValor()) {
            throw new IllegalArgumentException("Lance deve ser maior que o último lance");
        }

        // Limite de 5 lances por usuário
        long qtdLances = lances.stream()
                .filter(l -> l.getUsuario().getNome().equals(lance.getUsuario().getNome()))
                .count();

        if (qtdLances >= 5) {
            throw new IllegalArgumentException("Usuário já atingiu o limite de 5 lances");
        }

        lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }
}


