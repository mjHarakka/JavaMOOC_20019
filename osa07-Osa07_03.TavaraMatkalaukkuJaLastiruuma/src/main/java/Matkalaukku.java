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

public class Matkalaukku {
    private int maxPaino;
    private int yhteispaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maxPaino) {
        this.maxPaino = maxPaino;
        this.tavarat = new ArrayList<>();
    }
    
    public void tulostaTavarat() {
        for (Tavara tavara: tavarat) {
            System.out.println(tavara);
        }
    }
    
    public int yhteispaino() {
        return this.yhteispaino;
    }
    
    public Tavara raskainTavara() {
        
        if (tavarat.size() == 0) {
            return null;
        }
        
        
        Tavara raskain = tavarat.get(0);

        for (Tavara tavara: tavarat) {
            if (tavara.getPaino() > raskain.getPaino()) {
                raskain = tavara;
            }
        }
       
        return raskain;
        
    }
    
    public void lisaaTavara(Tavara tavara) {

        if ((tavara.getPaino() + this.yhteispaino) <= this.maxPaino) {
            this.tavarat.add(tavara);
            this.yhteispaino += tavara.getPaino();
        }
        
    }
    
    @Override
    public String toString() {
        
        if (tavarat.size() == 0) {
            return "ei tavaroita (" + this.yhteispaino + " kg)";
        } else if (tavarat.size() == 1) {
            return tavarat.size() + " tavara (" + this.yhteispaino + " kg)";
        } else {
            return tavarat.size() + " tavaraa (" + this.yhteispaino + " kg)";
        }
        
        
    }
}
