package exercício11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        int numero = 7;

        // Loop de 1 a 10 para calcular e exibir a tabuada
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
