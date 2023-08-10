package estruturadecisao;

import java.util.Scanner;

public class Atividade4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
          System.out.println("Produtos Disponiveis");
         System.out.println("1- Notebook Lenovo");
             System.out.println("2- Celular MotoG22");
            System.out.println("3- Carro Hb20");
          System.out.println("4- Apartamento");
          System.out.println("Digite seu produto:");
              int produto = scanner.nextInt();

                         if (produto == 1) {
                 double preco = 3299;
            double parcela = preco * 0.05;
                    double meses = preco / parcela;
            System.out.println("O preco da parcela sera de: R$" + parcela + "e voce ira ter " + meses + " parcelas");
                     } else if (produto == 2) {
            double preco = 1789;
            double parcela = preco * 0.10;
            double meses = preco / parcela;
                      System.out.println("O preco da parcela sera de: R$" + parcela + "e voce ira ter " + meses + " parcelas");
         } else if (produto == 3) {
            double preco = 68000;
                          double parcela = preco * 0.02;
             double meses = preco / parcela;
                System.out.println("O preco da parcela sera de: R$" + parcela + "e voce ira ter " + meses + " parcelas");
        } else if (produto == 4) {
                       double preco = 180000;
              double parcela = preco * 0.01;
            double meses = preco / parcela;
                        System.out.println("O preco da parcela sera de: R$" + parcela + "e voce ira ter " + meses + " parcelas");
        }
    }
}
        
