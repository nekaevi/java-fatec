package org.example; // Pacote onde a classe está

public class Validador { // Classe pública que contém os métodos de validação

    // ------------------ EMAIL ------------------
    public boolean ehEmailValido(String email) {
        if (email == null) return false;           // Se for nulo, já retorna falso
        email = email.trim();                      // Remove espaços no começo e no fim
        if (email.isEmpty()) return false;         // Se estiver vazio, falso
        int at = email.indexOf('@');               // Pega a posição do '@'
        int dot = email.lastIndexOf('.');          // Pega a última posição do '.'
        // Checa se existe @, se há ponto depois do @ e não está no começo ou no fim
        return at > 0 && dot > at + 1 && dot < email.length() - 1;
    }

    // ------------------ SENHA ------------------
    public boolean ehSenhaForte(String senha) {
        if (senha == null) return false;           // Se for nula, retorna falso
        if (senha.length() < 8) return false;      // Senha deve ter pelo menos 8 caracteres
        boolean temLetra = senha.matches(".*[A-Za-z].*"); // Tem pelo menos uma letra?
        boolean temNumero = senha.matches(".*\\d.*");     // Tem pelo menos um número?
        return temLetra && temNumero;              // Só retorna true se tiver os dois
    }

    // ------------------ CPF ------------------
    public boolean ehCPFValido(String cpf) {
        if (cpf == null) return false;             // Se for nulo, falso
        String apenasDigitos = cpf.replaceAll("\\D", ""); // Remove tudo que não é dígito (pontos, traços)
        return apenasDigitos.matches("\\d{11}");   // Checa se tem exatamente 11 dígitos numéricos
    }

    // ------------------ PALÍNDROMO ------------------
    public boolean ehPalindromo(String texto) {
        if (texto == null) return false;           // Se for nulo, falso
        // Remove tudo que não é letra nem número e converte para minúsculas
        String limpo = texto.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (limpo.isEmpty()) return false;         // Se ficou vazio, falso
        String invertido = new StringBuilder(limpo).reverse().toString(); // Inverte a string limpa
        return limpo.equals(invertido);            // Compara original com invertida
    }

}
