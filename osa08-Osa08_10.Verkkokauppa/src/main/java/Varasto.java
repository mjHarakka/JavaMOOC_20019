/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Varasto {
    private Map<String, Integer> tuotteet;
    private Map<String, Integer> saldot;

    public Varasto() {
        this.tuotteet = new HashMap<>();
        this.saldot = new HashMap<>();
    }
    
    public Set<String> tuotteet() {
        Set<String> tuotteetSet = new HashSet<>();
        
        for (String tuote: tuotteet.keySet()) {
            tuotteetSet.add(tuote);
        }
        
        return tuotteetSet;
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.tuotteet.put(tuote, hinta);
        this.saldot.put(tuote, saldo);
    }
    
    public int saldo(String tuote) {
        if (this.saldot.containsKey(tuote)) {
            return this.saldot.get(tuote);
        } else {
            return 0;
        }
    }
    
    public boolean ota(String tuote) {
        if (this.saldot.containsKey(tuote) && this.saldot.get(tuote) > 0) {
            this.saldot.replace(tuote, this.saldot.get(tuote) - 1);
            return true;
        } else {
            return false;
        }
    }
    
    
    
    public int hinta(String tuote) {
        if (this.tuotteet.containsKey(tuote)) {
            return this.tuotteet.get(tuote);
        } else {
            return -99;
        }
    }
    
}
