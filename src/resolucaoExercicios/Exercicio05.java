package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade: ");
        idade = scan.nextInt();

        if(idade >= 0 && idade <=12){
            System.out.println("Categoria: Criança!");
        }else if(idade <= 19){
            System.out.println("Categoria: Adolescente!");
        }else{
            System.out.println("Categoria: Adulto!");
        }
        scan.close();
    }
}
