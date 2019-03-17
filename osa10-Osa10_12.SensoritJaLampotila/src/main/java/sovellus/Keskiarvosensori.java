package sovellus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.List;
import java.util.ArrayList;

public class Keskiarvosensori implements Sensori {
    private List<Sensori> sensorit;
    private List<Integer> mittaukset;
    
    public Keskiarvosensori() {
        sensorit = new ArrayList<>();
        mittaukset = new ArrayList<>();
    }
    
    public List<Integer> mittaukset() {
        return mittaukset;
    }
    
    public void lisaaSensori(Sensori lisattava) {
        if (!sensorit.contains(lisattava)) {
            sensorit.add(lisattava);
        }
    }
    
    public boolean onPaalla() {
        boolean onPaalla = true;
        
        for (Sensori s: sensorit) {
            if (!s.onPaalla()) {
                onPaalla = false;
            }
        }
        return onPaalla;
    }

    public int mittaa(){
        int summa = 0;
        for (Sensori s: sensorit) {
            summa += s.mittaa();
        }
        mittaukset.add(summa / sensorit.size());
        return mittaukset.get(mittaukset.size()-1);
    }
    
    public void paalle() {
        sensorit.stream()
                .forEach((s) -> s.paalle());
    }

    public void poisPaalta() {
        sensorit.stream()
                .forEach((s) -> s.poisPaalta());
    }  
}
