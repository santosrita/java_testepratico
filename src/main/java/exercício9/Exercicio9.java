package exercício9;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

                // Inicializando o array para armazenar 5 valores
                int[] valores = new int[5];

                // Solicitando e lendo os 5 valores
                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite o valor " + (i + 1) + ": ");
                    valores[i] = input.nextInt();
                }

                // Inicializando variáveis para encontrar o maior elemento e contar suas ocorrências
                int maior = valores[0];
                int contagemMaior = 1; // Começa com 1 porque o primeiro elemento já é contado

                // Encontrando o maior elemento e contando suas ocorrências
                for (int i = 1; i < 5; i++) {
                    if (valores[i] > maior) {
                        maior = valores[i];
                        contagemMaior = 1; // Resetando a contagem para o novo maior elemento encontrado
                    } else if (valores[i] == maior) {
                        contagemMaior++; // Incrementando a contagem do maior elemento
                    }
                }

                // Exibindo o resultado
                System.out.println("O maior elemento é: " + maior);
                System.out.println("Ele aparece " + contagemMaior + " vez(es) entre os valores informados.");

                input.close();
            }
        }
