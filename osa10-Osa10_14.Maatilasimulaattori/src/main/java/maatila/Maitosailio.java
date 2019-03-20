package maatila;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.lang.Math;

public class Maitosailio {
    private double tilavuus;
    private double saldo;
    
    public Maitosailio() {
        tilavuus = 2000;
    }
    
    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }

    public double paljonkoTilaaJaljella() {
        return tilavuus - saldo;
    }

    public void lisaaSailioon(double maara) {
        if (saldo + maara <= tilavuus) {
            saldo += maara;
        } else {
            saldo = maara - (maara - tilavuus);
        }
    }

    public double otaSailiosta(double maara) {
        double palautettava = 0.0;
        if (saldo - maara < 0) {
            saldo = 0.0;
            
        } else if (maara < saldo) {
            palautettava = maara;
            saldo = saldo - maara;
        }
        
        return palautettava;
    }
    
    @Override
    public String toString() {
        double s = Math.ceil(saldo * 100) / 100;
        double t = Math.ceil(tilavuus * 100 / 100);
                
        return Math.ceil(s) + "/" + Math.ceil(t);
    }
    
}
