package maatila;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.Random;
import java.lang.Math;

public class Lehma implements Lypsava, Eleleva {
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String nimi;
    private double utareTilavuus;
    private double utareMaitoMaara;
    
    public Lehma() {
        int luku = 0 + new Random().nextInt(NIMIA.length);
        nimi = NIMIA[luku];
        setUtareTilavuus();
    }
    
    public Lehma(String nimi) {
        this.nimi = nimi;
        setUtareTilavuus();
    }
    
    public double lypsa() {
        double returnable = utareMaitoMaara;
        utareMaitoMaara = 0;
        return returnable;
    }
    
    public void eleleTunti() {
        Random r = new Random();
        double randVal = 0.7 + (2.0 - 0.7) * r.nextDouble();
        
        if (utareMaitoMaara + randVal > utareTilavuus) {
            utareMaitoMaara = utareTilavuus;
        } else {
            utareMaitoMaara += randVal;
        }
    }
    
    private void setUtareTilavuus() {
        utareTilavuus = 15 + new Random().nextInt(26);
    }
    
    
    public String getNimi() {
        return nimi;
    }
    
    public double getTilavuus() {
        return utareTilavuus;
    }
    
    public double getMaara() {
        return utareMaitoMaara;
    }
    
    public String toString() {
        return nimi + " " + Math.ceil(utareMaitoMaara * 100 / 100) + "/" + utareTilavuus;
    }
    
}

