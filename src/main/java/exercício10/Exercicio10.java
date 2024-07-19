package exercício10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o número N
        System.out.print("Digite um número inteiro N (maior que zero): ");
        int n = scanner.nextInt();

        // Verifica se N é maior que zero
        if (n <= 0) {
            System.out.println("Número inválido. Por favor, digite um número maior que zero.");
            return; // Encerra o programa se N não for válido
        }

        // Exibe todos os números pares de 1 até N
        System.out.println("Números pares de 1 até " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Fecha o Scanner
        scanner.close();
        }
    }
