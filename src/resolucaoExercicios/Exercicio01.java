package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        /*
        * Crie um programa que solicite ao usuário o peso (em quilogramas)
        * e a altura (em metros), calcule o IMC e exiba o resultado.
        * */

        Scanner scan = new Scanner(System.in);
        double peso, altura, imc;

        System.out.print("Digite seu peso (em kg): ");
        peso = scan.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f", imc);

        scan.close();

    }
}
