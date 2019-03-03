/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */

public class MuistavaTuotevarasto extends Tuotevarasto {
    private double alkuSaldo;
    private Muutoshistoria muutoshistoria;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        this.alkuSaldo = alkuSaldo;
        this.muutoshistoria = new Muutoshistoria();
        muutoshistoria.lisaa(this.alkuSaldo);
    }
    
    public void lisaaVarastoon(double maara) {
        this.muutoshistoria.lisaa(maara);
    }
    
    public double otaVarastosta(double maara) {
        return 0;
    }
    
    public String historia() {
        return muutoshistoria.toString();
    }
}
