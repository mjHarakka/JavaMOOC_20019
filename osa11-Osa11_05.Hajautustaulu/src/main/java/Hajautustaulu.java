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

public class Hajautustaulu<K, V> {
    private ArrayList<Pari<K, V>> arvot;
    private int arvoja;

    public Hajautustaulu() {
        this.arvot = new ArrayList<>();
        this.arvoja = 0;
    }
    
    public void lisaa(K avain, V arvo) {
        this.arvot.add(new Pari(avain, arvo));
    }
    
    public V poista(K avain) {
        Pari<K, V> poistettava;
        
        for (Pari<K, V> pari: arvot) {
            if (avain.equals(pari.getAvain())) {
                poistettava = pari;
                this.arvot.remove(pari);
                return pari.getArvo();
            } else {
                return null;
            }
        }
        
    }
    
    public V hae(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.size());
        if (this.arvot.get(hajautusArvo) == null) {
            return null;
        }

        for (Pari<K, V> pari: arvot) {
            if (avain.equals(pari.getAvain())) {
                return pari.getArvo();
            }
        }

        return null;
    }
}
