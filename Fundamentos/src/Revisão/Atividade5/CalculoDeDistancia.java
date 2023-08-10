package Atividade5;

import java.util.Scanner;

public class CalculoDeDistancia {

    public static void main(String[] args) {
        double PrecoInferior200KM = 0.50;
        double PrecoSuperior200KM = 0.45;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distancia da viagem em km: ");
        double distanciaViagem = scanner.nextDouble();

        double precoPassagem;
        if (distanciaViagem <= 200) {
            precoPassagem = distanciaViagem * PrecoInferior200KM;
        } else {
            precoPassagem = distanciaViagem * PrecoSuperior200KM;
        }
        System.out.println("Distancia da viagem: " + distanciaViagem + " km");
        System.out.println("Preço da passagem: R$" + precoPassagem);
    }
}
