package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é PAR!");
        }else{
            System.out.println("O número " + numero + " é ÍMPAR!");
        }
        scan.close();
    }
}
