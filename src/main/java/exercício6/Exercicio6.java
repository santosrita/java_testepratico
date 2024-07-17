package exercício6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        String sexo;
        Double altura;
        Double imcIdeal;
        Scanner input = new Scanner(System.in);

        //Solicitando a altura ao usuário
        System.out.println("Digite a altura em metros");
        altura = input.nextDouble();

        //Solicitando o sexo ao usuário
        System.out.println("Digite o sexo (M para masculino e F para feminino)");
        sexo = input.next();

        //Calculando o IMC conforme o sexo
        if (sexo.equalsIgnoreCase("M")){
            //Fórmula para homens
            imcIdeal = (72.7 * altura) - 58;
            System.out.println("O IMC ideal para um homem com altura " + altura + "é: " + imcIdeal);
        }
        else if (sexo.equalsIgnoreCase("F")){
            //Fórmula para mulheres
            imcIdeal = (62.1 * altura) - 44.7;
            System.out.println("O IMC ideal para uma mulher com altura " + altura + "é: " + imcIdeal);
        }
        else {
            //Se o sexo não for válido
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
        }

        input.close();

    }
}
