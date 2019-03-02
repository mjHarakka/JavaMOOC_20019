/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.ArrayList;

public class Resepti {
    private String reseptiNimi;
    private int keittoAika;
    private ArrayList<String> raakaAineet;

    public Resepti(String reseptiNimi, int keittoAika, ArrayList<String> raakaAineet) {
        this.reseptiNimi = reseptiNimi;
        this.keittoAika = keittoAika;
        this.raakaAineet = raakaAineet;
    }
    
    @Override
    public String toString() {
        return this.reseptiNimi + this.keittoAika + this.raakaAineet;
    }
    
}
