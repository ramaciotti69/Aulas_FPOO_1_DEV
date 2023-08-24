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
        Carro fiatMarea = new Carro("Marea", "Fiat", "Azul", 1999, 4, "AB1837BD");
        
        System.out.println(fiatMarea);
        
        fiatMarea.andar(110);
         fiatMarea.andar(160); 
        System.out.println(fiatMarea);
    }
}


