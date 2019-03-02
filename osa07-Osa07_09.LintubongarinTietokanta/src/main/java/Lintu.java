/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Lintu {
    private String nimi;
    private String latinaNimi;
    private int havainnot;

    public Lintu(String nimi, String latinaNimi) {
        this.nimi = nimi;
        this.latinaNimi = latinaNimi;
        this.havainnot = 0;
    }

    public void lisaaHavainto() {
        this.havainnot++;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String getLatinaNimi() {
        return this.nimi;
    }
    
    public int getHavainnot() {
        return this.havainnot;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.latinaNimi + "): " + this.havainnot + " havaintoa";
    }
    
    
    
}
