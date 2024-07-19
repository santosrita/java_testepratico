package exercício12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        int numero;
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que digite um número de 1 a 7
        System.out.print("Digite um número de 1 a 7 para obter o dia da semana: ");
        numero = input.nextInt();

        // Usa switch-case para determinar o dia da semana correspondente
        String diaDaSemana;
        switch (numero) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Número inválido. Digite um número de 1 a 7.";
                break;
        }

        // Exibe o dia da semana correspondente ou mensagem de erro
        System.out.println(diaDaSemana);

        // Fecha o Scanner
        input.close();
    }
}
