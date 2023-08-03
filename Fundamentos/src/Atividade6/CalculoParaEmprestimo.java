package Atividade6;

import java.util.Scanner;

public class CalculoParaEmprestimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Digite o valor da casa: ");
        double valorCasa = scanner.nextDouble();

System.out.print("Digite o salario: ");
        double salario = scanner.nextDouble();

System.out.print("Digite a quantidade de anos a pagar: ");
        int anos = scanner.nextInt();
double prestacaoMaxima = salario * 0.3;
        double prestacao = valorCasa / (anos * 12);

        if (prestacao <= prestacaoMaxima) {
            System.out.println("Emprestimo aprovado");
        } else {
            System.out.println("Empréstimo rejeitado por conta de ser maior que 30% do salario");
        }
    }
}


