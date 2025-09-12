package org.example; // Pacote de testes

import static org.junit.jupiter.api.Assertions.*; // Importa assertTrue/False
import org.junit.jupiter.api.Test;                // Importa anotação @Test

public class ValidadorTest { // Classe de teste JUnit

    Validador v = new Validador(); // Instancia o Validador para usar nos testes

    @Test
    void testEhEmailValido() { // Testa o método ehEmailValido
        assertTrue(v.ehEmailValido("teste@gmail.com"));               // Deve ser válido
        assertTrue(v.ehEmailValido("teste+123@gmail.com"));           // caracteres especiais válidos
        assertTrue(v.ehEmailValido("user.name@dominio.com.br"));       // Deve ser válido
        assertFalse(v.ehEmailValido("testeemail.com"));                // Sem @ → inválido
        assertFalse(v.ehEmailValido("@dominio.com"));                  // Sem usuário antes do @ → inválido
    }

    @Test
    void testEhSenhaForte() { // Testa o método ehSenhaForte
        assertTrue(v.ehSenhaForte("Senha123!"));       // Tem letra + número + tamanho suficiente
        assertTrue(v.ehSenhaForte("Abc123$%")); // símbolos diferentes
        assertTrue(v.ehSenhaForte("abcDEF1234*"));     // Também atende aos critérios
        assertFalse(v.ehSenhaForte("fraca"));          // Curta e sem número
        assertFalse(v.ehSenhaForte("12345678"));       // Só números → não atende
    }

    @Test
    void testEhCPFValido() { // Testa o método ehCPFValido
        assertTrue(v.ehCPFValido("12345678901"));         // 11 dígitos
        assertTrue(v.ehCPFValido("123.456.789-01"));      // 11 dígitos com pontuação → deve limpa
        assertFalse(v.ehCPFValido("123"));                // Poucos dígitos
        assertFalse(v.ehCPFValido("abc12345678"));        // Letras misturadas
    }

    @Test
    void testEhPalindromo() { // Testa o método ehPalindromo
        assertTrue(v.ehPalindromo("arara"));                      // Palíndromo simples
        assertTrue(v.ehPalindromo("12321")); // só números
        assertTrue(v.ehPalindromo("A man, a plan, a canal, Panama")); // Palíndromo ignorando espaços e pontuação
        assertFalse(v.ehPalindromo("java"));                      // Não é palíndromo
        assertFalse(v.ehPalindromo(""));                          // Vazio → falso
    }
}
