package exercício2;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {

        int A, B, C;

        Scanner input = new Scanner(System.in);

        //Solicitando 3 valores:

        System.out.println("Informe o primeiro valor");
        A = input.nextInt();

        System.out.println("Informe o segundo valor");
        B = input.nextInt();

        System.out.println("Informe o terceiro valor");
        C = input.nextInt();

        //Verificando o maior valor entre A, B, C

        int maior = A;

        if(B > maior){
            maior = B;
        }
        if (C > maior){
            maior = C;
        }
        System.out.println("O maior valor é:" + maior);
        input.close();
    }
}
