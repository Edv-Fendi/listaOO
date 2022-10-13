/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author EdvaldodeFendi
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Andar andar = new Andar();
        andar.acelerar();
        andar.katiau();
        andar.frear();

        System.out.println(andar.getVelocidade());
    }
    
}
