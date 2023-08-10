package estruturadecisao;

import java.util.Scanner;

public class Atividade1 {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Digite o seu cargo do funcionário (Gerente/Supervisor/Tecnico/Auxiliar): ");
        String cargo = scanner.nextLine();

        double salarioBase = 0;
        double inssPorcentagem = 0;
        double convenio = 0;

        switch (cargo.toLowerCase()) {
            case "gerente":
                salarioBase = 5590.00;
                inssPorcentagem = 8.0;
                convenio = 289.00;
                break;
            case "supervisor":
                salarioBase = 4128.00;
                inssPorcentagem = 7.0;
                convenio = 239.00;
                break;
            case "tecnico":
                salarioBase = 3789.00;
                inssPorcentagem = 4.0;
                convenio = 189.00;
                break;
            case "auxiliar":
                salarioBase = 2345.00;
                inssPorcentagem = 2.0;
                convenio = 156.00;
                break;
            default:
                System.out.println("Cargo invalido!");
                scanner.close();
                return;
        }

        double descontoINSS = salarioBase * (inssPorcentagem / 100);
        double salarioLiquido = salarioBase - descontoINSS - convenio;

        System.out.println("Cargo: " + cargo);
        System.out.println("Salario Base: R$ " + salarioBase);
        System.out.println("Desconto INSS: R$ " + descontoINSS);
        System.out.println("Convenio: R$ " + convenio);
        System.out.println("Salario Liquido: R$ " + salarioLiquido);
    }
    }
}

