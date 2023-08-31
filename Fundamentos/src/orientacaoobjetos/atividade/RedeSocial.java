/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Post post01 = new Post("Caneta Azul inicia sua carreira no MasterChef","Chocado", EnumTipoPost.COZINHA);
        post01.classificarPost(3);
        System.out.println(post01);
        
        Post post02 = new Post("Neymar ganha a sua segunda Champions League", "OMundo", EnumTipoPost.NOTICIA);
        post02.classificarPost(5);
        System.out.println(post02);
    }
}
