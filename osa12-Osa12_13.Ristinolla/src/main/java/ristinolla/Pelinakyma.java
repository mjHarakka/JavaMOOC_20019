/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinolla;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mikkoharakka
 */
public class Pelinakyma {
    
    private List<Button> napit;
    private boolean vuoro;
    private Label vuoroTeksti;

    public Pelinakyma() {
        this.napit = new ArrayList<>();
        this.vuoro = true;
        this.vuoroTeksti = new Label("Vuoro: X");
    }
    
    public Parent getNakyma() {
        
        GridPane asettelu = new GridPane();
        
        Button b11 = new Button(" ");
        b11.setFont(Font.font("Monospaced", 40));
        Button b12 = new Button(" ");
        b12.setFont(Font.font("Monospaced", 40));
        Button b13 = new Button(" ");
        b13.setFont(Font.font("Monospaced", 40));
        
        Button b21 = new Button(" ");
        b21.setFont(Font.font("Monospaced", 40));
        Button b22 = new Button(" ");
        b22.setFont(Font.font("Monospaced", 40));
        Button b23 = new Button(" ");
        b23.setFont(Font.font("Monospaced", 40));
        
        Button b31 = new Button(" ");
        b31.setFont(Font.font("Monospaced", 40));
        Button b32 = new Button(" ");
        b32.setFont(Font.font("Monospaced", 40));
        Button b33 = new Button(" ");
        b33.setFont(Font.font("Monospaced", 40));
        
        vuoroTeksti.setFont(Font.font("Monospaced", 15));
        
        asettelu.add(vuoroTeksti, 0, 0);
        
        asettelu.add(b11, 0, 1);
        asettelu.add(b12, 1, 1);
        asettelu.add(b13, 2, 1);
        
        asettelu.add(b21, 0, 2);
        asettelu.add(b22, 1, 2);
        asettelu.add(b23, 2, 2);
        
        asettelu.add(b31, 0, 3);
        asettelu.add(b32, 1, 3);
        asettelu.add(b33, 2, 3);
        
        onClick(b11);
        onClick(b12);
        onClick(b13);
        
        onClick(b21);
        onClick(b22);
        onClick(b23);
        
        onClick(b31);
        onClick(b32);
        onClick(b33);
        
        napit.add(b11);
        napit.add(b12);
        napit.add(b13);
        napit.add(b21);
        napit.add(b22);
        napit.add(b23);
        napit.add(b31);
        napit.add(b32);
        napit.add(b33);
        
        
        
        
        
        return asettelu;
    }
    
    public void onClick(Button b) {
        b.setOnMouseClicked((event) -> {
            if (vuoro) {
                b.setText("X");
                vuoroTeksti.setText("Vuoro: 0");
                vuoro = !vuoro;
            } else if (!vuoro) {
                b.setText("0");
                vuoroTeksti.setText("Vuoro: X");
                vuoro = !vuoro;
            }
            
            b.setDisable(true);
            
            
            
            
        });
    }
    
     public boolean getVuoro() {
        return vuoro;
    }
    
    public boolean check() {
        return true;
    }

    
}
