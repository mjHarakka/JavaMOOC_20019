/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Maa {
    private String maa;
    private int vuosi;
    private String sukupuoli;
    private double lkPros;

    public Maa(String maa, int vuosi, String sukupuoli, double lkPros) {
        this.maa = maa;
        this.vuosi = vuosi;
        this.sukupuoli = sukupuoli;
        this.lkPros = lkPros;
    }
    
    public double getLkPros() {
        return this.lkPros;
    }

    @Override
    public String toString() {
        return this.maa + " (" + this.vuosi + "), " + this.sukupuoli + ", " + this.lkPros;
    }
    
}
