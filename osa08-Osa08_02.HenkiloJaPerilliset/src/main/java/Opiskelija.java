/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Opiskelija extends Henkilo {
    private int op;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.op = 0;
    }
    
    public int opintopisteita() {
        return this.op;
    }
    
    public void opiskele() {
        this.op++;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + this.op;
    }
    
}
