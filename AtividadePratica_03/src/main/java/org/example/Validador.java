package org.example;

public class Validador {

    public boolean ehEmailValido(String email) {
        if (email == null) return false;
        email = email.trim();
        if (email.isEmpty()) return false;
        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');
        // checa @ existe, há ponto depois do @, e não está no começo/fim
        return at > 0 && dot > at + 1 && dot < email.length() - 1;
    }

    public boolean ehSenhaForte(String senha) {
        if (senha == null) return false;
        if (senha.length() < 8) return false;
        boolean temLetra = senha.matches(".*[A-Za-z].*");
        boolean temNumero = senha.matches(".*\\d.*");
        return temLetra && temNumero;
    }

    public boolean ehCPFValido(String cpf) {
        if (cpf == null) return false;
        String apenasDigitos = cpf.replaceAll("\\D", ""); // remove pontos/traços
        return apenasDigitos.matches("\\d{11}"); // simples: só checa 11 dígitos
    }

    public boolean ehPalindromo(String texto) {
        if (texto == null) return false;
        String limpo = texto.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (limpo.isEmpty()) return false;
        String invertido = new StringBuilder(limpo).reverse().toString();
        return limpo.equals(invertido);
    }
}

