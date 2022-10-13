/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author EdvaldodeFendi
 */
public class Andar {
    
    private float velocidade;
    
    
    public void acelerar(){
        this.velocidade = velocidade + 5;
    }
    public void katiau(){
        this.velocidade = velocidade + 25;
    }
    public void frear(){
        this.velocidade = velocidade - 10;
    }

    public float getVelocidade() {
        return velocidade;
    }
    
    
}
