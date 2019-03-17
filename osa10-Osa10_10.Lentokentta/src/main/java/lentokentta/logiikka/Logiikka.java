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
public interface Logiikka {
    void lisaaLentokone(Lentokone lentokone);
    void lisaaLento(String tunnus, String lahto, String kohde);
    void tulostaLentokoneet();
    void tulostaLennot();
    void tulostaLentokoneTiedot(String tunnus);
}
