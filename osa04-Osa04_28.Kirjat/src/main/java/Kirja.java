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
    private int sivut;
    private int kVuosi;

    public Kirja(String nimi, int sivut, int kVuosi) {
        this.nimi = nimi;
        this.sivut = sivut;
        this.kVuosi = kVuosi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    @Override
    public String toString() {
        return this.nimi + ", " + this.sivut + " sivua, " + this.kVuosi;
    }
    
    
    
}
