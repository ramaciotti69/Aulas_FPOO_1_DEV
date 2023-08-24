/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Concessionaria {
    public static void main(String[] args) {
        Carro carros = new Carro("Marea", MarcaEnum.TOYOTA, CorEnum.AMARELO, 1999, 4, "AB1837BD");
        
        System.out.println(carros);
        
        carros.andar(110);
         carros.andar(160); 
        System.out.println(carros);
    }
}


