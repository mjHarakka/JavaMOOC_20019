/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Tuote {
    private String nimi;
    private double hinta;
    private int maara;
    
    public Tuote(String nimi, double hinta, int maara) {
        this.nimi = nimi;
        this.hinta = hinta;
        this.maara = maara;
    }
    
    public void tulostaTuote() {
        System.out.println(this.nimi + ", hinta " + this.hinta + ", " + this.maara + " kpl");
    }
    
    
}
