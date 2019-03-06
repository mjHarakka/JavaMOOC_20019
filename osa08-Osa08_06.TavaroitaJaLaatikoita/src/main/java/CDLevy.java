/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class CDLevy implements Talletettava {
    private String artisti;
    private String levyNimi;
    private int julkaisuvuosi;
    private double paino;

    public CDLevy(String artisti, String levyNimi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.levyNimi = levyNimi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.paino = 0.1;
    }
    
    public double paino() {
        return this.paino;
    }
    
    @Override
    public String toString() {
        return this.artisti + ": " + this.levyNimi + " (" +this.julkaisuvuosi + ")";
    }
}
