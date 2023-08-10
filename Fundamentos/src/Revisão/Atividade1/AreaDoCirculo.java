package Atividade1;

import java.util.Scanner;

public class AreaDoCirculo {

 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Digite o raio do circulo: ");
         double raio = scanner.nextDouble();
         
         double area = calcularAreaCirculo(raio);
         System.out.println("A area do circulo com raio " + raio + " e " + area);
     }
    }

    public static double calcularAreaCirculo(double raio) {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}


