package exercício5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        int numero1, numero2;
        Scanner input = new Scanner(System.in);

        //Solicitando os valores ao usuário
        System.out.println("Digite o primeiro número");
        numero1 = input.nextInt();

        System.out.println("Digite o segundo número");
        numero2 = input.nextInt();

        //Verificando quem é maior, menor ou se são iguais
        if (numero1 > numero2){
            System.out.println("Primeiro número é maior");
        } else if (numero2 > numero1){
            System.out.println("Segundo número é maior");
        }
        else{
            System.out.println("Os números são iguais");
        }
        input.close();
    }
}
