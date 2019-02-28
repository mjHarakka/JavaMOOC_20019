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

public class Lastiruuma {
    private int maxPaino;
    private int yhteispaino;
    private ArrayList<Matkalaukku> lastiruuma;

    public Lastiruuma(int maxPaino) {
        this.maxPaino = maxPaino;
        this.lastiruuma = new ArrayList<>();
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku laukku: this.lastiruuma) {
            laukku.tulostaTavarat();
        }
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        
        if ((laukku.yhteispaino() + this.yhteispaino) <= this.maxPaino) {
            this.lastiruuma.add(laukku);
            this.yhteispaino += laukku.yhteispaino();
        }

    }
    
    public String toString() {
        return this.lastiruuma.size() + " matkalaukkua (" + this.yhteispaino + " kg)";
    }
    
}
