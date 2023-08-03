package Atividade4;

import java.util.Scanner;

public class CalculoDeAumentoDeSalario {

    public static void main(String[] args) {
        double PercentualSuperior = 0.10;
        double PercentualInferior = 0.15;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu salario:");
        double salario = scanner.nextDouble();
        double aumento;

        if (salario > 1350.00) {
            aumento = salario * PercentualSuperior;
        } else {
            aumento = salario * PercentualInferior;
        }
        double novoSalario = salario + aumento;
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Novo salario: R$" + novoSalario);
    }
}
