package resolucaoExercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempoServico;
        double salario;

        System.out.println("Digite o seu salário: ");
        salario = scan.nextDouble();

        System.out.println("Digite o tempo de serviço: ");
        tempoServico = scan.nextInt();

        if(tempoServico > 5){
            System.out.println("Salário Original: " + salario
                                + "\nBônus: " + salario * 0.10
                                + "\nSalário Final: " + salario * 1.1
            );
        }else{
            System.out.println("Salário Original: " + salario
                    + "\nBônus: " + salario * 0.05
                    + "\nSalário Final: " + salario * 1.05
            );
        }
        scan.close();
    }
}
