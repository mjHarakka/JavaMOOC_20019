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
public class Lentokone {
    private String tunnus;
    private int kapasiteetti;

    public Lentokone() {
    }

    public Lentokone(String tunnus, int kapasiteetti) {
        this.tunnus = tunnus;
        this.kapasiteetti = kapasiteetti;
    }
    
    public String getTunnus() {
        return tunnus;
    }
    
    public int getKapasiteetti() {
        return kapasiteetti;
    }
    
    @Override
    public String toString() {
        return tunnus + " (" + kapasiteetti + " henkilöä)";
    }
    
}
