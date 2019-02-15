/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Maksukortti {
    private double saldo;
    
    public Maksukortti(double alkuSaldo) {
        this.saldo = alkuSaldo;
    }
    
    public void syoMaukkaasti() {
        
        if (this.saldo - 4.60 >= 0) {
             this.saldo -= 4.60;
        }
        
       
    }
    
    public void syoEdullisesti() {
        if (this.saldo - 2.60 >= 0) {
             this.saldo -= 2.60;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
        
        if (rahamaara > 0) {
            if (this.saldo + rahamaara <= 150) {
                this.saldo += rahamaara;
            } else {
                this.saldo = 150;
            }
        }
        
        
        
        
    }
    
    @Override
    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }
    
}
