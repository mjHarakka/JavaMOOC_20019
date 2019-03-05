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
    private Muutoshistoria muutoshistoria;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        
        this.saldo = alkuSaldo;
        this.muutoshistoria = new Muutoshistoria();
        muutoshistoria.lisaa(this.saldo);
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + this.historia());
        System.out.println("Suurin tuotemäärä: " + muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: " + muutoshistoria.minArvo());
        System.out.println("Keskiarvo: " + muutoshistoria.keskiarvo());
    }
    
    public void lisaaVarastoon(double maara) {
        if (maara < 0) {
            return;
        }
        if (maara <= paljonkoMahtuu()) {
            this.saldo = this.saldo + maara;
        } else {
            this.saldo = this.tilavuus;
        }
        this.muutoshistoria.lisaa(this.saldo);
    }
    
    public double otaVarastosta(double maara) {
        if (maara < 0) {
            return 0.0;
        }
        if (maara > this.saldo) {
            double kaikkiMitaVoidaan = this.saldo;
            this.saldo = 0.0;
            return kaikkiMitaVoidaan;
        }

        this.saldo = this.saldo - maara;
        this.muutoshistoria.lisaa(this.saldo);
        return maara;
    }
    
    public String historia() {
        return this.muutoshistoria.toString();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
