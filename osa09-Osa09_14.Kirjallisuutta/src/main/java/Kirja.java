/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Kirja {
    private String nimi;
    private int kohdeIka;

    public Kirja(String nimi, int kohdeIka) {
        this.nimi = nimi;
        this.kohdeIka = kohdeIka;
    }

    public int getKohdeIka() {
        return kohdeIka;
    }

    public String getNimi() {
        return nimi;
    }
    
    /*
    @Override
    public int compareTo(Kirja k) {
        if (this.kohdeIka == k.getKohdeIka()) {
            return 0;
        } else if(this.kohdeIka > k.getKohdeIka()) {
            return 1;
        } else {
            return -1;
        }
    }
    */
    
    @Override
    public String toString() {
        return nimi + " (" + kohdeIka + " vuotiaille ja vanhemmille)";
    }
}
