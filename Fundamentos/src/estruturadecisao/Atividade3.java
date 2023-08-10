package estruturadecisao;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Opcoes de prato:");
        System.out.println("1. Arroz, feijao, bife acebolado - R$ 19,99");
        System.out.println("2. Arroz, feijao, file de frango - R$ 18,99");
        System.out.println("3. Arroz, feijão, brajola - R$ 23,99");

        System.out.print("Escolha o numero do prato desejado: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a quantidade de pratos: ");
        int quantidade = scanner.nextInt();

        double precoPorPrato = 0;

        switch (opcao) {
            case 1:
                precoPorPrato = 19.99;
                break;
            case 2:
                precoPorPrato = 18.99;
                break;
            case 3:
                precoPorPrato = 23.99;
                break;
            default:
                System.out.println("Nao tem essa opcao.");
                System.exit(0);
        }

        double total = precoPorPrato * quantidade;

        System.out.println("Total a pagar: R$ " + total);

        scanner.close();
    }

}
