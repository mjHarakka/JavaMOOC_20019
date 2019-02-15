/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Elokuva {
    private String nimi;
    private int ikaraja;
    
    public Elokuva(String nimi, int ikaraja) {
        this.nimi = nimi;
        this.ikaraja = ikaraja;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    public int ikaraja() {
        return this.ikaraja;
    }
    
}
