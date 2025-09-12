package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorTest {

    Validador v = new Validador();

    @Test
    void testEhEmailValido() {
        assertTrue(v.ehEmailValido("teste@gmail.com"));
        assertTrue(v.ehEmailValido("user.name@dominio.com.br"));
        assertFalse(v.ehEmailValido("testeemail.com"));
        assertFalse(v.ehEmailValido("@dominio.com"));
    }

    @Test
    void testEhSenhaForte() {
        assertTrue(v.ehSenhaForte("Senha123!"));
        assertTrue(v.ehSenhaForte("abcDEF1234*"));
        assertFalse(v.ehSenhaForte("fraca"));
        assertFalse(v.ehSenhaForte("12345678")); // só números não é aceitável aqui
    }

    @Test
    void testEhCPFValido() {
        assertTrue(v.ehCPFValido("12345678901"));
        assertTrue(v.ehCPFValido("123.456.789-01")); // remove formatação
        assertFalse(v.ehCPFValido("123"));
        assertFalse(v.ehCPFValido("abc12345678"));
    }

    @Test
    void testEhPalindromo() {
        assertTrue(v.ehPalindromo("arara"));
        assertTrue(v.ehPalindromo("A man, a plan, a canal, Panama"));
        assertFalse(v.ehPalindromo("java"));
        assertFalse(v.ehPalindromo("")); // vazio → false no nosso método
    }
}

