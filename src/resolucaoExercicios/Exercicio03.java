package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        /*
            Crie um programa que converta uma temperatura em graus Celsius para Fahrenheit.
         */

        Scanner scan = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scan.nextDouble();

        fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("A temperatura em Fahrenheit é " + fahrenheit + "ºF");

        scan.close();
    }
}
