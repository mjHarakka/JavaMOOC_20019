/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.List;
import java.util.ArrayList;

public class Lauma implements Siirrettava {
    private List <Siirrettava> lauma;

    public Lauma() {
        this.lauma = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.lauma.add(siirrettava);
    }
    
    public void siirra(int dx, int dy) {
        for (Siirrettava elio: this.lauma) {
            elio.siirra(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String palautettava = "";
        
        for (Siirrettava elio: this.lauma) {
            palautettava += elio + "\n";
        }
        return palautettava;
    }
}
