package app;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
        int numero = 10; //Declaração e Inicializando a variável

        double real = 10.0;

        char letra = 'a';

        boolean validacao = 10 > 5;

        Scanner scan = new Scanner(System.in);

        String aluno;
        double nota1, nota2, nota3, media, recuperacao;

        //Entrada de Dados
        System.out.println("** CÁLCULO DE MÉDIA **");
        System.out.println("Digite o seu nome: ");
        aluno = scan.next();

        System.out.println("Digite a sua 1º nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a sua 2º nota:");
        nota2 = scan.nextDouble();

        System.out.println("Digite a sua 3º nota:");
        nota3 = scan.nextDouble();

        //Processamento
        media = (nota1+nota2+nota3)/3;

        //Saída de dados
        //System.out.println("Aluno: " + aluno + "\nMédia: " + media);

        System.out.printf("Aluno: %s\nMédia: %.1f\nSituação: ", aluno, media);

        //Estrutura de Decisão
        if (media >= 7.0){
            System.out.println("Aprovado!");
        }else if(media >= 5.0){
            System.out.println("Digite a nota de recuperação: ");
            recuperacao = scan.nextDouble();

            if((recuperacao + media)/2 >= 6){
                System.out.println("Aprovado por recuperação!");
            }else {
                System.out.println("Reprovado!");
            }
        }else{
            System.out.println("Reprovado!");
        }

        System.out.println(media >= 7 ? "APROVADO" : "REPROVADO");
        */
        /*

        /* EXEMPLOS DE CASTING
        long valor1 = 10;
        int valor2 = (int) valor1;

        int num1 = 10;
        double num2 = num1;

        double numero1 = 2.6;
        int numero2 = (int) numero1;

        System.out.println(valor2 + " | " + num2 + " | " + numero2);


        /* LAÇOS DE REPETIÇÃO
        // -> WHILE

        int contador = 1;
        while(contador <= 100){
            if(contador % 2 == 0){
                System.out.println(contador);
            }
            contador++;
        }

        contador = 1;
        while(contador <= 100){
            if(contador % 2 == 1){
                System.out.println(contador);
            }
            contador++;
        }

        // -> DO-WHILE
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(11);
        int palpite;

        do{
            System.out.println("Digite um valor: ");
            palpite = scan.nextInt();

            if(palpite == numeroAleatorio){
                System.out.println("Parabéns! Você acertou o número!\nNúmero Sorteado: " + numeroAleatorio);
            }else{
                System.out.println("Palpite incorreto! Tente novamente!");
            }

        }while(palpite != numeroAleatorio);

        // -> FOR

        for(int cont = 1; cont <= 5; cont++){
            System.out.println(cont);
        }

        System.out.println("Digite o número da tabuada: ");
        int numero = scan.nextInt();

        for (int cont = 1; cont <= 10; cont++){

            if(cont == 5){
                continue;
            }

            System.out.printf("%d x %d = %d\n", numero, cont, numero * cont);

            if(cont == 5){
                //break;
            }
        }*/

        Scanner scan = new Scanner(System.in);

        int tamanho = 3;

        String nomes[] = new String[tamanho];

        int length = nomes.length;

        for(int i = 0; i < 2; i++){
            System.out.println("Digite um nome: ");
            nomes[i] = scan.nextLine();
        }

        System.out.println("Visualização dos Elementos com FOR TRADICIONAL");
        for(int i = 0; i < length; i++){
            System.out.println(nomes[i]);
        }

        System.out.println("Visualização dos Elementos com FOR-EACH");
        for(String nome : nomes){
            System.out.println(nome);
        }

        /* ARRAY BIDIMENSIONAL (MATRIZ)*/

        double[][] notas = new double[3][3];
        String[] alunos = {"Davi", "Paulo", "João"};

        for(int linha = 0; linha < notas.length; linha++){
            System.out.println("Notas do " + alunos[linha] + "º Aluno");
            for(int coluna = 0; coluna < notas[0].length; coluna++) {
                System.out.println("Digite a " + (coluna + 1) + "º Nota: ");
                notas[linha][coluna] = scan.nextDouble();
            }
        }

        for(int linha = 0; linha < notas.length; linha++){
            System.out.println("Notas do " + alunos[linha] + "º Aluno");
            for(int coluna = 0; coluna < notas[0].length; coluna++) {
                System.out.println((coluna+1) + "º Nota: " + notas[linha][coluna]);
            }
        }
    }
}
