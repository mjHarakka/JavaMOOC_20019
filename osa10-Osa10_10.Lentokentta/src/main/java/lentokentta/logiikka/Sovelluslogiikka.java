/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.logiikka;

/**
 *
 * @author mikkoharakka
 */
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;
import java.util.ArrayList;

public class Sovelluslogiikka implements Logiikka {
    private List<Lentokone> lentokoneet;
    private List<Lento> lennot;

    public Sovelluslogiikka() {
        this.lentokoneet = new ArrayList<>();
        this.lennot = new ArrayList<>();
    }

    public void lisaaLentokone(Lentokone lentokone) {
        this.lentokoneet.add(lentokone);
    }
    public void lisaaLento(String tunnus, String lahto, String kohde) {
        Lentokone tempLk = new Lentokone();
        
        for (Lentokone lk: lentokoneet) {
            if (lk.getTunnus().equals(tunnus)) {
                tempLk = lk;
            }
        }
        
        if (tempLk != null) {
            lennot.add(new Lento(tempLk.getTunnus(), tempLk.getKapasiteetti(), lahto, kohde));
        }        
        
        
        
    }
    public void tulostaLentokoneet() {
        lentokoneet.stream()
                .forEach(lk -> System.out.println(lk)); 
    }
    public void tulostaLennot() {
        lennot.stream()
                .forEach(l -> System.out.println(l));
    }
    
    public void tulostaLentokoneTiedot(String tunnus) {
        for (Lentokone lk: lentokoneet) {
            if (tunnus.equals(lk.getTunnus())) {
                System.out.println(lk);
            }
        }
    }
    
}
