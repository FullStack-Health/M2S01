package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        /*
        * Crie um programa que solicite a idade do usuário e calcule a FCM.
        * */

        Scanner scan = new Scanner(System.in);
        int idade, fcm;

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        fcm = 220 - idade;

        System.out.println("Sua frequência cardiaca máxima é: " + fcm + " bpm");
        scan.close();
    }
}
