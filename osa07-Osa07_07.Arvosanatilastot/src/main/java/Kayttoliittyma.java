/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    
    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
    }
    
    public void arvosanaJakauma() {
        
    }
    
    public void run() {
        int summa = 0;
        int lkm = 0;
        int hvSum = 0;
        int hvLkm = 0;
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa: ");
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
           
            if (syote == -1) {
                break;
            }
            
            if (syote >= 0 && syote <= 100) {
                
                if (syote >= 50) {
                hvSum += syote;
                hvLkm++;
            } 
            
            summa += syote;
            lkm++;
                
            }
        
        }

        System.out.println("Pisteiden keskiarvo (kaikki): " + summa / (double)lkm);
        
        if (hvLkm > 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + hvSum / (double)hvLkm);
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
        }
        
        System.out.println("Hyväksymisprosentti: " + 100 * (hvLkm / (double)lkm));
        
        
    }
    
    
}
