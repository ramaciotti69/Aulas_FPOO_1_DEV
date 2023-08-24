/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        Aluno walter = new Aluno("Walter Hartwell White", "walterwhite@gmail.com", 945638);
        System.out.println(walter);
        walter.estudar();
        walter.passouDeAno();
        System.out.println(walter);
    }
}
