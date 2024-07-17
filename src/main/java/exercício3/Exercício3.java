package exercício3;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {

        int A, B;
        Scanner input = new Scanner(System.in);

                //Solicitando os valores ao usuário
        System.out.println("Digite o valor de A");
        A = input.nextInt();

        System.out.println("Digite o valor de B");
        B = input.nextInt();

        //Verificando se são múltiplos

        if (A % B == 0 || B % A == 0){
            System.out.println("São múltiplos");
        }
        else{
            System.out.println("Não são múltiplos");
        }
        input.close();
    }
}
