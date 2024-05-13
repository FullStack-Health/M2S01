package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        /*
            Crie um sistema para uma pequena escola que deverá ter as seguintes funcionalidades:
            - Cadastrar Alunos
            - Cadastrar Notas
            - Gerar Relatório

        */
        Scanner scan = new Scanner(System.in);
        String[] alunos = {};
        double[][] notas = {};
        int opcao, qtdAlunos=0, soma=0;

        do{
            System.out.print("1 - CADASTRAR ALUNOS\n2 - CADASTRAR NOTAS\n3 - GERAR RELATÓRIO\n4 - SAIR\nEscolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Quantidade de alunos: ");
                    qtdAlunos = scan.nextInt();
                    alunos = new String[qtdAlunos];

                    for (int i = 0; i < qtdAlunos; i++){
                        System.out.print("Nome do "+(i+1)+"º aluno: ");
                        alunos[i] = scan.next();
                    }
                    System.out.println("Alunos Cadastrados com sucesso!");
                    break;
                case 2:
                    notas = new double[qtdAlunos][3];
                    for(int linha = 0; linha < notas.length; linha++){
                        System.out.println("NOTAS ALUNO " + alunos[linha]);
                        for(int coluna = 0; coluna < notas[0].length; coluna++){
                            System.out.printf("%dº Nota: ", coluna+1);
                            notas[linha][coluna] = scan.nextDouble();
                        }
                    }
                    break;
                case 3:
                    System.out.println("_* RELATÓRIO ALUNOS *_");

                    for(int linha = 0; linha < notas.length; linha++){
                        System.out.println("Aluno: " + alunos[linha]);
                        for(int coluna = 0; coluna < notas[0].length; coluna++){
                            System.out.println(coluna+1 + "º Nota: " + notas[linha][coluna]);
                            soma += notas[linha][coluna];
                        }
                        System.out.println("Média: " + soma/3);
                        System.out.print("Situação: ");
                        System.out.println(soma/3 >= 7 ? "Aprovado" : "Reprovado");
                        System.out.println();
                        soma = 0;
                    }
                    break;
            }

        }while(opcao != 4);
    }
}
