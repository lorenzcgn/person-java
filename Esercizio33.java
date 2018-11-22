/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio33;
import java.util.Scanner;
/**
 *
 * @author 75844087
 */
public class Esercizio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
       
        
        System.out.println("Inserisci il nome");
        String nome=s.next();
        System.out.println("Inserisci eta");
        int eta=s.nextInt();
        System.out.println("Inserisci sesso");
        String sesso=s.next();
        System.out.println("Inserisci impiego");
        String impiego=s.next();
       
        Persona pr1=new Persona(eta, nome, sesso, impiego);
        pr1.chiSei();
        
    }
    
}
