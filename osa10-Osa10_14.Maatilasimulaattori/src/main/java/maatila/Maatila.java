/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author mikkoharakka
 */
import java.util.List;
import java.util.ArrayList;

public class Maatila implements Eleleva {
    private String omistaja;
    private Navetta navetta;
    private List<Lehma> lehmat;

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }
    
    public void hoidaLehmat() {
        navetta.hoida(lehmat);
    }
    
    public void lisaaLehma(Lehma l) {
        lehmat.add(l);
    }
    
    public void eleleTunti() {
        lehmat.stream()
                .forEach(l -> l.eleleTunti());
    }

    public String getOmistaja() {
        return omistaja;
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        navetta.asennaLypsyrobotti(lypsyrobotti);
    }
    
    @Override
    public String toString() {
        String lehmaString = "";
        
        if (lehmat.isEmpty()) {
            lehmaString += "Ei lehmiä.";
        } else {
            for (Lehma l: lehmat) {
                lehmaString += l.toString() + "\n";
            }
        }

        return "Maatilan omistaja: " + omistaja + "\n" +
                "Navetan maitosäiliö: " + navetta.getMaitosailio().toString() + "\n" +
                lehmaString;          
    }
    
    
}
