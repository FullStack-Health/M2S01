package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
            Crie um programa em Java que solicite ao usuário o seu nível de
            condicionamento (iniciante, intermediário ou avançado) e, em
            seguida, gere um plano de treinamento semanal com base nesse
            nível.
        */

        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.print("Escolha o nível de condicionamento: \n" +
                "1. Iniciante\n" +
                "2. Intermediário\n" +
                "3. Avançado\n" +
                "Opção: ");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1. Domingo -> Caminhada" +
                        "\n2. Segunda-Feira -> Musculação" +
                        "\n3. Terça-Feira -> Descanso" +
                        "\n4. Quarta-Feira -> Yoga" +
                        "\n5. Quinta-Feira -> Natação" +
                        "\n6. Sexta-Feira -> Descanso" +
                        "\n7. Sábado -> Futebol");
                break;
            case 2:
                System.out.println("1. Domingo -> Caminhada" +
                        "\n2. Segunda-Feira -> Musculação" +
                        "\n3. Terça-Feira -> Corrida" +
                        "\n4. Quarta-Feira -> Yoga" +
                        "\n5. Quinta-Feira -> Natação" +
                        "\n6. Sexta-Feira -> Descanso" +
                        "\n7. Sábado -> Futebol");
                break;
            case 3:
                System.out.println("1. Domingo -> Caminhada" +
                        "\n2. Segunda-Feira -> Musculação" +
                        "\n3. Terça-Feira -> Corrida" +
                        "\n4. Quarta-Feira -> Yoga" +
                        "\n5. Quinta-Feira -> Natação" +
                        "\n6. Sexta-Feira -> Volêi" +
                        "\n7. Sábado -> Futebol");
                break;
            default:
                System.out.println("Opção Inválida!!!");
        }
    }
}
