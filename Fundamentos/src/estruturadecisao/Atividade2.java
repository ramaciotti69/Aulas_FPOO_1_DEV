package estruturadecisao;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a largura do terreno em metros: ");
            double largura = scanner.nextDouble();
            
            System.out.print("Digite o comprimento do terreno em metros: ");
            double comprimento = scanner.nextDouble();

            double area = largura * comprimento;
            double valorMetroQuadrado;

            if (area <= 250) {
                valorMetroQuadrado = 8.5;
             } else if (area <= 350) {
                valorMetroQuadrado = 9.5;
               } else {
                valorMetroQuadrado = 11.5;
            }

            double valorTotal = area * valorMetroQuadrado;

               System.out.println("Area do terreno: " + area + " m²");
              System.out.println("Valor por metro quadrado: R$" + valorMetroQuadrado);
            System.out.println("Valor total a ser pago: R$" + valorTotal);
        }
    }

}
