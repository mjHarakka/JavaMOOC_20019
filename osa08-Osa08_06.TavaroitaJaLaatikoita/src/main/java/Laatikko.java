/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.ArrayList;

public class Laatikko implements Talletettava {
    private double maxCap;
    private ArrayList<Talletettava> tavarat;

    public Laatikko(double maxCap) {
        this.maxCap = maxCap;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Talletettava t) {
        if (paino() + t.paino() <= maxCap) {
            tavarat.add(t);
        }
    }
    
    public double paino() {
        double paino = 0;
            
        for (Talletettava t: tavarat) {
            paino += t.paino();
        }
        
        return paino;
    }
    
    @Override
    public String toString() {
        return "Laatikko: " + this.tavarat.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }
    
}
