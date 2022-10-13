/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2.pkg3;

/**
 *
 * @author EdvaldodeFendi
 */
public class Local {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sala sala = new Sala();
        sala.setPessoaAtual(30);
        
        System.out.println("A capacidade maxima e de: "+sala.getMaximoPessoa() + " Tem um total de: "+ sala.getPessoaAtual());
    }
    
}
