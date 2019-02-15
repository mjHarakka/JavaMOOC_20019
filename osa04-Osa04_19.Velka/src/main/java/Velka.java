/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Velka {
    private double saldo;
    private double korkokerroin;

    public Velka(double saldoAlussa, double kerroinAlussa) {
        this.saldo = saldoAlussa;
        this.korkokerroin = kerroinAlussa;
    }
    
    public void tulostaSaldo() {
        System.out.println(this.saldo);
    }
    
    public void odotaVuosi() {
        saldo *= korkokerroin;
    }
    
}
