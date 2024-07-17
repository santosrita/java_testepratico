package exercício4;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {

        int numero
                Scanner input = new Scanner(System.in);

        //Solicitando valor ao usuário
        System.out.println("Digite um valor");
        numero = input.nextInt();

        //Verificando se o número é ímpar ou par
        if (numero % 2 == 0){
            System.out.println(numero + "é par");
        }
        else{
            System.out.println(numero + "é ímpar");
        }


    }
}
