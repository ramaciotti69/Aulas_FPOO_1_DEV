package estruturadecisao;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] tabelaPrecos = {
            {98.00, 2.39},
            {79.00, 1.99},
            {102.00, 2.99}
        };

        System.out.print("Digite o nome do veiculo (Fiat Argo, Fiat Mobi, Hyundai Hb20): ");
        String veiculoEscolhido = scanner.nextLine();
        int veiculoIndex = -1;

        switch (veiculoEscolhido) {
            case "Fiat Argo":
                veiculoIndex = 0;
                break;
            case "Fiat Mobi":
                veiculoIndex = 1;
                break;
            case "Hyundai Hb20":
                veiculoIndex = 2;
                break;
            default:
                System.out.println("Veiculo nao identificado");
                System.exit(0);
        }

        System.out.print("Digite a quantidade de dias de aluguel: ");
        int diasAluguel = scanner.nextInt();

        System.out.print("Digite a quantidade de km rodados: ");
        double kmRodados = scanner.nextDouble();

        double precoDiaria = tabelaPrecos[veiculoIndex][0];
        double precoPorKm = tabelaPrecos[veiculoIndex][1];

        double custoDiaria = precoDiaria * diasAluguel;
        double custoKm = precoPorKm * kmRodados;

        double custoTotal = custoDiaria + custoKm;

        System.out.println("O valor total do aluguel para o veiculo " + veiculoEscolhido + " e R$ " + custoTotal);
    }
}
