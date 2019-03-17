/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.ui;

import lentokentta.logiikka.Sovelluslogiikka;
import java.util.Scanner;
import lentokentta.logiikka.Lentokone;

/**
 *
 * @author mikkoharakka
 */

public class Tekstikayttoliittyma implements Kayttoliittyma {
    private Sovelluslogiikka logiikka;
    private Scanner lukija;
    
    public Tekstikayttoliittyma(Sovelluslogiikka sovelluslogiikka) {
        this.logiikka = sovelluslogiikka;
        lukija = new Scanner(System.in);
    }
    
    public void kaynnista() {
        
        System.out.println("Lentokentän hallinta");
        while (true) {
            System.out.println("Valitse toiminto:\n" +
                "[1] Lisää lentokone\n" +
                "[2] Lisää lento\n" +
                "[x] Poistu hallintamoodista");
            String syote = lukija.nextLine();
            
            if (syote.equals("x")) {
                break;
            }
            
            if (syote.equals("1")) {
                System.out.println("Anna lentokoneen tunnus: ");
                String tunnus = lukija.nextLine();
                System.out.println("Anna lentokoneen kapasiteetti:");
                int kapasiteetti = Integer.valueOf(lukija.nextLine());
                
                logiikka.lisaaLentokone(new Lentokone(tunnus, kapasiteetti));
            }
            
            if (syote.equals("2")) {
                System.out.println("Anna lentokoneen tunnus: ");
                String tunnus = lukija.nextLine();
                System.out.println("Anna lähtöpaikan tunnus: ");
                String lahto = lukija.nextLine();
                System.out.println("Anna kohdepaikan tunnus: ");
                String kohde = lukija.nextLine();
                
                logiikka.lisaaLento(tunnus, lahto, kohde);
            }      
        }
        
        System.out.println("Lentopalvelu");
        while (true) {
            System.out.println("[1] Tulosta lentokoneet\n" +
            "[2] Tulosta lennot\n" +
            "[3] Tulosta lentokoneen tiedot\n" +
            "[x] Lopeta");
            String syote = lukija.nextLine();
            
            if (syote.equals("x")) {
                break;
            }
            
            if (syote.equals("1")) {
                logiikka.tulostaLentokoneet();
            }
            
            if (syote.equals("2")) {
                logiikka.tulostaLennot();
            }
            
            if (syote.equals("3")) {
                System.out.println("Mikä kone: ");
                String kone = lukija.nextLine();
                logiikka.tulostaLentokoneTiedot(kone);
            }
            
        }
        
    }
    
    
    
    
}
