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

public class Muutoshistoria {
    private ArrayList<Double> tilanteet;
    
    public Muutoshistoria() {
        tilanteet = new ArrayList<>();
    }
    
    public double maxArvo() {
        
        if (tilanteet.isEmpty()) {
            return 0;
        } else {
            Double maxArvo = tilanteet.get(0);
            for (Double arvo: tilanteet) {
                if (arvo > maxArvo) {
                    maxArvo = arvo;
                }
            }
            return maxArvo;
        }
        
    }
    
    public double minArvo() {
        if (tilanteet.isEmpty()) {
            return 0;
        } else {
            Double minArvo = tilanteet.get(0);
            for (Double arvo: tilanteet) {
                if (arvo < minArvo) {
                    minArvo = arvo;
                }
            }
            return minArvo;
        }
    }
    
    public double keskiarvo() {
        int summa = 0;
        
        if (tilanteet.isEmpty()) {
            return 0;
        } else {
            for (Double arvo: tilanteet) {
                summa += arvo;
            }
            return summa / (double)tilanteet.size();
        }
        
    }
    
    public void lisaa(double tilanne) {
        this.tilanteet.add(tilanne);
    }
    
    public void nollaa() {
        this.tilanteet.clear();
    }
    
    @Override
    public String toString() {
        return this.tilanteet.toString();
    }
}
