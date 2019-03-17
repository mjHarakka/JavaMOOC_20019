/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.Random;

/**
 *
 * @author mikkoharakka
 */
public class Lampomittari implements Sensori {
    private boolean onPaalla;
    
    public Lampomittari() {
        this.onPaalla = false;
    }
    
    

    public boolean onPaalla() {
        return onPaalla;
    }

    public int mittaa(){
        if (onPaalla == false) {
            throw new IllegalStateException("Mittarin pitää olla päällä!");
        }
        
        return new Random().nextInt(61)-30;
    }
    
    public void paalle() {
        onPaalla = true;
    }

    public void poisPaalta() {
        onPaalla = false;
    }    
}
