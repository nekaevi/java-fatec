package org.example.test;



import org.example.model.Lance;
import org.example.model.Leilao;
import org.example.model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeilaoTest {

    @Test
    void deveAceitarUmLanceValido() {
        Leilao leilao = new Leilao("Notebook Gamer");
        Usuario maria = new Usuario("Maria");

        leilao.propoe(new Lance(maria, 1000.0));

        assertEquals(1, leilao.getLances().size());
        assertEquals(1000.0, leilao.getLances().get(0).getValor());
    }

    @Test
    void naoDeveAceitarLanceDecrescente() {
        Leilao leilao = new Leilao("Smartphone");
        Usuario joao = new Usuario("João");

        leilao.propoe(new Lance(joao, 1000.0));

        assertThrows(IllegalArgumentException.class, () -> {
            leilao.propoe(new Lance(joao, 900.0));
        });
    }

    @Test
    void naoDeveAceitarMaisDeCincoLancesPorUsuario() {
        Leilao leilao = new Leilao("Carro antigo");
        Usuario ana = new Usuario("Ana");

        for (int i = 0; i < 5; i++) {
            leilao.propoe(new Lance(ana, 1000 + i * 100));
        }

        assertThrows(IllegalArgumentException.class, () -> {
            leilao.propoe(new Lance(ana, 2000));
        });
    }

    @Test
    void deveLidarComListaVaziaOuNula() {
        Leilao leilao = new Leilao("Casa");
        assertTrue(leilao.getLances().isEmpty());
        assertThrows(IllegalArgumentException.class, () -> leilao.propoe(null));
    }
}
