package lentokentta;

import lentokentta.logiikka.Sovelluslogiikka;
import lentokentta.ui.Kayttoliittyma;
import lentokentta.ui.Tekstikayttoliittyma;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Sovelluslogiikka sovelluslogiikka = new Sovelluslogiikka();
        Kayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(sovelluslogiikka);
        
        kayttoliittyma.kaynnista();
        
    }
}
