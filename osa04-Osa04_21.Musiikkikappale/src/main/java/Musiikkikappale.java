/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Musiikkikappale {
    private String nimi;
    private int pituus;

    public Musiikkikappale(String nimi, int pituus) {
        this.nimi = nimi;
        this.pituus = pituus;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    public int pituus() {
        return this.pituus;
    }

    
    
}
