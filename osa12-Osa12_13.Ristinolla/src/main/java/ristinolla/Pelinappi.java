package ristinolla;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Pelinappi {
    private Button nappi;
    
    public Pelinappi() {
        
        this.nappi = new Button(" ");
        nappi.setFont(Font.font("Monospaced", 40));
        
        
    }
    
    public boolean paina(boolean inputVuoro) {
        final boolean vuoro = inputVuoro;
        
        
            
            if (vuoro) {
                nappi.setText("X");
            } else if (!vuoro) {
                nappi.setText("0");
            }
            
            
        
        return !vuoro;
    }
    
    public Button getNappi() {
        return this.nappi;
    }
    
    public void setTeksti(int pelaaja) {
        
        if (pelaaja == 1) {
            this.nappi.setText("X");
        } else if (pelaaja == 2) {
            this.nappi.setText("0");
        }
        
        
    }
    
    
}
