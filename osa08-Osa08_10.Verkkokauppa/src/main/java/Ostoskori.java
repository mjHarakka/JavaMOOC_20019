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
import java.util.Set;
import java.util.HashSet;

public class Ostoskori {
    private List<Ostos> ostoskori;

    public Ostoskori() {
        this.ostoskori = new ArrayList<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        Ostos tempOstos = new Ostos(tuote, 1, hinta);
        
        for (Ostos ostos: ostoskori) {
            if (ostos.getTuote().equals(tuote)) {
                ostos.kasvataMaaraa();
                return;
            }
        }
        
        this.ostoskori.add(tempOstos);
        
        
    }
    
    public int hinta() {
        int kokHinta = 0;
        
        for (Ostos ostos: ostoskori) {
            kokHinta += ostos.hinta();
        }
        return kokHinta;
    }
    
    public void tulosta() {
        for (Ostos ostos: ostoskori) {
            System.out.println(ostos);
        }
    }
    
}
