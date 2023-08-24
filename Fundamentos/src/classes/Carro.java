/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int rodas;
    private String chassi;
    private String situacao;
    private int velocidade;
    

    public Carro(String modelo, String marca, String cor, int ano, int rodas, String chassi) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.chassi = chassi;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    public void andar(int velocidade) {  
        this.situacao = "Andando";
        this.velocidade = velocidade;
        
    }
    public void freiar(){
        this.situacao = "Freiando";
        this.velocidade = this.velocidade - 30;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", chassi=" + chassi + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }
    
}
