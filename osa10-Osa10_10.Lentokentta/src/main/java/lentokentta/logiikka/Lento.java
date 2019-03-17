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
public class Lento extends Lentokone {
    private String lahtoPaikka;
    private String kohdePaikka;

    public Lento(String tunnus, int kapasiteetti, String lahtoPaikka, String kohdePaikka) {
        super(tunnus, kapasiteetti);
        this.lahtoPaikka = lahtoPaikka;
        this.kohdePaikka = kohdePaikka;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (" + lahtoPaikka + "-" + kohdePaikka + ")";
    }
    
    
}
