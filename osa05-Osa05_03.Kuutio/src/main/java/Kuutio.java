/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Kuutio {
    private int sarmaPituus;

    public Kuutio(int sarmaPituus) {
        this.sarmaPituus = sarmaPituus;
    }
     
    public int tilavuus() {
        return this.sarmaPituus * this.sarmaPituus * this.sarmaPituus;
    }
    
    @Override
    public String toString() {
        return "Kuution särmän pituus on " + this.sarmaPituus + ", tilavuus on " + this.tilavuus();
    }
    
}
