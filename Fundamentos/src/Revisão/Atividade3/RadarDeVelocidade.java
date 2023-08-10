package Atividade3;

import java.util.Scanner;

public class RadarDeVelocidade {
    public static void main(String[] args) {
        int VelocidadeMaxima = 80;
        double MultaPorKM = 5.00; 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro (em km/h): ");
        int velocidadeCarro = scanner.nextInt();


        if (velocidadeCarro > VelocidadeMaxima) {
            int kmAcima = velocidadeCarro - VelocidadeMaxima;
            
            double valorMulta = kmAcima * MultaPorKM;
            
            System.out.println("Motorista multado");
            System.out.println("Velocidade registrada: " + velocidadeCarro + " km/h");
            System.out.println("Velocidade máxima permitida: " + velocidadeCarro + " km/h");
            System.out.println("Você ultrapassou " + kmAcima + " km/h da velocidade máxima.");
            System.out.println("Valor da multa: R$" + valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite permitido.");
        }
    }
}
    



    
        
    

