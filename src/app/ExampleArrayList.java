package app;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleArrayList {

    public static void main(String[] args) {
        //DECLARAÇÃO DO ARRAYLIST

        Scanner scan = new Scanner(System.in);
        ArrayList<String> pacientes = new ArrayList<>();
        ArrayList<String> pacientesTest = new ArrayList<>();

        //INSERÇÃO DE DADOS
        for(int i = 0; i < 4; i++){
            System.out.println("Nome do "+ (i+1)+"º Paciente: ");
            pacientes.add(scan.nextLine());

            System.out.println(pacientes.size());
        }

        //VISUALIZAÇÃO DOS DADOS
        System.out.println("PACIENTES CADASTRADOS");
        for(String paciente : pacientes){
            System.out.println(paciente);
        }

        pacientesTest.add("Davi Saldanha");
        pacientesTest.add("Ana Maria");

        pacientes.removeAll(pacientesTest);

        System.out.println();
        System.out.println("PACIENTES CADASTRADOS");
        for(String paciente : pacientes){
            System.out.println(paciente);
        }

        System.out.println(pacientes.contains("Davi Saldanha"));
    }
}
