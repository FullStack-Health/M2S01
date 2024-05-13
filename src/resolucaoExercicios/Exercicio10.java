package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        /*
            Faça um programa para ler 10 números diferentes a serem armazenados em um vetor.
            Os números deverão ser armazenados no vetor na ordem em que forem lidos, sendo que,
            caso o usuário digite um número que já foi digitado anteriormente, o programa deverá
            pedir a ele para digitar outro número. Note que cada valor digitado pelo usuário deve
            ser pesquisado no vetor, verificando se ele existe entre os números que já foram fornecidos.
            Exiba na tela o vetor final que foi digitado.
        */

        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[10];
        int length = numeros.length;
        int numero;
        boolean numeroExiste = false;

        for(int i = 0; i < length; i++){
            System.out.println("Digite o " + (i+1) +"º valor: ");
            numero = scan.nextInt();

            for(int j = 0; j < i; j++){
                if(numero == numeros[j]){
                    numeroExiste = true;
                }
            }

            if(numeroExiste){
                System.out.println("Número já armazenado no array!\nDigite um novo número.");
                i--;
                numeroExiste = false;
            }else{
                numeros[i] = numero;
            }
        }

        for(int num : numeros){
            System.out.println(num);
        }
    }
}
