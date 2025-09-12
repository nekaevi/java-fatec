package org.example;

import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validador v = new Validador(); // instancia a classe de validação
        Scanner sc = new Scanner(System.in);

        // ---------- Testar email ----------
        System.out.print("Digite um email: ");
        String email = sc.nextLine();
        if (v.ehEmailValido(email)) {
            System.out.println("Email válido!");
        } else {
            System.out.println("Email inválido!");
        }

        // ---------- Testar senha ----------
        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();
        if (v.ehSenhaForte(senha)) {
            System.out.println("Senha forte!");
        } else {
            System.out.println("Senha fraca!");
        }

        // ---------- Testar CPF ----------
        System.out.print("Digite um CPF: ");
        String cpf = sc.nextLine();
        if (v.ehCPFValido(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }

        // ---------- Testar palíndromo ----------
        System.out.print("Digite um texto para verificar palíndromo: ");
        String texto = sc.nextLine();
        if (v.ehPalindromo(texto)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        sc.close();
    }
}
